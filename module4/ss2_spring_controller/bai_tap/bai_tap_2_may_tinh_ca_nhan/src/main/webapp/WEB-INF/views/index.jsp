<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/16/2022
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form action="calculate" method="get">
    <input type="number" name="number1" value="${number1}">
    <select name="operator">
        <%--      <option value="">--Select an operator--</option>--%>
        <option value="add">Addition</option>
        <option value="subtract">Subtraction</option>
        <option value="multiple">Multiplication</option>
        <option value="divide">Division</option>
    </select>
    <input type="number" name="number2" value="${number2}">
    <button>Result</button>
</form>
<c:if test='${error.equals("")}'><h4>Result is: ${result}</h4></c:if>
<c:if test='${!error.equals("")}'><h4 style="color: red">${error}</h4></c:if>

</body>
</html>
