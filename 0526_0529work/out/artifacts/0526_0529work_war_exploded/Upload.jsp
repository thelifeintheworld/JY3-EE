<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/5/24
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<form action="upload.do"enctype="multipart/form-data" method="post">
    <input type="file" name="file1"/>
    <input type="submit" value="上传文件"/>

</form>
</body>
</html>
