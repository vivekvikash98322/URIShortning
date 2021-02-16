package com.url.shortning.model;

import java.time.LocalDateTime;

public class URLMappningEntity {

	private String orignalURL;
	
	private String shortenedURL;
	
	private LocalDateTime validTill;
	
	

	public URLMappningEntity(String orignalURL, String shortenedURL, LocalDateTime validTill) {
		this.orignalURL = orignalURL;
		this.shortenedURL = shortenedURL;
		this.validTill = validTill;
	}

	public String getOrignalURL() {
		return orignalURL;
	}

	public void setOrignalURL(String orignalURL) {
		this.orignalURL = orignalURL;
	}

	public String getShortenedURL() {
		return shortenedURL;
	}

	public void setShortenedURL(String shortenedURL) {
		this.shortenedURL = shortenedURL;
	}

	public LocalDateTime getValidTill() {
		return validTill;
	}

	public void setValidTill(LocalDateTime validTill) {
		this.validTill = validTill;
	}

	@Override
	public String toString() {
		return "URLMappningEntity [orignalURL=" + orignalURL + ", shortenedURL=" + shortenedURL + ", validTill="
				+ validTill + "]";
	}
	
}
