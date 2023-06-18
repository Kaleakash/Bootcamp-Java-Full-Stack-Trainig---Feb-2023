package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:8080/sayHello 
	// we produce the output in string format. 
	
	@RequestMapping(value = "sayHello",method = RequestMethod.GET)
	public String sayHello() {
		return "Welcome to Spring boot with REst API";
	}
	// http://localhost:8080/sayHTML
	
	@RequestMapping(value = "sayHTML",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String sayHTML() {
		return "<h2>Welcome to Spring boot with REst API</h2>";
	}
	
	// http://localhost:8080/sayPlain
		@RequestMapping(value = "sayPlain",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
		public String sayPlain() {
			return "<h2>Welcome to Spring boot with REst API<h2>";
		}
		
		// http://localhost:8080/sayPlain
		@RequestMapping(value = "sayXml",method = RequestMethod.GET,produces = MediaType.TEXT_XML_VALUE)
		public String sayXML() {
			return "<h2>Welcome to Spring boot with REst API<h2>";
		}
}
