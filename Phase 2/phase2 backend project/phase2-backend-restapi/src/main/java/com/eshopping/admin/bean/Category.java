package com.eshopping.admin.bean;

public class Category {
private int cid;
private String categoryName; 
private String categoryDescription;
private String categoryImageUrl;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCategoryName() {
	return categoryName;
}
public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
}
public String getCategoryDescription() {
	return categoryDescription;
}
public void setCategoryDescription(String categoryDescription) {
	this.categoryDescription = categoryDescription;
}
public String getCategoryImageUrl() {
	return categoryImageUrl;
}
public void setCategoryImageUrl(String categoryImageUrl) {
	this.categoryImageUrl = categoryImageUrl;
}
public Category() {
	super();
	// TODO Auto-generated constructor stub
}
public Category(int cid, String categoryName, String categoryDescription, String categoryImageUrl) {
	super();
	this.cid = cid;
	this.categoryName = categoryName;
	this.categoryDescription = categoryDescription;
	this.categoryImageUrl = categoryImageUrl;
}
@Override
public String toString() {
	return "Category [cid=" + cid + ", categoryName=" + categoryName + ", categoryDescription=" + categoryDescription
			+ ", categoryImageUrl=" + categoryImageUrl + "]";
}

}
