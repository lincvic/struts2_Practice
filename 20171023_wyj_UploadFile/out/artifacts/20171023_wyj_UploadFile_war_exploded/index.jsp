<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/23
  Time: 上午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
  <head>
    <title>这是一个上传页面</title>
  </head>

  <body>
  <s:form action="uploadAction" method="POST" enctype="multipart/form-data">
    <s:textfield name="title" label="文件主题"/>
    <s:file label="选择文件1" name="upload"/>
    <s:file label="选择文件2" name="upload"/>
    <s:file label="选择文件3" name="upload"/>
    <s:submit value="上传"/>
  </s:form>
  </body>
</html>
