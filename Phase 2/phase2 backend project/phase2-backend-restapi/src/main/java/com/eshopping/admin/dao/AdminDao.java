package com.eshopping.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eshopping.admin.bean.Admin;
import com.eshopping.resource.DbResource;

public class AdminDao {

	Connection con;
	public AdminDao() {
		con = DbResource.getDbConnection();
	}
	public boolean signIn(Admin admin) {
		try {
		PreparedStatement pstmt = con.prepareStatement("select * from admin where emailid = ? and password =?");
		pstmt.setString(1, admin.getEmailid());
		pstmt.setString(2, admin.getPassword());
		ResultSet rs = pstmt.executeQuery();
		if(rs.next()) {
			return true;
		}
		} catch (Exception e) {
				System.out.println(e);
		}
		return false;
	}
}
