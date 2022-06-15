<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/6/2022
  Time: 5:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - New Customer</title>
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
                            <a class="nav-link text-white add-btn" href="/customer?action=create">New Customer</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link text-white list-btn" href="/customer">Customer List</a>
                        </li>
                    </ul>
                    <div class="col-5" id="search-div">
                        <form action="/customer" method="get">
                            <input type="hidden" name="action" value="search">
                            <input class="search" id="search-input" type="text" name="search"
                                   placeholder="Search by customer name" style="width: 200px" value="${searchName}">
                            <input type="submit" value="Search" style="border-radius: 5px; border: 1px solid #0c5460">
                        </form>
                    </div>
                </div>
            </div>
        </nav>
    </div>

    <div class="container-fluid col-auto">
        <div class="container-fluid mt-2 w-50">
            <form action="/customer?action=create" method="post">
                <h4>Add New Customer</h4>
                <br>
                <div class="row mb-3">
                    <label for="inputEmail1" class="col-sm-2 col-form-label">Cus. Type</label>
                    <div class="col-sm-10">
                        <select name="customerTypeId" class="form-select" id="inputEmail1"
                                aria-label="Default select example">
                            <c:choose>
                                <c:when test="${customer.customerTypeId ==0 }">
                                    <option value="" selected>-- Select Customer Type --</option>
                                    <c:forEach items="${customerTypeList}" var="type">
                                        <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                                    </c:forEach>
                                </c:when>
                                <c:otherwise>
                                    <option>-- Select Customer Type --</option>
                                    <c:forEach items="${customerTypeList}" var="type">
                                        <c:choose>
                                            <c:when test="${type.customerTypeId == customer.customerTypeId}">
                                                <option value="${type.customerTypeId}"
                                                        selected>${type.customerTypeName}</option>
                                            </c:when>
                                            <c:otherwise>
                                                <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                                            </c:otherwise>
                                        </c:choose>
                                    </c:forEach>
                                </c:otherwise>

                            </c:choose>
                        </select>
                    </div>
                    <small class="text-danger">${errors.customerTypeId}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail2" class="col-sm-2 col-form-label">Name</label>
                    <div class="col-sm-10">
                        <input type="text" name="customerName" class="form-control" id="inputEmail2"
                               value="${customer.customerName}">
                    </div>
                    <small class="text-danger">${errors.customerName}</small>

                </div>
                <div class="row mb-3">
                    <label for="inputEmail3" class="col-sm-2 col-form-label">Birthday</label>
                    <div class="col-sm-10">
                        <input type="date" name="customerBirthday" class="form-control" id="inputEmail3"
                               value="${customer.customerBirthday}">
                    </div>
                    <small class="text-danger">${errors.customerBirthday}</small>
                </div>

                <div class="row mb-3">
                    <label for="inputEmail4" class="col-sm-2 col-form-label">Gender</label>
                    <div class="col-sm-10">
                        <select name="customerGender" class="form-select" aria-label="Default select example"
                                id="inputEmail4" value="${customer.customerGender}">
                            <c:choose>
                                <c:when test="${customer.customerGender == 0}">
                                    <option>-- Select Gender --</option>
                                    <option value="1">Male</option>
                                    <option value="0" selected>Female</option>
                                    <option value="-1">Other</option>
                                </c:when>
                                <c:when test="${customer.customerGender == 1}">
                                    <option>-- Select Gender --</option>
                                    <option value="1" selected>Male</option>
                                    <option value="0">Female</option>
                                    <option value="-1">Other</option>
                                </c:when>
                                <c:when test="${customer.customerGender == -1}">
                                    <option>-- Select Gender --</option>
                                    <option value="1">Male</option>
                                    <option value="0">Female</option>
                                    <option value="-1" selected>Other</option>
                                </c:when>
                                <c:otherwise>
                                    <option selected>-- Select Gender --</option>
                                    <option value="1">Male</option>
                                    <option value="0">Female</option>
                                    <option value="-1">Other</option>
                                </c:otherwise>
                            </c:choose>
                        </select>
                    </div>
                    <small class="text-danger">${errors.customerGender}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail5" class="col-sm-2 col-form-label">ID Card</label>
                    <div class="col-sm-10">
                        <input type="text" name="customerIdCard" class="form-control" id="inputEmail5"
                               value="${customer.customerIdCard}">
                    </div>
                    <small class="text-danger">${errors.customerIdCard}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail6" class="col-sm-2 col-form-label">Phone</label>
                    <div class="col-sm-10">
                        <input type="text" name="customerPhone" class="form-control" id="inputEmail6"
                               value="${customer.customerPhone}">
                    </div>
                    <small class="text-danger">${errors.customerPhone}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail7" class="col-sm-2 col-form-label">Email</label>
                    <div class="col-sm-10">
                        <input type="email" name="customerEmail" class="form-control" id="inputEmail7"
                               value="${customer.customerEmail}">
                    </div>
                    <small class="text-danger">${errors.customerEmail}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail8" class="col-sm-2 col-form-label">Address</label>
                    <div class="col-sm-10">
                        <input type="text" name="customerAddress" class="form-control" id="inputEmail8"
                               value="${customer.customerAddress}">
                    </div>
                    <small class="text-danger">${errors.customerAddress}</small>
                </div>
                <div class="row mb-3">
                    <label for="inputEmail9" class="col-sm-2 col-form-label"></label>
                    <div class="col-sm-10">
                        <button type="submit" class="btn btn-primary" id="inputEmail9">Save</button>
                        <a class="btn btn-secondary" href="/customer" style="float: right">Cancel</a>
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
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>
</html>

