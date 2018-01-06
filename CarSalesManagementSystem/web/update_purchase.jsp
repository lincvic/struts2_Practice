<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>更新用户信息</title>

   <%-- <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link href="css/ems.css" rel="stylesheet">
    <script src="js/yq.js" type="text/javascript"> </script>
</head>

<body>

<%
    int pid = Integer.parseInt(request.getParameter("pid"));
    int clientid = Integer.parseInt(request.getParameter("clientid"));
    int sid = Integer.parseInt(request.getParameter("sid"));
    String purchasedate = request.getParameter("purchasedate");
%>
<div id="main_bg">
    <header>
        <nav>
            <div id="logo">
                <a href="#" >更新用户信息</a>
            </div>
        </nav>
        <div id ="banner"></div>
    </header>
</div>

<div id="update">
    <div class="login_info">
        <form name="form" method="post" action="/servlet/Admin/Purchase/UpdatePurchaseServlet">
            <input class="form_input" type="text" name="pid" placeholder="购买单号"  value="<%=pid%>" readonly="true">
            <input class="form_input" type="text" name="clientid" placeholder="用户编号"  value="<%=clientid%>">
            <input class="form_input" type="text" name="sid" placeholder="销售编号" value="<%=sid%>"><br>
            <input class="form_input" type="text" name="purchasedate" placeholder="购买日期" value="<%=purchasedate%>"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>
