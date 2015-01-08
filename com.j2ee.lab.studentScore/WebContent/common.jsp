<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="component" uri="/WEB-INF/tlds/component.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<title>Your scores information</title>
</head>
<body>
	<component:HeadBar log="${user.haslog}" />
	<div class="container-fluid">
		<div class="span2">
			<div>
				<p>当前在线人数： ${people_static.log_no}</p>
				<p>当前登陆人数： ${people_static.online_no}</p>
			</div>
			<jsp:useBean id="user" type="data.UserBean" scope="session"></jsp:useBean>
			<%
				if (!user.allPass()) {
			%>
			<jsp:include page="attention.jspf" />
			<%
				}
			%>
		</div>
		<div class="span8">
			<table class="table table-striped table-bordered table-condensed">
				<caption>your course information:</caption>
				<thead>
					<tr>
						<td>序号</td>
						<td>课程号</td>
						<td>课程名称</td>
						<td>成绩</td>
					</tr>
				</thead>
				<tbody>
					<jsp:useBean id="courseRecord"
						class="com.j2ee.ejbServer.model.CourseRecord" scope="page"></jsp:useBean>
					<%
						int i;
						for (i = 0; i < user.getCrList().getCrList().size(); i++) {
							pageContext.setAttribute("courseRecord", user.getCrList()
									.getCrList(i));
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
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>