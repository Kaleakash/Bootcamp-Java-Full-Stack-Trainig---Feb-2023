package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com")
@EnableAspectJAutoProxy(exposeProxy = true)  // enable aspect features 
public class SpringBootAopConceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopConceptApplication.class, args);
		System.out.println("spring boot up");
	}

}
