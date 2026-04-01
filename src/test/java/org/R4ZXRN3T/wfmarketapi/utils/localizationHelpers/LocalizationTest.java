package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class LocalizationTest {
	@Test
	public void testLocaleData_defaultsAndSetters() {
		Localization.LocaleData d = new Localization.LocaleData();
		// constructor initializes several fields to empty string
		assertEquals("", d.getName());
		assertEquals("", d.getDescription());
		assertEquals("", d.getWikiLink());
		assertEquals("", d.getIcon());
		assertEquals("", d.getThumb());
		assertEquals("", d.getSubIcon());

		// title and other fields default to null until set
		assertNull(d.getTitle());

		d.setTitle("T");
		assertEquals("T", d.getTitle());
	}

	@Test
	public void testLanguage_fromCode_andToString() {
		assertEquals(Localization.Language.ENGLISH, Localization.Language.fromCode("en"));
		assertEquals("de", Localization.Language.GERMAN.toString());
		assertNull(Localization.Language.fromCode("xx"));
	}

	@Test
	public void testSetAndGetLanguageData_fieldSetter() {
		Localization loc = new Localization();
		loc.setLanguageData(Localization.Language.ENGLISH, Localization.LocalizedField.NAME, "Name1");
		assertEquals("Name1", loc.getLanguageData(Localization.Language.ENGLISH).getName());

		Localization.LocaleData ld = new Localization.LocaleData();
		ld.setName("Other");
		loc.setLanguageData(Localization.Language.GERMAN, ld);
		assertEquals("Other", loc.getLanguageData(Localization.Language.GERMAN).getName());
	}
}
