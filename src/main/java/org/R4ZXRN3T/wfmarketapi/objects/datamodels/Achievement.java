package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Achievement metadata and state container.
 */
public class Achievement extends LocalizedDataModel implements Nameable, Describable, Iconable, Thumbable {
	private String id;
	private String slug;
	private String type;
	private Boolean secret;
	private Integer reputationBonus;
	private Integer goal;
	private AchievementState state;

	/**
	 * No-arg constructor.
	 */
	public Achievement() {
		this.id = null;
		this.slug = null;
		this.type = null;
		this.secret = null;
		this.reputationBonus = null;
		this.goal = null;
		this.i18n = null;
		this.state = null;
	}

	/**
	 * All-args constructor.
	 */
	public Achievement(String id, String slug, String type, Boolean secret, Integer reputationBonus, Integer goal, Localization i18n, AchievementState state) {
		this.id = id;
		this.slug = slug;
		this.type = type;
		this.secret = secret;
		this.reputationBonus = reputationBonus;
		this.goal = goal;
		this.i18n = i18n;
		this.state = state;
	}

	/**
	 * Returns achievement id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets achievement id.
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
	 * Returns type.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets type.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Returns secret flag.
	 */
	public Boolean getSecret() {
		return secret;
	}

	/**
	 * Sets secret flag.
	 */
	public void setSecret(Boolean secret) {
		this.secret = secret;
	}

	/**
	 * Returns reputation bonus.
	 */
	public Integer getReputationBonus() {
		return reputationBonus;
	}

	/**
	 * Sets reputation bonus.
	 */
	public void setReputationBonus(Integer reputationBonus) {
		this.reputationBonus = reputationBonus;
	}

	/**
	 * Returns goal value.
	 */
	public Integer getGoal() {
		return goal;
	}

	/**
	 * Sets goal value.
	 */
	public void setGoal(Integer goal) {
		this.goal = goal;
	}

	// Localization getters/setters are provided by LocalizedDataModel

	/**
	 * Returns achievement state.
	 */
	public AchievementState getState() {
		return state;
	}

	/**
	 * Sets achievement state.
	 */
	public void setState(AchievementState state) {
		this.state = state;
	}

	/**
	 * Embedded state for an achievement (user-specific progress/flags).
	 */
	public static class AchievementState {
		private Boolean featured;
		private Boolean hidden;
		private Integer progress;
		private String completedAt;

		/**
		 * No-arg constructor (fields set to null).
		 */
		public AchievementState() {
			this.featured = null;
			this.hidden = null;
			this.progress = null;
			this.completedAt = null;
		}

		/**
		 * All-args constructor.
		 */
		public AchievementState(Boolean featured, Boolean hidden, Integer progress, String completedAt) {
			this.featured = featured;
			this.hidden = hidden;
			this.progress = progress;
			this.completedAt = completedAt;
		}

		/**
		 * Returns whether this achievement is featured.
		 */
		public Boolean getFeatured() {
			return featured;
		}

		/**
		 * Sets featured flag.
		 */
		public void setFeatured(Boolean featured) {
			this.featured = featured;
		}

		/**
		 * Returns hidden flag.
		 */
		public Boolean getHidden() {
			return hidden;
		}

		/**
		 * Sets hidden flag.
		 */
		public void setHidden(Boolean hidden) {
			this.hidden = hidden;
		}

		/**
		 * Returns progress value.
		 */
		public Integer getProgress() {
			return progress;
		}

		/**
		 * Sets progress value.
		 */
		public void setProgress(Integer progress) {
			this.progress = progress;
		}

		/**
		 * Returns completed-at timestamp.
		 */
		public String getCompletedAt() {
			return completedAt;
		}

		/**
		 * Sets completed-at timestamp.
		 */
		public void setCompletedAt(String completedAt) {
			this.completedAt = completedAt;
		}
	}
}
