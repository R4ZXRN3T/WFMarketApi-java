package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Describable;
import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Localization;
import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.LocalizedDataModel;
import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.Nameable;

/**
 * Definition of a Lich quirk (special modifiers applied to a Lich-generated
 * weapon or enemy).
 *
 * <p>Quirks include an optional group string and localized name/description
 * via the localization container.</p>
 */
public class LichQuirk extends LocalizedDataModel implements Nameable, Describable {
	private String id;
	private String slug;
	private String group;

	public LichQuirk() {
		this.id = null;
		this.slug = null;
		this.group = null;
		this.i18n = null;
	}

	public LichQuirk(String id, String slug, String group, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.group = group;
		this.i18n = i18n;
	}

	/**
	 * Returns quirk id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets quirk id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns slug.
	 *
	 * @return slug or null
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets slug.
	 *
	 * @param slug slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns group string.
	 *
	 * @return group or null
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets group string.
	 *
	 * @param group group to set
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	// Localization getters/setters are provided by LocalizedDataModel
}
