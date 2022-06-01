<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Products</title>
    <style>
        body {
            margin: 3px;
        }

        div {
            text-align: center;
            display: flex;
            flex-direction: column;
        }

        input {
            width: 200px;
        }

        table {
            margin: 3px;
            border: darkcyan 1px solid;
            border-collapse: collapse;
        }

        .align {
            text-align: center;
        }
    </style>
</head>
<body>
<div>
    <h1>Product Management</h1>
    <a href="/controller?action=create">Create New Product</a>
    <br>
    <div style="display: inline">
        <form action="search" method="post">
            <input type="text" name="search" placeholder="Search product by name">
            <input type="submit" value="Search" style="width: auto">
        </form>
    </div>

    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Description</th>
            <th>Manufacturer</th>
            <th>Update</th>
            <th>Delete</th>
            <th>Detail</th>

        </tr>
        <c:forEach var="temp" items="${products}">
            <tr>
                <td class="align">${temp.getId()}</td>
                <td>${temp.getName()}</td>
                <td>${temp.getPrice()}</td>
                <td>${temp.getDescription()}</td>
                <td>${temp.getManufacturer()}</td>
                <td class="align"><a href="controller?action=update&id=${temp.getId()}">Edit</a></td>
                <td class="align"><a href="controller?action=delete&id=${temp.getId()}">Delete</a></td>
                <td class="align"><a href="controller?action=view&id=${temp.getId()}">View</a></td>
            </tr>
        </c:forEach>
    </table>

</div>
</body>
</html>
