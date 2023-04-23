<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function storeData() {
	//var obj = new XMLHttpRequest();
	//obj
}
</script>
</head>
<body>
<h2>Login Page with get method</h2>
<form action="CheckLogin.jsp" method="get">
<label>EmailId</label>
<input type="email" name="email" required="required"/><br/>
<label>Password</label>
<input type="password" name="pass" required="required"/><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
<hr/>
<h2>Login Page with post method</h2>
<form action="CheckLogin.jsp" method="post">
<label>EmailId</label>
<input type="email" name="email" required="required"/><br/>
<label>Password</label>
<input type="password" name="pass" required="required"/><br/>
<input type="submit" value="submit"/>
<input type="reset" value="reset"/>
</form>
</body>
</html>