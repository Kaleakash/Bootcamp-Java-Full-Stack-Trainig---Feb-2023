package com.service;

import com.bean.Login;
import com.dao.LoginDao;

public class LoginService {

	LoginDao ld = new LoginDao();
	
	public String sigUp(Login ll) {
		StringBuffer sbRef = new StringBuffer(ll.getPassword());		// 123 
		ll.setPassword(sbRef.reverse().toString());						// 321 
		
		if(ld.signUp(ll)>0) {
			return "Account created successfully";
		}else {
			return "Account didn't create";
		}
	}
	
	
	public String sigIn(Login ll) {
		StringBuffer sbRef = new StringBuffer(ll.getPassword());		// 123 
		ll.setPassword(sbRef.reverse().toString());						// 321 
		
		if(ld.signIn(ll)>0) {
			return "Success";
		}else {
			return "Failure";
		}
	}
}
