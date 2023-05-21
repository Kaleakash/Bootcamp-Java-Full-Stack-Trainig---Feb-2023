package com.eshopping.customer.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.PseudoColumnUsage;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eshopping.admin.bean.Product;
import com.eshopping.customer.bean.Orders;
import com.eshopping.resource.DbResource;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

public class OrdersDao {

	Connection con;
	public OrdersDao() {
		con = DbResource.getDbConnection();
		
	}
	
	public int placeOrder(Orders order) {
		try {
	PreparedStatement pstmt = 
	con.prepareStatement("insert into orders(orderDate,orderStatus,email,shipmentCharges,totalItems,totalAmount) values(?,?,?,?,?,?)");		
	pstmt.setDate(1, Date.valueOf(order.getOrderDate()));  // converting string to sql date format. 
	pstmt.setString(2,order.getOrderStatus());
	pstmt.setString(3, order.getEmail());
	pstmt.setInt(4, order.getShipmentCharges());
	pstmt.setInt(5, order.getTotalItems());
	pstmt.setFloat(6, order.getTotalAmount());
	int res = pstmt.executeUpdate();
		if(res>0) {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select orderid from orders order by orderid desc");
			if(rs.next()) {
				int orderId = rs.getInt(1);
				return orderId;
			}
		}
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
		return 0;
	}
	public int orderProductDetails(List<Product> products, int orderid) {
		try {
			Statement stmt=con.createStatement();
			System.out.println("Size of products "+products.size());
			for(int i=0;i<products.size();i++) {
	stmt.addBatch("insert into product_orders_info(oid,pid,qty) values("+orderid+","+products.get(i).getPid()+","+products.get(i).getQty()+")");
			}
			int res[] = stmt.executeBatch();			// it execute only once in db or send to db. 
			System.out.println("Result "+res.length);
			return res.length;
		} catch (Exception e) {
		System.out.println(e);
		return 0;
		}
	}
	
	public List<Orders> getAllOrderDetails() {
		List<Orders> listOfOrders = new ArrayList<Orders>();	
		try {
			PreparedStatement pstmt = con.prepareStatement("select * from orders");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Orders od = new Orders();
					od.setOrderid(rs.getInt(1));	//7 
			PreparedStatement pstmt1 = con.prepareStatement("select * from product_orders_info where oid = ?");
				pstmt1.setInt(1, od.getOrderid());
				ResultSet rs1 = pstmt1.executeQuery();
					while(rs1.next()) {
						int pid = rs1.getInt(3);
						
						PreparedStatement pstmt2 = con.prepareStatement("select * from product where pid = ?");
						pstmt2.setInt(1, pid);
						ResultSet rs2 = pstmt2.executeQuery();
					List<Product> listProduct = new ArrayList<Product>();
							while(rs2.next()) {
								Product p = new Product();
								p.setPid(rs2.getInt(1));
								p.setTitle(rs2.getString(2));
								p.setDescription(rs2.getString(3));
								p.setPrice(rs2.getInt(4));
								p.setDiscountPercentage(rs2.getFloat(5));
								p.setRating(rs2.getFloat(6));
								p.setStock(rs2.getInt(7));
								p.setBrand(rs2.getNString(8));
								p.setCid(rs2.getInt(9));
								listProduct.add(p);
								//p.setImages(rs.getBlob(10).toString());
							}
							od.setProducts(listProduct);
					}
				od.setEmail(rs.getString(2));
				od.setOrderStatus(rs.getString(3));
				od.setEmail(rs.getString(4));
				od.setTotalItems(rs.getInt(6));
				od.setTotalAmount(rs.getFloat(7));
				listOfOrders.add(od);		// 
			}
			} catch (Exception e) {
					System.out.println(e);
			}
			return listOfOrders;
	}
	
public List<Orders> getAllOrdersByUsers(String email) {
	List<Orders> listOfOrders = new ArrayList<Orders>();	
	try {
		PreparedStatement pstmt = con.prepareStatement("select * from orders where email=?");
		pstmt.setString(1, email);
		ResultSet rs = pstmt.executeQuery();
		while(rs.next()) {
			Orders od = new Orders();
			od.setOrderid(rs.getInt(1));
			PreparedStatement pstmt1 = con.prepareStatement("select * from product_orders_info where oid = ?");
			pstmt1.setInt(1, od.getOrderid());
			ResultSet rs1 = pstmt1.executeQuery();
				while(rs1.next()) {
					int pid = rs1.getInt(3);
					
					PreparedStatement pstmt2 = con.prepareStatement("select * from product where pid = ?");
					pstmt2.setInt(1, pid);
					ResultSet rs2 = pstmt2.executeQuery();
					List<Product> listProduct = new ArrayList<Product>();
						while(rs2.next()) {
							Product p = new Product();
							p.setPid(rs2.getInt(1));
							p.setTitle(rs2.getString(2));
							p.setDescription(rs2.getString(3));
							p.setPrice(rs2.getInt(4));
							p.setDiscountPercentage(rs2.getFloat(5));
							p.setRating(rs2.getFloat(6));
							p.setStock(rs2.getInt(7));
							p.setBrand(rs2.getNString(8));
							p.setCid(rs2.getInt(9));
							listProduct.add(p);
							//p.setImages(rs.getBlob(10).toString());
						}
						od.setProducts(listProduct);
				}
			od.setEmail(rs.getString(2));
			od.setOrderStatus(rs.getString(3));
			od.setEmail(rs.getString(4));
			od.setTotalItems(rs.getInt(6));
			od.setTotalAmount(rs.getFloat(7));
			listOfOrders.add(od);
		}
		} catch (Exception e) {
				System.out.println(e);
		}
		return listOfOrders;
	}
}
