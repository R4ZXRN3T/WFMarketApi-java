package org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums;

/**
 * Supported platforms where users may play.
 */
public enum Platform {
	PC("pc"),
	PS4("ps4"),
	XBOX("xbox"),
	SWITCH("switch"),
	MOBILE("mobile");

	private final String value;

	Platform(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}

