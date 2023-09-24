package ehealthcare.com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ehealthcare.com.entity.Login;
import ehealthcare.com.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;
	
	public String signIn(Login login) {
		Optional<Login>	result = loginRepository.findById(login.getEmailid());
		
		if(result.isPresent()) {
					
					Login ll = result.get();
					
					if(ll.getPassword().equals(login.getPassword())) {
						
						if(ll.getTypeofuser().equals("admin")) {
							return "Admin login successfully";
						}else {
							return "Customer login successfully";
						}
						
					}else {
						return "Password is invalid";
					}
		}else {
			return "Invalid emailid";
		}
		
	}
	
	public String signUp(Login login) {
				if(login.getTypeofuser().equalsIgnoreCase("admin")) {
					return "You can't create admin account";
				}else {
				Optional<Login>	result = loginRepository.findById(login.getEmailid());
				if(result.isPresent()) {
					return "Account already exists";
				}else {
					loginRepository.save(login);
					return "Account created successfully";
				}
				}
	}
	
	
}
