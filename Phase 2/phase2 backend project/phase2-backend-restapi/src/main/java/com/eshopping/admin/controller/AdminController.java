package com.eshopping.admin.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshopping.admin.bean.Admin;
import com.eshopping.admin.service.AdminService;
import com.google.gson.Gson;

/**
 * Servlet implementation class AdminController
 */
@WebServlet("/AdminController")						// url-pattern 
public class AdminController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AdminController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	AdminService as = new AdminService();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		BufferedReader br = request.getReader();
			response.setContentType("text/plain");
		Gson gson = new Gson();
		Admin admin = gson.fromJson(br, Admin.class);
		System.out.println(admin);  // it call toString method and display emailid and password;
		String result = as.signIn(admin);
		pw.print(result);
		pw.flush();
	}

}
