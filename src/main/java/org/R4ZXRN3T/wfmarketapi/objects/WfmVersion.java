package org.R4ZXRN3T.wfmarketapi.objects;

import java.time.LocalDateTime;

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


	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getIos() {
		return ios;
	}

	public void setIos(String ios) {
		this.ios = ios;
	}

	public String getMinIos() {
		return minIos;
	}

	public void setMinIos(String minIos) {
		this.minIos = minIos;
	}

	public String getAndroid() {
		return android;
	}

	public void setAndroid(String android) {
		this.android = android;
	}

	public String getMinAndroid() {
		return minAndroid;
	}

	public void setMinAndroid(String minAndroid) {
		this.minAndroid = minAndroid;
	}

	public LocalDateTime getItems() {
		return items;
	}

	public void setItems(LocalDateTime items) {
		this.items = items;
	}

	public LocalDateTime getRivens() {
		return rivens;
	}

	public void setRivens(LocalDateTime rivens) {
		this.rivens = rivens;
	}

	public LocalDateTime getLiches() {
		return liches;
	}

	public void setLiches(LocalDateTime liches) {
		this.liches = liches;
	}

	public LocalDateTime getSisters() {
		return sisters;
	}

	public void setSisters(LocalDateTime sisters) {
		this.sisters = sisters;
	}

	public LocalDateTime getMissions() {
		return missions;
	}

	public void setMissions(LocalDateTime missions) {
		this.missions = missions;
	}

	public LocalDateTime getNpcs() {
		return npcs;
	}

	public void setNpcs(LocalDateTime npcs) {
		this.npcs = npcs;
	}

	public LocalDateTime getLocations() {
		return locations;
	}

	public void setLocations(LocalDateTime locations) {
		this.locations = locations;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}
