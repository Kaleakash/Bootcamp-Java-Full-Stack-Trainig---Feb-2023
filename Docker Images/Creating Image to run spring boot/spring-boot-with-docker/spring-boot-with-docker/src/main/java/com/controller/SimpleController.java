package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping(value = "/")
	public String sayHello() {
		return "Welcome to Spring boot with docker";
	}
	
	@GetMapping(value = "hello/{name}")
	public String greeting(@PathVariable("name") String name) {
		return "Welcome to spring boot with docker "+name;
	}
}
