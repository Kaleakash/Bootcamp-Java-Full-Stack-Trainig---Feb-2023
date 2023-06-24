package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class EurekaSecondClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSecondClientApplication.class, args);
		System.out.println("Spring boot micro service project running on port number 8181");
	}

}
