package eshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eshopping.entity.Admin;
import eshopping.service.AdminService;

@RestController
@RequestMapping("phase3/admin")
@CrossOrigin
public class AdminController {

	@Autowired
	AdminService adminService;
	
	// http://localhost:8181/phase3/admin/signIn
	
	@PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String signIn(@RequestBody Admin admin) {
		return adminService.signIn(admin);
	}
	
	
}
