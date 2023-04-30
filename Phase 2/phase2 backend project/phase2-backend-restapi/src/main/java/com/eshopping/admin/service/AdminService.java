package com.eshopping.admin.service;

import com.eshopping.admin.bean.Admin;
import com.eshopping.admin.dao.AdminDao;

public class AdminService {

	AdminDao ad = new AdminDao();
	
	public String signIn(Admin admin) {
		if(ad.signIn(admin)) {
			return "success";
		}else {
			return "failure";
		}
	}
}
