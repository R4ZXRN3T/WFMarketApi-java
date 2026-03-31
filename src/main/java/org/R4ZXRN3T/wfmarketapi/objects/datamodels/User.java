package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Public user profile model.
 */
public class User extends DataModel {
	private String id;
	private String ingameName;
	private String avatar;
	private String background;
	private String about;
	private Integer reputation;
	private Integer masteryLevel;
	private String platform;
	private Boolean crossplay;
	private String locale;
	private Achievement[] achievementShowcase;
	private String status;
	private Activity activity;
	private String lastSeen;
	private Boolean banned;
	private String banUntil;
	private Boolean warned;
	private String warnMessage;
	private String banMessage;

	/**
	 * No-arg constructor. Initializes all fields to null.
	 */
	public User() {
		this.id = null;
		this.ingameName = null;
		this.avatar = null;
		this.background = null;
		this.about = null;
		this.reputation = null;
		this.masteryLevel = null;
		this.platform = null;
		this.crossplay = null;
		this.locale = null;
		this.achievementShowcase = null;
		this.status = null;
		this.activity = null;
		this.lastSeen = null;
		this.banned = null;
		this.banUntil = null;
		this.warned = null;
		this.warnMessage = null;
		this.banMessage = null;
	}

	/**
	 * All-args constructor.
	 */
	public User(String id, String ingameName, String avatar, String background, String about, Integer reputation, Integer masteryLevel, String platform, Boolean crossplay, String locale, Achievement[] achievementShowcase, String status, Activity activity, String lastSeen, Boolean banned, String banUntil, Boolean warned, String warnMessage, String banMessage) {
		this.id = id;
		this.ingameName = ingameName;
		this.avatar = avatar;
		this.background = background;
		this.about = about;
		this.reputation = reputation;
		this.masteryLevel = masteryLevel;
		this.platform = platform;
		this.crossplay = crossplay;
		this.locale = locale;
		this.achievementShowcase = achievementShowcase;
		this.status = status;
		this.activity = activity;
		this.lastSeen = lastSeen;
		this.banned = banned;
		this.banUntil = banUntil;
		this.warned = warned;
		this.warnMessage = warnMessage;
		this.banMessage = banMessage;
	}

	/**
	 * Returns the user id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the user id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns the in-game display name.
	 *
	 * @return ingameName or null
	 */
	public String getIngameName() {
		return ingameName;
	}

	/**
	 * Sets the in-game display name.
	 *
	 * @param ingameName name to set
	 */
	public void setIngameName(String ingameName) {
		this.ingameName = ingameName;
	}

	/**
	 * Returns avatar path or URL.
	 *
	 * @return avatar or null
	 */
	public String getAvatar() {
		return avatar;
	}

	/**
	 * Sets avatar path or URL.
	 *
	 * @param avatar avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * Returns background path or URL.
	 *
	 * @return background or null
	 */
	public String getBackground() {
		return background;
	}

	/**
	 * Sets background path or URL.
	 *
	 * @param background background to set
	 */
	public void setBackground(String background) {
		this.background = background;
	}

	/**
	 * Returns the about HTML content for the user.
	 *
	 * @return about content or null
	 */
	public String getAbout() {
		return about;
	}

	/**
	 * Sets the about HTML content.
	 *
	 * @param about about content
	 */
	public void setAbout(String about) {
		this.about = about;
	}

	/**
	 * Returns reputation value.
	 *
	 * @return reputation or null
	 */
	public Integer getReputation() {
		return reputation;
	}

	/**
	 * Sets reputation value.
	 *
	 * @param reputation reputation to set
	 */
	public void setReputation(Integer reputation) {
		this.reputation = reputation;
	}

	/**
	 * Returns mastery level.
	 *
	 * @return mastery level or null
	 */
	public Integer getMasteryLevel() {
		return masteryLevel;
	}

