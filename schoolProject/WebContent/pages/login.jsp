<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
</head>
<body>
	<form action="login" method="post">
		<div>
			username:<input type="text" name="userName"><br>
			password:<input type="password" name="userPwd"><br> <input
				type="submit">
		</div>
		<div><%=request.getAttribute("msg")!=null?request.getAttribute("msg"):""%></div>
	</form>
</body>
</html>