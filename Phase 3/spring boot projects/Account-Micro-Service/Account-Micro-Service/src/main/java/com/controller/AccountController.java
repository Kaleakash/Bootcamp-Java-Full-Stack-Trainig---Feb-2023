package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Account;
import com.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping(value = "createAccount",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody Account account) {
		return accountService.createAccount(account);
	}
	
	@GetMapping(value = "findAccountDetails/{accno}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Account findAccountDetails(@PathVariable("accno") int accno) {
		return accountService.findAccountDetails(accno);
	}
	
	@GetMapping(value = "findBalance/{accno}")
	public float findBalance(@PathVariable("accno") int accno) {
		return accountService.findBalance(accno);
	}
}



