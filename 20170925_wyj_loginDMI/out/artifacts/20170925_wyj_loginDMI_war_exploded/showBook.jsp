<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/27
  Time: 下午6:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>这是全部书籍信息页面</title>
</head>
<body>
<table>
    <tr bgcolor="#00ffff">
        <td>书名</td>
        <td>作者</td>
        <td>定价</td>
    </tr>
    <s:iterator value="bookList" var="book">
        <tr>
            <td><s:property value="#book.bookName"></s:property></td>
            <td><s:property value="#book.bookAuthor"></s:property></td>
            <td><s:property value="#book.bookPrice"></s:property></td>
        </tr>
    </s:iterator>

</table>
</body>
</html>
