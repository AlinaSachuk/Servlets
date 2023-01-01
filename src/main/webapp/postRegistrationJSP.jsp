<%@ page import="java.io.FileWriter" %><%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 30.12.22
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h3>You registered successfully!</h3>
<% FileWriter writer = new FileWriter("/Users/alina/Documents//Register.txt");
writer.write("Your login: " + (request.getParameter("login")) + "\n");
writer.write("Your password: " + (request.getParameter("password")));
writer.close();%>
</body>
</html>
