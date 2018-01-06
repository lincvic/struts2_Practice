<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/24
  Time: 下午5:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息修改</title>
</head>
<body>
<h2>填写图书信息</h2>
<s:fielderror fieldName="modiBookError"/>

<s:form action="modiBook" method="POST">

    <s:textfield label="图书ID" name="id" value="%{#session.bookById.id}" readonly="true"/>
    <s:textfield label="图书名字" name="bname" value="%{#session.bookById.bname}"/>
    <s:textfield label="图书ISBN" name="isbn" value="%{#session.bookById.isbn}"/>
    <s:submit value="提交"/>

</s:form>
</body>
</html>
