<%@ page import="listener.ExistingSessionCounter" language="java"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css">
<title>Student information</title>
</head>
<body>
	<div>
		<div id="remind">
			<%
				out.println("<p><a href=\"login.jsp\">log out</a></p>");
				out.println("<p>当前在线人数：");
				out.println(ExistingSessionCounter.getSessionNo() + "</p>");
				out.println("<p>请注意，您有挂科！</p>");
			%>
			<!-- <p>${ExistingSessionCounter.sessionCount}</p> --> 
		</div>
	</div>
</body>
</html>