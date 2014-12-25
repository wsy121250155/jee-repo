<%@ page import="data.CourseRecord,listener.ExistingSessionCounter"
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
			<jsp:useBean id="courseList" type="data.CourseRecordList"
				scope="session"></jsp:useBean>
			<jsp:useBean id="courseRecord" class="data.CourseRecord" scope="page"></jsp:useBean>
			<%
				out.println("<p><a href=\"login.jsp\">log out</a></p>");
				out.println("<p>当前在线人数：");
				out.println(ExistingSessionCounter.getSessionNo() + "</p>");
				out.println("<p>your course information:</p>");
			%>
			<table>
				<tr>
					<td>序号</td>
					<td>课程号</td>
					<td>课程名称</td>
					<td>成绩</td>
				</tr>
				<%
					int i;
					for (i = 0; i < courseList.getCrList().size(); i++) {
						pageContext.setAttribute("courseRecord",
								courseList.getCrList(i));
				%>
				<tr>
					<td><%=i + 1%></td>
					<td><jsp:getProperty name="courseRecord" property="cid"></jsp:getProperty></td>
					<td><jsp:getProperty name="courseRecord" property="cname"></jsp:getProperty></td>
					<td><jsp:getProperty name="courseRecord" property="score"></jsp:getProperty></td>
				</tr>
				<%
					}
				%>
			</table>
		</div>
	</div>
</body>
</html>