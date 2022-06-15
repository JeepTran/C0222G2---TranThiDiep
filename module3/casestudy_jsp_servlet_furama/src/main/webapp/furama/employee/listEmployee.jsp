<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/7/2022
  Time: 4:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - Employee List</title>
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <style>
        <%@include file="/css/style.css" %>
    </style>

    <link rel="stylesheet" href="../../bootstrap-5/bootstrap.min.css">
</head>
<body>
<div class="container-fluid row " style="padding: 0">
    <div id="head-info" class="row col-12">
        <div class="col-1">
            <img id="logo-img"
                 src="/image/furamalogo.png">
        </div>
        <div class="col-9" style="height: 50px"></div>
        <div id="student-name" class="col-2">Tran Thi Diep</div>
    </div>
    <div style="margin: 0;padding: 0;">
        <nav class="navbar navbar-expand-lg navbar-light bg-light"
             style="box-sizing: border-box;padding: 0px;margin: 0;width:100%; background-color: aquamarine">
            <div class="container-fluid" style="box-sizing: border-box;padding: 0px; margin: 0">
                <img src="" alt="">
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                        data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent" style="padding: 10px ">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/furama">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white add-btn" href="/employee?action=create">New Employee</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white list-btn" href="/employee">Employee List</a>
                        </li>
                    </ul>
                    <div class="col-5" id="search-div">
                        <form action="/employee" method="get">
                            <input type="hidden" name="action" value="search">
                            <input class="search" id="search-input" type="text" name="search"
                                   placeholder="Search by employee name" style="width: 200px" value="${searchName}">
                            <input type="submit" value="Search" style="border-radius: 5px; border: 1px solid #0c5460">
                        </form>
                    </div>
                </div>
            </div>
        </nav>
    </div>
    <div class="container-fluid">
        <div class="container-fluid mt-3" style="overflow: auto">
            <table id="tableEmployee" class="table table-striped table-bordered" style="font-size: 12px; width: 100%">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>Employee Name</th>
                    <th>Birthday</th>
                    <th>ID Card</th>
                    <th>Salary (VND)</th>
                    <th>Phone</th>
                    <th>Email</th>
                    <th>Address</th>
                    <th>Position</th>
                    <th>Education Degree</th>
                    <th>Division</th>
                    <th>Username</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${employeeList}" var="temp">
                    <tr>
                        <td>${temp.employeeId}</td>
                        <td>${temp.employeeName}</td>
                        <td>${temp.employeeBirthday}</td>
                        <td>${temp.employeeIdCard}</td>
                        <td><fmt:formatNumber pattern="#" value="${temp.employeeSalary}"/></td>
                        <td>${temp.employeePhone}</td>
                        <td>${temp.employeeEmail}</td>
                        <td>${temp.employeeAddress}</td>

                        <c:forEach items="${positionList}" var="position">
                            <c:if test="${temp.positionId == position.positionId}">
                                <td>${position.positionName}</td>
                            </c:if>
                        </c:forEach>

                        <c:forEach items="${educationDegreeList}" var="degree">
                            <c:if test="${temp.educationDegreeId == degree.educationDegreeId}">
                                <td>${degree.educationDegreeName}</td>
                            </c:if>
                        </c:forEach>

                        <c:forEach items="${divisionList}" var="division">
                            <c:if test="${temp.divisionId == division.divisionId}">
                                <td>${division.divisionName}</td>
                            </c:if>
                        </c:forEach>

                        <td>${temp.username}</td>
                        <td>
                            <button class="edit-btn"><a href="/employee?action=update&id=${temp.employeeId}">Edit</a>
                            </button>
                        </td>
                        <td>
                            <button class="delete-btn" data-bs-toggle="modal"
                                    data-bs-target="#staticBackdrop${temp.employeeId}">Delete
                            </button>
                        </td>

                        <!-- Modal -->
                        <div class="modal fade" id="staticBackdrop${temp.employeeId}" data-bs-backdrop="static"
                             data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-body">
                                        <h6>Do you want to delete employee ID <strong class="text-warning">${temp.employeeId}</strong> name <strong
                                                class="text-warning">${temp.employeeName}</strong> ?</h6>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal"
                                                style="font-size: 14px">Close
                                        </button>
                                        <a class="btn btn-primary" href="/employee?action=delete&id=${temp.employeeId}"
                                           style="font-size: 14px">Submit</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>
<script src="../../bootstrap-5/bootstrap.bundle.min.js"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 6
        });
    });
</script>
</html>

