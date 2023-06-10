package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.bean.Product;

@Repository		// @Repository is dao layer specific annotation 
public class ProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	
	public int storeProduct(Product product) {
		try {
	return jdbcTemplate.update("insert into product values(?,?,?)", product.getPid(),product.getPname(),product.getPrice());	
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int updateProduct(Product product) {
		try {
	return jdbcTemplate.update("update product set price = ? where pid = ?", product.getPrice(),product.getPid());	
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int deleteProduct(int pid) {
		try {
	return jdbcTemplate.update("delete from product where pid = ?", pid);	
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public List<Map<String, Object>> findProductUsingListMap() {
		return jdbcTemplate.queryForList("select * from product");
	}
	
	public List<Product> findAllProductObject(){
	return jdbcTemplate.query("select * from Product", new MyProductRowMapper());
	}
	
	public List<Product> findAllProductObject(float price){
	return jdbcTemplate.query("select * from product where price > ?", new MyProductRowMapper(), price);
	}
	
	
}
class MyProductRowMapper implements RowMapper<Product>{
	// this life cycle method map each row to record and convert it 
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product p = new Product();
		p.setPid(rs.getInt(1));
		p.setPname(rs.getString(2));
		p.setPrice(rs.getFloat(3));
		return p;
	}
}


