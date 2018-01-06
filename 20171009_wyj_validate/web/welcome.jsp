<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/9
  Time: 上午10:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:i18n name="sw.wyj.action.message">
<html>
<head>
    <title><s:text name="title4"/></title>
</head>
<body>
${sessionScope.loginmsg}
</body>
</html>
</s:i18n>