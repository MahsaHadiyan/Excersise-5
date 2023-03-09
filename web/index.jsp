<%@ page import="controller.SessionMonitor" %><%--
  Created by IntelliJ IDEA.
  User: Hadian
  Date: 3/5/2023
  Time: 11:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%=SessionMonitor.getONLINE()%>
  <BR/>
  <%=SessionMonitor.getVISIT()%>
  <br/>
  <form action="/main.do">
    <input type="text" name="name"/>
    <input type="text" name="family"/>
    <input type="submit"/>
  </form>

  </body>
</html>
