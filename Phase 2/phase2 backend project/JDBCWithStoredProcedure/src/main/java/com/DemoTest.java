package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class DemoTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/phase2_db", "root", "root@123");
	CallableStatement cstmt  = con.prepareCall("{call getProductName(?,?)}");
	cstmt.setInt(1, 1);
	cstmt.registerOutParameter(2, Types.VARCHAR);
	cstmt.executeUpdate();
	String output = cstmt.getString(2);
	System.out.println(output);
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
