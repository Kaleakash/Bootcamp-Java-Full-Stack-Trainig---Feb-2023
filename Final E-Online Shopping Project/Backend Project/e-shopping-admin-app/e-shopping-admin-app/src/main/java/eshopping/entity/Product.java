package eshopping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto_increment
private int pid;
private String title;
private String description;
@Column(name = "discountpercentage")
private float discountPercentage;
private float price;
private float rating;
private int stock;
private String brand;
private int cid;
private int qty;

public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}
public float getDiscountPercentage() {
	return discountPercentage;
}
public void setDiscountPercentage(float discountPercentage) {
	this.discountPercentage = discountPercentage;
}
private String thumbnail;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getThumbnail() {
	return thumbnail;
}
public void setThumbnail(String thumbnail) {
	this.thumbnail = thumbnail;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pid, String title, String description, float discountPercentage, float price, float rating,
		int stock, String brand, int cid, String thumbnail) {
	super();
	this.pid = pid;
	this.title = title;
	this.description = description;
	this.discountPercentage = discountPercentage;
	this.price = price;
	this.rating = rating;
	this.stock = stock;
	this.brand = brand;
	this.cid = cid;
	this.thumbnail = thumbnail;
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", title=" + title + ", description=" + description + ", discountPercentage="
			+ discountPercentage + ", price=" + price + ", rating=" + rating + ", stock=" + stock + ", brand=" + brand
			+ ", cid=" + cid + ", qty=" + qty + ", thumbnail=" + thumbnail + "]";
}

}
