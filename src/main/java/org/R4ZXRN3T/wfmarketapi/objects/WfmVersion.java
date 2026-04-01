package org.R4ZXRN3T.wfmarketapi.objects;

import java.time.LocalDateTime;

/**
 * Container for version and manifest timestamps returned by the Warframe Market
 * API's {@code versions} endpoint.
 *
 * <p>Holds API and mobile app version strings plus per-collection timestamps
 * (items, rivens, liches, sisters, missions, npcs, locations) and the overall
 * {@code updatedAt} timestamp.</p>
 */
public class WfmVersion extends WfmapiObject {
	private String apiVersion;
	private String ios;
	private String minIos;
	private String android;
	private String minAndroid;
	private LocalDateTime items;
	private LocalDateTime rivens;
	private LocalDateTime liches;
	private LocalDateTime sisters;
	private LocalDateTime missions;
	private LocalDateTime npcs;
	private LocalDateTime locations;
	private LocalDateTime updatedAt;

	/**
	 * No-arg constructor. Initializes all fields to {@code null}.
	 */
	public WfmVersion() {
		this.apiVersion = null;
		this.ios = null;
		this.minIos = null;
		this.android = null;
		this.minAndroid = null;
		this.items = null;
		this.rivens = null;
		this.liches = null;
		this.sisters = null;
		this.missions = null;
		this.npcs = null;
		this.locations = null;
		this.updatedAt = null;
	}

	/**
	 * All-arguments constructor.
	 */
	public WfmVersion(String apiVersion, String ios, String minIos, String android, String minAndroid, LocalDateTime items, LocalDateTime rivens, LocalDateTime liches, LocalDateTime sisters, LocalDateTime missions, LocalDateTime npcs, LocalDateTime locations, LocalDateTime updatedAt) {
		this.apiVersion = apiVersion;
		this.ios = ios;
		this.minIos = minIos;
		this.android = android;
		this.minAndroid = minAndroid;
		this.items = items;
		this.rivens = rivens;
		this.liches = liches;
		this.sisters = sisters;
		this.missions = missions;
		this.npcs = npcs;
		this.locations = locations;
		this.updatedAt = updatedAt;
	}

	/**
	 * Returns the API version string.
	 */
	public String getApiVersion() {
		return apiVersion;
	}

	/**
	 * Sets the API version string.
	 */
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	/**
	 * Returns the iOS app version string.
	 */
	public String getIos() {
		return ios;
	}

	/**
	 * Sets the iOS app version string.
	 */
	public void setIos(String ios) {
		this.ios = ios;
	}

	/**
	 * Returns the minimum supported iOS version.
	 */
	public String getMinIos() {
		return minIos;
	}

	/**
	 * Sets the minimum supported iOS version.
	 */
	public void setMinIos(String minIos) {
		this.minIos = minIos;
	}

	/**
	 * Returns the Android app version string.
	 */
	public String getAndroid() {
		return android;
	}

	/**
	 * Sets the Android app version string.
	 */
	public void setAndroid(String android) {
		this.android = android;
	}

	/**
	 * Returns the minimum supported Android version.
	 */
	public String getMinAndroid() {
		return minAndroid;
	}

	/**
	 * Sets the minimum supported Android version.
	 */
	public void setMinAndroid(String minAndroid) {
		this.minAndroid = minAndroid;
	}

	/**
	 * Returns the timestamp when the items manifest was last updated.
	 */
	public LocalDateTime getItems() {
		return items;
	}

	/**
	 * Sets the items manifest timestamp.
	 */
	public void setItems(LocalDateTime items) {
		this.items = items;
	}

	/**
	 * Returns the timestamp when the rivens manifest was last updated.
	 */
	public LocalDateTime getRivens() {
		return rivens;
	}

	/**
	 * Sets the rivens manifest timestamp.
	 */
	public void setRivens(LocalDateTime rivens) {
		this.rivens = rivens;
	}

	/**
	 * Returns the timestamp when the liches manifest was last updated.
	 */
	public LocalDateTime getLiches() {
		return liches;
	}

	/**
	 * Sets the liches manifest timestamp.
	 */
	public void setLiches(LocalDateTime liches) {
		this.liches = liches;
	}

	/**
	 * Returns the timestamp when the sisters manifest was last updated.
	 */
	public LocalDateTime getSisters() {
		return sisters;
	}

	/**
	 * Sets the sisters manifest timestamp.
	 */
	public void setSisters(LocalDateTime sisters) {
		this.sisters = sisters;
	}

	/**
	 * Returns the timestamp when the missions manifest was last updated.
	 */
	public LocalDateTime getMissions() {
		return missions;
	}

	/**
	 * Sets the missions manifest timestamp.
	 */
	public void setMissions(LocalDateTime missions) {
		this.missions = missions;
	}

	/**
	 * Returns the timestamp when the NPCs manifest was last updated.
	 */
	public LocalDateTime getNpcs() {
		return npcs;
	}

	/**
	 * Sets the NPCs manifest timestamp.
	 */
	public void setNpcs(LocalDateTime npcs) {
		this.npcs = npcs;
	}

	/**
	 * Returns the timestamp when the locations manifest was last updated.
	 */
	public LocalDateTime getLocations() {
		return locations;
	}

	/**
	 * Sets the locations manifest timestamp.
	 */
	public void setLocations(LocalDateTime locations) {
		this.locations = locations;
	}

	/**
	 * Returns the overall updatedAt timestamp for the versions payload.
	 */
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	/**
	 * Sets the overall updatedAt timestamp for the versions payload.
	 */
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
