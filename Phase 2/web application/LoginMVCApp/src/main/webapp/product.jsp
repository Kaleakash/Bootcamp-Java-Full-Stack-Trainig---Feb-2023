<%@page import="java.util.List,com.bean.Product" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
	function updatefun(pid,price) {
		alert(pid+" "+price);
		window.location.href="http://localhost:8080/LoginMVCApp/ProductUpdateController?pid="+pid+"&price="+price;
	}
</script>
</head>
<body>
<table border="1">
<tr>
	<th>PId</th>
	<th>PName</th>
	<th>Price</th>
	<td>Update</td>
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
		<td><input type="button" value="update" onclick="updatefun(<%=p.getPid()%>,<%=p.getPrice()%>)"/></td>
	</tr>
<%
}
%>

</table>
</body>
</html>