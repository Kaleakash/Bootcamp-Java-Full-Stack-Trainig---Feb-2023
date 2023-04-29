package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.resource.DbResource;

public class ProductDao {
	Connection con;
	public ProductDao() {
		con = DbResource.getDbConnection();
	}
	public int storeProduct(Product product) {
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into product(pname,price) values(?,?)");
			pstmt.setString(1, product.getPname());
			pstmt.setFloat(2, product.getPrice());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	public List<Product> retrieveProdcut() {
		List<Product> listOfProduct = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
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
