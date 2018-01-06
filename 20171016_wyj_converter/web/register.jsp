<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/16
  Time: 上午11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<s:form action="registerAction" method="POST">
    <s:textfield label="用户名" name="username"/>
    <s:textfield label="固话" name="tel"/>
    <s:textfield label="省" name="address"/>
    <s:textfield label="市" name="address"/>
    <s:textfield label="区" name="address"/>
    <s:textfield label="街道" name="address"/>
    <s:submit label="提交"/>
</s:form>
</body>
</html>
