package eshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eshopping.bean.Users;
import eshopping.service.UserService;

@RestController
@RequestMapping("phase3/admin/users")
@CrossOrigin
public class UsersController {

	@Autowired
	UserService usersService;
	
	@GetMapping(value = "findAll",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> findAllUsers() {
		return usersService.getAllUsers();
		
	}
}
