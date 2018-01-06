<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/11/6
  Time: 上午11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>这是一个登陆界面</title>
</head>
<body>
<s:actionerror/>
<s:fielderror/>
<form action="doLogin" method="post">
    用户名:<input type="text" name="username"><br>
    密码:<input type="password" name="psw"><br>
    验证码：<input type="text" name="checkcode"  id="checkcode" value="点击图片刷新"/>
    <img src="imageAction.action" onclick="this.src='imageAction.action'" title="点击图片刷新验证码"/><br>
    <input type="submit" value="确认">

</form>
</body>
</html>
