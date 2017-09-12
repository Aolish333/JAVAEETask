<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/12
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HelloWord</title>
</head>
<body>
<%--更换action采用不同的方式进行访问helloword--%>
<form action="hello1.action" method="post">
    <label><input name="username" type="text"></label>
    <label><input name="password" type="password"></label>
    <label><input type="submit" value="提交"></label>
</form>
</body>
</html>
