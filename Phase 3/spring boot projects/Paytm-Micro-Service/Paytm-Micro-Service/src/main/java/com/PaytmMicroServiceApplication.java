package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.entity")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableEurekaClient
public class PaytmMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaytmMicroServiceApplication.class, args);
		System.out.println("Paytm micro service running on port number 8383");
	}


	@Bean		// object creation done by use but maintain by container 
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
