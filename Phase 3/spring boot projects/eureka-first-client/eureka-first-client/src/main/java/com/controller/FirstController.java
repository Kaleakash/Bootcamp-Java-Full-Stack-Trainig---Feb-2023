package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping(value = "first")
	public String sayHello() {
		return "Welcome to Spring micro service with first controller";
	}
}
