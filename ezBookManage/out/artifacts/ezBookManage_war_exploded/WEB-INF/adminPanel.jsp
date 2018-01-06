<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/24
  Time: 下午3:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员后台</title>
</head>
<body>
<h2>欢迎来到管理员后台</h2>
<s:fielderror/>
<a href="getAllBook.action">点我管理图书信息</a><br>
<a href="adminAddBookJump.action">点我添加图书信息</a>
</body>
</html>
