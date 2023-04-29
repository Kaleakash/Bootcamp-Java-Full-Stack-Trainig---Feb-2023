<%@page import="java.util.List,com.bean.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<tr>
	<th>PId</th>
	<th>PName</th>
	<th>Price</th>
</tr>
<%
Object obj = request.getAttribute("products");
List<Product> listOfProduct = (List<Product>)obj;
for(int i=0;i<listOfProduct.size();i++) {
Product p  = listOfProduct.get(i);
%>
	<tr>
		<td><%=p.getPid()%></td>
		<td><%=p.getPname()%></td>
		<td><%=p.getPrice()%></td>
	</tr>
<%
}
%>

</table>
</body>
</html>