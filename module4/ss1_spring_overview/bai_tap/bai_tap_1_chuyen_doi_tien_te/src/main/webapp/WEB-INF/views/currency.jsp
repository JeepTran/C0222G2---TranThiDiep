<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/15/2022
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Exchange</title>
</head>
<body>
<h3>Currency Exchange</h3>
<form action="/exchange">
    <div>
        USD:
        <input type="text" name="usd">
    </div>
    <div>
        Rate:
        <input type="text" name="rate" value="23000">
    </div>
    <di>
        <button>Exchange</button>
    </di>
</form>
<div>
    <h3>VND: ${vnd}</h3>
</div>
</body>
</html>
