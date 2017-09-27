<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/27
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addBook.action" method="post" >
    <table>
        <tr>
            <td>书名:</td>
            <td><input type="text" value="" name="BookName"></td>
        </tr>
        <tr>
            <td>作者:</td>
            <td><input type="text" value="" name="BookAuthor"></td>
        </tr>
        <tr>
            <td>定价:</td>
            <td><input type="text" value="" name="BookPrice"></td>
        </tr>
        <tr>
            <input type="submit">
        </tr>
    </table>
</form>
</body>
</html>
