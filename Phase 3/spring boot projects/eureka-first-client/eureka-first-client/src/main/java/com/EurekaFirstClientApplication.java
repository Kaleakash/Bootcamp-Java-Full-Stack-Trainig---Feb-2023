package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "com")
@EnableEurekaClient
public class EurekaFirstClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFirstClientApplication.class, args);
		System.out.println("First Client application running on port number 8080");
	}

}
