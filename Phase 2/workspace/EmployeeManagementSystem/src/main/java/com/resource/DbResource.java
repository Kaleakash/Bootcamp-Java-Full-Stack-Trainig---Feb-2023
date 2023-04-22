package com.resource;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbResource {
	static Connection con;
	// this code load only once 
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_java_db", "root", "root@123");
		}catch(Exception e) {}
		
	}
	
	
	public static Connection getDbConnection() {
		try {
			return con;
		} catch (Exception e) {
			System.out.println(e.toString());
			return null;
		}
	}
	
	public void closeResource() {
		try {
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
