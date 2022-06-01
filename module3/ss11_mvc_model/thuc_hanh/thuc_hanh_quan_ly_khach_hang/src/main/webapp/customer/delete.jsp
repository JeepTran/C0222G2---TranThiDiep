<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 10:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Customer</title>
</head>
<body>
<h2>Delete Customer</h2>
<form method="post">
    <h3>Are you sure to delete?</h3>
    <fieldset>
        <legend>Customer Information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${customer.getName()}</td>
            </tr>
            <tr>
                <td>Email:</td>
                <td>${customer.getEmail()}</td>
            </tr>
            <tr>
                <td>Address:</td>
                <td>${customer.getAddress()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete"></td>
                <td><a href="/customer">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
