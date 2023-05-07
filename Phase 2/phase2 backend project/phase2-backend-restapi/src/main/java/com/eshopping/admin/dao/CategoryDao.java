package com.eshopping.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.eshopping.admin.bean.Category;
import com.eshopping.resource.DbResource;

public class CategoryDao {

	Connection con;
	public CategoryDao() {
	con = DbResource.getDbConnection();
	}
	
	public int storeCategory(Category category) {
		try {
		PreparedStatement pstmt = con.prepareStatement("insert into category(categoryName,categoryDescription,categoryImageUrl) values(?,?,?)");
		pstmt.setString(1, category.getCategoryName());
		pstmt.setString(2, category.getCategoryDescription());
		pstmt.setString(3, category.getCategoryImageUrl());
		return pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}
	
	public int findCategoryId(String categoryName) {
		try {
			PreparedStatement pstmt = con.prepareStatement("select cid from category where categoryName=?");
			pstmt.setString(1, categoryName);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				int categoryId = rs.getInt(1);
				return categoryId;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int deleteCategory(int cid) {
		try {
			PreparedStatement pstmt = con.prepareStatement("delete from category where cid = ?");
			pstmt.setInt(1, cid);
			int res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public List<Category> findAllCategory(){
		List<Category> listOfCategory = new ArrayList<>();
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from category");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Category cc = new Category();
				cc.setCid(rs.getInt(1));
				cc.setCategoryName(rs.getString(2));
				cc.setCategoryDescription(rs.getString(3));
				cc.setCategoryImageUrl(rs.getString(4));
				listOfCategory.add(cc);
			}
			} catch (Exception e) {
				System.out.println(e);
				
			}
		return listOfCategory;
	}
}
