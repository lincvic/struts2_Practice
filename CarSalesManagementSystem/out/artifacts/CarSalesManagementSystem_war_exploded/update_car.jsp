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
    int carid = Integer.parseInt(request.getParameter("carid"));
    String brand = request.getParameter("brand");
    String model = request.getParameter("model");
    int price = Integer.parseInt(request.getParameter("price"));
    String picture = request.getParameter("picture");
    int quantity = Integer.parseInt(request.getParameter("quantity"));
%>
<div id="main_bg">
    <header>
        <nav>
            <div id="logo">
                <a href="#" >更新轿车信息</a>
            </div>
        </nav>
        <div id ="banner"></div>
    </header>
</div>

<div id="update">
    <div class="login_info">
        <form name="form" method="post" action="/servlet/Admin/Car/UpdateCarServlet">
            <input class="form_input" type="text" name="carid" placeholder="轿车编号"  value="<%=carid%>" readonly="true">
            <input class="form_input" type="text" name="brand" placeholder="品    牌" value="<%=brand%>"><br>
            <input class="form_input" type="text" name="model" placeholder="车    型" value="<%=model%>"><br>
            <input class="form_input" type="text" name="price" placeholder="进   价" value="<%=price%>"><br>
            <input class="form_input" type="text" name="picture" placeholder="图片链接" value="<%=picture%>"><br>
            <input class="form_input" type="text" name="quantity" placeholder="销售数量" value="<%=quantity%>"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>
