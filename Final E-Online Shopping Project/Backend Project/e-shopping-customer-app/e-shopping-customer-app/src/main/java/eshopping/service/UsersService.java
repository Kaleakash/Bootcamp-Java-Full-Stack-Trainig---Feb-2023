package eshopping.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import eshopping.entity.Account;
import eshopping.entity.Users;
import eshopping.repository.UsersRepository;

@Service
public class UsersService {


	public PasswordEncoder password() {
		return new BCryptPasswordEncoder();
	}
	
	@Autowired
	UsersRepository usersRepository;
	
	@Autowired
	AccountService accountService;
	
	public String signUp(Users  users) {
		Optional<Users> result  = usersRepository.findById(users.getEmailid());
		if(result.isPresent()) {
			return "EmailId must be unique";
		}else {
			users.setPassword(password().encode(users.getPassword()));	// convert to hash
			Account account = new Account();
			account.setEmailid(users.getEmailid());
			account.setAmount(1000);
			
			usersRepository.save(users);
			accountService.createAccount(account);
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
	
	public List<Users> findAllUsers() {
		System.out.println("Admin Micro Service client called service "+LocalDateTime.now());
		return usersRepository.findAll();
	}
	
}




