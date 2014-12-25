<%@ page import="data.CourseRecord,listener.ExistingSessionCounter, listener.SessionAttiListener"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css">
<title>Student information</title>
</head>
<body>
	<div>
		<div id="stu_course_info">
			<p>
				<a href="logOut">log out</a>
			</p>
			<p>
				当前在线人数：
				<%=ExistingSessionCounter.getSessionNo()%>
			</p>
			<p>
				当前登陆人数：
				<%=SessionAttiListener.getLogNo()%>
			</p>
			<jsp:useBean id="courseList" type="data.CourseRecordList"
				scope="session"></jsp:useBean>
			<jsp:useBean id="courseRecord" class="data.CourseRecord" scope="page"></jsp:useBean>
			<p>your course information:</p>
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