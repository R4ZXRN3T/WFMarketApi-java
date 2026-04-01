package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized system name (game internal
 * system name representation).
 */
public interface SystemNameable extends Localizable {
	/**
	 * Return the localized system name for the given language.
	 *
	 * @param language preferred language
	 * @return localized system name or {@code null}
	 */
	default String getSystemName(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.SYSTEM_NAME);
	}

	/**
	 * Convenience overload returning the English system name.
	 *
	 * @return English system name or {@code null}
	 */
	default String getSystemName() {
		return getSystemName(Localization.Language.ENGLISH);
	}
}
