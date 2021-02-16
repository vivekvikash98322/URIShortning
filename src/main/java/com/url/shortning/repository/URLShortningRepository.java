package com.url.shortning.repository;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.url.shortning.model.URLMappningEntity;

@Component
public class URLShortningRepository {

	private Map<String, URLMappningEntity> mappedEntity;
	
	public URLShortningRepository(Map<String, URLMappningEntity> mappedEntity) {
		this.mappedEntity = new HashMap<String, URLMappningEntity>();
	}
	
	
	public void setKeyValue(String key, URLMappningEntity value) {
		this.mappedEntity.put(key, value);
	}

	public URLMappningEntity getValueByKey(String key) {
		return this.mappedEntity.get(key);
	}
}
