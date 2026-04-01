package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums.ActivityType;

/**
 * Represents a user's current activity or status details returned by the API.
 *
 * <p>Stored in user payloads to convey what the user is currently doing or
 * to provide additional context (for example a mission or in-game action).
 * Fields may be {@code null} when not provided by the API.</p>
 */
public class Activity extends DataModel {
	private ActivityType type;
	private String details;
	private String startedAt;

	public Activity() {
		this.type = null;
		this.details = null;
		this.startedAt = null;
	}

	public Activity(ActivityType type, String details, String startedAt) {
		this.type = type;
		this.details = details;
		this.startedAt = startedAt;
	}

	/**
	 * Returns the activity type.
	 *
	 * @return ActivityType or null
	 */
	public ActivityType getType() {
		return type;
	}

	/**
	 * Sets the activity type.
	 *
	 * @param type activity type to set
	 */
	public void setType(ActivityType type) {
		this.type = type;
	}

	/**
	 * Returns activity details string.
	 *
	 * @return details or null
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * Sets activity details string.
	 *
	 * @param details details to set
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 * Returns activity startedAt timestamp.
	 *
	 * @return startedAt or null
	 */
	public String getStartedAt() {
		return startedAt;
	}

	/**
	 * Sets activity startedAt timestamp.
	 *
	 * @param startedAt timestamp to set
	 */
	public void setStartedAt(String startedAt) {
		this.startedAt = startedAt;
	}
}
