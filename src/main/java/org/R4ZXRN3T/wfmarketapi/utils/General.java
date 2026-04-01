package org.R4ZXRN3T.wfmarketapi.utils;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;

import static org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization.LocalizedField.*;

/**
 * Small utility helpers used by the library.
 *
 * <p>This class provides a collection of convenience methods used across the
 * library for working with localized data, JSON parsing helpers and nullable
 * optional getters that return boxed types (or {@code null}) instead of
 * throwing when a field is missing. The helpers intentionally return
 * {@code null} for missing values to allow callers to distinguish between
 * absent and present values.</p>
 */
public class General {
	/**
	 * Selects a localized value from a {@link Localization} container.
	 *
	 * <p>If the requested language is not present in the provided
	 * {@code i18n} object this method will attempt to fall back to
	 * English. If neither the preferred language nor English are present
	 * the method returns {@code null}.</p>
	 *
	 * @param i18n     the localization container, may be {@code null}
	 * @param language preferred language to select; may be {@code null}
	 * @param field    which localized field to retrieve (name, description, etc.)
	 * @return the localized string for the requested field, or {@code null}
	 * if the localization or the requested language/field is unavailable
	 */
	public static String getLocalizedValue(Localization i18n, Localization.Language language, Localization.LocalizedField field) {
		if (i18n == null) {
			return null;
		}

		Localization.LocaleData localeData = i18n.getLanguageData(language);
		if (localeData == null && language != Localization.Language.ENGLISH) {
			localeData = i18n.getLanguageData(Localization.Language.ENGLISH);
		}
		if (localeData == null) {
			return null;
		}

		switch (field) {
			case NAME:
				return localeData.getName();
			case TITLE:
				return localeData.getTitle();
			case DESCRIPTION:
				return localeData.getDescription();
			case WIKI_LINK:
				return localeData.getWikiLink();
			case ICON:
				return localeData.getIcon();
			case THUMB:
				return localeData.getThumb();
			case SUB_ICON:
				return localeData.getSubIcon();
			default:
				return null;
		}
	}

	/**
	 * Parse an ISO-8601 timestamp that may include an offset (for example a
	 * trailing 'Z' or an offset like '+02:00') or may be zone-less (for
	 * example {@code "2026-03-27T16:43:42"}).
	 *
	 * <p>If an offset is present this method interprets the timestamp as an
	 * {@link Instant} in UTC and converts it to a {@link LocalDateTime}
	 * using {@link java.time.ZoneOffset#UTC}. If the input is zone-less the
	 * string is parsed directly as a {@link LocalDateTime} using the default
	 * ISO local date-time parser.</p>
	 *
	 * @param text the ISO-8601 timestamp to parse, may be {@code null}
	 * @return the parsed {@link LocalDateTime}, or {@code null} when input is
	 * {@code null} or empty
	 * @throws java.time.format.DateTimeParseException if the input is non-empty
	 *                                                 and cannot be parsed
	 */
	public static LocalDateTime parseTimestamp(String text) {
		if (text == null || text.isEmpty()) return null;
		try {
			// handles strings like "2021-05-21T14:59:02Z" or with offset
			Instant inst = Instant.parse(text);
			return LocalDateTime.ofInstant(inst, ZoneOffset.UTC);
		} catch (DateTimeParseException ex) {
			// fallback: parse zone-less local datetime like "2026-03-27T16:43:42"
			return LocalDateTime.parse(text);
		}
	}

	/**
	 * Convert a {@link JSONArray} of strings into a Java {@code String[]}.
	 *
	 * <p>The conversion uses {@code JSONArray#optString(int, null)} so the
	 * resulting array may contain {@code null} elements if the JSON array
	 * had non-string or null entries. When {@code arr} is {@code null} this
	 * method returns an empty array.</p>
	 *
	 * @param arr the JSON array to convert, may be {@code null}
	 * @return a {@code String[]} of the same length as {@code arr} (or an
	 * empty array when {@code arr} is {@code null}); elements may be
	 * {@code null} when the JSON element is missing or not a string
	 */
	public static String[] jsonArrayToStringArray(JSONArray arr) {
		if (arr == null) return new String[0];        // or return null if you prefer
		String[] out = new String[arr.length()];
		for (int i = 0; i < arr.length(); i++) {
			// use optString to avoid exceptions and allow null/default
			out[i] = arr.optString(i, null);
		}
		return out;
	}

