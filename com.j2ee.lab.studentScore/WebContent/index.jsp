<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/global.css" rel="stylesheet" type="text/css"> 
<title>java-ee</title>
</head>
<body>
<div>
<h1>student score query</h1>
<p>course：j2ee</p>
<p>times: second</p>
<p>description: 学生登录，跟据学生的ID，查询当前课程成绩（使用文件）</p>
<p>并根据成绩，确定返回结果:</p>
<table>
<tr><td>有不及格课程：</td><td>警示页面</td></tr>
<tr><td>正常结果：</td><td>标准页面</td></tr>
<tr><td>未知的学生ID：</td><td>错误页面</td></tr>
</table>


<a href="loginServlet">start from here</a>
</div>
</body>
</html>