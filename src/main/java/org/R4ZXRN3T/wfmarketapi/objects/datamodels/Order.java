package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Order model describes a user's buy or sell order without embedding owner details.
 */
public class Order extends DataModel {
	private String id;
	private String type;
	private Integer platinum;
	private Integer quantity;
	private Integer perTrade;
	private Integer rank;
	private Integer charges;
	private String subtype;
	private Integer amberStars;
	private Integer cyanStars;
	private Boolean visible;
	private String createdAt;
	private String updatedAt;
	private String itemId;
	private String group;

	/**
	 * No-arg constructor initializing all fields to null.
	 */
	public Order() {
		this.id = null;
		this.type = null;
		this.platinum = null;
		this.quantity = null;
		this.perTrade = null;
		this.rank = null;
		this.charges = null;
		this.subtype = null;
		this.amberStars = null;
		this.cyanStars = null;
		this.visible = null;
		this.createdAt = null;
		this.updatedAt = null;
		this.itemId = null;
		this.group = null;
	}

	/**
	 * All-args constructor.
	 */
	public Order(String id, String type, Integer platinum, Integer quantity, Integer perTrade, Integer rank, Integer charges, String subtype, Integer amberStars, Integer cyanStars, Boolean visible, String createdAt, String updatedAt, String itemId, String group) {
		this.id = id;
		this.type = type;
		this.platinum = platinum;
		this.quantity = quantity;
		this.perTrade = perTrade;
		this.rank = rank;
		this.charges = charges;
		this.subtype = subtype;
		this.amberStars = amberStars;
		this.cyanStars = cyanStars;
		this.visible = visible;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.itemId = itemId;
		this.group = group;
	}

	/**
	 * Returns order id.
	 *
	 * @return id or null
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets order id.
	 *
	 * @param id id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns order type ("buy" or "sell").
	 *
	 * @return type or null
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets order type.
	 *
	 * @param type type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Returns platinum value for the order.
	 *
	 * @return platinum or null
	 */
	public Integer getPlatinum() {
		return platinum;
	}

	/**
	 * Sets platinum value.
	 *
	 * @param platinum platinum to set
	 */
	public void setPlatinum(Integer platinum) {
		this.platinum = platinum;
	}

	/**
	 * Returns total quantity for the order.
	 *
	 * @return quantity or null
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * Sets total quantity for the order.
	 *
	 * @param quantity quantity to set
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns per-trade quantity.
	 *
	 * @return perTrade or null
	 */
	public Integer getPerTrade() {
		return perTrade;
	}

	/**
	 * Sets per-trade quantity.
	 *
	 * @param perTrade per-trade quantity
	 */
	public void setPerTrade(Integer perTrade) {
		this.perTrade = perTrade;
	}

	/**
	 * Returns rank for the order item.
	 *
	 * @return rank or null
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * Sets rank for the order item.
	 *
	 * @param rank rank to set
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * Returns charges for the order item.
	 *
	 * @return charges or null
	 */
	public Integer getCharges() {
		return charges;
	}

	/**
	 * Sets charges for the order item.
	 *
	 * @param charges charges to set
	 */
	public void setCharges(Integer charges) {
		this.charges = charges;
	}

	/**
	 * Returns subtype for the order item.
	 *
	 * @return subtype or null
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * Sets subtype for the order item.
	 *
	 * @param subtype subtype to set
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * Returns amber stars count.
	 *
	 * @return amberStars or null
	 */
	public Integer getAmberStars() {
		return amberStars;
	}

	/**
	 * Sets amber stars count.
	 *
	 * @param amberStars value to set
	 */
	public void setAmberStars(Integer amberStars) {
		this.amberStars = amberStars;
	}

	/**
	 * Returns cyan stars count.
	 *
	 * @return cyanStars or null
	 */
	public Integer getCyanStars() {
		return cyanStars;
	}

	/**
	 * Sets cyan stars count.
	 *
	 * @param cyanStars value to set
	 */
	public void setCyanStars(Integer cyanStars) {
		this.cyanStars = cyanStars;
	}

	/**
	 * Returns visibility flag for the order.
	 *
	 * @return visible or null
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Sets visibility flag for the order.
	 *
	 * @param visible flag to set
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * Returns creation timestamp.
	 *
	 * @return createdAt or null
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets creation timestamp.
	 *
	 * @param createdAt timestamp string
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Returns last update timestamp.
	 *
	 * @return updatedAt or null
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets last update timestamp.
	 *
	 * @param updatedAt timestamp string
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * Returns referenced item id.
	 *
	 * @return itemId or null
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * Sets referenced item id.
	 *
	 * @param itemId item id string
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * Returns group name for the order.
	 *
	 * @return group or null
	 */
	public String getGroup() {
		return group;
	}

	/**
	 * Sets group name for the order.
	 *
	 * @param group group name
	 */
	public void setGroup(String group) {
		this.group = group;
	}
}


