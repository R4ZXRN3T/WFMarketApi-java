package org.R4ZXRN3T.wfmarketapi.objects.datamodels;

/**
 * Order model that includes the short user payload of the order creator.
 *
 * <p>Used by endpoints that return an order along with basic information
 * about the user who posted it.</p>
 */
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
