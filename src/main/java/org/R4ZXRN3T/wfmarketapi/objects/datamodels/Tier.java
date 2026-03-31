package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/** Subscription tier for users. */
public enum Tier {
    NONE("none"),
    BRONZE("bronze"),
    SILVER("silver"),
    GOLD("gold"),
    DIAMOND("diamond");

    private final String value;

    Tier(String value) { this.value = value; }

    @Override
    public String toString() { return value; }
}

