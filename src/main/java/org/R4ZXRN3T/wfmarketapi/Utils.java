package org.R4ZXRN3T.wfmarketapi;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Item;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.ItemShort;
import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Localization;
import org.json.JSONArray;
import org.json.JSONObject;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeParseException;

import static org.R4ZXRN3T.wfmarketapi.objects.datamodels.Localization.LocalizedField.*;

/**
 * Small utility helpers used by the library.
 */
public class Utils {
	/**
	 * Selects a localized value from a {@link Localization} container.
	 * Falls back to English when the requested language is not available.
	 *
	 * @param i18n     the localization container
	 * @param language preferred language
	 * @param field    field to retrieve
	 * @return localized string or null
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
	 * Parse an ISO-8601 timestamp that may include an offset (e.g. trailing 'Z')
	 * or may be zone-less (e.g. "2026-03-27T16:43:42"). If an offset is
	 * present we interpret the instant as UTC and convert to LocalDateTime
	 * at UTC; otherwise we parse as a LocalDateTime directly.
	 *
	 * @param text Input {@link String} to parse.
	 * @return A {@link LocalDateTime} object with the parsed time.
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

	public static String[] jsonArrayToStringArray(JSONArray arr) {
		if (arr == null) return new String[0];        // or return null if you prefer
		String[] out = new String[arr.length()];
		for (int i = 0; i < arr.length(); i++) {
			// use optString to avoid exceptions and allow null/default
			out[i] = arr.optString(i, null);
		}
		return out;
	}

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
			String description = langObj.optString("description", null);
			String wikiLink = langObj.optString("wikiLink", null);
			String icon = langObj.optString("icon", null);
			String thumb = langObj.optString("thumb", null);
			String subIcon = langObj.optString("subIcon", null);

			returnLocale.setLanguageData(currentLang, NAME, name);
			returnLocale.setLanguageData(currentLang, DESCRIPTION, description);
			returnLocale.setLanguageData(currentLang, WIKI_LINK, wikiLink);
			returnLocale.setLanguageData(currentLang, ICON, icon);
			returnLocale.setLanguageData(currentLang, THUMB, thumb);
			returnLocale.setLanguageData(currentLang, SUB_ICON, subIcon);
		}
		return returnLocale;
	}

	// Helpers that return boxed types or null when a field is missing or explicitly null
	public static String optStringNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getString(key) : null;
	}

	public static Integer optIntegerNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getInt(key) : null;
	}

	public static Float optFloatNullable(JSONObject json, String key) {
		if (json == null) return null;
		if (json.has(key) && !json.isNull(key)) {
			// JSONObject stores numbers as double; cast to float
			return (float) json.getDouble(key);
		}
		return null;
	}

	public static Boolean optBooleanNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.has(key) && !json.isNull(key) ? json.getBoolean(key) : null;
	}

	public static String[] optStringArrayNullable(JSONObject json, String key) {
		if (json == null) return null;
		return json.optJSONArray(key) == null ? null : jsonArrayToStringArray(json.getJSONArray(key));
	}

	public static ItemShort parseItemShort(JSONObject json) {
		if (json == null) return new ItemShort();
		String id = optStringNullable(json, "id");
		String slug = optStringNullable(json, "slug");
		String gameRef = optStringNullable(json, "gameRef");
		String[] tags = optStringArrayNullable(json, "tags");
		Localization i18n = parseLocalization(json.optJSONObject("i18n"));
		Integer maxRank = optIntegerNullable(json, "maxRank");
		Integer maxCharges = optIntegerNullable(json, "maxCharges");
		Boolean vaulted = optBooleanNullable(json, "vaulted");
		Integer ducats = optIntegerNullable(json, "ducats");
		Integer amberStars = optIntegerNullable(json, "amberStars");
		Integer cyanStars = optIntegerNullable(json, "cyanStars");
		Integer baseEndo = optIntegerNullable(json, "baseEndo");
		Float endoMultiplier = optFloatNullable(json, "endoMultiplier");
		String[] subTypes = optStringArrayNullable(json, "subTypes");

		return new ItemShort(
				id,
				slug,
				gameRef,
				tags,
				i18n,
				maxRank,
				maxCharges,
				vaulted,
				ducats,
				amberStars,
				cyanStars,
				baseEndo,
				endoMultiplier,
				subTypes
		);
	}

	/**
	 * Parse a full Item (long payload) into an {@link Item} object.
	 * Uses the nullable opt helpers so missing fields become null instead of throwing.
	 */
	public static Item parseItem(JSONObject json) {
		if (json == null) return new Item();
		String id = optStringNullable(json, "id");
		String slug = optStringNullable(json, "slug");
		String gameRef = optStringNullable(json, "gameRef");
		String[] tags = optStringArrayNullable(json, "tags");
		Localization i18n = parseLocalization(json.optJSONObject("i18n"));
		String[] subTypes = optStringArrayNullable(json, "subTypes");
		Integer maxRank = optIntegerNullable(json, "maxRank");
		Integer maxCharges = optIntegerNullable(json, "maxCharges");
		Boolean vaulted = optBooleanNullable(json, "vaulted");
		Integer ducats = optIntegerNullable(json, "ducats");
		Integer amberStars = optIntegerNullable(json, "amberStars");
		Integer cyanStars = optIntegerNullable(json, "cyanStars");
		Integer baseEndo = optIntegerNullable(json, "baseEndo");
		Float endoMultiplier = optFloatNullable(json, "endoMultiplier");

		Boolean setRoot = optBooleanNullable(json, "setRoot");
		String[] setParts = optStringArrayNullable(json, "setParts");
		Integer quantityInSet = optIntegerNullable(json, "quantityInSet");
		String rarity = optStringNullable(json, "rarity");
		Boolean bulkTradable = optBooleanNullable(json, "bulkTradable");
		Integer maxAmberStars = optIntegerNullable(json, "maxAmberStars");
		Integer maxCyanStars = optIntegerNullable(json, "maxCyanStars");
		Integer vosfor = optIntegerNullable(json, "vosfor");
		Integer reqMasteryRank = optIntegerNullable(json, "reqMasteryRank");
		Integer tradingTax = optIntegerNullable(json, "tradingTax");
		Boolean tradable = optBooleanNullable(json, "tradable");

		return new Item(
				id,
				slug,
				gameRef,
				tags,
				i18n,
				subTypes,
				maxRank,
				maxCharges,
				vaulted,
				ducats,
				amberStars,
				cyanStars,
				baseEndo,
				endoMultiplier,
				setRoot,
				setParts,
				quantityInSet,
				rarity,
				bulkTradable,
				maxAmberStars,
				maxCyanStars,
				vosfor,
				reqMasteryRank,
				tradingTax,
				tradable
		);
	}
}
