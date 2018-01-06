<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/9
  Time: 下午7:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:i18n name="sw.wyj.action.message">
<html>
<head>
    <title><s:text name="title3"/></title>
</head>
<body>
<h1>${sessionScope.usermsg}</h1><br>
${sessionScope.namemsg}<br>
${sessionScope.emailmsg}<br>
${sessionScope.phonemsg}<br>
<a href="index.jsp"><s:text name="msg"/></a>
</body>
</html>
</s:i18n>