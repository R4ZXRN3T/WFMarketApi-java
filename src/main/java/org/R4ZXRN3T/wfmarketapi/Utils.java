package org.R4ZXRN3T.wfmarketapi;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.Localization;

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
}
