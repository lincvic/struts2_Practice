<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/9/18
  Time: 上午11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>这是一个计算器首页</title>
  </head>
  <body>
  <form action="calAction" method="post">
    操作数1:<input type="text" name="num1" value=${requestScope.num1} ><br>
    运算符：<input type="radio" name="op" value="+"${requestScope.op=="+"?"checked":""} }>+
    <input type="radio" name="op" value="-"${requestScope.op=="-"?"checked":""}>-
    <input type="radio" name="op" value="*"${requestScope.op=="*"?"checked":""}>*
    <input type="radio" name="op" value="/"${requestScope.op=="/"?"checked":""}>/<br>
    操作数2:<input type="text" name="num2" value=${requestScope.num2}><br>
    <input type="submit" value="计算"/><br>
  </form>
  结果:<input type="text" value=${requestScope.result}>
  </body>
</html>
