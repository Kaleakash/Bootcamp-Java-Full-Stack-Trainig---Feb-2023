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
import com.eshopping.admin.service.CategoryService;
import com.google.gson.Gson;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	CategoryService cs = new CategoryService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	response.setContentType("application/json");
	List<Category> listOfCategory = cs.findAllCategory();
	Gson gson = new Gson();
	String jsonResponse = gson.toJson(listOfCategory);
	pw.print(jsonResponse);
	pw.flush();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	BufferedReader br = request.getReader();
	response.setContentType("text/plain");
	Gson gson = new Gson();
	Category category = gson.fromJson(br, Category.class);
	String result = cs.storeCategory(category);
	pw.print(result);
	pw.flush();
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
 