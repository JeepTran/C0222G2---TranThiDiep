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
    <title>Update Product</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>Update Product</legend>
        <table>
            <tr>
                <td><label>Product ID: </label></td>
                <td><input type="text" name="id" value="${product.getId()}"></td>
            </tr>
            <tr>
                <td><label>Product Name: </label></td>
                <td><input type="text" name="name" value="${product.getName()}"></td>
            </tr>
            <tr>
                <td><label>Price: </label></td>
                <td><input type="text" name="price" value="${product.getPrice()}"></td>
            </tr>
            <tr>
                <td><label>Description: </label></td>
                <td><input type="text" name="description" value="${product.getDescription()}"></td>
            </tr>
            <tr>
                <td><label>Manufacturer: </label></td>
                <td><input type="text" name="manufacturer" value="${product.getManufacturer()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update Product"></td>
                <td><button><a href="/controller">Back to Product Management</a></button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
