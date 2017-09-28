<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/27
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除页面</title>
</head>
<body>
<table>
    <tr bgcolor="#d2691e">
        <td>书名</td>
        <td>作者</td>
        <td>定价</td>
    </tr>
    <s:iterator value="Books" var="b">
        <tr>
            <td><a href="deleteBook.jsp"><s:property value="#b.BookName"></s:property></a></td>
            <td><a href="deleteBook.jsp"><s:property value="#b.BookAuthor"></s:property></a></td>
            <td><a href="deleteBook.jsp"><s:property value="#b.BookPrice"></s:property></a></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
