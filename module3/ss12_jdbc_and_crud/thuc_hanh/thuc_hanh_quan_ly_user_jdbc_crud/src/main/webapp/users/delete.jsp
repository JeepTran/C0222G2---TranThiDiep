<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/2/2022
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete User</title>
</head>
<body>
<form action="/users?action=delete" method="post">
    <fieldset>
        <legend>Delete User?</legend>
        <table>
            <tr>
                <td><input type="hidden" name="id" value="${user.getId()}" ></td>
            </tr>
            <tr>
                <td>Name: </td>
                <td>${user.getName()}</td>
            </tr>
            <tr>
                <td>Email: </td>
                <td>${user.getEmail()}</td>
            </tr>
            <tr>
                <td>Country: </td>
                <td>${user.getCountry()}</td>
            </tr>
            <tr>
                <td><input type="submit" value="Delete"></td>
                <td><button type="button"><a href="/users" style="text-decoration: none">No</a></button></td>
            </tr>
        </table>

    </fieldset>
</form>
</body>
</html>
