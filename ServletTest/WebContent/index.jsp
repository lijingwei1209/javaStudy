<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
   <h1>中文能正常显示不能?!!!!</h1>
   <hr/>
   <a href="servlet/HelloServlet">以Get方式请求HelloServlet</a>
   <form action="servlet/HelloServlet" method="post">
   <input type="submit" value="Post方式请求访问HelloServlet" />
   </form>>
</body>
</html>