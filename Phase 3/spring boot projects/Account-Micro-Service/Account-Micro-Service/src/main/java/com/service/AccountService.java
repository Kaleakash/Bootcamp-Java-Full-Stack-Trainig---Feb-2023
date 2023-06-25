package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Account;
import com.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Optional<Account> result = accountRepository.findById(account.getAccno());
		if(result.isPresent()) {
			return "Account number already present it must be unqique";
		}else {
			accountRepository.save(account);
			return "Account created successfully";
		}
	}
	public Account findAccountDetails(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
		Account acc = result.get();
		return acc;
		}else {
			return null;
		}
	}
	
	public float findBalance(int accno) {
		Optional<Account> result = accountRepository.findById(accno);
		if(result.isPresent()) {
		Account acc = result.get();
		return acc.getAmount();
		}else {
			return -1;
		}
	}
}
