package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Model representing a Lich weapon metadata entry.
 */
public class LichWeapon extends DataModel {
    private String id;
    private String slug;
    private String gameRef;
    private Integer reqMasteryRank;
    private Localization i18n;
    public LichWeapon() {
        this.id = null;
        this.slug = null;
        this.gameRef = null;
        this.reqMasteryRank = null;
        this.i18n = null;
    }

    public LichWeapon(String id, String slug, String gameRef, Integer reqMasteryRank, Localization i18n) {
        this.id = id;
        this.slug = slug;
        this.gameRef = gameRef;
        this.reqMasteryRank = reqMasteryRank;
        this.i18n = i18n;
    }

    /**
     * Returns lich weapon id.
     * @return id or null
     */
    public String getId() { return id; }

    /**
     * Sets lich weapon id.
     * @param id id to set
     */
    public void setId(String id) { this.id = id; }

    /**
     * Returns slug.
     * @return slug or null
     */
    public String getSlug() { return slug; }

    /**
     * Sets slug.
     * @param slug slug to set
     */
    public void setSlug(String slug) { this.slug = slug; }

    /**
     * Returns game reference.
     * @return gameRef or null
     */
    public String getGameRef() { return gameRef; }

    /**
     * Sets game reference.
     * @param gameRef gameRef to set
     */
    public void setGameRef(String gameRef) { this.gameRef = gameRef; }

    /**
     * Returns required mastery rank.
     * @return reqMasteryRank or null
     */
    public Integer getReqMasteryRank() { return reqMasteryRank; }

    /**
     * Sets required mastery rank.
     * @param reqMasteryRank mastery rank to set
     */
    public void setReqMasteryRank(Integer reqMasteryRank) { this.reqMasteryRank = reqMasteryRank; }

    /**
     * Returns localization container.
     * @return Localization or null
     */
    public Localization getI18n() { return i18n; }

    /**
     * Sets localization container.
     * @param i18n Localization to set
     */
    public void setI18n(Localization i18n) { this.i18n = i18n; }
}


