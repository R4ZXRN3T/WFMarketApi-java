package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized node name (e.g. mission
 * node display name).
 */
public interface NodeNameable extends Localizable {
	/**
	 * Return the localized node name for the given language.
	 *
	 * @param language preferred language
	 * @return localized node name or {@code null}
	 */
	default String getNodeName(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.NODE_NAME);
	}

	/**
	 * Convenience overload returning the English node name.
	 *
	 * @return English node name or {@code null}
	 */
	default String getNodeName() {
		return getNodeName(Localization.Language.ENGLISH);
	}
}
