<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/11
  Time: 19:14
To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:i18n name="i18nLib/loginForm">
<html>
<head>
    <title><s:text name="loginPage"/></title>
</head>
<body>

<s:form method="POST" action="login">
    <a href="Null?request_locale=en_US"><s:text name="test1"/></a>
    <a href="Null?request_locale=zh_CN"><s:text name="test"/></a>
    <s:textfield name="userName" key="userName" />
    <s:password name="password" key="password" />
    <s:submit key="login"></s:submit>
</s:form>

</body>
</html>
</s:i18n>