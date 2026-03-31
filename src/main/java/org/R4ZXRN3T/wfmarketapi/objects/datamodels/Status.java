package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/** User online presence status. */
public enum Status {
    INVISIBLE("invisible"),
    OFFLINE("offline"),
    ONLINE("online"),
    IN_GAME("in_game");

    private final String value;

    Status(String value) { this.value = value; }

    @Override
    public String toString() { return value; }
}

