<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/27
  Time: 下午5:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是图书添加页面</title>
</head>
<body>
<form action="addBookAction" method="post">
    书名：<input type="text" name="bookName"/>
    <br>
    作者：<input type="text" name="bookAuthor"/>
    <br>
    价格：<input type="text" name="bookPrice"/>
    <br>
    <input type="submit" value="提交">
</form>
</body>
</html>
