package org.R4ZXRN3T.wfmarketapi.utils;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class GeneralTest {
	@Test
	public void testGetLocalizedValue_nullI18n_returnsNull() {
		assertNull(General.getLocalizedValue(null, Localization.Language.ENGLISH, Localization.LocalizedField.NAME));
	}

	@Test
	public void testGetLocalizedValue_fallbackToEnglish() {
		Localization l = new Localization();
		l.setLanguageData(Localization.Language.ENGLISH, Localization.LocalizedField.NAME, "EnglishName");

		// Request German which is not present -> should fallback to English
		String v = General.getLocalizedValue(l, Localization.Language.GERMAN, Localization.LocalizedField.NAME);
		assertEquals("EnglishName", v);
	}

	@Test
	public void testParseTimestamp_withZoneAndWithoutZone() {
		LocalDateTime withZone = General.parseTimestamp("2026-03-27T16:43:42Z");
		assertNotNull(withZone);

		LocalDateTime withoutZone = General.parseTimestamp("2026-03-27T16:43:42");
		assertEquals(LocalDateTime.of(2026, 3, 27, 16, 43, 42), withoutZone);
	}

	@Test
	public void testParseTimestamp_nullOrEmpty_returnsNull() {
		assertNull(General.parseTimestamp(null));
		assertNull(General.parseTimestamp(""));
	}

	@Test
	public void testJsonArrayToStringArray_mixedAndNull() {
		JSONArray arr = new JSONArray();
		arr.put("a");
		arr.put(JSONObject.NULL);
		arr.put(3);

		String[] out = General.jsonArrayToStringArray(arr);
		assertEquals(3, out.length);
		assertEquals("a", out[0]);
		assertNull(out[1]);
		assertEquals("3", out[2]);

		String[] empty = General.jsonArrayToStringArray(null);
		assertEquals(0, empty.length);
	}

	@Test
	public void testOptNullableHelpers_andOptStringArray() {
		JSONObject json = new JSONObject();
		json.put("s", "ok");
		json.put("n", JSONObject.NULL);
		json.put("i", 5);
		json.put("f", 1.5);
		json.put("b", true);
		JSONArray arr = new JSONArray();
		arr.put("x");
		json.put("arr", arr);

		assertEquals("ok", General.optStringNullable(json, "s"));
		assertNull(General.optStringNullable(json, "n"));
		assertEquals(Integer.valueOf(5), General.optIntegerNullable(json, "i"));
		assertNull(General.optIntegerNullable(json, "missing"));
		assertEquals(Float.valueOf(1.5f), General.optFloatNullable(json, "f"));
		assertEquals(Boolean.TRUE, General.optBooleanNullable(json, "b"));

		String[] sa = General.optStringArrayNullable(json, "arr");
		assertNotNull(sa);
		assertArrayEquals(new String[]{"x"}, sa);

		assertNull(General.optStringArrayNullable(json, "missing"));
	}

	@Test
	public void testParseLocalization_parsesKnownLanguagesAndIgnoresUnknown() {
		JSONObject loc = new JSONObject();
		JSONObject en = new JSONObject();
		en.put("name", "EName");
		en.put("description", "EDesc");
		loc.put("en", en);

		JSONObject de = new JSONObject();
		de.put("name", "DName");
		loc.put("de", de);

		// unknown language code should be ignored
		loc.put("xx", new JSONObject().put("name", "XName"));

		Localization parsed = General.parseLocalization(loc);
		assertEquals("EName", parsed.getLanguageData(Localization.Language.ENGLISH).getName());
		assertEquals("EDesc", parsed.getLanguageData(Localization.Language.ENGLISH).getDescription());
		assertEquals("DName", parsed.getLanguageData(Localization.Language.GERMAN).getName());
		assertNull(parsed.getLanguageData(Localization.Language.CHINESE_SIMPLIFIED));
	}
}
