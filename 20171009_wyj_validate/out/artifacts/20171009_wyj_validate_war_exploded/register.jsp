<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/9
  Time: 下午3:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:i18n name="sw.wyj.i18n.index">
<html>
<head>
    <title><s:text name="title2"/></title>
</head>
<body>
<table>

<s:form action="registerAction" method="POST">
    <tr>
    <s:textfield key="email" name="email"/>
    </tr><tr>
    <s:password key="psw" name="psw"/>
    </tr><tr>
    <s:password key="repsw" name="repsw"/>
    </tr><tr>
    <s:textfield key="username" name="username"/>
    </tr><tr>
    <s:textfield key="name" name="name"/>
    </tr><tr>
    <s:textfield key="phone" name="phonenum"/>
    </tr><tr>
    <td>
    <s:textfield key="checkcode" name="checkcode"/>
    </td><td>
    <img src="imageAction.action" onclick="this.src='imageAction.action'" />
    </td>
    </tr><tr>
    <s:submit key="submit"/>
    </tr>
</s:form>

</table>

</body>
</html>
</s:i18n>