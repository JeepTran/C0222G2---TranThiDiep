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
    <title>Updated Mailbox</title>
</head>
<body>
<h2>Updated Mailbox</h2>
<h4>Language: ${mailbox.languages}</h4>
<h4>Page size: ${mailbox.pageSize}</h4>
<c:if test="${mailbox.spamsFilter.equals(true)}">
    <h4>Spam filter: enable</h4>
</c:if>
<c:if test="${mailbox.spamsFilter.equals(false)}">
    <h4>Spam filter: disable</h4>
</c:if>
<h4>Signature: ${mailbox.signature}</h4>

</body>
</html>
