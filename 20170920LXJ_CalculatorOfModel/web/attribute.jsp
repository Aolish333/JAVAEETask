<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/23
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>属性驱动</title>
</head>
<body>
<form action="calculator2.action" method="post">
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
