package com.eshopping.admin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshopping.admin.bean.Category;
import com.eshopping.admin.bean.Product;
import com.eshopping.admin.service.ProductService;
import com.google.gson.Gson;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ProductController() {
        super();
      }

	ProductService ps = new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("application/json");
		List<Product> listOfProduct = ps.findAllProducts();
		Gson gson = new Gson();
		String jsonResponse = gson.toJson(listOfProduct);
		pw.print(jsonResponse);
		pw.flush();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BufferedReader br = request.getReader();
		response.setContentType("text/plain");
		Gson gson = new Gson();
		Product product = gson.fromJson(br, Product.class);
		System.out.println(product);
		String result = ps.storeProduct(product);
		pw.print(result);
		//pw.println("done");
		pw.flush();
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		int pid  = Integer.parseInt(request.getParameter("pid"));
		response.setContentType("text/plain");
		String result = ps.deleteProduct(pid);
		pw.print(result);
		pw.flush();
	}

}
