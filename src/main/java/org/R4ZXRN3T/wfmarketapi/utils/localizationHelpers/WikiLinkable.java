package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized Wiki link.
 *
 * <p>Implementing classes must provide a {@link Localization} container via
 * {@link Localizable#getI18n()}. The default helper methods retrieve the
 * Wiki link for a specific language or fall back to English when no
 * language is supplied.</p>
 */
public interface WikiLinkable extends Localizable {
	/**
	 * Return the localized Wiki link for the given language.
	 *
	 * @param language preferred language to retrieve
	 * @return the Wiki link string for the requested language, or {@code null}
	 * when no localization is available
	 */
	default String getWikiLink(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.WIKI_LINK);
	}

	/**
	 * Convenience overload returning the English Wiki link.
	 *
	 * @return the English Wiki link or {@code null}
	 */
	default String getWikiLink() {
		return getWikiLink(Localization.Language.ENGLISH);
	}
}
