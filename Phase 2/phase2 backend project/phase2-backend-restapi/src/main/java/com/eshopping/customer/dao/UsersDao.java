package com.eshopping.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eshopping.customer.bean.Users;
import com.eshopping.resource.DbResource;

public class UsersDao {

	Connection con;
	public UsersDao() {
		con = DbResource.getDbConnection();
	}

	public int signUp(Users users) {
		try {
		PreparedStatement pstmt = con.prepareStatement("insert into users values(?,?,?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1, users.getEmailid());
		pstmt.setString(2, users.getUsername());
		pstmt.setString(3, users.getFullName());
		pstmt.setString(4,users.getPassword());
		pstmt.setString(5, users.getImg());
		pstmt.setLong(6, users.getContact());
		pstmt.setString(7, users.getAddress().getStreet());
		pstmt.setString(8, users.getAddress().getCity());
		pstmt.setString(9, users.getAddress().getState());
		pstmt.setString(10, users.getAddress().getCountry());
		pstmt.setLong(11, users.getAddress().getPincode());
		int res = pstmt.executeUpdate();
		if(res>0) {
			PreparedStatement pstmt1 = con.prepareStatement("insert into account(emailid,amount) values(?,?)");
			pstmt1.setString(1, users.getEmailid());
			pstmt1.setFloat(2, 2500);
			int res1 = pstmt1.executeUpdate();
			return res1;
		}
		
		} catch (Exception e) {
		System.out.println(e);
		}
		
		return 0;
	}
	
	public boolean signIn(Users users) {
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from users where emailid =? and password = ?");
			pstmt.setString(1, users.getEmailid());
			pstmt.setString(2, users.getPassword());
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












