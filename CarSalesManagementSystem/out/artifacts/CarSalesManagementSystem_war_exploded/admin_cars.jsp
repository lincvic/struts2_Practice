<%@ page import="entity.Car" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/25
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%--
    轿车数需大于4
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>轿车信息</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <link href="css/dashboard.css" rel="stylesheet">
    <link href="css/ems.css" rel="stylesheet">
    <script src="js/yq.js" type="text/javascript"> </script>
</head>

<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="admin_main.jsp">汽车销售管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#" onclick="login()">添加车辆信息</a></li>
            </ul>
        </div>
    </div>
</nav>

<%
    List<Car> list = (List<Car>) request.getSession().getAttribute("carList");
%>

<div class="container-fluid">
    <div class="row">
        <div class="main">
            <h1 class="page-header">热销车型</h1>

            <div class="row placeholders">
                <%
                    for (int i = 0 ;i < 4 ;i ++){
                %>
                <div class="col-xs-6 col-sm-3 placeholder">
                    <img src="<%=list.get(i).getPicture()%>" style="width:200px; height: 200px;" class="img-responsive" alt="Generic placeholder thumbnail">
                    <h4><%=list.get(i).getBrand()%> <%=list.get(i).getModel()%></h4>
                    <span class="text-muted">销量：<%=list.get(i).getQuantity()%></span>
                </div>
                <%
                    }
                %>
            </div>

            <h2 class="sub-header">轿车信息</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#车辆编号</th>
                        <th>品牌</th>
                        <th>车型</th>
                        <th>价格</th>
                        <th>销量</th>
                        <th>修改</th>
                        <th>删除</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        for(Car car : list){
                    %>
                    <tr>
                        <td><%=car.getCarid()%></td>
                        <td><%=car.getBrand()%></td>
                        <td><%=car.getModel()%></td>
                        <td><%=car.getPrice()%></td>
                        <td><%=car.getQuantity()%></td>
                        <td width="40px;">
                            <button type="button" class="btn btn-sm btn-primary" onclick="window.location.href='update_car.jsp?carid=<%=car.getCarid()%>&brand=<%=car.getBrand()%>&model=<%=car.getModel()%>&price=<%=car.getPrice()%>&picture=<%=car.getPicture()%>&quantity=<%=car.getQuantity()%>'">修改</button>
                        </td>
                        <td width="40px;">
                            <button type="button" class="btn btn-sm btn-danger" onclick="window.location.href='/servlet/Admin/Car/DeleteCarServlet?carid=<%=car.getCarid()%>'">删除</button>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>


<div id="login">
    <div class="login_info">
        <div style="width: 100%; height: 30px;">
            <img class="cancel" src="../../img/cancel.png" onclick="back()">
        </div>
        <form name="form" method="post" action="/servlet/Admin/Car/InsertCarServlet" style="display: block">
            <input class="form_input" type="text" name="brand" placeholder="品    牌"><br>
            <input class="form_input" type="text" name="model" placeholder="车    型"><br>
            <input class="form_input" type="text" name="price" placeholder="进    价"><br>
            <input class="form_input" type="text" name="picture" placeholder="图片链接"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>

</body>
</html>

