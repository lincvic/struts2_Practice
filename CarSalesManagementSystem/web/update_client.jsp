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
    int clientid = Integer.parseInt(request.getParameter("clientid"));
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    String phonenumber = request.getParameter("phonenumber");
    String address = request.getParameter("address");
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
        <form name="form" method="post" action="/servlet/Admin/Client/UpdateClientServlet">
            <input class="form_input" type="text" name="clientid" placeholder="用户编号"  value="<%=clientid%>" readonly="true">
            <input class="form_input" type="text" name="name" placeholder="性    名" value="<%=name%>"><br>
            <input class="form_input" type="password" name="password" placeholder="密    码" value="<%=password%>"><br>
            <input class="form_input" type="text" name="phonenumber" placeholder="电话号码" value="<%=phonenumber%>"><br>
            <input class="form_input" type="text" name="address" placeholder="家庭地址" value="<%=address%>"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>
