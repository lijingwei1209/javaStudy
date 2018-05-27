<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 使用html5，以下注释如果明白可忽略 -->
<!DOCTYPE html>
<html>
<head>
<!-- 移动设备优先，
width=device-width 表示宽度是设备屏幕的宽度。
initial-scale=1 表示初始的缩放比例。
shrink-to-fit=no 自动适应手机屏幕的宽度 -->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 网上找的重置浏览器样式的css，浏览器有一些默认样式先清除掉 -->
<link rel="stylesheet" href="../resource/css/normalize.css">
<!-- 新 Bootstrap4 核心 CSS 文件 -->
<link rel="stylesheet" href="../resource/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入。一个js的库，让你更加方便的写js -->
<script src="../resource/js/jquery.min.js"></script>
<!-- 最新的 Bootstrap4 核心 JavaScript 文件，可以不引入，主要是一些像轮播图动态展示需要 -->
<script src="../resource/js/bootstrap.min.js"></script>
<title>新希望学校管理系统</title>
</head>

<body>
<div class="container">
  <h2>新希望学校管理系统</h2>
  <form action="login" method="post">
    <div class="form-group">
      <label for="userName">用户名:</label>
      <input  class="form-control" id="userName" name="userName" placeholder="请输入用户名" autoFocus>
    </div>
    <div class="form-group">
      <label for="userPwd">密码:</label>
      <input type="password" class="form-control" id="userPwd" name="userPwd" placeholder="请输入密码">
    </div>
    <button type="submit" class="btn btn-primary">登录</button>
    <div><%=request.getAttribute("msg")!=null?request.getAttribute("msg"):""%></div>
  </form>
</div>
</body>
</html>