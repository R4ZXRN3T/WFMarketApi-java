package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Model representing a Sisters of Parvos weapon metadata entry.
 */
public class SisterWeapon extends LocalizedDataModel implements Nameable, WikiLinkable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String gameRef;
	private Integer reqMasteryRank;

	public SisterWeapon() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.reqMasteryRank = null;
		this.i18n = null;
	}

	public SisterWeapon(String id, String slug, String gameRef, Integer reqMasteryRank, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.reqMasteryRank = reqMasteryRank;
		this.i18n = i18n;
	}

	/**
	 * Returns sister weapon id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets sister weapon id.
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
	 * Returns required mastery rank.
	 */
	public Integer getReqMasteryRank() {
		return reqMasteryRank;
	}

	/**
	 * Sets required mastery rank.
	 */
	public void setReqMasteryRank(Integer reqMasteryRank) {
		this.reqMasteryRank = reqMasteryRank;
	}

	// Localization getters/setters are provided by LocalizedDataModel
}


