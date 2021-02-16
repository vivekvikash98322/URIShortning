package com.url.shortining.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.url.shortning.dto.URLShortningDTO;
import com.url.shortning.repository.URLShortningRepository;
import com.url.shortning.service.IURLShortningService;
import com.url.shortning.service.URLShortningServiceImpl;


public class URLShortningServiceTest {

	@InjectMocks
	private IURLShortningService iurlShortningService;
	
	@Mock
	private URLShortningRepository repo;
	
	@Before
	public void before() {
		this.iurlShortningService = new URLShortningServiceImpl();
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void success_url_shortining_test() {
		String url = "https://www.google.com/";
		
		URLShortningDTO urlShortningDTO = new URLShortningDTO();
		urlShortningDTO.setUrl(url);
		
		String value  = this.iurlShortningService.shortURL(urlShortningDTO);
		Assert.assertNotNull(value);
		Assert.assertEquals(value, "cac87a2c");
	}
}
