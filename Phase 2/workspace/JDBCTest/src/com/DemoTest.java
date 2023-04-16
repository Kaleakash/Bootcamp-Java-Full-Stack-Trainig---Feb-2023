package com;
import java.sql.*;
import java.util.Scanner;
public class DemoTest {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // pre defined class for mysql 8.x version 
			System.out.println("Driver loaded successfully");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_java_db", "root", "root@123");
	System.out.println("connected");
	Statement stmt = con.createStatement();
	Scanner sc = new Scanner(System.in);
	// Insert Query 
//	int res = stmt.executeUpdate("insert into product values(5,'Pen Drive',2500)");
//	if(res>0) {
//		System.out.println("Record inserted...");
//	}
//	// Insert record using PreparedStatement 
//	PreparedStatement pstmt = con.prepareStatement("insert into product values(?,?,?)");
//	System.out.println("Enter the product pid");
//	int pid = sc.nextInt();
//	pstmt.setInt(1, pid);
//	System.out.println("Enter the product name");
//	sc.nextLine();			// it is use to hold enter key. 
//	String pname = sc.nextLine();		// terminator is enter key 
//	pstmt.setString(2, pname);
//	System.out.println("Enter the price");
//	float price = sc.nextFloat();
//	pstmt.setFloat(3, price);
//	int res = pstmt.executeUpdate();
//	if(res>0) {
//		System.out.println("Record inserted successfully");
//	}
//	// Delete query 
//	int res = stmt.executeUpdate("delete from product where pid = 5");
//	if(res>0) {
//		System.out.println("Product deleted successfully");
//	}else {
//		System.out.println("Product not present");
//	}
	
//	// delete record using PreparedStatement 
//		PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
//		System.out.println("Enter the product pid");
//		int pid = sc.nextInt();
//		pstmt.setInt(1, pid);
//		int res = pstmt.executeUpdate();
//		if(res>0) {
//			System.out.println("Record deleted successfully");
//		}else {
//			System.out.println("Record not present");
//		}
		
	// Delete query 
//		int res = stmt.executeUpdate("update product set price = 62000 where pid=100");
//		if(res>0) {
//			System.out.println("Product updated successfully");
//		}else {
//			System.out.println("Product not present");
//		}
		
	// update record using PreparedStatement 
//			PreparedStatement pstmt = con.prepareStatement("update product set price = ? where pid = ?");
//			System.out.println("Enter the product pid");
//			int pid = sc.nextInt();
//			pstmt.setInt(2, pid);
//			System.out.println("Enter the product price");
//			float price = sc.nextFloat();
//			pstmt.setFloat(1, price);
//			int res = pstmt.executeUpdate();
//			if(res>0) {
//				System.out.println("Record update successfully");
//			}else {
//				System.out.println("Record not present");
//			}
	// retreive records 
//	ResultSet rs = stmt.executeQuery("select * from product");
//		while(rs.next()) {
//			//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
//			System.out.println("id is "+rs.getInt("pid")+" Name is "+rs.getString("pname")+" Salary is "+rs.getFloat("price"));
//		}
	
	// Reteive with where clause using preparedstatement 
	PreparedStatement pstmt = con.prepareStatement("select * from product where price >?");
	System.out.println("enter the price");
	float price = sc.nextFloat();
	pstmt.setFloat(1, price);
	ResultSet rs = pstmt.executeQuery();
	while(rs.next()) {
		//System.out.println("id is "+rs.getInt(1)+" Name is "+rs.getString(2)+" Salary is "+rs.getFloat(3));
		System.out.println("id is "+rs.getInt("pid")+" Name is "+rs.getString("pname")+" Salary is "+rs.getFloat("price"));
	}
	//		rs.close();
//	stmt.close();
//	con.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
