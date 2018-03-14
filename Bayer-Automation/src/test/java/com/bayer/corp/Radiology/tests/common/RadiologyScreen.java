package com.bayer.corp.Radiology.tests.common;

public class RadiologyScreen {

	private String screenName;
	private String batchName;
	private String xpathKey;
	private String url;

	public RadiologyScreen() {

	}

	public RadiologyScreen(String screenName, String batchName, String xpathKey, String url) {
		super();
		this.screenName = screenName;
		this.batchName = batchName;
		this.xpathKey = xpathKey;
		this.url = url;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getXpathKey() {
		return xpathKey;
	}

	public void setXpathKey(String xpathKey) {
		this.xpathKey = xpathKey;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
