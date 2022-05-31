<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/31/2022
  Time: 10:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h2>Vietnamese Dictionary</h2>
<form action="/translate" method="post">
    <input type="text" name="search" placeholder="Enter word to search"><br>
    <input type="submit" value="Search">
</form>

<h4>Result: ${result}</h4>

</body>
</html>
