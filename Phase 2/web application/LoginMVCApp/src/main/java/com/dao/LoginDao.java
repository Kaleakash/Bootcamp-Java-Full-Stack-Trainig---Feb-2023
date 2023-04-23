package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.Login;
import com.resource.DbResource;

public class LoginDao {

	Connection con;
	public LoginDao() {
		con = DbResource.getDbConnection();
	}
	public int signIn(Login login) {
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from login where emailid = ? and password = ?");
			pstmt.setString(1, login.getEmailid());
			pstmt.setString(2, login.getPassword());
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				return 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	public int signUp(Login login) {
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into login values(?,?)");
			pstmt.setString(1, login.getEmailid());
			pstmt.setString(2, login.getPassword());
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
}
