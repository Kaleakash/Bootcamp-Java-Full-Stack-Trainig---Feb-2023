package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Account;
import com.entity.Paytm;
import com.service.PaytmService;

@RestController
@RequestMapping("paytm")
public class PaytmController {

	@Autowired
	PaytmService paytmService;
	
	@PostMapping(value = "createAccount")
	public String createAccount(@RequestBody Paytm paytm) {
		return paytmService.accountCreate(paytm);
	}
	
	@GetMapping(value = "findBalance/{emailid}")
	public String findBalance(@PathVariable("emailid") String emailid) {
		return paytmService.findBalance(emailid);
	}
	
	
	@GetMapping(value = "findAccountInfo/{emailid}")
	public Account findAccountDetails(@PathVariable("emailid") String emailid) {
		return paytmService.findAccountDetails(emailid);
	}
}
