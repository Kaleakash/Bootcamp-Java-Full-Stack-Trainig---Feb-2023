package eshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import eshopping.bean.Users;



@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;
	
	public List<Users> getAllUsers() {
	//List<Users> listOfUsers = 	this.restTemplate.getForObject("http://localhost:8282/phase3/customer/findAllUsers", List.class);
  List<Users> listOfUsers = 	this.restTemplate.getForObject("http://E-SHOPPING-CUSTOMER-APP/phase3/customer/findAllUsers", List.class);
	return listOfUsers;
	}
}
