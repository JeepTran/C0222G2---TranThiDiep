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
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
</head>
<body>
<form action="translate">
    <div>
        English:
        <input type="text" name="english" placeholder="Enter some familiar animals" value="${english}">
    </div>
    <div style="margin-top: 10px">
    <button>Translate</button>
    </div>
</form>
<div>
    Vietnamese: <strong style="color: blue">${vietnamese}</strong>
</div>
</body>
<script src="../../bootstrap413/js/bootstrap.bundle.min.js"></script>
</html>
