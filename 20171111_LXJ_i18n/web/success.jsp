
<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/11
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<s:i18n name="i18nLib/success_zh_CN">
<html>
<head>
    <title><s:text name="successPage"/></title>
</head>
<body>
${sessionScope.user}
</body>
</html>
</s:i18n>