	/**
	 * Parse a localization JSON object into a {@link Localization} instance.
	 *
	 * <p>The input is expected to be an object whose keys are language codes
	 * (for example {@code "en"}, {@code "de"}) and whose values are
	 * objects containing localized fields such as {@code name} and
	 * {@code description}. Unknown language keys are ignored. Missing fields
	 * on a language object result in {@code null} values in the returned
	 * {@link Localization}.</p>
	 *
	 * @param localization the JSON object containing localization entries, may
	 *                     be {@code null}
	 * @return a {@link Localization} populated with any recognized language
	 * data; when {@code localization} is {@code null} an empty
	 * {@link Localization} is returned
	 */
	public static Localization parseLocalization(JSONObject localization) {
		Localization returnLocale = new Localization();
		// If there's no localization object, return an empty Localization (all fields null)
		if (localization == null) return returnLocale;

		for (String language : localization.keySet()) {
			// Some manifests may contain unexpected language keys; ignore unknown enums
			Localization.Language currentLang;
			// Map language code (e.g. "en") to enum; skip if unknown
			currentLang = Localization.Language.fromCode(language);
			if (currentLang == null) continue;

			JSONObject langObj = localization.optJSONObject(language);
			if (langObj == null) continue;

			// Use optString with default null so missing fields become null instead of throwing
			String name = langObj.optString("name", null);
			String title = langObj.optString("title", null);
			String nodeName = langObj.optString("nodeName", null);
			String systemName = langObj.optString("systemName", null);
			String description = langObj.optString("description", null);
			String wikiLink = langObj.optString("wikiLink", null);
			String icon = langObj.optString("icon", null);
			String thumb = langObj.optString("thumb", null);
			String subIcon = langObj.optString("subIcon", null);

			returnLocale.setLanguageData(currentLang, NAME, name);
			returnLocale.setLanguageData(currentLang, TITLE, title);
			returnLocale.setLanguageData(currentLang, NODE_NAME, nodeName);
			returnLocale.setLanguageData(currentLang, SYSTEM_NAME, systemName);
			returnLocale.setLanguageData(currentLang, DESCRIPTION, description);
			returnLocale.setLanguageData(currentLang, WIKI_LINK, wikiLink);
			returnLocale.setLanguageData(currentLang, ICON, icon);
			returnLocale.setLanguageData(currentLang, THUMB, thumb);
			returnLocale.setLanguageData(currentLang, SUB_ICON, subIcon);
		}
		return returnLocale;
	}

	/**
	 * Return a {@link String} value from {@code json} or {@code null} when the
	 * field is missing or explicitly {@code null} in the JSON.
	 *
	 * @param json the JSON object to read from, may be {@code null}
	 * @param key  the key to read
	 * @return the string value or {@code null}
	 */
	public static String optStringNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getString(key) : null;
	}

	/**
	 * Return an {@link Integer} value from {@code json} or {@code null} when
	 * the field is missing or explicitly {@code null} in the JSON.
	 *
	 * @param json the JSON object to read from, may be {@code null}
	 * @param key  the key to read
	 * @return the integer value or {@code null}
	 */
	public static Integer optIntegerNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getInt(key) : null;
	}

	/**
	 * Return a {@link Float} value from {@code json} or {@code null} when the
	 * field is missing or explicitly {@code null} in the JSON. Note that
	 * {@link org.json.JSONObject} stores numeric values as {@code double};
	 * this method casts to {@code float} when a numeric value is present.
	 *
	 * @param json the JSON object to read from, may be {@code null}
	 * @param key  the key to read
	 * @return the float value or {@code null}
	 */
	public static Float optFloatNullable(JSONObject json, String key) {
		if (json == null) return null;
		if (json.has(key) && !json.isNull(key)) {
			// JSONObject stores numbers as double; cast to float
			return (float) json.getDouble(key);
		}
		return null;
	}

	/**
	 * Return a {@link Boolean} value from {@code json} or {@code null} when
	 * the field is missing or explicitly {@code null} in the JSON.
	 *
	 * @param json the JSON object to read from, may be {@code null}
	 * @param key  the key to read
	 * @return the boolean value or {@code null}
	 */
	public static Boolean optBooleanNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getBoolean(key) : null;
	}

	/**
	 * Return a string array for the JSON array at {@code key}, or {@code null}
	 * when the key does not exist. This mirrors the nullable behavior of the
	 * other {@code opt*Nullable} helpers in this class.
	 *
	 * @param json the JSON object to read from, may be {@code null}
	 * @param key  the key to read
	 * @return a {@code String[]} or {@code null} when the JSON key does not
	 * exist; individual elements may be {@code null}
	 */
	public static String[] optStringArrayNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.optJSONArray(key) == null ? null : jsonArrayToStringArray(json.getJSONArray(key));
	}
}
