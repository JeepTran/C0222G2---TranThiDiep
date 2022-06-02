<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/2/2022
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new user</title>
</head>
<body>
<form action="/users?action=create" method="post">
    <fieldset>
        <legend>Add New User</legend>
        <table>
            <tr>
                <td>ID: </td>
                <td><input type="text" name="id" placeholder="Enter User ID"></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" placeholder="Enter User Name"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="email" placeholder="Enter User Email"></td>
            </tr>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" placeholder="Enter User Country"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add User"></td>
                <td><button><a href="/users">Back to User Management</a></button></td>
            </tr>
        </table>

    </fieldset>
</form>
</body>
</html>
