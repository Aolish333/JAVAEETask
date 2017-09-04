<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/9/3
  Time: 19:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>统计网页的访问次数</title>
</head>
<body>
<%
    if (application.getAttribute("count")==null){
        application.setAttribute("count", 0);//application.setAttribute("count", new Integer(0));
    }
    Integer count = (Integer) application.getAttribute("count");
    //使用application对象读取count参数的值，再在原值基础上累加1
    application.setAttribute("count", count + 1);
%>
<h2>
    <!-- 输出累加后的count参数对应的值 -->
    欢迎您访问，本页面已经被访问过 <font color="#ff0000"><%=application.getAttribute("count")%></font>次
</h2>
</body>
</html>
