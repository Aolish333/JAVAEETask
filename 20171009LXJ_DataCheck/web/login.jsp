<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/11
  Time: 19:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆界面</title>
</head>
<body>
你注册的信息如下：<br>
用户名：${uername}<br>
密码：${password}<br>
生日：${birthDay}<br>

邮箱：${emailAddress}
<s:form method="POST" action="login">
    <s:textfield name="userName" label="登陆名(昵称)"></s:textfield>
    <s:password name="password" label="密码"></s:password>
    <s:submit value="登陆"></s:submit>
</s:form>

</body>
</html>
