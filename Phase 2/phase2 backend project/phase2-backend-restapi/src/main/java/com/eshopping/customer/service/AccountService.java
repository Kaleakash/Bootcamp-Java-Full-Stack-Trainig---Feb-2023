package com.eshopping.customer.service;

import com.eshopping.customer.dao.AccountDao;

public class AccountService {

	AccountDao ad = new AccountDao();
	
	public float findBalance(String emailid) {
		return ad.findBalance(emailid);
	}
}
