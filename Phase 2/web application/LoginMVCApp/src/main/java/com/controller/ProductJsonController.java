package com.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.google.gson.Gson;
import com.service.ProductService;

/**
 * Servlet implementation class ProductJsonController
 */
public class ProductJsonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductJsonController() {
        super();
        // TODO Auto-generated constructor stub
    }

	ProductService ps = new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("application/json");
	response.setCharacterEncoding("UTF-8");
	List<Product> listOfProduct = ps.listOfProduct();
	Gson gson = new Gson();
	String jsonResonse = gson.toJson(listOfProduct);
	pw.print(jsonResonse);
	pw.flush();
	}

	// http.post("url",product); in service layer in angular project 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BufferedReader br = request.getReader();
//		response.setContentType("text/plain");
//		response.setCharacterEncoding("UTF-8");
		Gson gson = new Gson();
		Product p = gson.fromJson(br, Product.class);
		String result = ps.storeProduct(p);
		pw.print(result);
		pw.flush();
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
