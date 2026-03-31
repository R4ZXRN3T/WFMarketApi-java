package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

public class UserPrivate extends User {
	private Role role;
	private String aboutRaw;
	private Integer credits;
	private String theme;
	private Boolean verification;
	private String checkCode;
	private Tier tier;
	private Boolean subscription;
	private Integer reviewsLeft;
	private Integer unreadMessages;
	private String[] ignoreList;
	private Boolean deleteInProgress;
	private String deleteAt;
	private Object linkedAccounts; // placeholder
	private Boolean hasEmail;
	private String createdAt;

	public UserPrivate() {
		super();
		this.role = null;
		this.aboutRaw = null;
		this.credits = null;
		this.theme = null;
		this.verification = null;
		this.checkCode = null;
		this.tier = null;
		this.subscription = null;
		this.reviewsLeft = null;
		this.unreadMessages = null;
		this.ignoreList = null;
		this.deleteInProgress = null;
		this.deleteAt = null;
		this.linkedAccounts = null;
		this.hasEmail = null;
		this.createdAt = null;
	}

	public UserPrivate(Role role, String aboutRaw, Integer credits, String theme, Boolean verification, String checkCode, Tier tier, Boolean subscription, Integer reviewsLeft, Integer unreadMessages, String[] ignoreList, Boolean deleteInProgress, String deleteAt, Object linkedAccounts, Boolean hasEmail, String createdAt) {
		super();
		this.role = role;
		this.aboutRaw = aboutRaw;
		this.credits = credits;
		this.theme = theme;
		this.verification = verification;
		this.checkCode = checkCode;
		this.tier = tier;
		this.subscription = subscription;
		this.reviewsLeft = reviewsLeft;
		this.unreadMessages = unreadMessages;
		this.ignoreList = ignoreList;
		this.deleteInProgress = deleteInProgress;
		this.deleteAt = deleteAt;
		this.linkedAccounts = linkedAccounts;
		this.hasEmail = hasEmail;
		this.createdAt = createdAt;
	}

	/**
	 * Returns role.
	 */
	public Role getRole() {
		return role;
	}

	/**
	 * Sets role.
	 */
	public void setRole(Role role) {
		this.role = role;
	}

	/**
	 * Returns aboutRaw HTML.
	 */
	public String getAboutRaw() {
		return aboutRaw;
	}

	/**
	 * Sets aboutRaw HTML.
	 */
	public void setAboutRaw(String aboutRaw) {
		this.aboutRaw = aboutRaw;
	}

	/**
	 * Returns credits.
	 */
	public Integer getCredits() {
		return credits;
	}

	/**
	 * Sets credits.
	 */
	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	/**
	 * Returns theme name.
	 */
	public String getTheme() {
		return theme;
	}

	/**
	 * Sets theme name.
	 */
	public void setTheme(String theme) {
		this.theme = theme;
	}

	/**
	 * Returns verification flag.
	 */
	public Boolean getVerification() {
		return verification;
	}

	/**
	 * Sets verification flag.
	 */
	public void setVerification(Boolean verification) {
		this.verification = verification;
	}

	/**
	 * Returns check code.
	 */
	public String getCheckCode() {
		return checkCode;
	}

	/**
	 * Sets check code.
	 */
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	/**
	 * Returns tier.
	 */
	public Tier getTier() {
		return tier;
	}

	/**
	 * Sets tier.
	 */
	public void setTier(Tier tier) {
		this.tier = tier;
	}

	/**
	 * Returns subscription flag.
	 */
	public Boolean getSubscription() {
		return subscription;
	}

	/**
	 * Sets subscription flag.
	 */
	public void setSubscription(Boolean subscription) {
		this.subscription = subscription;
	}

	/**
	 * Returns reviews left.
	 */
	public Integer getReviewsLeft() {
		return reviewsLeft;
	}

	/**
	 * Sets reviews left.
	 */
	public void setReviewsLeft(Integer reviewsLeft) {
		this.reviewsLeft = reviewsLeft;
	}

	/**
	 * Returns unread messages count.
	 */
	public Integer getUnreadMessages() {
		return unreadMessages;
	}

	/**
	 * Sets unread messages count.
	 */
	public void setUnreadMessages(Integer unreadMessages) {
		this.unreadMessages = unreadMessages;
	}

	/**
	 * Returns ignore list.
	 */
	public String[] getIgnoreList() {
		return ignoreList;
	}

	/**
	 * Sets ignore list.
	 */
	public void setIgnoreList(String[] ignoreList) {
		this.ignoreList = ignoreList;
	}

	/**
	 * Returns delete in progress flag.
	 */
	public Boolean getDeleteInProgress() {
		return deleteInProgress;
	}

	/**
	 * Sets delete in progress flag.
	 */
	public void setDeleteInProgress(Boolean deleteInProgress) {
		this.deleteInProgress = deleteInProgress;
	}

	/**
	 * Returns delete at timestamp.
	 */
	public String getDeleteAt() {
		return deleteAt;
	}

	/**
	 * Sets delete at timestamp.
	 */
	public void setDeleteAt(String deleteAt) {
		this.deleteAt = deleteAt;
	}

	/**
	 * Returns linked accounts object.
	 */
	public Object getLinkedAccounts() {
		return linkedAccounts;
	}

	/**
	 * Sets linked accounts object.
	 */
	public void setLinkedAccounts(Object linkedAccounts) {
		this.linkedAccounts = linkedAccounts;
	}

	/**
	 * Returns whether user has verified email.
	 */
	public Boolean getHasEmail() {
		return hasEmail;
	}

	/**
	 * Sets hasEmail flag.
	 */
	public void setHasEmail(Boolean hasEmail) {
		this.hasEmail = hasEmail;
	}

	/**
	 * Returns creation timestamp.
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets creation timestamp.
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
}


