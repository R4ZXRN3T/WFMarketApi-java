package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized icon path.
 */
public interface Iconable extends Localizable {
	/**
	 * Return the localized icon path for the given language.
	 *
	 * @param language preferred language
	 * @return icon path or {@code null}
	 */
	default String getIcon(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.ICON);
	}

	/**
	 * Convenience overload returning the English icon path.
	 *
	 * @return English icon path or {@code null}
	 */
	default String getIcon() {
		return getIcon(Localization.Language.ENGLISH);
	}
}
