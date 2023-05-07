package com.eshopping.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.eshopping.admin.bean.Category;
import com.eshopping.admin.bean.Product;
import com.eshopping.resource.DbResource;

public class ProductDao {
	Connection con;
	public ProductDao() {
	con = DbResource.getDbConnection();
	}
	
	public int storeProduct(Product product) {
		try {
		PreparedStatement pstmt = con.prepareStatement("insert into product(title,description,price,discountPercentage,rating,stock,brand,cid,thumbnail) values(?,?,?,?,?,?,?,?,?)");
		pstmt.setString(1, product.getTitle());
		pstmt.setString(2, product.getDescription());
		pstmt.setFloat(3, product.getPrice());
		pstmt.setFloat(4, product.getDiscountPercentage());
		pstmt.setFloat(5, product.getRating());
		pstmt.setInt(6, product.getStock());
		pstmt.setString(7, product.getBrand());
		pstmt.setInt(8, product.getCid());
		pstmt.setString(9, product.getThumbnail());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from product where pid = ?");
			pstmt.setInt(1, pid);
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public List<Product> findAllProducts(){
		List<Product> listOfProduct = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt(1));
				p.setTitle(rs.getString(2));
				p.setDescription(rs.getString(3));
				p.setPrice(rs.getFloat(4));
				p.setDiscountPercentage(rs.getFloat(5));
				p.setRating(rs.getFloat(6));
				p.setStock(rs.getInt(7));
				p.setBrand(rs.getString(8));
				p.setCid(rs.getInt(9));
				p.setThumbnail(rs.getString(10));
				listOfProduct.add(p);
			}
			} catch (Exception e) {
				System.out.println(e);
				
			}
		return listOfProduct;
	}
}
