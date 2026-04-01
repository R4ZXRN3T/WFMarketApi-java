package org.R4ZXRN3T.wfmarketapi.objects.datamodels.enums;

/**
 * User authorization role.
 */
public enum Role {
	USER("user"),
	MODERATOR("moderator"),
	ADMIN("admin");

	private final String value;

	Role(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}

