package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Lightweight transaction item payload used in transaction records.
 */
public class TxItem extends DataModel {
	private String id;
	private Integer rank;
	private Integer charges;
	private String subtype;
	private Integer amberStars;
	private Integer cyanStars;

	/**
	 * No-arg constructor initializing fields to null.
	 */
	public TxItem() {
		this.id = null;
		this.rank = null;
		this.charges = null;
		this.subtype = null;
		this.amberStars = null;
		this.cyanStars = null;
	}

	/**
	 * All-args constructor.
	 */
	public TxItem(String id, Integer rank, Integer charges, String subtype, Integer amberStars, Integer cyanStars) {
		this.id = id;
		this.rank = rank;
		this.charges = charges;
		this.subtype = subtype;
		this.amberStars = amberStars;
		this.cyanStars = cyanStars;
	}

	/**
	 * Returns item id.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets item id.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Returns rank.
	 */
	public Integer getRank() {
		return rank;
	}

	/**
	 * Sets rank.
	 */
	public void setRank(Integer rank) {
		this.rank = rank;
	}

	/**
	 * Returns charges.
	 */
	public Integer getCharges() {
		return charges;
	}

	/**
	 * Sets charges.
	 */
	public void setCharges(Integer charges) {
		this.charges = charges;
	}

	/**
	 * Returns subtype.
	 */
	public String getSubtype() {
		return subtype;
	}

	/**
	 * Sets subtype.
	 */
	public void setSubtype(String subtype) {
		this.subtype = subtype;
	}

	/**
	 * Returns amber stars.
	 */
	public Integer getAmberStars() {
		return amberStars;
	}

	/**
	 * Sets amber stars.
	 */
	public void setAmberStars(Integer amberStars) {
		this.amberStars = amberStars;
	}

	/**
	 * Returns cyan stars.
	 */
	public Integer getCyanStars() {
		return cyanStars;
	}

	/**
	 * Sets cyan stars.
	 */
	public void setCyanStars(Integer cyanStars) {
		this.cyanStars = cyanStars;
	}
}
