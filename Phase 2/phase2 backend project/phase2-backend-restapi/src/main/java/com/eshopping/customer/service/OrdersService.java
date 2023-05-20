package com.eshopping.customer.service;

import java.util.List;

import com.eshopping.customer.bean.Orders;
import com.eshopping.customer.dao.OrdersDao;

public class OrdersService {

	OrdersDao od = new OrdersDao();
	
	public String placeOrder(Orders order) {
		int orderId = od.placeOrder(order);
		System.out.println("Order Id "+orderId);
		int result = od.orderProductDetails(order.getProducts(), orderId);
		if(result>0) {
			// we need to call decrement Stock DAO method 
			return "Order Placed successsfully";
		}else {
			return "Order didn't place";
		}
		
	}
	
	public List<Orders> getAllOrders() {
		return od.getAllOrderDetails();
	}
	
	public List<Orders> findOrdersByUser(String email){
		return od.getAllOrdersByUsers(email);
	}
}
