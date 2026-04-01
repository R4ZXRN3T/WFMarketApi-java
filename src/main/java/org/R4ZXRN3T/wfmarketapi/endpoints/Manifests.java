package org.R4ZXRN3T.wfmarketapi.endpoints;

import org.R4ZXRN3T.wfmarketapi.API;
import org.R4ZXRN3T.wfmarketapi.objects.WfmVersion;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.*;
import org.R4ZXRN3T.wfmarketapi.utils.Parsing;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;

import static org.R4ZXRN3T.wfmarketapi.utils.General.parseTimestamp;
import static org.R4ZXRN3T.wfmarketapi.utils.Parsing.*;

@SuppressWarnings("unused")
/**
 * Helpers for retrieving and parsing manifest endpoints from the Warframe
 * Market API.
 *
 * <p>This class contains convenience methods that call the API's manifest
 * endpoints (items, riven/weapons, lich/weapons, versions, etc.) and parse
 * the returned JSON into the library's data model objects.</p>
 *
 * <p>Most methods return either a populated model, a map/array of models or
 * {@code null} / empty collections when the API response is missing or
 * malformed. See individual method JavaDocs for exact behavior.</p>
 */
public class Manifests {

	/**
	 * Retrieve the current Warframe Market and mobile app versions.
	 *
	 * <p>This method calls the API endpoint {@code "versions"} and parses
	 * the response into a {@link org.R4ZXRN3T.wfmarketapi.objects.WfmVersion}
	 * object. Several collection timestamps returned by the API are Base64
	 * encoded; this method decodes and parses them as ISO-8601 timestamps
	 * using {@link org.R4ZXRN3T.wfmarketapi.utils.General#parseTimestamp(String)}.</p>
	 *
	 * @return a {@link org.R4ZXRN3T.wfmarketapi.objects.WfmVersion} populated
	 * with version and collection timestamps. This method will throw a
	 * RuntimeException when the underlying API response is missing required
	 * fields (consistent with {@link org.R4ZXRN3T.wfmarketapi.API#getJsonResponse}).
	 */
	public static WfmVersion getVersions() {
		JSONObject jsonResponse = API.getJsonResponse("versions");
		JSONObject data = jsonResponse.getJSONObject("data");
		JSONObject apps = data.getJSONObject("apps");
		JSONObject collections = data.getJSONObject("collections");
		return (new WfmVersion(
			jsonResponse.getString("apiVersion"),
			apps.getString("ios"),
			apps.getString("minIos"),
			apps.getString("android"),
			apps.getString("minAndroid"),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("items")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("rivens")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("liches")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("sisters")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("missions")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("npcs")), StandardCharsets.UTF_8)),
			parseTimestamp(new String(Base64.getDecoder().decode(collections.getString("locations")), StandardCharsets.UTF_8)),
			parseTimestamp(data.getString("updatedAt"))
		));
	}

	/**
	 * Retrieve a map of items from the API keyed by slug when available.
	 *
	 * <p>The method calls the {@code "items"} manifest endpoint and parses
	 * the returned array into {@link org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort}
	 * instances. The returned map uses the item's slug as the key when
	 * available; when a slug is missing the localized name is used as a
	 * fallback to avoid {@code null} keys.</p>
	 *
	 * @return a {@link HashMap} mapping item slugs (or names as fallback) to
	 * {@link org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort} objects.
	 * When the API response is missing or malformed an empty map is returned.
	 */
	public static HashMap<String, ItemShort> getItems() {
		JSONObject response = API.getJsonResponse("items");
		if (response == null) return new HashMap<>();
		JSONArray data = response.optJSONArray("data");
		if (data == null) return new HashMap<>();
		HashMap<String, ItemShort> items = new HashMap<>(data.length());
		for (Object currentObject : data) {
			ItemShort item = Parsing.parseItemShort((JSONObject) currentObject);
			// Use localized name as key when available, otherwise fall back to id to avoid null keys
			String key = item.getSlug() != null ? item.getSlug() : item.getName();
			items.put(key, item);
		}
		return items;
	}

	/**
	 * Retrieve a single item by slug and parse it into an {@link Item}.
	 *
	 * @param itemSlug the slug of the item to retrieve (for example
	 *                 {@code "revenant_prime_chassis"}); must not be {@code null}
	 * @return the parsed {@link Item} instance, or {@code null} when the
	 * API response is empty or the item cannot be found
	 */
	public static Item getItem(String itemSlug) {
		JSONObject response = API.getJsonResponse("item/" + itemSlug);
		if (response == null) return null;
		JSONObject itemJson = response.getJSONObject("data");
		if (itemJson == null) return null;

		return parseItem(itemJson);
	}

	/**
	 * Retrieve the constituent items of an item set.
	 *
	 * <p>This calls the endpoint {@code "item/<setSlug>/set"} and returns
	 * an array of full {@link Item} objects representing the set parts. If
	 * the API response is missing or malformed {@code null} is returned to
	 * match the historical behavior of this method.</p>
	 *
	 * @param setSlug the slug of the set to query
	 * @return an array of {@link Item} objects for the set, or {@code null}
	 * when the API response is not available
	 */
	public static Item[] getSetItems(String setSlug) {
		JSONObject response = API.getJsonResponse("item/" + setSlug + "/set");
		if (response == null) return null;
		JSONObject data = response.getJSONObject("data");
		if (data == null) return null;
		JSONArray jsonItems = data.getJSONArray("items");
		if (jsonItems == null) return null;

		Item[] items = new Item[jsonItems.length()];
		for (int i = 0; i < jsonItems.length(); i++) {
			items[i] = parseItem((JSONObject) jsonItems.get(i));
		}
		return items;
	}

	public static HashMap<String, RivenWeapon> getRivenWeapons() {
		JSONObject response = API.getJsonResponse("riven/weapons");
		if (response == null) return null;
		JSONArray data = response.optJSONArray("data");
		if (data == null) return null;
		HashMap<String, RivenWeapon> rivenWeapons = new HashMap<>(data.length());

		for (Object rivenWeaponJson : data) {
			RivenWeapon rivenWeapon = parseRivenWeapon((JSONObject) rivenWeaponJson);
			rivenWeapons.put(rivenWeapon.getSlug(), rivenWeapon);
		}
		return rivenWeapons;
	}

	public static RivenWeapon getRivenWeapon(String rivenWeaponSlug) {
		JSONObject response = API.getJsonResponse("riven/weapon/" + rivenWeaponSlug);
		if (response == null) return null;
		JSONObject rivenJson = response.getJSONObject("data");
		if (rivenJson == null) return null;

		return parseRivenWeapon(rivenJson);
	}

	public static HashMap<String, RivenAttribute> getRivenAttributes() {
		JSONObject response = API.getJsonResponse("riven/attributes");
		if (response == null) return null;
		JSONArray data = response.optJSONArray("data");
		if (data == null) return null;
		HashMap<String, RivenAttribute> rivenAttributes = new HashMap<>(data.length());

		for (Object rivenAttributeJson : data) {
			RivenAttribute rivenAttribute = parseRivenAttribute((JSONObject) rivenAttributeJson);
			rivenAttributes.put(rivenAttribute.getSlug(), rivenAttribute);
		}
		return rivenAttributes;
	}

	public static HashMap<String, LichWeapon> getLichWeapons() {
		JSONObject response = API.getJsonResponse("lich/weapons");
		if (response == null) return null;
		JSONArray data = response.optJSONArray("data");
		if (data == null) return null;
		HashMap<String, LichWeapon> lichWeapons = new HashMap<>(data.length());

		for (Object lichWeaponJson : data) {
			LichWeapon lichWeapon = parseLichWeapon((JSONObject) lichWeaponJson);
			lichWeapons.put(lichWeapon.getSlug(), lichWeapon);
		}
		return lichWeapons;
	}

	public static LichWeapon getLichWeapon(String lichWeaponSlug) {
		JSONObject response = API.getJsonResponse("lich/weapon/" + lichWeaponSlug);
		if (response == null) return null;
		JSONObject lichWeaponJson = response.getJSONObject("data");
		if (lichWeaponJson == null) return null;

		return parseLichWeapon(lichWeaponJson);
	}
}
