<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/2/2022
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Management</title>
</head>
<body>
<div>
    <h1>User Management</h1>
    <h2><a href="/users?action=create">Add new user</a></h2>
    <form action="/users" method="get">
        <input type="hidden" name="action" value="search">
        <input type="text" name="search" placeholder="Search by country">
        <input type="submit" value="Search">
    </form>
    <div>
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Country</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            <c:forEach items="${users}" var="temp">
                <tr>
                    <td>${temp.getId()}</td>
                    <td>${temp.getName()}</td>
                    <td>${temp.getEmail()}</td>
                    <td>${temp.getCountry()}</td>
                    <td><a href="/users?action=update&id=${temp.getId()}">Edit</a></td>
                    <td><a href="/users?action=delete&id=${temp.getId()}">Delete</a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>
</html>
