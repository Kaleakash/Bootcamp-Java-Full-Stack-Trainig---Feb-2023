package com.eshopping.customer.service;

import java.util.List;

import com.eshopping.customer.bean.Orders;
import com.eshopping.customer.dao.AccountDao;
import com.eshopping.customer.dao.OrdersDao;

public class OrdersService {

	OrdersDao od = new OrdersDao();
	AccountDao ad = new AccountDao();
	public String placeOrder(Orders order) {
		int orderId = od.placeOrder(order);
		System.out.println("Order Id "+orderId);
		int result = od.orderProductDetails(order.getProducts(), orderId);
		if(result>0) {
			int result1 = ad.doPayment(order.getTotalAmount(), order.getEmail());
			if(result1>0) {
				return "Order Placed successsfully";
			}else {
				return "Order didn't place";
			}
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
