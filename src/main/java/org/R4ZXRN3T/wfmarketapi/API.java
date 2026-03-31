package org.R4ZXRN3T.wfmarketapi;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Localization;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Platform;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class API {
	private static final String API_BASE_PATH = "https://api.warframe.market/v2/";
	private static final String ASSET_BASE_PATH = "https://warframe.market/static/assets/";
	// Simple in-process rate limiter: allow up to 3 requests per 1000 milliseconds
	private static final int MAX_REQUESTS = 3;
	private static final long WINDOW_MILLIS = 1000L;
	private static final Deque<Long> requestTimestamps = new ArrayDeque<>();
	private static LocalDateTime lastApiCall;

	public static JSONObject getJsonResponse(String endpoint) {
		return getJsonResponse(endpoint, true);
	}

	public static JSONObject getJsonResponse(String endpoint, boolean errorOut) {
		return getJsonResponse(Localization.Language.ENGLISH, Platform.PC, endpoint, errorOut);
	}

	public static JSONObject getJsonResponse(Localization.Language language, Platform platform, String endpoint, boolean errorOut) {
		// Enforce rate limit before making the API call
		ensureRateLimit();
		if (lastApiCall == null) lastApiCall = LocalDateTime.now();

		try {
			URL url = new URL(API_BASE_PATH + endpoint);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");

			// Add optional headers for language and platform. If null, omit header to allow server default.
			if (language != null) {
				connection.setRequestProperty("Language", language.toString());
			}
			if (platform != null) {
				connection.setRequestProperty("Platform", platform.toString());
			}

			int responseCode = connection.getResponseCode();
			System.out.println("Response Code: " + responseCode);

			// Choose input stream: prefer error stream for non-2xx responses, fall back if necessary
			InputStream stream;
			if (responseCode >= 400) {
				stream = connection.getErrorStream();
				if (stream == null) {
					// If error stream is not available, try the regular input stream as a last resort
					stream = connection.getInputStream();
				}
			} else {
				stream = connection.getInputStream();
			}

			BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
			String inputLine;
			StringBuilder response = new StringBuilder();

			while ((inputLine = reader.readLine()) != null) {
				response.append(inputLine);
			}
			reader.close();

			if (responseCode >= 400) {
				if (errorOut) {
					throw new RuntimeException("Erroneous response from server: " + response);
				} else {
					System.out.println("Erroneous response: " + response);
				}
				return null;
			} else {
				return new JSONObject(response.toString());
			}
		} catch (IOException e) {
			if (errorOut) throw new RuntimeException("Error reading input stream: " + e.getMessage());
			System.out.println("Error reading input stream: " + e.getMessage());
			return null;
		} catch (JSONException e) {
			if (errorOut) throw new RuntimeException("Error: Invalid JSON in response: " + e.getMessage());
			System.out.println("Error: Invalid JSON in response: " + e.getMessage());
			return null;
		}
	}

	/**
	 * Ensures no more than MAX_REQUESTS are made within WINDOW_MILLIS.
	 * This method blocks the caller if necessary until a slot becomes available.
	 */
	private static void ensureRateLimit() {
		while (true) {
			long now = System.currentTimeMillis();
			long waitMillis = 0L;
			// Compute state while holding the lock
			synchronized (requestTimestamps) {
				// Remove timestamps outside the window
				while (!requestTimestamps.isEmpty() && now - requestTimestamps.peekFirst() >= WINDOW_MILLIS) {
					requestTimestamps.removeFirst();
				}
				if (requestTimestamps.size() < MAX_REQUESTS) {
					requestTimestamps.addLast(now);
					return;
				}
				// Need to wait until the oldest timestamp falls out of the window
				long oldest = requestTimestamps.peekFirst();
				waitMillis = WINDOW_MILLIS - (now - oldest);
			}
			// Sleep outside synchronized block so other threads can check the timestamps
			if (waitMillis > 0) {
				try {
					Thread.sleep(waitMillis);
				} catch (InterruptedException ignored) {
					Thread.currentThread().interrupt();
				}
			}
			// Loop and try again
		}
	}
}
