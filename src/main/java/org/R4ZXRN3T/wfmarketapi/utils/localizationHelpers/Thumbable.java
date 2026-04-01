package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized thumbnail path.
 *
 * <p>Default methods will return the thumbnail for a requested language or
 * fall back to English when not present.</p>
 */
public interface Thumbable extends Localizable {
	/**
	 * Return the localized thumbnail path for the given language.
	 *
	 * @param language preferred language
	 * @return thumbnail path or {@code null}
	 */
	default String getThumb(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.THUMB);
	}

	/**
	 * Convenience overload returning the English thumbnail.
	 *
	 * @return English thumbnail path or {@code null}
	 */
	default String getThumb() {
		return getThumb(Localization.Language.ENGLISH);
	}
}
