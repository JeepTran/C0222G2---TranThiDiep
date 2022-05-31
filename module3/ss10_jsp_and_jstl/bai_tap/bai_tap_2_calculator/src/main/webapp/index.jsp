<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/31/2022
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
</head>
<style>
    input {
        margin: 5px;
    }
</style>
<body>
<h2>Simple Calculator</h2>
<form action="/calculate" method="post">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td><label>First operand: </label></td>
                <td><input type="text" name="firstNum" placeholder="Enter first operand"></td>
            </tr>
            <tr>
                <td><label>Operator: </label></td>
                <td><select name="operator">
                    <option value="+" >Addition</option>
                    <option value="-" >Subtraction</option>
                    <option value="*" >Multiplication</option>
                    <option value="/" >Division</option>
                </select>
                </td>
            </tr>
            <tr>
                <td><label>Second operand: </label></td>
                <td><input type="text" name="SecondNum" placeholder="Enter second operand"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculate"></td>
            </tr>
        </table>
    </fieldset>
</form>
<h2>Result:</h2>
<h4>${a} ${c} ${b} = ${d} </h4>
</body>
</html>
