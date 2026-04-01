package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Mission model.
 */
public class Mission extends LocalizedDataModel implements Nameable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String gameRef;

	/**
	 * No-arg constructor initializing fields to null.
	 */
	public Mission() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.i18n = null;
	}

	/**
	 * All-args constructor.
	 */
	public Mission(String id, String slug, String gameRef, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.i18n = i18n;
	}

	/**
	 * Returns mission id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets mission id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns mission slug.
	 *
	 * @return slug or null
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets mission slug.
	 *
	 * @param slug slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns game reference path for the mission.
	 *
	 * @return gameRef or null
	 */
	public String getGameRef() {
		return gameRef;
	}

	/**
	 * Sets game reference path.
	 *
	 * @param gameRef gameRef to set
	 */
	public void setGameRef(String gameRef) {
		this.gameRef = gameRef;
	}

	// Localization getters/setters are provided by LocalizedDataModel
}
