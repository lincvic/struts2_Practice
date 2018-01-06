<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/5
  Time: 下午4:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>这是一个统计页面</title>
</head>
<body>
<%
    if (application.getAttribute("count") == null) {
        application.setAttribute("count", new Integer(0));
    }
    Integer count = (Integer) application.getAttribute("count");
    application
            .setAttribute("count", new Integer(count.intValue() + 1));
    count = (Integer) application.getAttribute("count");
%>

<h1>第<%=count.intValue()%>次访问</h1>

</body>
</html>
