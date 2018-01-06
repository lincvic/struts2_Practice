<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="detailSale" class="entity.DetailSale" scope="session"/>
<jsp:useBean id="client" class="entity.Client" scope="session"/>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>轿车详情</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <link href="css/dashboard.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/ems.css" />
</head>

<body>
<!-- Nav -->
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">轿车详情</a>
        </div>
        <button type="button" class="btn btn-success" style="float: right; margin-top: 7px;" onclick="window.location.href='/servlet/PurchaseServlet?sid=<%=detailSale.getSid()%>&clientid=<%=client.getClientId()%>'">
            立即购买
        </button>
    </div>
</nav>

<!-- Main -->
<section id="main">
    <div class="inner">
        <div class="image fit">
            <img src="<%=detailSale.getPicture()%>" />
        </div>
        <header>
            <h1><%=detailSale.getBrand()%> <%=detailSale.getModel()%></h1>
            <p class="info">编号：<%=detailSale.getCarid()%></p>
            <p class="info">价格：<%=detailSale.getPrice() + detailSale.getProfit()%> 人民币</p>
            <p class="info">导购员：<%=detailSale.getName()%> ( no.<%=detailSale.getEid()%>)</p>
            <p class="info">联系电话：<%=detailSale.getPhonenumber()%></p>
        </header>
    </div>
</section>
</body>
</html>
