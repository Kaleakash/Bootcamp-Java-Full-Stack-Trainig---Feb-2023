package com.eshopping.customer.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.eshopping.resource.DbResource;

public class AccountDao {

	
	Connection con;
	public AccountDao() {
		con = DbResource.getDbConnection();
	}
	
	public float findBalance(String emailid) {
		try {
		PreparedStatement pstmt = con .prepareStatement("select amount from account where emailid=?");
		pstmt.setString(1, emailid);
		ResultSet rs  = pstmt.executeQuery();
		if(rs.next()) {
			float amount = rs.getFloat(1);
			return amount;
		}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int doPayment(float amount, String email) {
		try {
			PreparedStatement pstmt = con .prepareStatement("update account set amount = amount - ? where emailid=?");
			pstmt.setFloat(1,amount);
			pstmt.setString(2, email);
			int res = pstmt.executeUpdate();
			return res;
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
	}
}
