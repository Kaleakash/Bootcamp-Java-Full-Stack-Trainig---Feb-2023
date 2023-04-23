<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- JSP Comment  --%>
<h2>Welcome to HTML Page</h2>
<%!int a,b,sum; %>
<%
	a=10;
	b=20;
	sum  = a+b;
	//System.out.println("Welcome to JSP on console");
	out.println("Welcome to JSP Page on browser ");
	out.println("Sum of two number is "+sum);
%>
<p>Value of a is <%=a %> and b is <%=b %></p>
<font color='red'>sum of two number is <%=sum %></font>
</body>
</html>