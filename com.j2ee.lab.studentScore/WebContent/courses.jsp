<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="component" uri="/WEB-INF/tlds/component.tld"%>
<%@ taglib prefix="info" uri="/WEB-INF/tlds/info.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<title>courses information</title>
</head>
<body>
	<div>
	<component:HeadBar log="${user.haslog}" />
		<div class="span8">
			<table class="table table-striped table-bordered table-condensed">
				<caption>all courses information:</caption>
				<thead>
					<tr>
						<td>序号</td>
						<td>课程号</td>
						<td>课程名称</td>
					</tr>
				</thead>
				<tbody>
					<info:coursesTable crList="${crList }"/>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>