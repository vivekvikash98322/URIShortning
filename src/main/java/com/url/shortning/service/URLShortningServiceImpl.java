package com.url.shortning.service;

import java.nio.charset.Charset;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.hash.Hashing;
import com.url.shortning.dto.URLShortningDTO;
import com.url.shortning.model.URLMappningEntity;
import com.url.shortning.repository.URLShortningRepository;

@Service
public class URLShortningServiceImpl implements IURLShortningService{

	@Autowired private URLShortningRepository repo;  
	
	
	@Override
	public String shortURL(URLShortningDTO url) {
	    String id = Hashing.murmur3_32().hashString(url.getUrl(), Charset.defaultCharset()).toString();
	    this.repo.setKeyValue(id, new URLMappningEntity(url.getUrl(), id, LocalDateTime.now()));
		return id;
	}

	@Override
	public String getMappedURL(String url) {
		return this.repo.getValueByKey(url).getOrignalURL();
	}

}
