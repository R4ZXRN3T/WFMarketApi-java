package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized title/short description.
 *
 * <p>Uses the {@code DESCRIPTION} localized field as the source for title
 * content. Implementations should provide a {@link Localization} via
 * {@link Localizable#getI18n()}.</p>
 */
public interface Titleable extends Localizable {
	/**
	 * Return the localized title for the given language.
	 *
	 * @param language preferred language
	 * @return the localized title or {@code null}
	 */
	default String getTitle(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.DESCRIPTION);
	}

	/**
	 * Convenience overload returning the English title.
	 *
	 * @return the English title or {@code null}
	 */
	default String getTitle() {
		return getTitle(Localization.Language.ENGLISH);
	}
}
