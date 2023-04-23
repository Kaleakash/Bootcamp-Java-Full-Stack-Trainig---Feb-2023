package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Login;
import com.service.LoginService;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	// SignIn
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		Login ll = new Login();
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		LoginService ls = new LoginService();
		String result = ls.sigIn(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");	
		RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");
		
		if(result.equalsIgnoreCase("success")) {
			rd1.forward(request, response);
		}else {
			pw.print("failure");
			rd2.include(request, response);
		}
	}
	// SignUp
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		String emailid = request.getParameter("emailid");
		String password = request.getParameter("password");
		
		Login ll = new Login();
		ll.setEmailid(emailid);
		ll.setPassword(password);
		
		LoginService ls = new LoginService();
		String result = ls.sigUp(ll);
		RequestDispatcher rd1 = request.getRequestDispatcher("login.jsp");
		pw.print(result);
		rd1.include(request, response);
	}

}
