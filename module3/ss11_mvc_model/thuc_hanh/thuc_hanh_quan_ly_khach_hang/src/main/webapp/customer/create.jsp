<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/31/2022
  Time: 9:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create New Customer</title>
</head>
<body>
<form method="post">
    <h2>Create New Customer</h2>
    <label>Customer ID: </label>
    <input type="text" name="id"><br>
    <label>Customer name: </label>
    <input type="text" name="name"><br>
    <label>Email: </label>
    <input type="email" name="email"><br>
    <label>Address: </label>
    <input type="text" name="address"><br>
    <input type="submit" value="Create">
</form>
</body>
</html>
