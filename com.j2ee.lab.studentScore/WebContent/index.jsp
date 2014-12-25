<%@ page
	import="java.util.Date,java.text.SimpleDateFormat,java.lang.String"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css">
<title></title>
</head>
<body>
	<%!String getSysTime() {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return df.format(new Date());
	}%>
	<div>
		<div id="show_time">
			<p>您于：</p>
			<p><%=getSysTime()%>登陆本页。
			</p>
		</div>
		<div id="start_link">
			<a href="loginServlet">start from here</a>
		</div>
		<div id="no-peo-record">
			<%!int visit_no = 0;%>
			<%="当前已有 " + (++visit_no) + " 人访问过该页面。"%>
		</div>
	</div>
</body>
</html>