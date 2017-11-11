<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/11/6
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>下载测试</title>
</head>
<body>
你已经入下载页面<br>
<%--<a href="download?downloadFileName = 12 & inputPath = I:/12.jpg">文件下载</a>--%>
<%--&lt;%&ndash;不能写空格&ndash;%&gt;--%>
<a href="download?downloadFileName=12&inputPath=I:/12.jpg">文件下载</a>
<a href="download?downloadFileName=12&inputPath=I:/12.jpg">文件下载</a>
<a href="download?downloadFileName=12&inputPath=I:/12.jpg">文件下载</a>


    <%--<s:iterator value="newName" var="b">--%>
        <%--<td><a href="download?downloadFileName=<s:property value="#b">&inputPath=I:/12.jpg">文件下载</a></s:property></td>--%>
<%--</s:iterator>--%>
</body>
</html>
