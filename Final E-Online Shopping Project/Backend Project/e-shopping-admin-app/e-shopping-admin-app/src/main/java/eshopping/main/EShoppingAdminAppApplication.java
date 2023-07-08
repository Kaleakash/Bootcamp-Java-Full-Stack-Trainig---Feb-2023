package eshopping.main;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import eshopping.entity.Admin;
import eshopping.repository.AdminRepository;

@SpringBootApplication(scanBasePackages = "eshopping")
@EntityScan(basePackages = "eshopping.entity")
@EnableJpaRepositories(basePackages = "eshopping.repository")
@EnableEurekaClient
public class EShoppingAdminAppApplication {
	
	@Autowired
	AdminRepository adminRepository;
	
	
	
	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}
	
	@PostConstruct
	public void doInitialization() {
		Admin admin = new Admin();
		admin.setEmailid("admin@gmail.com");
		// admin@123 password we can read from file, github account etc. 
		
		admin.setPassword(password().encode("admin@123"));		// admin@123 password convert into hash algorithms 
		String hashPassword = password().encode("admin@123");
		System.out.println(hashPassword);
		System.out.println(password().matches("admin@1234", hashPassword));
		adminRepository.save(admin);
		System.out.println("Account created...");
	}
	public static void main(String[] args) {
		SpringApplication.run(EShoppingAdminAppApplication.class, args);
		System.out.println("Spring boot micro service for admin running on port number 8181");
	}

}
