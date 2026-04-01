package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.utils.General;

/**
 * Interface for models that expose a localized name.
 *
 * <p>Provides convenience default methods that use the shared
 * {@link General#getLocalizedValue(Localization, Localization.Language, Localization.LocalizedField)}
 * helper to extract the localized name from the model's {@link Localization}.
 */
public interface Nameable extends Localizable {
	/**
	 * Return the localized name for the given language.
	 *
	 * @param language preferred language
	 * @return the localized name or {@code null}
	 */
	default String getName(Localization.Language language) {
		return General.getLocalizedValue(getI18n(), language, Localization.LocalizedField.NAME);
	}

	/**
	 * Convenience overload returning the English name.
	 *
	 * @return the English localized name or {@code null}
	 */
	default String getName() {
		return getName(Localization.Language.ENGLISH);
	}
}
