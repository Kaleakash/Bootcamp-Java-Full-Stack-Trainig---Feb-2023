package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")		// Enable @Restcontroller, @Service, @Repository 
@EntityScan(basePackages = "com.bean")						//Enable @Entity 	
@EnableJpaRepositories(basePackages = "com.repository")		// Enable spring data features. 
public class SpringBootRestApiWithDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiWithDataApplication.class, args);
		System.out.println("Spring boot up");
	}

}
