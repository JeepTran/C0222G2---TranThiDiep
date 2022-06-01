
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
    <title>Create Product</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>Create New Product</legend>
        <table>
            <tr>
                <td><label>Product ID: </label></td>
                <td><input type="text" name="id" placeholder="Enter product ID"></td>
            </tr>
            <tr>
                <td><label>Product Name: </label></td>
                <td><input type="text" name="name" placeholder="Enter product name"></td>
            </tr>
            <tr>
                <td><label>Price: </label></td>
                <td><input type="text" name="price" placeholder="Enter price"></td>
            </tr>
            <tr>
                <td><label>Description: </label></td>
                <td><input type="text" name="description" placeholder="Enter description"></td>
            </tr>
            <tr>
                <td><label>Manufacturer: </label></td>
                <td><input type="text" name="manufacturer" placeholder="Enter manufacturer"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Create Product"></td>
                <td><button><a href="/controller">Back to Product Management</a></button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
