<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 7:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        div{
            text-align: center;
            display: flex;
            flex-direction: column;
        }
    </style>
</head>
<body>
<div>
    <h1>Customer Management</h1>
    <a href="/customer?action=create">Create Customer</a>
    <br>
    <br>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
            <th>View</th>
        </tr>
        <c:forEach items="${listCustomer}" var="temp">
            <tr>
                <td>${temp.getId()}</td>
                <td>${temp.getName()}</td>
                <td>${temp.getEmail()}</td>
                <td>${temp.getAddress()}</td>
                <td><a href="customer?action=edit&id=${temp.getId()}">Edit</a></td>
                <td><a href="customer?action=delete&id=${temp.getId()}">Delete</a></td>
                <td><a href="customer?action=view&id=${temp.getId()}">View</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
