package com.eshopping.customer.bean;

import java.util.Arrays;

import com.eshopping.admin.bean.Product;

public class Orders {
private int orderid;
private String orderDate;
private String orderStatus;
private String email;
private int shipmentCharges;
private int totalItems;
private float totalAmount;
private Product[] products;

public Product[] getProducts() {
	return products;
}
public void setProducts(Product[] products) {
	this.products = products;
}
public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public String getOrderStatus() {
	return orderStatus;
}
public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getShipmentCharges() {
	return shipmentCharges;
}
public void setShipmentCharges(int shipmentCharges) {
	this.shipmentCharges = shipmentCharges;
}
public int getTotalItems() {
	return totalItems;
}
public void setTotalItems(int totalItems) {
	this.totalItems = totalItems;
}
public float getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(float totalAmount) {
	this.totalAmount = totalAmount;
}
@Override
public String toString() {
	return "Orders [orderid=" + orderid + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", email="
			+ email + ", shipmentCharges=" + shipmentCharges + ", totalItems=" + totalItems + ", totalAmount="
			+ totalAmount + ", products=" + Arrays.toString(products) + "]";
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
public Orders(int orderid, String orderDate, String orderStatus, String email, int shipmentCharges, int totalItems,
		float totalAmount) {
	super();
	this.orderid = orderid;
	this.orderDate = orderDate;
	this.orderStatus = orderStatus;
	this.email = email;
	this.shipmentCharges = shipmentCharges;
	this.totalItems = totalItems;
	this.totalAmount = totalAmount;
}

}
