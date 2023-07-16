package eshopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import eshopping.entity.Account;
import eshopping.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		accountRepository.save(account);
		return "Account created";
	}
	
	public float findBalance(String emailid) {
		Account acc = accountRepository.findAccountDetails(emailid);
		if(acc==null) {
			return -1;
		}else {
			return acc.getAmount();
		}
	}
	
	public void debitAmount(String emailid, float amount) {
		Account acc = accountRepository.findAccountDetails(emailid);
		if(acc==null) {
		
		}else {
			acc.setAmount(acc.getAmount()-amount);
			accountRepository.saveAndFlush(acc);
		}
	}
}
