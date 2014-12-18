<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css"> 
<title>login</title>
</head>
<body>
	<div>
	<p>student login</p>
	
	<form action="loginServlet" method="post">
		<table>
		<tr><td>id:</td><td><input type="text" name="sid" /></td></tr>
		<tr><td>password:</td><td><input type="password" name="spw" /></td></tr>
		</table>
		<input type="submit" value="Submit" />
	</form>
	</div>
</body>
</html>