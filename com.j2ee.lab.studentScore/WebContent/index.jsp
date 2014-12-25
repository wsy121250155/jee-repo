<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="js/time.js"></script>
<script type="text/javascript">
	window.onload = function() {
		document.getElementById('time').innerHTML = startTime()
	}
</script>
</head>
<body>
	<div>
		<div id="show_time">
			<p>您于：</p>
			<p>
				<em id="time"></em>登陆本页。
			</p>
		</div>
		<div>
			<a href="loginServlet">start from here</a>
		</div>
		<div>
			<%!int visit_no = 0;%>
			<p>当前已有<%=(++visit_no)%>人访问过该页面。</p>
		</div>
	</div>
</body>
</html>