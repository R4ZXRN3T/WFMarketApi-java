package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized sub-icon path.
 *
 * <p>Sub-icons are an optional secondary icon used by some manifests. The
 * default methods retrieve the value for a specific language or fall back
 * to English when not present.</p>
 */
public interface SubIconable extends Localizable {
	/**
	 * Return the localized sub-icon path for the given language.
	 *
	 * @param language preferred language
	 * @return sub-icon path or {@code null}
	 */
	default String getSubIcon(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.SUB_ICON);
	}

	/**
	 * Convenience overload returning the English sub-icon path.
	 *
	 * @return English sub-icon path or {@code null}
	 */
	default String getSubIcon() {
		return getSubIcon(Localization.Language.ENGLISH);
	}
}
