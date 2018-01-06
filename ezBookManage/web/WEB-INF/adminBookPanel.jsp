<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/24
  Time: 下午3:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书信息管理</title>
</head>
<body>
<s:fielderror/>
<table border="1">
    <tr>
        <td>id</td>
        <td>图书名称</td>
        <td>图书ISBN</td>
        <td colspan="2">操作</td>

    </tr>
    <s:iterator value="bookList" var="b">
        <tr>
            <td><s:property value="#b.id"/></td>
            <td><s:property value="#b.bname"/></td>
            <td><s:property value="#b.isbn"/></td>
            <td><a href="modiBookJump.action?bookId=<s:property value='#b.id'/>">修改图书信息</a></td>
            <td><a href="delBook.action?bookId=<s:property value='#b.id'/>">删除图书信息</a></td>
        </tr>

    </s:iterator>

</table>
</body>
</html>
