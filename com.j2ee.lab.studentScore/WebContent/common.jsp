<%@ page
	import="dataService.Logic,data.CourseRecord,listener.ExistingSessionCounter"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div id="stu_course_info">
			<%
				out.println("<p><a href=\"login.jsp\">log out</a></p>");
				out.println("<p>当前在线人数：");
				out.println(ExistingSessionCounter.getSessionNo() + "</p>");
				out.println("<p>your course information:</p>");
				int i = 0;
				out.println("<table>");
				out.println("<tr><td>序号</td><td>课程号</td><td>课程名称</td><td>成绩</td></tr>");
				for (CourseRecord cr : Logic.getCrList()) {
					out.println("<tr><td>" + (++i) + "</td><td>" + cr.getCid()
							+ "</td>" + "<td>" + cr.getCname() + "</td>" + "</td>"
							+ "<td>" + cr.getScore() + "</td>" + "</tr>");
				}
				out.println("</table>");
			%>
		</div>
	</div>
</body>
</html>