package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Product;
import com.service.ProductService;


public class ProdutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ProdutController() {
        super();
        // TODO Auto-generated constructor stub
    }

    ProductService ps = new ProductService();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//PrintWriter pw = response.getWriter();
List<Product> listOfProduct = ps.listOfProduct();	//<table>
request.setAttribute("products", listOfProduct);
RequestDispatcher rd = request.getRequestDispatcher("product.jsp");
rd.forward(request, response);
//	pw.println("<table>");
//	pw.println("<tr> <th>PId</th> <th>PName</th> <th>Price</th> </tr>");
//		for(int i=0;i<listOfProduct.size();i++) {
//			Product p  = listOfProduct.get(i);
//			pw.print("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getPrice()+"</td></tr>");
//		}
//	pw.println("</table>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter pw = response.getWriter();
	String pname = request.getParameter("pname");
	float price = Float.parseFloat(request.getParameter("price"));
	response.setContentType("text/html");
	Product p = new Product();
	p.setPname(pname);
	p.setPrice(price);
	
	String result = ps.storeProduct(p);
	pw.println(result);
	RequestDispatcher rd = request.getRequestDispatcher("storeProdcut.jsp");
	rd.include(request, response);
	}

	
}
