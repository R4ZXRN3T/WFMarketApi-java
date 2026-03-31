package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Transaction record representing a trade that occurred on the marketplace.
 */
public class Transaction extends DataModel {
	private String id;
	private String type;
	private String originId;
	private Integer platinum;
	private Integer quantity;
	private String createdAt;
	private String updatedAt;
	private TxItem item;
	private UserShort user;

	/**
	 * No-arg constructor initializing fields to null.
	 */
	public Transaction() {
		this.id = null;
		this.type = null;
		this.originId = null;
		this.platinum = null;
		this.quantity = null;
		this.createdAt = null;
		this.updatedAt = null;
		this.item = null;
		this.user = null;
	}

	/**
	 * All-args constructor.
	 */
	public Transaction(String id, String type, String originId, Integer platinum, Integer quantity, String createdAt, String updatedAt, TxItem item, UserShort user) {
		this.id = id;
		this.type = type;
		this.originId = originId;
		this.platinum = platinum;
		this.quantity = quantity;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.item = item;
		this.user = user;
	}

	/**
	 * Returns transaction id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets transaction id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns transaction type.
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets transaction type.
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Returns origin order id.
	 */
	public String getOriginId() {
		return originId;
	}

	/**
	 * Sets origin order id.
	 */
	public void setOriginId(String originId) {
		this.originId = originId;
	}

	/**
	 * Returns platinum amount.
	 */
	public Integer getPlatinum() {
		return platinum;
	}

	/**
	 * Sets platinum amount.
	 */
	public void setPlatinum(Integer platinum) {
		this.platinum = platinum;
	}

	/**
	 * Returns quantity.
	 */
	public Integer getQuantity() {
		return quantity;
	}

	/**
	 * Sets quantity.
	 */
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	/**
	 * Returns created-at timestamp.
	 */
	public String getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets created-at timestamp.
	 */
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	/**
	 * Returns updated-at timestamp.
	 */
	public String getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets updated-at timestamp.
	 */
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	/**
	 * Returns the transaction item payload.
	 */
	public TxItem getItem() {
		return item;
	}

	/**
	 * Sets the transaction item payload.
	 */
	public void setItem(TxItem item) {
		this.item = item;
	}

	/**
	 * Returns the short user payload for this transaction.
	 */
	public UserShort getUser() {
		return user;
	}

	/**
	 * Sets the short user payload for this transaction.
	 */
	public void setUser(UserShort user) {
		this.user = user;
	}
}


