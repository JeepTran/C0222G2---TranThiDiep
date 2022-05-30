<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/30/2022
  Time: 4:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
    <style>
        input{
            height: 20px;
            width: 100px;
            margin: 5px;
            padding: 5px;
        }
        #submit{
            width: auto;
            padding: 0;
        }
        form{
            height: 150px;
            width: 300px;
        }
    </style>
</head>
<body>
<h2>Currency Converter</h2>
<form action="/convert" method="get">
    <label>Rate:</label>
    <input type="text" name="rate" placeholder="RATE" value="22000"><br>
    <label>USD:</label>
    <input type="text" name="usd" placeholder="USD" value="0"><br>
    <input id= "submit" type="submit" value="Converter">
</form>
</body>
</html>
