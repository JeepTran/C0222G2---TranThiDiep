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
    <title>Detail Product</title>
</head>
<body>

<form method="post">
    <h2>Detailed Information of Product</h2>
    <fieldset>
        <legend>Product Information</legend>
        <table>
            <tr>
                <td><label>Product ID: </label></td>
                <td>${product.getId()}</td>
            </tr>
            <tr>
                <td><label>Product Name: </label></td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td><label>Price: </label></td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td><label>Description: </label></td>
                <td>${product.getDescription()}</td>
            </tr>
            <tr>
                <td><label>Manufacturer: </label></td>
                <td>${product.getManufacturer()}</td>
            </tr>
            <tr>
                <td></td>
                <td><button><a href="/controller">Back to Product Management</a></button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
