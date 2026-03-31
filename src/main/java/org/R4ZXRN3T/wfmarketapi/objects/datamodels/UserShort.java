package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Minimal user payload returned in lists and public contexts.
 */
public class UserShort extends DataModel {
	private String id;
	private String ingameName;
	private String avatar;
	private Integer reputation;
	private String locale;
	private String platform;
	private Boolean crossplay;
	private String status;
	private Activity activity;
	private String lastSeen;

	/**
	 * No-arg constructor initializing fields to null.
	 */
	public UserShort() {
		this.id = null;
		this.ingameName = null;
		this.avatar = null;
		this.reputation = null;
		this.locale = null;
		this.platform = null;
		this.crossplay = null;
		this.status = null;
		this.activity = null;
		this.lastSeen = null;
	}

	/**
	 * All-args constructor.
	 */
	public UserShort(String id, String ingameName, String avatar, Integer reputation, String locale, String platform, Boolean crossplay, String status, Activity activity, String lastSeen) {
		this.id = id;
		this.ingameName = ingameName;
		this.avatar = avatar;
		this.reputation = reputation;
		this.locale = locale;
		this.platform = platform;
		this.crossplay = crossplay;
		this.status = status;
		this.activity = activity;
		this.lastSeen = lastSeen;
	}

	/**
	 * Returns the user's id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the user's id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the in-game display name.
	 */
	public String getIngameName() {
		return ingameName;
	}

	/**
	 * Sets the in-game display name.
	 */
	public void setIngameName(String ingameName) {
		this.ingameName = ingameName;
	}

	/**
	 * Returns avatar path or URL.
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * Sets avatar path or URL.
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Returns reputation value.
	 */
	public Integer getReputation() {
		return reputation;
	}

	/**
	 * Sets reputation value.
	 */
	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	/**
	 * Returns the user's locale string.
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Sets the user's locale.
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * Returns the user's platform identifier.
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * Sets the user's platform.
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Returns whether crossplay is enabled.
	 */
	public Boolean getCrossplay() {
		return crossplay;
	}

	/**
	 * Sets the crossplay flag.
	 */
	public void setCrossplay(Boolean crossplay) {
		this.crossplay = crossplay;
	}

	/**
	 * Returns the user's status string.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets the user's status string.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Returns the user's current activity.
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * Sets the user's current activity.
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 * Returns the last seen timestamp.
	 */
	public String getLastSeen() {
		return lastSeen;
	}

	/**
	 * Sets the last seen timestamp.
	 */
	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}
}


