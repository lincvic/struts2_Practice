<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="client" class="entity.Client" scope="session"/>
<!DOCTYPE html>
<html lang="cn">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>欢迎 : )</title>

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
                            <li class="active"><a href="#"><%=client.getName()%> 先生</a></li>
                        </ul>
                    </nav>
                </div>
            </div>

            <div class="inner cover">
                <h1 class="cover-heading" style="font-size: 60px;">SHIFT THE FUTURE</h1>
                <br>
                <br>
                <br>
                <p class="lead">
                    <a href="/servlet/CarsServlet" class="btn btn-lg btn-default">全线车系</a>
                </p>
            </div>

        </div>

    </div>

</div>

</body>
</html>
