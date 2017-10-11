<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/9
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<s:form method="POST" action="register.action">
    <s:textfield name="emailAddress" label="Email地址"></s:textfield>
    <s:password name="password" label="密码"></s:password>
    <s:password name="confirPassword" label="确认密码"></s:password>
    <s:textfield name="userName" label="登陆名(昵称)"></s:textfield>
    <s:textfield name="realName" label="真实姓名"></s:textfield>
    <s:textfield name="phoneNumber" label="手机号"></s:textfield>
    <th>
    <s:include value="checking.jsp"></s:include>
    </th>
    <s:textfield name="userCode" label="验证码"></s:textfield>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
