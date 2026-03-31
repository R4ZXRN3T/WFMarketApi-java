package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Sister quirk metadata model.
 */
public class SisterQuirk extends DataModel {
    private String id;
    private String slug;
    private String group;
    private Localization i18n;

    public SisterQuirk() {
        this.id = null;
        this.slug = null;
        this.group = null;
        this.i18n = null;
    }

    public SisterQuirk(String id, String slug, String group, Localization i18n) {
        this.id = id;
        this.slug = slug;
        this.group = group;
        this.i18n = i18n;
    }

    /** Returns id. */
    public String getId() { return id; }
    /** Sets id. */
    public void setId(String id) { this.id = id; }
    /** Returns slug. */
    public String getSlug() { return slug; }
    /** Sets slug. */
    public void setSlug(String slug) { this.slug = slug; }
    /** Returns group. */
    public String getGroup() { return group; }
    /** Sets group. */
    public void setGroup(String group) { this.group = group; }
    /** Returns localization container. */
    public Localization getI18n() { return i18n; }
    /** Sets localization container. */
    public void setI18n(Localization i18n) { this.i18n = i18n; }
}


