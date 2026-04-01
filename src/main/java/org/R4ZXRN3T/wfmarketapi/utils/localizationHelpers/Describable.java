package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized description.
 *
 * <p>Provides a convenience accessor to obtain the description text for a
 * requested language or the English fallback.</p>
 */
public interface Describable extends Localizable {
	/**
	 * Return the localized description for the given language.
	 *
	 * @param language preferred language
	 * @return localized description or {@code null}
	 */
	default String getDescription(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.DESCRIPTION);
	}

	/**
	 * Convenience overload returning the English description.
	 *
	 * @return English description or {@code null}
	 */
	default String getDescription() {
		return getDescription(Localization.Language.ENGLISH);
	}
}
