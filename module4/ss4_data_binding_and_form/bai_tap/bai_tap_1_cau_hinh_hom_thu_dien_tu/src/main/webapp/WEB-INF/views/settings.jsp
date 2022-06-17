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
<h2>Settings</h2>
<form:form action="update" method="post" modelAttribute="mailbox">
    <table>
        <tr>
            <td><strong>Languages: </strong></td>
            <td>
                <form:select path="languages" items="${languages}"/>
            </td>
        </tr>
        <tr>
            <td><strong>Page Size: </strong></td>
            <td>Show <form:select path="pageSize" items="${pageSizes}"/> emails per page</td>
        </tr>
        <tr>
            <td><strong>Spams Filter: </strong></td>
            <td>
                <form:checkbox id="spam" path="spamsFilter" value="enable"/> Enable spams filter
            </td>
        </tr>
        <tr>
            <td><strong>Signature: </strong></td>
            <td>
                <form:textarea path="signature" ></form:textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <button type="submit" >Update</button>
                <button type="reset">Cancel</button>
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
