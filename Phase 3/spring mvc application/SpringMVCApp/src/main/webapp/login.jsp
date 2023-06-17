<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Login Page with hard coding check emailid and password</h2>
<form action="loginCheck" method="post">
<label>EmailId</label>
<input type="email" name="email"><br/>
<label>Password</label>
<input type="password" name="pass"><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
<hr/>
<h2>Login page with datase using JdbcTemplate</h2>
<form action="signIn" method="post">
<label>EmailId</label>
<input type="email" name="email"><br/>
<label>Password</label>
<input type="password" name="pass"><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
<a href="signUp.jsp">SignUp</a>
</body>
</html>