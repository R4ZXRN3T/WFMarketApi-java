package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

/**
 * Interface for models that contain localization data.
 *
 * <p>Implementations store a {@link Localization} container. This interface
 * provides the canonical {@code getI18n/setI18n} accessors.</p>
 */
public interface Localizable {
	/**
	 * Return the {@link Localization} container for this model.
	 *
	 * @return the localization container, may be {@code null}
	 */
	Localization getI18n();

	/**
	 * Set the {@link Localization} container for this model.
	 *
	 * @param i18n localization container to assign
	 */
	void setI18n(Localization i18n);
}
