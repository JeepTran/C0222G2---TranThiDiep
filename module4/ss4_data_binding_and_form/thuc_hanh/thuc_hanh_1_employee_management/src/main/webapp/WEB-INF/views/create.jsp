<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/17/2022
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Create New Employee</title>
  </head>
  <body>
 <h3>Welcome, Enter The Employee Details</h3>
  <form:form method="post" action="addEmployee" modelAttribute="employee">
    <table>
      <tr>
        <td><form:label path="id">Employee ID</form:label></td>
        <td><form:input path="id"></form:input></td>
      </tr>
      <tr>
        <td><form:label path="name">Employee Name</form:label></td>
        <td><form:input path="name"></form:input></td>
      </tr>
      <tr>
        <td><form:label path="contactNumber">Contact Number</form:label></td>
        <td><form:input path="contactNumber"></form:input></td>
      </tr>
      <tr>
        <td><input type="submit" value="Submit"></td>
      </tr>
    </table>

  </form:form>



  </body>
</html>
