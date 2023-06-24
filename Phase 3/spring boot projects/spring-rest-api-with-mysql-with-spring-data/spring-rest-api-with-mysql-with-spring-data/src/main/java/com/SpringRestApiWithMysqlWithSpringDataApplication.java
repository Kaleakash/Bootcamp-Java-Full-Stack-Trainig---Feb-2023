package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")	// enable @Restcontroller, @serivce, @repository 
@EntityScan(basePackages = "com.entity")				// enable @Entity 
@EnableJpaRepositories(basePackages = "com.repository")	// enable spring data features
public class SpringRestApiWithMysqlWithSpringDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiWithMysqlWithSpringDataApplication.class, args);
		System.out.println("Spring boot with data up");
	}

}
