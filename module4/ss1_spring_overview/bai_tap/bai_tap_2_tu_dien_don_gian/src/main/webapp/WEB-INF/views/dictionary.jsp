<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/15/2022
  Time: 9:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<form action="translate">
    <div>
        English:
        <input type="text" name="english" placeholder="Enter some familiar animals" value="${english}">
    </div>
    <div style="margin-top: 10px">
    <button style="border-radius: 5px; border: 1px dashed black">Translate</button>
    </div>
</form>
<div>
    Vietnamese: <strong style="color: blue">${vietnamese}</strong>
</div>
</body>
</html>
