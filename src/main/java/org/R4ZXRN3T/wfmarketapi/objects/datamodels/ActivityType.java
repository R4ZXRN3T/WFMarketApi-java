package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Type of user activity status.
 */
public enum ActivityType {
	UNKNOWN("unknown"),
	IDLE("idle"),
	ON_MISSION("on_mission"),
	IN_DOJO("dojo"),
	IN_ORBITER("orbiter"),
	IN_RELAY("relay");

	private final String value;

	ActivityType(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value;
	}
}

