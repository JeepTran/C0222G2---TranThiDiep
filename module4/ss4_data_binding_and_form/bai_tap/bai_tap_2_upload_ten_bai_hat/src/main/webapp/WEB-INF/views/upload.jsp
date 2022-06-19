<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/17/2022
  Time: 2:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Settings</title>
</head>
<body>
<h2>Upload Song</h2>
<form:form action="upload" method="post" modelAttribute="song">
    <table>
        <tr>
            <td><strong>Song name: </strong></td>
            <td>
                <form:input path="songName"/>
            </td>
        </tr>
        <tr>
            <td><strong>Singer: </strong></td>
            <td><form:input path="singer"/></td>
        </tr>
        <tr>
            <td><strong>Music Kind: </strong></td>
            <td>
                <form:select path="musicType" items="${musicKind}"/></td>
        </tr>
        <tr>
            <td><strong>Song URL: </strong></td>
            <td>
                <form:select path="songUrl">
                    <form:option value="https://www.youtube.com/watch?v=hiRqIZcVkv4">So Far Away</form:option>
                    <form:option value="https://www.youtube.com/watch?v=2Vv-BfVoq4g">Perfect</form:option>
                    <form:option value="https://www.youtube.com/watch?v=R25JM-6Tvng">Shape Of You</form:option>
                    <form:option value="https://www.youtube.com/watch?v=EaJV2irv7MU">Send It</form:option>
                    <form:option value="https://www.youtube.com/watch?v=K_zylJH4PRI">At My Worst</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit">Upload</button>
                <button type="reset">Cancel</button>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
