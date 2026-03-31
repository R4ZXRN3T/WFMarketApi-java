package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Riven weapon model.
 */
public class Riven extends DataModel {
    private String id;
    private String slug;
    private String gameRef;
    private String group;
    private String rivenType;
    private Float disposition;
    private Integer reqMasteryRank;
    private Localization i18n;

    /**
     * No-arg constructor (fields initialized to null).
     */
    public Riven() {
        this.id = null;
        this.slug = null;
        this.gameRef = null;
        this.group = null;
        this.rivenType = null;
        this.disposition = null;
        this.reqMasteryRank = null;
        this.i18n = null;
    }

    /**
     * All-args constructor.
     */
    public Riven(String id, String slug, String gameRef, String group, String rivenType, Float disposition, Integer reqMasteryRank, Localization i18n) {
        this.id = id;
        this.slug = slug;
        this.gameRef = gameRef;
        this.group = group;
        this.rivenType = rivenType;
        this.disposition = disposition;
        this.reqMasteryRank = reqMasteryRank;
        this.i18n = i18n;
    }

    /**
     * Returns the riven id.
     * @return id or null
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the riven id.
     * @param id id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Returns the riven slug.
     * @return slug or null
     */
    public String getSlug() {
        return slug;
    }

    /**
     * Sets the riven slug.
     * @param slug slug to set
     */
    public void setSlug(String slug) {
        this.slug = slug;
    }

    /**
     * Returns the game reference path.
     * @return gameRef or null
     */
    public String getGameRef() {
        return gameRef;
    }

    /**
     * Sets the game reference path.
     * @param gameRef gameRef to set
     */
    public void setGameRef(String gameRef) {
        this.gameRef = gameRef;
    }

    /**
     * Returns the group used for UI grouping.
     * @return group or null
     */
    public String getGroup() {
        return group;
    }

    /**
     * Sets the group used for UI grouping.
     * @param group group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * Returns riven type (e.g., pistol, rifle).
     * @return rivenType or null
     */
    public String getRivenType() {
        return rivenType;
    }

    /**
     * Sets riven type.
     * @param rivenType riven type string
     */
    public void setRivenType(String rivenType) {
        this.rivenType = rivenType;
    }

    /**
     * Returns disposition value.
     * @return disposition or null
     */
    public Float getDisposition() {
        return disposition;
    }

    /**
     * Sets disposition value.
     * @param disposition disposition to set
     */
    public void setDisposition(Float disposition) {
        this.disposition = disposition;
    }

    /**
     * Returns required mastery rank for the riven.
     * @return reqMasteryRank or null
     */
    public Integer getReqMasteryRank() {
        return reqMasteryRank;
    }

    /**
     * Sets required mastery rank.
     * @param reqMasteryRank mastery rank to set
     */
    public void setReqMasteryRank(Integer reqMasteryRank) {
        this.reqMasteryRank = reqMasteryRank;
    }

    /**
     * Returns localization container for the riven.
     * @return Localization or null
     */
    public Localization getI18n() {
        return i18n;
    }

    /**
     * Sets localization container for the riven.
     * @param i18n Localization to set
     */
    public void setI18n(Localization i18n) {
        this.i18n = i18n;
    }
}


