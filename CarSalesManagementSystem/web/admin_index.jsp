<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/24
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>欢迎 ：)</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">汽车销售管理系统</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" method="post" action="/servlet/Admin/AdminLoginServlet">
                <div class="form-group">
                    <input name="id" type="text" placeholder="管理员账号" class="form-control">
                </div>
                <div class="form-group">
                    <input name="password" type="password" placeholder="密码" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">登录</button>
            </form>
        </div>
    </div>
</nav>

<div class="site-wrapper">
    <div class="site-wrapper-inner">
        <div class="cover-container" style="height: 700px;">
            <div style="background: url(/img/bg3.jpg) fixed center; height: 100%;"></div>
        </div>
    </div>
</div>

</body>
</html>
