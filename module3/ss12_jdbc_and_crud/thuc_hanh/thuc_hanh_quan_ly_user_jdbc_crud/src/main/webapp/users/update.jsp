<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/2/2022
  Time: 4:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update User</title>
</head>
<body>
<form action="/users?action=update" method="post">
    <fieldset>
        <legend>Update User Information</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id" value="${user.getId()}"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" value="${user.getName()}"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" value="${user.getEmail()}"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" value="${user.getCountry()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Save"></td>
                <td><button><a href="/users">Back to User Management</a></button></td>
            </tr>
        </table>

    </fieldset>
</form>
</body>
</html>
