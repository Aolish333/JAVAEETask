<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/11
  Time: 8:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>验证码页面</title>
    <script type="text/javascript">
        function reloadCode() {
            console.log("reload");
            var time = new Date().getTime();
            document.getElementById("imageCode").src = "<%=request.getContextPath()%>/image?d=" + time;
        }
    </script>
</head>
<body>
<img src="image.action" alt="验证码" name="imageCode" id="imageCode" height="20dp" width="100dp">
<a href="javascript:reloadCode();">看不清楚</a>
</body>
</html>
