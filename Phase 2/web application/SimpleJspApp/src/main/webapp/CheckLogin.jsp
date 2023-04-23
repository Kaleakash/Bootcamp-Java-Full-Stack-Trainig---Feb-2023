<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String email,password; %>
<%
email = request.getParameter("email");
password = request.getParameter("pass");

if(email.equals("akash@gmail.com") && password.equals("123")){
	out.println("successfully login");
}else {
	out.println("failure try once again");
}
%>
</body>
</html>