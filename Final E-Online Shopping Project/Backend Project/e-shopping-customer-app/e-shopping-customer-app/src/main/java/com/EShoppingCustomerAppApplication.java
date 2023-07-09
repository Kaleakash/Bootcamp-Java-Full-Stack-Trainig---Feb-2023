package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "eshopping")
@EntityScan(basePackages = "eshopping.entity")
@EnableJpaRepositories(basePackages = "eshopping.repository")
public class EShoppingCustomerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EShoppingCustomerAppApplication.class, args);
		System.out.println("customer micro service running on port number 8282");
	}

}
