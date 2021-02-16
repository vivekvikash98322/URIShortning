package com.url.shortning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.url.shortning.dto.URLShortningDTO;
import com.url.shortning.service.IURLShortningService;

@RestController
public class URLShortningController {

	@Autowired
	private IURLShortningService iurlShortningService;
	
	@PostMapping(path = "/short")
	public String shortURL(@RequestBody URLShortningDTO url) {
		return this.iurlShortningService.shortURL(url);
	}
	
	@GetMapping(path = "/{url}")
	public RedirectView redirect(@PathVariable String url) {
		String urlfetched =  this.iurlShortningService.getMappedURL(url);
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(urlfetched);
        return redirectView;
	}
}
