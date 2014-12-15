<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String sid=request.getParameter("sid");
out.println("<h>Sorry, there is no user who has id-"+sid+" or your password is wrong!</h>");
out.println("<p><a href=\"login.jsp\">Please try again!</a></p>");
%>
</body>
</html>