<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/1/2022
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>Customer Information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" value="${customer.getName()}"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" value="${customer.getEmail()}"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input type="text" name="address" value="${customer.getAddress()}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><a href="/customer">Back to customer list</a></td>
            </tr>
        </table>
    </fieldset>
</form>

</body>
</html>
