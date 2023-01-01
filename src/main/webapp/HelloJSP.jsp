<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  NewYearID.User: alina
  Date: 28.12.22
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My first JSP</title>
</head>
<body>
Hello World!
<%= new Date()%> <br>
Hello, <%= request.getParameter("name")%>! Welcome to JSP
</body>
</html>
