package com.stock.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {
	
	@RequestMapping
	public String getMessage() {
		return "Web application configuration correct";
	}
}
