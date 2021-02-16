package com.url.shortning.service;

import org.springframework.stereotype.Service;

import com.url.shortning.dto.URLShortningDTO;

@Service
public interface IURLShortningService {

	String shortURL(URLShortningDTO url);
	
	String getMappedURL(String url);
}
