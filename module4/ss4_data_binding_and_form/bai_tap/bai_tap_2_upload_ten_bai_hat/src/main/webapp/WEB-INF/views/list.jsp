<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/17/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Song List</title>
</head>
<body>
<h2>Song List</h2>
<table border="1">
    <tr>
        <th>Song Name</th>
        <th>Singer</th>
        <th>Song Kind</th>
        <th>Song Path</th>
    </tr>
    <c:forEach items="${songList}" var="temp">

        <tr>
            <td>${temp.songName}</td>
            <td>${temp.singer}</td>
            <td>${temp.musicType}</td>
            <td>${temp.songUrl}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
