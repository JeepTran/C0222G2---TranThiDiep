<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
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
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Description</th>
        <th>Manufacturer</th>

    </tr>
    <c:forEach var="temp" items="${searchList}">
        <tr>
            <td class="align">${temp.getId()}</td>
            <td>${temp.getName()}</td>
            <td>${temp.getPrice()}</td>
            <td>${temp.getDescription()}</td>
            <td>${temp.getManufacturer()}</td>
        </tr>
    </c:forEach>
    <button><a href="/controller">Back to Product Management</a></button>
</table>
</body>
</html>
