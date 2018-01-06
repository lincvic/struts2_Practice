<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 13:56
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

    <title>欢迎使用汽车销售管理系统</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <link href="css/main.css" rel="stylesheet">
</head>

<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <nav>
                        <ul class="nav masthead-nav">
                            <li class="active"><a href="/servlet/Admin/Car/SelectCarListServlet">轿车信息</a></li>
                            <li><a href="/servlet/Admin/Client/SelectClientListServlet">用户信息</a></li>
                            <li><a href="/servlet/Admin/Employee/SelectEmployeeListServlet">员工信息</a></li>
                            <li><a href="/servlet/RestoreServlet" >数据恢复</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading">汽车销售管理系统</h1>

                <p class="lead">CAR SALES MANAGEMENT SYSTEM</p>
                <p class="lead">
                    <a href="/servlet/Admin/Purchase/SelectPurchaseListServlet" class="btn btn-lg btn-default">销售信息</a>
                </p>
            </div>

        </div>

    </div>

</div>

</body>
</html>
