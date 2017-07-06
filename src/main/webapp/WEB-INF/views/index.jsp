<%--
  Created by IntelliJ IDEA.
  User: Keven
  Date: 2017/7/5
  Time: 上午11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>welcome to kmall</title>
</head>
<body style="text-align:center;">
<form action="/kmall/login" method="post">
    <h1>用户登录</h1><br>
    账号:<input type="text" name="account" id="account"/><br>
    密码:<input type="password" name="password" id="password"/><br>
    <input type="submit" value="登录"/><br>
    没有账号？<a href="/kmall/register">立即注册</a>
</form>
</body>
</html>
