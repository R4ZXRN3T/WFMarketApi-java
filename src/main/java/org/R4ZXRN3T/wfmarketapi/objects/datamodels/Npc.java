package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

public class Npc extends DataModel {
	private String id;
	private String slug;
	private String gameRef;
	private Localization i18n;

	public Npc() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.i18n = null;
	}

	public Npc(String id, String slug, String gameRef, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.i18n = i18n;
	}

	/**
	 * Returns NPC id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets NPC id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns NPC slug.
	 *
	 * @return slug or null
	 */
	public String getSlug() {
		return slug;
	}

	/**
	 * Sets NPC slug.
	 *
	 * @param slug slug to set
	 */
	public void setSlug(String slug) {
		this.slug = slug;
	}

	/**
	 * Returns game reference path for the NPC.
	 *
	 * @return gameRef or null
	 */
	public String getGameRef() {
		return gameRef;
	}

	/**
	 * Sets the game reference path for the NPC.
	 *
	 * @param gameRef game reference to set
	 */
	public void setGameRef(String gameRef) {
		this.gameRef = gameRef;
	}

	/**
	 * Returns localization data for the NPC.
	 *
	 * @return Localization object or null
	 */
	public Localization getI18n() {
		return i18n;
	}

	/**
	 * Sets localization data for the NPC.
	 *
	 * @param i18n Localization object
	 */
	public void setI18n(Localization i18n) {
		this.i18n = i18n;
	}
}


