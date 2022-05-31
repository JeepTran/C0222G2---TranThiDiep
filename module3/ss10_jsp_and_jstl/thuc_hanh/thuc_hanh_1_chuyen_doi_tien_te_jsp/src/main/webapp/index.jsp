<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        input{
            margin: 5px;
        }
    </style>
</head>
<body>
<form action="/converter.jsp" method="post">
    <h1>Currency Converter</h1>
    <label>Rate:</label>
    <input type="text" name="rate" value="22000" placeholder="Enter rate"><br>
    <label>USD:</label>
    <input type="text" name="usd" value="0" placeholder="Enter USD"><br>
    <input type="submit" value="Converter">
</form>
</body>
</html>
