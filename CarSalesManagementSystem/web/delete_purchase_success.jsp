<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/25
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>删除成功</h1>

<%
    response.setHeader("refresh", "2;URL=/servlet/Admin/Purchase/SelectPurchaseListServlet");
%>

</body>
</html>
