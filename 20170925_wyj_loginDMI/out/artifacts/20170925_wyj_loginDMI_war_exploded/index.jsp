<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/19
  Time: 下午6:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>这是一个登陆界面</title>
    <script type="text/javascript">
        function login() {
            targetForm = document.forms[0];
            targetForm.action = "doLogin!login";//与Struts.xml对应
            targetForm.submit();
        }
        function regist() {
            targetForm = document.forms[0];
            targetForm.action = "doRegist!regist";//与Struts.xml对应
            targetForm.submit();
        }
    </script>
</head>
<body>
<s:property value="info"/>
<form action="action!methodName" method="post">
    用户名:<input type="text" name="username">${errors.username[0]}<br>
    密码:<input type="password" name="psw">${errors.psw[0]}<br>
    用户类型:<select name="type">
    <option value="普通用户">普通用户</option>
    <option value="管理员">管理员</option>
</select>
    <input type="button" value="登陆" onclick="login()">
    <input type="button" value="注册" onclick="regist()">
</form>
</body>
</html>
