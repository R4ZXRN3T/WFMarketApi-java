package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemLocalizationConvenienceTest {
	@Test
	void itemShortConvenienceGettersUseEnglishByDefault() {
		Localization localization = new Localization();
		Localization.LocaleData en = new Localization.LocaleData();
		en.setName("Secura Dual Cestra");
		en.setDescription("A syndicate secondary weapon.");
		localization.setLanguageData(Localization.Language.ENGLISH, en);

		ItemShort itemShort = new ItemShort();
		itemShort.setI18n(localization);

		assertEquals("Secura Dual Cestra", itemShort.getName());
	}

	@Test
	void itemConvenienceGettersFallbackToEnglishWhenLocaleMissing() {
		Localization localization = new Localization();
		Localization.LocaleData en = new Localization.LocaleData();
		en.setName("Abating Link");
		en.setWikiLink("https://warframe.fandom.com/wiki/Abating_Link");
		localization.setLanguageData(Localization.Language.ENGLISH, en);

		Item item = new Item();
		item.setI18n(localization);

		assertEquals("Abating Link", item.getName(Localization.Language.ENGLISH));
		assertEquals("https://warframe.fandom.com/wiki/Abating_Link", item.getWikiLink(Localization.Language.ENGLISH));
	}
}
