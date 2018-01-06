<%@ page import="entity.Client" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Employee" %>
<%@ page import="entity.DetailSale" %>
<%@ page import="entity.DetailPurchase" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2017/6/25
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="img/icon.ico">

    <title>购买信息</title>

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
                <li><a href="#" onclick="login()">添加销售信息</a></li>
            </ul>
        </div>
    </div>
</nav>

<%
    List<DetailPurchase> list = (List<DetailPurchase>) request.getSession().getAttribute("purchaseList");
%>

<div class="container-fluid">
    <div class="row">
        <div class="main">
            <h2 class="sub-header">购买信息</h2>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>客户姓名(编号)</th>
                        <th>员工姓名(编号)</th>
                        <th>品牌车型(编号)</th>
                        <th>售价</th>
                        <th>出售日期</th>
                        <th width="40px;">修改</th>
                        <th width="40px;">删除</th>
                    </tr>
                    </thead>
                    <tbody>
                    <%
                        for(DetailPurchase detailPurchase : list){
                            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh:mm:ss");
                            String date = format.format(detailPurchase.getPurchasedate());
                    %>
                    <tr>
                        <td><%=detailPurchase.getPid()%></td>
                        <td><%=detailPurchase.getCname()%>(<%=detailPurchase.getClientid()%>)</td>
                        <td><%=detailPurchase.getEname()%>(<%=detailPurchase.getEid()%>)</td>
                        <td><%=detailPurchase.getBrand()%><%=detailPurchase.getModel()%>(<%=detailPurchase.getCarid()%>)</td>
                        <td><%=detailPurchase.getPrice() + detailPurchase.getProfit()%></td>
                        <td><%=date%></td>
                        <td width="40px;">
                            <button type="button" class="btn btn-sm btn-primary" onclick="window.location.href='update_purchase.jsp?pid=<%=detailPurchase.getPid()%>&clientid=<%=detailPurchase.getClientid()%>&sid=<%=detailPurchase.getSid()%>&purchasedate=<%=date%>'">修改</button>
                        </td>
                        <td width="40px;"> <button type="button" class="btn btn-sm btn-danger" onclick="window.location.href='/servlet/Admin/Purchase/DeletePurchaseServlet?pid=<%=detailPurchase.getPid()%>'">删除</button></td>
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
        <form name="form" method="post" action="/servlet/Admin/Purchase/InsertPurchaseServlet">
            <input class="form_input" type="text" name="clientid" placeholder="用户编号"><br>
            <input class="form_input" type="text" name="sid" placeholder="销售编号"><br>
            <input class = "form_bt" type="submit" value="确认">
            <input class = "form_bt" type="reset" value="重置">
        </form>
    </div>
</div>


</body>
</html>