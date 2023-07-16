package eshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import eshopping.service.AccountService;

@RestController
@RequestMapping("phase3/customer/account")
@CrossOrigin	
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@GetMapping(value = "findBalance")
	public float findBalance(@RequestParam("email") String emailid) {
		return accountService.findBalance(emailid);
	}
}
