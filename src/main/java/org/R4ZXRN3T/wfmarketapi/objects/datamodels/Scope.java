package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * API scope names for permission checks.
 */
public enum Scope {
	ME("me"),
	PROFILE("profile"),
	SETTINGS("settings"),
	CONTRACTS("contracts"),
	LEDGER("ledger"),
	REVIEWS("reviews");

	private final String value;

	Scope(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}

