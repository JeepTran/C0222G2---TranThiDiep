<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/30/2022
  Time: 5:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/translate" method="post">
    <input type="text" name="textSearch" placeholder="Enter word to search: ">
    <input type="submit" id="submit" value="Search">
</form>
</body>
</html>
