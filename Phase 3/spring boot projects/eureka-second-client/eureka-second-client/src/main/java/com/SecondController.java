package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	@GetMapping(value = "second")
	public String sayHello() {
	return "Welcome to Spring boot micro service using second client";	
	}
}
