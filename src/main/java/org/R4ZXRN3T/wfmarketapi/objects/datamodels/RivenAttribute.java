package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Model for Riven attribute metadata.
 */
public class RivenAttribute extends LocalizedDataModel implements Nameable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String gameRef;
	private String group;
	private String prefix;
	private String suffix;
	private String[] exclusiveTo;
	private Boolean positiveIsNegative;
	private String unit;
	private Boolean positiveOnly;
	private Boolean negativeOnly;

	/**
	 * No-arg constructor.
	 */
	public RivenAttribute() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.group = null;
		this.prefix = null;
		this.suffix = null;
		this.exclusiveTo = null;
		this.positiveIsNegative = null;
		this.unit = null;
		this.positiveOnly = null;
		this.negativeOnly = null;
		this.i18n = null;
	}

	/**
	 * All-args constructor.
	 */
	public RivenAttribute(String id, String slug, String gameRef, String group, String prefix, String suffix, String[] exclusiveTo, Boolean positiveIsNegative, String unit, Boolean positiveOnly, Boolean negativeOnly, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.group = group;
		this.prefix = prefix;
		this.suffix = suffix;
		this.exclusiveTo = exclusiveTo;
		this.positiveIsNegative = positiveIsNegative;
		this.unit = unit;
		this.positiveOnly = positiveOnly;
		this.negativeOnly = negativeOnly;
		this.i18n = i18n;
	}

	/**
	 * Returns id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns slug.
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets slug.
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns gameRef.
	 */
	public String getGameRef() {
		return gameRef;
	}

	/**
	 * Sets gameRef.
	 */
	public void setGameRef(String gameRef) {
		this.gameRef = gameRef;
	}

	/**
	 * Returns group.
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets group.
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 * Returns prefix.
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * Sets prefix.
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * Returns suffix.
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * Sets suffix.
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	/**
	 * Returns exclusiveTo array.
	 */
	public String[] getExclusiveTo() {
		return exclusiveTo;
	}

	/**
	 * Sets exclusiveTo array.
	 */
	public void setExclusiveTo(String[] exclusiveTo) {
		this.exclusiveTo = exclusiveTo;
	}

	/**
	 * Returns positiveIsNegative flag.
	 */
	public Boolean getPositiveIsNegative() {
		return positiveIsNegative;
	}

	/**
	 * Sets positiveIsNegative flag.
	 */
	public void setPositiveIsNegative(Boolean positiveIsNegative) {
		this.positiveIsNegative = positiveIsNegative;
	}

	/**
	 * Returns unit.
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * Sets unit.
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}

	/**
	 * Returns positiveOnly flag.
	 */
	public Boolean getPositiveOnly() {
		return positiveOnly;
	}

	/**
	 * Sets positiveOnly flag.
	 */
	public void setPositiveOnly(Boolean positiveOnly) {
		this.positiveOnly = positiveOnly;
	}

	/**
	 * Returns negativeOnly flag.
	 */
	public Boolean getNegativeOnly() {
		return negativeOnly;
	}

	/**
	 * Sets negativeOnly flag.
	 */
	public void setNegativeOnly(Boolean negativeOnly) {
		this.negativeOnly = negativeOnly;
	}

	/**
	 * Returns localization container.
	 */
	// Localization accessors and localized field getters are provided by
	// LocalizedDataModel and by capability interfaces (Nameable/Iconable/Thumbable).
}
