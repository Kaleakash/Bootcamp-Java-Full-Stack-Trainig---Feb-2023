package eshopping.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import eshopping.entity.Users;
import eshopping.repository.UsersRepository;

@Service
public class UsersService {


	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	UsersRepository usersRepository;
	
	public String signUp(Users  users) {
		Optional<Users> result  = usersRepository.findById(users.getEmailid());
		if(result.isPresent()) {
			return "EmailId must be unique";
		}else {
			users.setPassword(password().encode(users.getPassword()));	// convert to hash
			usersRepository.save(users);
			return "Account created successfully";
		}
	}
	
	public String signIn(Users  users) {
		Optional<Users> result = usersRepository.findById(users.getEmailid());
		if(result.isPresent()) {
			Users uu = result.get();	// emailid and password (hash )
			boolean flag = password().matches(users.getPassword(), uu.getPassword());
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