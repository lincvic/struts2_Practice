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

    <title>更新员工信息</title>

   <%-- <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">--%>

    <link rel="stylesheet" type="text/css" href="css/normalize.css">
    <link href="css/ems.css" rel="stylesheet">
    <script src="js/yq.js" type="text/javascript"> </script>
</head>

<body>

<%
    int eid = Integer.parseInt(request.getParameter("eid"));
    String name = request.getParameter("name");
    String phonenumber = request.getParameter("phonenumber");
    int totalnum = Integer.parseInt(request.getParameter("totalnum"));
    int totalprofit = Integer.parseInt(request.getParameter("totalprofit"));
%>
<div id="main_bg">
    <header>
        <nav>
            <div id="logo">
                <a href="#" >更新员工信息</a>
            </div>
        </nav>
        <div id ="banner"></div>
    </header>
</div>

<div id="update">
    <div class="login_info">
        <form name="form" method="post" action="/servlet/Admin/Employee/UpdateEmployeeServlet">
            <input class="form_input" type="text" name="eid" placeholder="员工编号"  value="<%=eid%>" readonly="true">
            <input class="form_input" type="text" name="name" placeholder="性    名" value="<%=name%>"><br>
            <input class="form_input" type="text" name="phonenumber" placeholder="电话号码" value="<%=phonenumber%>"><br>
            <input class="form_input" type="text" name="totalnum" placeholder="销售车数" value="<%=totalnum%>"><br>
            <input class="form_input" type="text" name="totalprofit" placeholder="销售利润" value="<%=totalprofit%>"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>
