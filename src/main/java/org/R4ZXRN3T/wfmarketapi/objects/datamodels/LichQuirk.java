package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

public class LichQuirk extends DataModel {
	private String id;
	private String slug;
	private String group;
	private Localization i18n;

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

	/**
	 * Returns localization container.
	 *
	 * @return Localization or null
	 */
	public Localization getI18n() {
		return i18n;
	}

	/**
	 * Sets localization container.
	 *
	 * @param i18n Localization to set
	 */
	public void setI18n(Localization i18n) {
		this.i18n = i18n;
	}
}


