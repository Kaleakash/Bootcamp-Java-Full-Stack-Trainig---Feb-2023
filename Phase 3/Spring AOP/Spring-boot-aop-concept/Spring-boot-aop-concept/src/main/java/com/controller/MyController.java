package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.service.MyService;

@RestController
public class MyController {

	@Autowired
	MyService myService;
	
	@GetMapping(value = "say")
	public String sayHello() {
		return myService.businessMethod();
	}
	
	@GetMapping(value = "calculation/{x}")
	public String calcuation(@PathVariable("x") int x) {
		return myService.div(x);
	}
}
