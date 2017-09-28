<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/27
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示书籍</title>
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
            <td><s:property value="#b.BookName"></s:property></td>
            <td><s:property value="#b.BookAuthor"></s:property></td>
            <td><s:property value="#b.BookPrice"></s:property></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
