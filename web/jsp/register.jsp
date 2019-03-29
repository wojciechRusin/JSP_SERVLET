<%--
  Created by IntelliJ IDEA.
  User: Wojciech
  Date: 2019-03-24
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
REGISTER
<nav>
    <a href="index.jsp"> go back</a>
</nav>
<figure>
    <img src="img\image1.png" width="200" height="200">
</figure>
<h1>Register new user</h1>
<div style="height: 50px">
    <div style="margin: 20px; background-color: lightgreen; " >
        <form action="registerAction" method="get">
            Login:    <input name="login" type="text"><br>
            Password: <input name="password" type="password"><br>
            <input name="submit" type="submit">
        </form>
    </div>
</div>
</body>
</html>
