package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

// Removed unused static import; localization helpers are provided via capability interfaces

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Short item payload model with common fields and localization convenience methods.
 */
public class ItemShort extends LocalizedDataModel implements Nameable, Iconable, Thumbable, SubIconable {
	private String id;
	private String slug;
	private String gameRef;
	private String[] tags;
	private String[] subtypes;
	private Integer maxRank;
	private Integer maxCharges;
	private Boolean vaulted;
	private Integer ducats;
	private Integer amberStars;
	private Integer cyanStars;
	private Integer baseEndo;
	private Float endoMultiplier;

	/**
	 * No-arg constructor. Initializes all fields to null.
	 */
	public ItemShort() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.tags = null;
		this.i18n = null;
		this.subtypes = null;
		this.maxRank = null;
		this.maxCharges = null;
		this.vaulted = null;
		this.ducats = null;
		this.amberStars = null;
		this.cyanStars = null;
		this.baseEndo = null;
		this.endoMultiplier = null;
	}

	/**
	 * All-args constructor. Assigns provided values to all fields.
	 */
	public ItemShort(String id, String slug, String gameRef, String[] tags, Localization i18n, Integer maxRank, Integer maxCharges, Boolean vaulted, Integer ducats, Integer amberStars, Integer cyanStars, Integer baseEndo, Float endoMultiplier, String[] subtypes) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.tags = tags;
		this.i18n = i18n;
		this.subtypes = subtypes;
		this.maxRank = maxRank;
		this.maxCharges = maxCharges;
		this.vaulted = vaulted;
		this.ducats = ducats;
		this.amberStars = amberStars;
		this.cyanStars = cyanStars;
		this.baseEndo = baseEndo;
		this.endoMultiplier = endoMultiplier;
	}

	/**
	 * Returns the item id.
	 *
	 * @return id string or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the item id.
	 *
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the item slug.
	 *
	 * @return slug string or null
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets the item slug.
	 *
	 * @param slug the slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns the game reference path for the item.
	 *
	 * @return gameRef string or null
	 */
	public String getGameRef() {
		return gameRef;
	}

	/**
	 * Sets the game reference path for the item.
	 *
	 * @param gameRef the game reference to set
	 */
	public void setGameRef(String gameRef) {
		this.gameRef = gameRef;
	}

	/**
	 * Returns tags associated with the item.
	 *
	 * @return array of tag strings or null
	 */
	public String[] getTags() {
		return tags;
	}

	/**
	 * Sets tags associated with the item.
	 *
	 * @param tags array of tag strings
	 */
	public void setTags(String[] tags) {
		this.tags = tags;
	}

	// Localization accessors and localized field getters are provided by
	// LocalizedDataModel and the capability interfaces this class implements.

	/**
	 * Returns the maximum rank available for the item (if applicable).
	 *
	 * @return max rank or null
	 */
	public Integer getMaxRank() {
		return maxRank;
	}

	/**
	 * Sets the maximum rank for the item.
	 *
	 * @param maxRank the max rank to set
	 */
	public void setMaxRank(Integer maxRank) {
		this.maxRank = maxRank;
	}

	/**
	 * Returns the maximum charges for the item (if applicable).
	 *
	 * @return max charges or null
	 */
	public Integer getMaxCharges() {
		return maxCharges;
	}

	/**
	 * Sets the maximum charges for the item.
	 *
	 * @param maxCharges the max charges to set
	 */
	public void setMaxCharges(Integer maxCharges) {
		this.maxCharges = maxCharges;
	}

	/**
	 * Returns whether the item is vaulted.
	 *
	 * @return vaulted flag or null
	 */
	public Boolean getVaulted() {
		return vaulted;
	}

	/**
	 * Sets the vaulted flag for the item.
	 *
	 * @param vaulted boolean flag
	 */
	public void setVaulted(Boolean vaulted) {
		this.vaulted = vaulted;
	}

	/**
	 * Returns ducat value for the item.
	 *
	 * @return ducats or null
	 */
	public Integer getDucats() {
		return ducats;
	}

	/**
	 * Sets ducat value for the item.
	 *
	 * @param ducats ducat value
	 */
	public void setDucats(Integer ducats) {
		this.ducats = ducats;
	}

	/**
	 * Returns base endo value for the item.
	 *
	 * @return base endo or null
	 */
	public Integer getBaseEndo() {
		return baseEndo;
	}

	/**
	 * Sets the base endo value for the item.
	 *
	 * @param baseEndo base endo value
	 */
	public void setBaseEndo(Integer baseEndo) {
		this.baseEndo = baseEndo;
	}

	/**
	 * Returns endo multiplier for the item.
	 *
	 * @return endo multiplier or null
	 */
	public Float getEndoMultiplier() {
		return endoMultiplier;
	}

	/**
	 * Sets the endo multiplier for the item.
	 *
	 * @param endoMultiplier multiplier value
	 */
	public void setEndoMultiplier(Float endoMultiplier) {
		this.endoMultiplier = endoMultiplier;
	}

	/**
	 * Returns subtypes array for the item.
	 *
	 * @return array of subtypes or null
	 */
	public String[] getSubtypes() {
		return subtypes;
	}

	/**
	 * Sets subtypes for the item.
	 *
	 * @param subtypes array of subtypes
	 */
	public void setSubtypes(String[] subtypes) {
		this.subtypes = subtypes;
	}

	/**
	 * Returns the amber stars count.
	 *
	 * @return amber stars or null
	 */
	public Integer getAmberStars() {
		return amberStars;
	}

	/**
	 * Sets amber stars count.
	 *
	 * @param amberStars amber stars count
	 */
	public void setAmberStars(Integer amberStars) {
		this.amberStars = amberStars;
	}

	/**
	 * Returns the cyan stars count.
	 *
	 * @return cyan stars or null
	 */
	public Integer getCyanStars() {
		return cyanStars;
	}

	/**
	 * Sets cyan stars count.
	 *
	 * @param cyanStars cyan stars count
	 */
	public void setCyanStars(Integer cyanStars) {
		this.cyanStars = cyanStars;
	}
}
