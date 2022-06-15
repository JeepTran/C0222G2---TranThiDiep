<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/7/2022
  Time: 5:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - New Employee</title>
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
    <div class="container-fluid col-auto">
        <div class="container-fluid mt-3 w-50">
            <form action="/employee?action=create" method="post">
                <h4>Add New Employee</h4>
                <br>

                <div class="row mb-3">
                    <label for="inputEmail1" class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" name="employeeName" class="form-control" id="inputEmail1">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail2" class="col-sm-2 col-form-label">Birthday</label>
                    <div class="col-sm-10">
                        <input type="date" name="employeeBirthday" class="form-control" id="inputEmail2">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">ID Card</label>
                    <div class="col-sm-10">
                        <input type="text" name="employeeIdCard" class="form-control" id="inputEmail3">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail4" class="col-sm-2 col-form-label">Salary</label>
                    <div class="col-sm-10">
                        <input type="text" name="employeeSalary" class="form-control" id="inputEmail4">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail5" class="col-sm-2 col-form-label">Phone</label>
                    <div class="col-sm-10">
                        <input type="text" name="employeePhone" class="form-control" id="inputEmail5">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail6" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" name="employeeEmail" class="form-control" id="inputEmail6">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail7" class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-10">
                        <input type="text" name="employeeAddress" class="form-control" id="inputEmail7">
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail8" class="col-sm-2 col-form-label">Position</label>
                    <div class="col-sm-10">
                        <select name="positionId" id="inputEmail8" class="form-select"
                                aria-label="Default select example">
                            <option>-- Choose Position --</option>
                            <c:forEach items="${positionList}" var="temp">
                                <option value="${temp.positionId}">${temp.positionName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail9" class="col-sm-2 col-form-label">Education</label>
                    <div class="col-sm-10">
                        <select name="educationDegreeId" id="inputEmail9" class="form-select"
                                aria-label="Default select example">
                            <option>-- Choose Education Degree --</option>
                            <c:forEach items="${educationDegreeList}" var="temp">
                                <option value="${temp.educationDegreeId}">${temp.educationDegreeName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail10" class="col-sm-2 col-form-label">Division</label>
                    <div class="col-sm-10">
                        <select name="divisionId" id="inputEmail10" class="form-select"
                                aria-label="Default select example">
                            <option>-- Choose Division --</option>
                            <c:forEach items="${divisionList}" var="temp">
                                <option value="${temp.divisionId}">${temp.divisionName}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail11" class="col-sm-2 col-form-label">Username</label>
                    <div class="col-sm-10">
                        <select name="username" id="inputEmail11" class="form-select"
                                aria-label="Default select example">
                            <option>-- Choose Username --</option>
                            <c:forEach items="${userList}" var="temp">
                                <option value="${temp.username}">${temp.username}</option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail12" class="col-sm-2 col-form-label"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary" id="inputEmail12">Save</button>
                        <a class="btn btn-secondary" href="/employee" style="float: right">Cancel</a>
                    </div>
                </div>
            </form>
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
            "pageLength": 7
        });
    });
</script>
</html>

