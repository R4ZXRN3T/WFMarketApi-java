package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.DataModel;

/**
 * Minimal base class that holds the localization container.
 *
 * <p>Subclasses may implement additional helper interfaces such as
 * {@link Nameable}, {@link Describable} or {@link Iconable} to expose specific
 * localized fields. This class provides the backing storage and basic
 * accessors for the {@link Localization} container.</p>
 */
public abstract class LocalizedDataModel extends DataModel implements Localizable {
	/**
	 * Localization container holding per-language localized fields.
	 */
	protected Localization i18n;

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Localization getI18n() {
		return i18n;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void setI18n(Localization i18n) {
		this.i18n = i18n;
	}
}
