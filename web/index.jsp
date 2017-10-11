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
<s:form>
    <s:textfield name="EmailAddress" label="Email地址"></s:textfield>
    <s:password name="Password" label="密码"></s:password>
    <s:password name="ConfirPassword" label="确认密码"></s:password>
    <s:textfield name="UserName" label="登陆名(昵称)"></s:textfield>
    <s:textfield name="RealName" label="真实姓名"></s:textfield>
    <s:textfield name="PhoneNumber" label="手机号"></s:textfield>
    <s:textfield name="" label="验证码："></s:textfield>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
</s:form>
</body>
</html>
