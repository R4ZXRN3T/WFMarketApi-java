package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

import org.R4ZXRN3T.wfmarketapi.utils.localizationHelpers.*;

/**
 * Full item payload model.
 * Item adds full-payload specific fields on top of ItemShort and also exposes
 * convenience localization getters directly for discoverability.
 */
public class Item extends ItemShort implements Nameable, Describable, WikiLinkable, Iconable, Thumbable, SubIconable {
	private Boolean setRoot;
	private String[] setParts;
	private Integer quantityInSet;
	private String rarity;
	private Boolean bulkTradable;
	private Integer maxAmberStars;
	private Integer maxCyanStars;
	private Integer vosfor;
	private Integer reqMasteryRank;
	private Integer tradingTax;
	private Boolean tradable;

	public Item() {
		super();
		this.setRoot = null;
		this.setParts = null;
		this.quantityInSet = null;
		this.rarity = null;
		this.bulkTradable = null;
		this.maxAmberStars = null;
		this.maxCyanStars = null;
		this.vosfor = null;
		this.reqMasteryRank = null;
		this.tradingTax = null;
		this.tradable = null;
	}

	public Item(String id, String slug, String gameRef, String[] tags, Localization i18n, String[] subtypes, Integer maxRank, Integer maxCharges, Boolean vaulted, Integer ducats, Integer amberStars, Integer cyanStars, Integer baseEndo, Float endoMultiplier, Boolean setRoot, String[] setParts, Integer quantityInSet, String rarity, Boolean bulkTradable, Integer maxAmberStars, Integer maxCyanStars, Integer vosfor, Integer reqMasteryRank, Integer tradingTax, Boolean tradable) {
		super(id, slug, gameRef, tags, i18n, maxRank, maxCharges, vaulted, ducats, amberStars, cyanStars, baseEndo, endoMultiplier, subtypes);
		this.setRoot = setRoot;
		this.setParts = setParts;
		this.quantityInSet = quantityInSet;
		this.rarity = rarity;
		this.bulkTradable = bulkTradable;
		this.maxAmberStars = maxAmberStars;
		this.maxCyanStars = maxCyanStars;
		this.vosfor = vosfor;
		this.reqMasteryRank = reqMasteryRank;
		this.tradingTax = tradingTax;
		this.tradable = tradable;
	}

	/**
	 * Returns whether this item is the root of a set.
	 *
	 * @return true if set root, false otherwise or null
	 */
	public Boolean getSetRoot() {
		return setRoot;
	}

	/**
	 * Sets whether this item is the root of a set.
	 *
	 * @param setRoot boolean flag
	 */
	public void setSetRoot(Boolean setRoot) {
		this.setRoot = setRoot;
	}

	/**
	 * Returns the parts that compose the set, if any.
	 *
	 * @return array of set part ids or null
	 */
	public String[] getSetParts() {
		return setParts;
	}

	/**
	 * Sets the parts that compose the set.
	 *
	 * @param setParts array of set part ids
	 */
	public void setSetParts(String[] setParts) {
		this.setParts = setParts;
	}

	/**
	 * Returns quantity in a set, if applicable.
	 *
	 * @return quantity in set or null
	 */
	public Integer getQuantityInSet() {
		return quantityInSet;
	}

	/**
	 * Sets the quantity in a set for this item.
	 *
	 * @param quantityInSet quantity value
	 */
	public void setQuantityInSet(Integer quantityInSet) {
		this.quantityInSet = quantityInSet;
	}

	/**
	 * Returns the rarity string for the item.
	 *
	 * @return rarity or null
	 */
	public String getRarity() {
		return rarity;
	}

	/**
	 * Sets the rarity string for the item.
	 *
	 * @param rarity rarity value
	 */
	public void setRarity(String rarity) {
		this.rarity = rarity;
	}

	/**
	 * Returns whether the item is bulk tradable.
	 *
	 * @return bulkTradable flag or null
	 */
	public Boolean getBulkTradable() {
		return bulkTradable;
	}

	/**
	 * Sets the bulk tradable flag for the item.
	 *
	 * @param bulkTradable boolean flag
	 */
	public void setBulkTradable(Boolean bulkTradable) {
		this.bulkTradable = bulkTradable;
	}

	/**
	 * Returns the maximum amber stars available for this item.
	 *
	 * @return amber stars or null
	 */
	public Integer getMaxAmberStars() {
		return maxAmberStars;
	}

	/**
	 * Sets the maximum amber stars for this item.
	 *
	 * @param maxAmberStars amber stars count
	 */
	public void setMaxAmberStars(Integer maxAmberStars) {
		this.maxAmberStars = maxAmberStars;
	}

	/**
	 * Returns the maximum cyan stars available for this item.
	 *
	 * @return cyan stars or null
	 */
	public Integer getMaxCyanStars() {
		return maxCyanStars;
	}

	/**
	 * Sets the maximum cyan stars for this item.
	 *
	 * @param maxCyanStars cyan stars count
	 */
	public void setMaxCyanStars(Integer maxCyanStars) {
		this.maxCyanStars = maxCyanStars;
	}

	/**
	 * Returns vosfor (in-game currency) value for this item.
	 *
	 * @return vosfor or null
	 */
	public Integer getVosfor() {
		return vosfor;
	}

	/**
	 * Sets the vosfor value for this item.
	 *
	 * @param vosfor vosfor amount
	 */
	public void setVosfor(Integer vosfor) {
		this.vosfor = vosfor;
	}

	/**
	 * Returns required mastery rank for the item.
	 *
	 * @return mastery rank or null
	 */
	public Integer getReqMasteryRank() {
		return reqMasteryRank;
	}

	/**
	 * Sets the required mastery rank.
	 *
	 * @param reqMasteryRank mastery rank
	 */
	public void setReqMasteryRank(Integer reqMasteryRank) {
		this.reqMasteryRank = reqMasteryRank;
	}

	/**
	 * Returns the trading tax applied to trades of this item.
	 *
	 * @return trading tax or null
	 */
	public Integer getTradingTax() {
		return tradingTax;
	}

	/**
	 * Sets the trading tax for this item.
	 *
	 * @param tradingTax tax amount
	 */
	public void setTradingTax(Integer tradingTax) {
		this.tradingTax = tradingTax;
	}

	/**
	 * Returns whether the item is tradable.
	 *
	 * @return tradable flag or null
	 */
	public Boolean getTradable() {
		return tradable;
	}

	/**
	 * Sets whether the item is tradable.
	 *
	 * @param tradable boolean flag
	 */
	public void setTradable(Boolean tradable) {
		this.tradable = tradable;
	}

	@Override
	public Integer getAmberStars() {
		return maxAmberStars;
	}

	@Override
	public void setAmberStars(Integer amberStars) {
		this.maxAmberStars = amberStars;
	}

	@Override
	public Integer getCyanStars() {
		return maxCyanStars;
	}

	@Override
	public void setCyanStars(Integer cyanStars) {
		this.maxCyanStars = cyanStars;
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getName(Localization.Language language) {
		return super.getName(language);
	}

	// Description and WikiLink defaults are provided by Describable and WikiLinkable

	@Override
	public String getIcon() {
		return super.getIcon();
	}

	@Override
	public String getIcon(Localization.Language language) {
		return super.getIcon(language);
	}

	@Override
	public String getThumb() {
		return super.getThumb();
	}

	@Override
	public String getThumb(Localization.Language language) {
		return super.getThumb(language);
	}

	@Override
	public String getSubIcon() {
		return super.getSubIcon();
	}

	@Override
	public String getSubIcon(Localization.Language language) {
		return super.getSubIcon(language);
	}
}
