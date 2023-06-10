package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository		// @Repository is dao layer specific annotation 
public class ProductDao {
	
	
	@Autowired
	DataSource ds;	// to achieve DataSource concept before spring framweork 
						// we were configure database details in application server 
					// using JNDI (Java Naning Directive interface) we search 
					// database connection 

	public int storeProduct(Product product) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement("insert into product values(?,?,?)");
			psmt.setInt(1, product.getPid());
			psmt.setString(2, product.getPname());
			psmt.setFloat(3, product.getPrice());
			return psmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Product> findAllProducts() {
	List<Product> listOfProduct = new ArrayList<Product>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement psmt = con.prepareStatement("select * from product");
			ResultSet rs = psmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setPname(rs.getString(2));
				p.setPrice(rs.getFloat(3));
				listOfProduct.add(p);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return listOfProduct;
	}
}
