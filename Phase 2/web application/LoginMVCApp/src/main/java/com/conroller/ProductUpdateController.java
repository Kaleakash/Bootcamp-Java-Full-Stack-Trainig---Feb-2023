package com.conroller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductUpdateController
 */
public class ProductUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		int pid = Integer.parseInt(request.getParameter("pid"));
		float price = Float.parseFloat(request.getParameter("price"));
		System.out.println(pid +" "+price);
		pw.println("<form action='ProductUpdateController' method='post'>");
		pw.println("<label>Pid</label>");
		pw.println("<input type='text' name='pid' value="+pid+" readonly/>");
		pw.println("<label>Price</label>");
		pw.println("<input type='text' name='price' value="+price+" />");
		pw.println("<input type='submit' value='update product'/>");
		pw.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		int pid = Integer.parseInt(request.getParameter("pid"));
		float price = Float.parseFloat(request.getParameter("price"));
		System.out.println(pid+" "+price);
		// call service and dao and update and retrieve updated record in table format. 
		pw.println("Update Post method callled...");
	}

}
