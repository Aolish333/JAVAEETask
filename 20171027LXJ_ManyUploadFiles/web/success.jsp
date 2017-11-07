<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/24
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传成功,文件下载</title>
</head>
<body>
<s:iterator value="" var="files">
    <th>文件</th>
    <tr>
        <td><s:property value="#files"/> </td>
    </tr>
</s:iterator>
</body>
</html>
