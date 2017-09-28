<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/8/28
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简单MVC</title>
</head>
<body>
<%--请求转发（服务器端跳转）
    请求重定向（客户端跳转）
--%>
<form action="CalculateServlet" method="post">
<jsp:useBean id="Calculate" class="ObjectPackage.Calculate" scope="page">
    <jsp:setProperty name="Calculate" property="*"/>
</jsp:useBean>
    <table>
        <tr>
            <td>
                操作数1：
            </td>
            <td>
                <input type="text" name="number1" value="">
            </td>
        </tr>
        <tr>
            <td>
                操作数2：
            </td>
            <td>
                <input type="text" name="number2" value="">
            </td>
        </tr>
        <tr>
            <td>
                运算符：
                <select name="op">
                    <option value="+">+</option>
                    <option value="-">-</option>
                    <option value="*">*</option>
                    <option value="/">/</option>
                </select>
            </td>
            <td>
                <input type="submit" value="计算">
            </td>
        </tr>
        <tr>
            <td>
                结果：
            </td>
            <td>
                <input type="text" value="${result}">
            </td>
        </tr>
    </table>
    </form>
    </body>
    </html>
