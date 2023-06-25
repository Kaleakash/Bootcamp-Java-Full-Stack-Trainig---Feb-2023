package eshopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import eshopping.entity.Admin;
import eshopping.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;
	
	
	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}
	public String signIn(Admin admin) {
		Optional<Admin> result = adminRepository.findById(admin.getEmailid());
		if(result.isPresent()) {
			Admin ad = result.get();	// emailid and password (hash )
			boolean flag = password().matches(admin.getPassword(), ad.getPassword());
			if(flag) {
				return "success";
			}else {
				return "Password is invalid";
			}
		}else {
			return "Invalid emailid";
		}
	}
}
