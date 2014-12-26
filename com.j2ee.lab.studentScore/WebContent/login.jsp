<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="bootstrap/css/bootstrap.css" rel="stylesheet"
	type="text/css">
<title>login</title>
</head>
<body>
	<!--  
	<div>
		<jsp:include page="logIn.jspf" />
	</div>-->
	<div>
		<form class="form-horizontal" action="loginServlet" method="post">
			<div class="control-group">
				<label class="control-label" for="inputId">Id</label>
				<div class="controls">
					<input type="text" id="inputId" placeholder="Id"  name="sid">
				</div>
			</div>
			<div class="control-group">
				<label class="control-label" for="inputPassword">Password</label>
				<div class="controls">
					<input type="password" id="inputPassword" placeholder="Password" name="spw">
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<label class="checkbox"> <input type="checkbox">
						Remember me
					</label>
					<button type="submit" class="btn">Sign in</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>