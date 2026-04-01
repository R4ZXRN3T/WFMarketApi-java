package org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers;

import java.util.HashMap;

/**
 * Container for localized strings for multiple languages.
 * Stores per-language LocaleData entries and provides convenience accessors.
 */
public class Localization {
	private final HashMap<Language, LocaleData> languageData;

	/**
	 * Constructs an empty Localization container.
	 */
	public Localization() {
		languageData = new HashMap<>();
	}

	/**
	 * Sets a single localized field value for a language.
	 *
	 * @param language target language
	 * @param field    field to set
	 * @param value    value to assign
	 */
	public void setLanguageData(Language language, LocalizedField field, String value) {
		LocaleData localeData = languageData.getOrDefault(language, new LocaleData());
		switch (field) {
			case NAME:
				localeData.setName(value);
				break;
			case TITLE:
				localeData.setTitle(value);
				break;
			case NODE_NAME:
				localeData.setNodeName(value);
				break;
			case SYSTEM_NAME:
				localeData.setSystemName(value);
				break;
			case DESCRIPTION:
				localeData.setDescription(value);
				break;
			case WIKI_LINK:
				localeData.setWikiLink(value);
				break;
			case ICON:
				localeData.setIcon(value);
				break;
			case THUMB:
				localeData.setThumb(value);
				break;
			case SUB_ICON:
				localeData.setSubIcon(value);
				break;
		}
		languageData.put(language, localeData);
	}

	/**
	 * Sets the whole LocaleData for a language.
	 *
	 * @param language target language
	 * @param data     locale data to assign
	 */
	public void setLanguageData(Language language, LocaleData data) {
		languageData.put(language, data);
	}

	/**
	 * Returns locale data for the default language (English).
	 *
	 * @return LocaleData or null
	 */
	public LocaleData getLanguageData() {
		return getLanguageData(Language.ENGLISH);
	}

	/**
	 * Returns locale data for the given language.
	 *
	 * @param language target language
	 * @return LocaleData or null
	 */
	public LocaleData getLanguageData(Language language) {
		return languageData.getOrDefault(language, null);
	}

	public enum Language {
		KOREAN("ko"),
		RUSSIAN("ru"),
		GERMAN("de"),
		FRENCH("fr"),
		PORTUGUESE("pt"),
		CHINESE_SIMPLIFIED("zh-hans"),
		CHINESE_TRADITIONAL("zh-hant"),
		SPANISH("es"),
		ITALIAN("it"),
		POLISH("pl"),
		UKRAINIAN("uk"),
		ENGLISH("en");

		private final String value;

		Language(String value) {
			this.value = value;
		}

		/**
		 * Map a language code (e.g. "en", "de", "fr") to the enum constant.
		 * Returns null when no matching language exists.
		 */
		public static Language fromCode(String code) {
			if (code == null) return null;
			for (Language l : values()) {
				if (l.value.equals(code)) return l;
			}
			return null;
		}

		@Override
		public String toString() {
			return value;
		}
	}

	public enum LocalizedField {
		DESCRIPTION,
		ICON,
		NAME,
		TITLE,
		NODE_NAME,
		SYSTEM_NAME,
		THUMB,
		WIKI_LINK,
		SUB_ICON
	}

	public static class LocaleData {
		private String name;
		private String title;
		private String systemName;
		private String nodeName;
		private String description;
		private String wikiLink;
		private String icon;
		private String thumb;
		private String subIcon;

		/**
		 * Constructs an empty LocaleData instance with empty strings.
		 */
		public LocaleData() {
			name = description = wikiLink = icon = thumb = subIcon = "";
		}

		/**
		 * Returns localized name.
		 */
		public String getName() {
			return name;
		}

		/**
		 * Sets localized name.
		 */
		public void setName(String name) {
			this.name = name;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getNodeName() {
			return nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getSystemName() {
			return systemName;
		}

		public void setSystemName(String systemName) {
			this.systemName = systemName;
		}

		/**
		 * Returns localized description.
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * Sets localized description.
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * Returns Wiki link.
		 */
		public String getWikiLink() {
			return wikiLink;
		}

		/**
		 * Sets Wiki link.
		 */
		public void setWikiLink(String wikiLink) {
			this.wikiLink = wikiLink;
		}

		/**
		 * Returns icon path.
		 */
		public String getIcon() {
			return icon;
		}

		/**
		 * Sets icon path.
		 */
		public void setIcon(String icon) {
			this.icon = icon;
		}

		/**
		 * Returns thumbnail path.
		 */
		public String getThumb() {
			return thumb;
		}

		/**
		 * Sets thumbnail path.
		 */
		public void setThumb(String thumb) {
			this.thumb = thumb;
		}

		/**
		 * Returns sub icon path.
		 */
		public String getSubIcon() {
			return subIcon;
		}

		/**
		 * Sets sub icon path.
		 */
		public void setSubIcon(String subIcon) {
			this.subIcon = subIcon;
		}
	}
}
