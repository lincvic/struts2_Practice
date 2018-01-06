<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/16
  Time: 上午11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个注册成功页面</title>
</head>
<body>

<h1>用户${sessionScope.user.username}注册成功</h1><br>
电话号码为${sessionScope.user.tel}<br>
详细地址为${sessionScope.user.address}<br>
</body>
</html>
