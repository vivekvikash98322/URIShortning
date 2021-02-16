package com.url.shortning.dto;

public class URLShortningDTO {

	private String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "URLShortningDTO [url=" + url + "]";
	}
	
}
