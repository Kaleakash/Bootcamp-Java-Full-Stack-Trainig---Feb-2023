package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "eshopping")
@EntityScan(basePackages = "eshopping.entity")
@EnableJpaRepositories(basePackages = "eshopping.repository")
public class EShoppingCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EShoppingCustomerAppApplication.class, args);
		System.out.println("customer micro service running on port number 8282");
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