	/**
	 * Sets mastery level.
	 *
	 * @param masteryLevel mastery level to set
	 */
	public void setMasteryLevel(Integer masteryLevel) {
		this.masteryLevel = masteryLevel;
	}

	/**
	 * Returns platform identifier.
	 *
	 * @return platform or null
	 */
	public String getPlatform() {
		return platform;
	}

	/**
	 * Sets the platform identifier.
	 *
	 * @param platform platform string
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}

	/**
	 * Returns whether crossplay is enabled for the user.
	 *
	 * @return crossplay flag or null
	 */
	public Boolean getCrossplay() {
		return crossplay;
	}

	/**
	 * Sets the crossplay flag.
	 *
	 * @param crossplay boolean flag
	 */
	public void setCrossplay(Boolean crossplay) {
		this.crossplay = crossplay;
	}

	/**
	 * Returns user's locale string.
	 *
	 * @return locale or null
	 */
	public String getLocale() {
		return locale;
	}

	/**
	 * Sets user's locale string.
	 *
	 * @param locale locale to set
	 */
	public void setLocale(String locale) {
		this.locale = locale;
	}

	/**
	 * Returns achievement showcase array.
	 *
	 * @return array of Achievement or null
	 */
	public Achievement[] getAchievementShowcase() {
		return achievementShowcase;
	}

	/**
	 * Sets achievement showcase.
	 *
	 * @param achievementShowcase array of Achievement
	 */
	public void setAchievementShowcase(Achievement[] achievementShowcase) {
		this.achievementShowcase = achievementShowcase;
	}

	/**
	 * Returns user's status string.
	 *
	 * @return status or null
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets user's status string.
	 *
	 * @param status status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Returns user's current activity.
	 *
	 * @return Activity or null
	 */
	public Activity getActivity() {
		return activity;
	}

	/**
	 * Sets user's current activity.
	 *
	 * @param activity Activity instance
	 */
	public void setActivity(Activity activity) {
		this.activity = activity;
	}

	/**
	 * Returns last seen timestamp.
	 *
	 * @return ISO timestamp string or null
	 */
	public String getLastSeen() {
		return lastSeen;
	}

	/**
	 * Sets last seen timestamp.
	 *
	 * @param lastSeen timestamp string
	 */
	public void setLastSeen(String lastSeen) {
		this.lastSeen = lastSeen;
	}

	/**
	 * Returns banned flag.
	 *
	 * @return banned flag or null
	 */
	public Boolean getBanned() {
		return banned;
	}

	/**
	 * Sets banned flag.
	 *
	 * @param banned boolean flag
	 */
	public void setBanned(Boolean banned) {
		this.banned = banned;
	}

	/**
	 * Returns ban until timestamp.
	 *
	 * @return ISO timestamp string or null
	 */
	public String getBanUntil() {
		return banUntil;
	}

	/**
	 * Sets ban until timestamp.
	 *
	 * @param banUntil timestamp string
	 */
	public void setBanUntil(String banUntil) {
		this.banUntil = banUntil;
	}

	/**
	 * Returns warned flag.
	 *
	 * @return warned flag or null
	 */
	public Boolean getWarned() {
		return warned;
	}

	/**
	 * Sets warned flag.
	 *
	 * @param warned boolean flag
	 */
	public void setWarned(Boolean warned) {
		this.warned = warned;
	}

	/**
	 * Returns warn message.
	 *
	 * @return warn message or null
	 */
	public String getWarnMessage() {
		return warnMessage;
	}

	/**
	 * Sets warn message.
	 *
	 * @param warnMessage message to set
	 */
	public void setWarnMessage(String warnMessage) {
		this.warnMessage = warnMessage;
	}

	/**
	 * Returns ban message.
	 *
	 * @return ban message or null
	 */
	public String getBanMessage() {
		return banMessage;
	}

	/**
	 * Sets ban message.
	 *
	 * @param banMessage message to set
	 */
	public void setBanMessage(String banMessage) {
		this.banMessage = banMessage;
	}
}


