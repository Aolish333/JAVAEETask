<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/11/7
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="upload">
    文件标题：<input type="text" name="title"/><br>
    选择文件1:<input type="file" name="upload"/><br>
    选择文件2:<input type="file" name="upload"/><br>
    选择文件3:<input type="file" name="upload"/><br>
    <input type="submit"/>
</body>
</html>
