package org.R4ZXRN3T.wfmarketapi.endpoints;

import org.R4ZXRN3T.wfmarketapi.API;
import org.R4ZXRN3T.wfmarketapi.Utils;
import org.R4ZXRN3T.wfmarketapi.objects.WfmVersion;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort;
import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;

import static org.R4ZXRN3T.wfmarketapi.Utils.parseTimestamp;

public class Manifests {

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

	public static HashMap<String, ItemShort> getItems() {
		JSONObject response = API.getJsonResponse("items");
		if (response == null) return new HashMap<>();
		JSONArray data = response.optJSONArray("data");
		if (data == null) return new HashMap<>();
		HashMap<String, ItemShort> items = new HashMap<>(data.length());
		for (Object currentObject : data) {
			ItemShort item = Utils.parseItemShort((JSONObject) currentObject);
			// Use localized name as key when available, otherwise fall back to id to avoid null keys
			String key = item.getSlug() != null ? item.getSlug() : item.getName();
			items.put(key, item);
		}
		return items;
	}
}
