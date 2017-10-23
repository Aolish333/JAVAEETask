<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2017/10/23
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <table border="1px">
    <tr>
      <th>姓名</th>
      <th>编号</th>
    </tr>
    <s:iterator value="arrayList" status="st" var="list">
      <tr <s:if test="#st.odd"> style="background-color: chocolate"</s:if>>
        <td><s:property value="username"/></td>
        <td><s:property value="no"/> </td>
      </tr>
    </s:iterator>
  </table>

  <s:debug>

  </s:debug>
  </body>
</html>
