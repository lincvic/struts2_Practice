<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/20
  Time: 下午7:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员</title>
</head>
<body>
<h1>管理员${sessionScope.username}登陆成功</h1>
<hr>
<a href="addBook.jsp" target="main">增加书籍</a>
<a href="addBook.jsp">删除书籍</a>
<a href="addBook.jsp">修改书籍</a>
<a href="addBook.jsp">查询书籍</a>
<iframe name="main" width="680" height="380">
</iframe>
</body>
</html>
