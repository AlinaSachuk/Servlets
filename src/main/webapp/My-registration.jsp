<%@ page import="java.io.Writer" %>
<%@ page import="java.io.FileWriter" %><%--
  Created by IntelliJ IDEA.
  User: alina
  Date: 30.12.22
  Time: 21:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<form action="postRegistrationJSP.jsp">
    <h2>Login: <input name="login" required/></h2>
    <h2>Password: <input name="password" type="password" required/></h2>
    <h1><input type="submit" value="register"></h1>
    <% FileWriter writer = new FileWriter("/Users/alina/Documents//Register.txt");
        response.getWriter();
        writer.close();
    %>
</form>
</body>
</html>
