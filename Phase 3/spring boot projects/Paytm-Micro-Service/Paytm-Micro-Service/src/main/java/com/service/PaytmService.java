package com.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bean.Account;
import com.entity.Paytm;
import com.repository.PaytmRepository;

@Service
public class PaytmService {

	@Autowired
	PaytmRepository paytmRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String accountCreate(Paytm paytm) {
		Optional<Paytm> result = paytmRepository.findById(paytm.getEmailid());
		if(result.isPresent()) {
			return "This account already exists";
		}else {
			paytmRepository.save(paytm);
			return "Account Created";
		}
	}
	
	public String findBalance(String emailid) {
		Optional<Paytm> result = paytmRepository.findById(emailid);
		if(result.isPresent()) {
			Paytm paymt = result.get();
			float amount = restTemplate.getForObject("http://localhost:8282/account/findBalance/"+paymt.getAccno(), Float.class);
				return "Your balance amount is "+amount;
			}else {
				return "Paytm account not present";
			}
		}
		
	
	public Account findAccountDetails(String emailid) {
		Optional<Paytm> result = paytmRepository.findById(emailid);
		if(result.isPresent()) {
			Paytm paymt = result.get();
			Account acc= restTemplate.getForObject("http://localhost:8282/account/findAccountDetails/"+paymt.getAccno(), Account.class);
				return acc;
			}else {
				return null;
			}
		}
	
}
