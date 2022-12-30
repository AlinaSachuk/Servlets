<%@ page import="NewYearID.User" %><%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 28.12.22
  Time: 21:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info JSP</title>
</head>
<body>
<%User user = (User) request.getAttribute("keyUser");%>
<h1>Hello dear, <%= user.getName() %>.</h1>
<h2> Your salary per month - <%= user.getSalaryPerMonth()%>.</h2>
<h3>Enjoy it! Happy New Year!!!</h3>
</body>
</html>