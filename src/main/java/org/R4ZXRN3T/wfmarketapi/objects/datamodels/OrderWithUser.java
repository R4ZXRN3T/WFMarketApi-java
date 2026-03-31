package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

public class OrderWithUser extends Order {
	private UserShort user;

	public OrderWithUser() {
		super();
		this.user = null;
	}

	public OrderWithUser(UserShort user) {
		super();
		this.user = user;
	}

	/**
	 * Returns the short user payload for this order.
	 *
	 * @return UserShort or null
	 */
	public UserShort getUser() {
		return user;
	}

	/**
	 * Sets the short user payload for this order.
	 *
	 * @param user UserShort instance
	 */
	public void setUser(UserShort user) {
		this.user = user;
	}
}


