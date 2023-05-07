package com.eshopping.customer.service;



import com.eshopping.customer.bean.Users;
import com.eshopping.customer.dao.UsersDao;

public class UsersService {

	UsersDao ud = new UsersDao();
	public String signUp(Users users) {
		if(ud.signUp(users)>0) {
			return "Account Created successfully";
		}else {
			return "Account didn't create";
		}
	}
	
	public String signIn(Users users) {
		
		if(ud.signIn(users)) {
			return "success";
		}else {
			return "failure";
		}
	}
}
