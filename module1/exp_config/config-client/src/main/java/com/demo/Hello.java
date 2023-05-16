package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@Value("${spring.datasource.url: default value}")
	private String url;
	
	@GetMapping("/")
	public String sayHello() {
		return url;
	}
}
