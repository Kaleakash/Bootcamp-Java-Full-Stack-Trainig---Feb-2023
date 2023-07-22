package eshopping.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Orders {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int orderid;
@Column(name = "orderdate")
private LocalDate orderDate;
@Column(name = "orderstatus")
private String orderStatus;
private String email;
@Column(name = "shipmentcharges")
private int shipmentCharges;
@Column(name = "totalitems")
private int totalItems;
@Column(name = "totalamount")
private float totalAmount;

public int getOrderid() {
	return orderid;
}
public void setOrderid(int orderid) {
	this.orderid = orderid;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
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
			+ totalAmount + "]";
}




}
