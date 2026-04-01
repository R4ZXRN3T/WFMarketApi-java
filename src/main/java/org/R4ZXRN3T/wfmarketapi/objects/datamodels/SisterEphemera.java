package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Ephemera metadata for Sisters of Parvos items (visual/effect metadata).
 *
 * <p>Includes animation and element fields and supports localization via the
 * {@link LocalizedDataModel} base class.</p>
 */
public class SisterEphemera extends LocalizedDataModel implements Nameable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String gameRef;
	private String animation;
	private String element;

	public SisterEphemera() {
		this.id = null;
		this.slug = null;
		this.gameRef = null;
		this.animation = null;
		this.element = null;
		this.i18n = null;
	}

	public SisterEphemera(String id, String slug, String gameRef, String animation, String element, Localization i18n) {
		this.id = id;
		this.slug = slug;
		this.gameRef = gameRef;
		this.animation = animation;
		this.element = element;
		this.i18n = i18n;
	}

	/**
	 * Returns ephemera id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets ephemera id.
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
	 * Returns animation path.
	 */
	public String getAnimation() {
		return animation;
	}

	/**
	 * Sets animation path.
	 */
	public void setAnimation(String animation) {
		this.animation = animation;
	}

	/**
	 * Returns element type.
	 */
	public String getElement() {
		return element;
	}

	/**
	 * Sets element type.
	 */
	public void setElement(String element) {
		this.element = element;
	}

	// Localization getters/setters are provided by LocalizedDataModel
}
