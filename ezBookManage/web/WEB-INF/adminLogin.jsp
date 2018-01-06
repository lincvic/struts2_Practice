<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/24
  Time: 下午4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>管理员登陆</title>
</head>
<body>
<s:fielderror fieldName="adminLoginError"/>

<s:form action="adminLogin" method="POST">
<s:textfield label="管理员账号" name="username"/>
<s:password label="管理员密码" name="psw"/>
<s:submit value="登陆"/>
</s:form>

</body>
</html>
