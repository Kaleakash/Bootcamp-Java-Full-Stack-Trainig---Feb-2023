package com.eshopping.customer.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshopping.admin.bean.Product;
import com.eshopping.customer.bean.Orders;
import com.eshopping.customer.service.OrdersService;
import com.google.gson.Gson;
import com.mysql.cj.x.protobuf.MysqlxCrud.Order;

/**
 * Servlet implementation class OrdersController
 */
@WebServlet("/OrdersController")
public class OrdersController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrdersController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		response.setContentType("application/json");
		String email = request.getParameter("email");
		System.out.println(email);
		if(email==null) {
			List<Orders> listOfOrders = os.getAllOrders();
			Gson gson = new Gson();
			String jsonResponse = gson.toJson(listOfOrders);
			pw.print(jsonResponse);
			pw.flush();
		}else {
			List<Orders> listOfOrders = os.findOrdersByUser(email);
			Gson gson = new Gson();
			String jsonResponse = gson.toJson(listOfOrders);
			pw.print(jsonResponse);
			System.out.println("All Orders details ");
			System.out.println(listOfOrders);
			pw.flush();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	OrdersService os = new OrdersService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BufferedReader br = request.getReader();
		response.setContentType("text/plain");
		Gson gson = new Gson();
		Orders order = gson.fromJson(br, Orders.class);
		System.out.println(order);		// toString ()
		String result = os.placeOrder(order);
		pw.print(result);
		//pw.println("done");
		pw.flush();
	}

}
