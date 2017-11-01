<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/23
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form method="post" enctype="multipart/form-data" action="upload">
    文件标题：<input type="text" name="title"/><br>
    选择文件1:<input type="file" name="upload"/><br>
    选择文件2:<input type="file" name="upload"/><br>
    选择文件3:<input type="file" name="upload"/><br>
    <input type="submit"/>
    <%--<table>--%>
        <%--<tr>--%>
            <%--<td>文件标题</td>--%>
            <%--<td><input type="text" name="title"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>选择文件1</td>--%>
            <%--<td><input type="file" name="myFile"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>选择文件2</td>--%>
            <%--<td><input type="file" name="myFile"/></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td>选择文件3</td>--%>
            <%--<td><input type="file" name="myFile"/></td>--%>
        <%--</tr>--%>
    <%--</table>--%>

</form>
</body>
</html>
