<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/31/2022
  Time: 11:55 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
    <style>
        h2 {
            text-align: center;
        }

        img {
            height: 80px;
            width: auto;
        }

        th {
            width: 200px;
            border-bottom: darkgrey 1px solid;
        }

        td {
            padding-left: 50px;
            border-bottom: darkgrey 1px solid;
        }

        .image{
            text-align: center;
        }
        form {
            border: cadetblue 1px solid;
        }
    </style>
</head>
<body>
<form>
    <h2>Danh Sách Khách Hàng</h2>
    <table>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td>${customer.getName()}</td>
                <td>${customer.getDob()}</td>
                <td>${customer.getAddress()}</td>
                <td class="image"><img src="${customer.getImage()}"></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
