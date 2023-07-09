package eshopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Category {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto_increment
@Column(name = "cid")	
private int cid;
@Column(name = "categoryname")
private String categoryName;	//if we create table then column name 
@Column(name = "categorydescription")								// in database created as category_name;
private String categoryDescription;
@Column(name = "categoryimageurl")
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

}
