<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/9
  Time: 上午10:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<s:i18n name="sw.wyj.i18n.index">
<html>
  <head>
    <title><s:text name="title"/></title>
  </head>
  <body>
  <s:form action="loginAction" method="POST">
    <s:textfield key="username" name="username"/>
    <s:password key="psw" name="lopsw" />
    <s:submit key="submit" />
    <s:fielderror fieldName="error"/>
  </s:form>
  <a href="register.jsp">点我前往注册页面</a><br>
  <a href="langAciton.action?request_locale=zh_CN"><s:text name="language.zh"/></a>
  <a href="langAciton.action?request_locale=en_US"><s:text name="language.en"/></a>
  <a href="langAciton.action?request_locale=ja_JP"><s:text name="language.ja"/></a>
  </body>
</html>
</s:i18n>