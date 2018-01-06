<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/24
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
<h2>输入图书相关信息</h2>
<s:fielderror fieldName="addBookError"/>

<s:form action="addBook" method="POST">

    <s:textfield label="图书名字" name="bname"/>
    <s:textfield label="图书ISBN" name="isbn"/>
    <s:submit value="提交"/>

</s:form>
</body>
</html>
