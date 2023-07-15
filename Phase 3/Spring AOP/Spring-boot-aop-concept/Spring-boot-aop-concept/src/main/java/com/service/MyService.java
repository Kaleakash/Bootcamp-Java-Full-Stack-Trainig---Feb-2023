package com.service;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	
	public String businessMethod() {
		System.out.println("This is business method");
		return "Simple business method coding done";
	}
	
	
	public String div(int x) {
		System.out.println("This is business method");
		//try {
		int res = 100/x;
		return "Simple business method coding done "+res;
		//}catch(Exception e) {
		//	System.out.println(e);
		//	return "exception generated";
	//	}
	}
}
