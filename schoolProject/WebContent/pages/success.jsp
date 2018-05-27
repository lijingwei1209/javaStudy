<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="model.User"%>

<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>study</title>
</head>
<body>

	<div>
		<%
			User user = (User) session.getAttribute("user");
		%>
		<h1>登录成功:<%=user.getUserName()%></h1>
	</div>
</body>
</html>
