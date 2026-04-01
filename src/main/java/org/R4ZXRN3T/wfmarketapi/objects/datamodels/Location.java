package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Location data model.
 */
public class Location extends LocalizedDataModel implements NodeNameable, SystemNameable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String gameRef;
	private String faction;
	private Integer minLevel;
	private Integer maxLevel;

	/**
	 * No-arg constructor initializing fields to null.
	 */
	public Location() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.faction = null;
		this.minLevel = null;
		this.maxLevel = null;
		this.i18n = null;
	}

	/**
	 * All-args constructor.
	 */
	public Location(String id, String slug, String gameRef, String faction, Integer minLevel, Integer maxLevel, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.faction = faction;
		this.minLevel = minLevel;
		this.maxLevel = maxLevel;
		this.i18n = i18n;
	}

	/**
	 * Returns the location id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the location id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the slug.
	 *
	 * @return slug or null
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets the slug.
	 *
	 * @param slug slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns the game reference.
	 *
	 * @return gameRef or null
	 */
	public String getGameRef() {
		return gameRef;
	}

	/**
	 * Sets the game reference.
	 *
	 * @param gameRef gameRef to set
	 */
	public void setGameRef(String gameRef) {
		this.gameRef = gameRef;
	}

	/**
	 * Returns faction name.
	 *
	 * @return faction or null
	 */
	public String getFaction() {
		return faction;
	}

	/**
	 * Sets faction name.
	 *
	 * @param faction faction to set
	 */
	public void setFaction(String faction) {
		this.faction = faction;
	}

	/**
	 * Returns minimum level.
	 *
	 * @return minLevel or null
	 */
	public Integer getMinLevel() {
		return minLevel;
	}

	/**
	 * Sets minimum level.
	 *
	 * @param minLevel min level to set
	 */
	public void setMinLevel(Integer minLevel) {
		this.minLevel = minLevel;
	}

	/**
	 * Returns maximum level.
	 *
	 * @return maxLevel or null
	 */
	public Integer getMaxLevel() {
		return maxLevel;
	}

	/**
	 * Sets maximum level.
	 *
	 * @param maxLevel max level to set
	 */
	public void setMaxLevel(Integer maxLevel) {
		this.maxLevel = maxLevel;
	}

	// Localization getters/setters are provided by LocalizedDataModel
}
