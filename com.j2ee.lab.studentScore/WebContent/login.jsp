<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<p>student login</p>
	
	<form action="loginServlet" method="post">
		id:<input type="text" name="sid" /> 
		password:<input type="text" name="spw" />
		<input type="submit" value="Submit" />
	</form>
	
</body>
</html>