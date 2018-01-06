<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/18
  Time: 下午5:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr bgcolor="#00ffff">
        <td>书名</td>
        <td>定价</td>
    </tr>
    <s:iterator value="bookList" var="book" status="st">
        <tr <s:if test="#st.odd"> style="background-color: red"</s:if>>
            <td><s:property value="#book.bookName"/></td>
    
            <td><s:property value="#book.bookPrice"/></td>
        </tr>

    </s:iterator>

</table>
</body>
</html>
