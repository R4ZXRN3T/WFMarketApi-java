package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ItemShortTest {
	@Test
	public void testGetName_defaultAndFallback() {
		ItemShort item = new ItemShort();
		Localization l = new Localization();
		l.setLanguageData(Localization.Language.ENGLISH, Localization.LocalizedField.NAME, "Sword");
		l.setLanguageData(Localization.Language.GERMAN, Localization.LocalizedField.NAME, "Schwert");
		item.setI18n(l);

		assertEquals("Sword", item.getName());
		assertEquals("Schwert", item.getName(Localization.Language.GERMAN));
		// Request a language that's not present -> fallback to English
		assertEquals("Sword", item.getName(Localization.Language.FRENCH));
	}
}
