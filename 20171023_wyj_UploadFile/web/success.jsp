<%--
  Created by IntelliJ IDEA.
  User: wong
  Date: 2017/10/23
  Time: 上午10:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>文件已上传,上传的文件如下,点击即可下载</h1>
<a href="download?inputPath=/Users/wong/Desktop/实验/${sessionScope.uploadFilename0}
&contentType=${sessionScope.uploadContentType0}
&downFileName=${sessionScope.uploadFilename0}">
    ${sessionScope.uploadFilename0}
</a>
<br>
<a href="download?inputPath=/Users/wong/Desktop/实验/${sessionScope.uploadFilename1}
&contentType=${sessionScope.uploadContentType1}
&downFileName=${sessionScope.uploadFilename1}">
    ${sessionScope.uploadFilename1}
</a>
<br><a href="download?inputPath=/Users/wong/Desktop/实验/${sessionScope.uploadFilename2}
&contentType=${sessionScope.uploadContentType2}
&downFileName=${sessionScope.uploadFilename2}">
    ${sessionScope.uploadFilename2}
</a>
<br>

</body>
</html>
