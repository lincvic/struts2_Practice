<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/8/30
  Time: 下午6:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="CalServlet" method="get">
    操作数1:<input type="text" name="num1" value=${requestScope.cal.num1} ><br>
    运算符：<input type="radio" name="op" value="+"${requestScope.cal.op=="+"?"checked":""} }>+
    <input type="radio" name="op" value="-"${requestScope.cal.op=="-"?"checked":""}>-
    <input type="radio" name="op" value="*"${requestScope.cal.op=="*"?"checked":""}>*
    <input type="radio" name="op" value="/"${requestScope.cal.op=="/"?"checked":""}>/<br>
    操作数2:<input type="text" name="num2" value=${requestScope.cal.num2}><br>
    <input type="submit" value="计算"/><br>
  </form>
  结果:<input type="text" value=${requestScope.cal.result}>
  </body>
</html>
