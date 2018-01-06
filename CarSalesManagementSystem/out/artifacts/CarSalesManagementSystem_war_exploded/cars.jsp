<%@ page import="entity.Car" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    List<Car> cars = (List<Car>) request.getSession().getAttribute("cars");
%>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>全线车系</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <link href="css/dashboard.css" rel="stylesheet">
    <link type="text/css" rel="stylesheet" href="css/waterfall.css" />
</head>

<body>
<div class="col-md-12 main">
    <nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">全线车系</a>
            </div>
        </div>
    </nav>
    <h2 class="sub-header">全线车系</h2>
    <div class="container">
        <%
            for(Car car : cars){
        %>
        <div>
            <img src="<%=car.getPicture()%>" width="220px"/>
            <a href="/servlet/DetailSaleServlet?carid=<%=car.getCarid()%>" style="display: inline-block"><%=car.getBrand()%> <%=car.getModel()%></a>
        </div>
        <%
            }
        %>
    </div>
</div>

</body>
</html>
