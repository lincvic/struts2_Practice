<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/13
  Time: 下午5:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>这是一个登陆界面</title>

</head>
<body>
<s:form action="login" method="POST">
    <s:textfield name="username" label="账号"></s:textfield>${errors.usernameError[0]}
    <br>
    <s:textfield name="psw" label="密码"></s:textfield>${errors.pswError[0]}
    <br>
    <s:submit value="提交"></s:submit>
</s:form>
</body>
</html>
