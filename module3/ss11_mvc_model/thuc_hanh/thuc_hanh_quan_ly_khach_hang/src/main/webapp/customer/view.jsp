<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>View Customer Information</h2>
<form method="post">
    <fieldset>
        <legend>Detailed Information</legend>
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
                <td></td>
                <td><a href="/customer">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
