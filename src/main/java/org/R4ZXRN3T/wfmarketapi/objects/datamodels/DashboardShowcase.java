package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Dashboard showcase model used by mobile app main screen to show featured items.
 */
public class DashboardShowcase extends DataModel {
	private Localization i18n;
	private DashboardShowcaseItem[] items;

	/**
	 * No-arg constructor.
	 */
	public DashboardShowcase() {
		this.i18n = null;
		this.items = null;
	}

	/**
	 * All-args constructor.
	 */
	public DashboardShowcase(Localization i18n, DashboardShowcaseItem[] items) {
		this.i18n = i18n;
		this.items = items;
	}

	/**
	 * Returns localization container for the showcase.
	 *
	 * @return Localization or null
	 */
	public Localization getI18n() {
		return i18n;
	}

	/**
	 * Sets localization container for the showcase.
	 *
	 * @param i18n Localization to set
	 */
	public void setI18n(Localization i18n) {
		this.i18n = i18n;
	}

	/**
	 * Returns items in the showcase.
	 *
	 * @return array of DashboardShowcaseItem or null
	 */
	public DashboardShowcaseItem[] getItems() {
		return items;
	}

	/**
	 * Sets items in the showcase.
	 *
	 * @param items array of DashboardShowcaseItem
	 */
	public void setItems(DashboardShowcaseItem[] items) {
		this.items = items;
	}

	/**
	 * Single item within a dashboard showcase.
	 */
	public static class DashboardShowcaseItem {
		private String item;
		private String background;
		private Boolean bigCard;

		/**
		 * No-arg constructor.
		 */
		public DashboardShowcaseItem() {
			this.item = null;
			this.background = null;
			this.bigCard = null;
		}

		/**
		 * All-args constructor.
		 */
		public DashboardShowcaseItem(String item, String background, Boolean bigCard) {
			this.item = item;
			this.background = background;
			this.bigCard = bigCard;
		}

		/**
		 * Returns referenced item id.
		 *
		 * @return item id or null
		 */
		public String getItem() {
			return item;
		}

		/**
		 * Sets referenced item id.
		 *
		 * @param item item id
		 */
		public void setItem(String item) {
			this.item = item;
		}

		/**
		 * Returns background image path.
		 *
		 * @return background or null
		 */
		public String getBackground() {
			return background;
		}

		/**
		 * Sets background image path.
		 *
		 * @param background background path
		 */
		public void setBackground(String background) {
			this.background = background;
		}

		/**
		 * Returns whether this is a big card in the showcase.
		 *
		 * @return bigCard flag or null
		 */
		public Boolean getBigCard() {
			return bigCard;
		}

		/**
		 * Sets the big card flag.
		 *
		 * @param bigCard boolean flag
		 */
		public void setBigCard(Boolean bigCard) {
			this.bigCard = bigCard;
		}
	}
}


