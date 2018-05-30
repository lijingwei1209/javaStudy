<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%  

String path = request.getContextPath();  

String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  

%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<base href="<%=basePath%>">  
<title>Insert title here</title>
</head>
<body>
    <h1>Servlet跳转路径</h1>
    <hr/>
    <!-- 使用相对路径访问HelloServlet -->
    <!-- /servlet/HelloServlet 第一个/表示服务器的根目录 -->
    <a href="servlet/HelloServlet">以Get方式访问HelloServlet!</a><br/>
    <!-- 使用绝地路径访问HelloServlet 可以使用Path变量;Path表示项目的根目录-->
    <a href="<%=path%>/servlet/HelloServlet">以Get方式访问HelloServlet!</a><br/>
    <!-- 表单中action的URL地址的写法与超链接方式完全相同 -->
    <a href="servlet/TestServlet">访问TestServlet,跳转到Test.jsp</a>
</body>
</html>