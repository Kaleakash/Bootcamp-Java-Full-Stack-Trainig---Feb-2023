package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html"); 
		String email = req.getParameter("email");
		String password = req.getParameter("pass");
		RequestDispatcher rd1 = req.getRequestDispatcher("Home");
		RequestDispatcher rd2 = req.getRequestDispatcher("login.html");
		
		if(email.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("successfully login with get method ");
			rd1.forward(req, response);
		}else {
			pw.println("failure try once again with get method");
			rd2.include(req, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		String email = request.getParameter("email");
		response.setContentType("text/html"); 
		String password = request.getParameter("pass");
		RequestDispatcher rd1 = request.getRequestDispatcher("Home");
		RequestDispatcher rd2 = request.getRequestDispatcher("login.html");
		if(email.equals("akash@gmail.com") && password.equals("123")) {
			pw.println("successfully login with post method ");
			rd1.forward(request, response);
		}else {
			pw.println("failure try once again with post method");
			rd2.include(request, response);
		}
	}

}
