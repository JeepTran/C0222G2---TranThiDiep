<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/6/2022
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Furama - Customer List</title>
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
                    <div class="col-8" id="search-div">
                        <form action="/customer" method="get">
                            <input type="hidden" name="action" value="search">
                            <input class="search" id="search-name-input" type="text" name="searchName"
                                   placeholder="Customer name" value="${searchName}">
                            <input class="search" id="search-id-input" type="text" name="searchCustomerId"
                                   placeholder="Customer ID" value="${searchCustomerId}">
                            <select class="search" id="search-customer-type-input" name="searchCustomerTypeId">
                                <option value="">-- Select Customer Type --</option>
                                <c:forEach items="${customerTypeList}" var="type">
                                    <c:choose>
                                        <c:when test="${type.customerTypeId == searchCustomerTypeId}">
                                            <option value="${type.customerTypeId}"
                                                    selected>${type.customerTypeName}</option>
                                        </c:when>
                                        <c:otherwise>
                                            <option value="${type.customerTypeId}">${type.customerTypeName}</option>
                                        </c:otherwise>
                                    </c:choose>
                                </c:forEach>
                            </select>
                            <input type="submit" value="Search" style="border-radius: 5px; border: 1px solid #0c5460">
                        </form>
                    </div>
                </div>
            </div>
        </nav>
    </div>
    <div class="container-fluid">
        <div class="container-fluid mt-3" style="overflow: auto">
            <table id="tableCustomer" class="table table-striped table-bordered" style="font-size: 12px; width: 100%">
                <thead>
                <tr>
                    <th>Customer ID</th>
                    <th>Customer Type</th>
                    <th>Customer Name</th>
                    <th>Customer Birthday</th>
                    <th>Customer Gender</th>
                    <th>Customer ID Card</th>
                    <th>Customer Phone</th>
                    <th>Customer Email</th>
                    <th>Customer Address</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${customerList}" var="temp">
                    <tr>
                        <td>${temp.customerId}</td>

                        <c:forEach items="${customerTypeList}" var="i">
                            <c:if test="${temp.customerTypeId == i.customerTypeId}">
                                <td>${i.customerTypeName}</td>
                            </c:if>
                        </c:forEach>

                        <td>${temp.customerName}</td>
                        <td>${temp.customerBirthday}</td>
                        <c:choose>
                            <c:when test="${temp.customerGender == 1}">
                                <td>Nam</td>
                            </c:when>
                            <c:when test="${temp.customerGender == 0}">
                                <td>Nữ</td>
                            </c:when>
                            <c:when test="${temp.customerGender == -1}">
                                <td>Khác</td>
                            </c:when>
                            <c:otherwise>
                                <td>Unknown</td>
                            </c:otherwise>
                        </c:choose>
                        <td>${temp.customerIdCard}</td>
                        <td>${temp.customerPhone}</td>
                        <td>${temp.customerEmail}</td>
                        <td>${temp.customerAddress}</td>
                        <td>
                            <button class="edit-btn"><a href="/customer?action=update&id=${temp.customerId}">Edit</a>
                            </button>
                        </td>
                        <td>
                            <button class="delete-btn" data-bs-toggle="modal"
                                    data-bs-target="#staticBackdrop${temp.customerId}">Delete
                            </button>
                        </td>

                        <!-- Modal -->
                        <div class="modal fade" id="staticBackdrop${temp.customerId}" data-bs-backdrop="static"
                             data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel"
                             aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-body">
                                        <h6>Do you want to delete customer ID <strong
                                                class="text-warning">${temp.customerId}</strong> - name <strong
                                                class="text-warning">${temp.customerName}</strong> ?</h6>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal"
                                                style="font-size: 14px">Close
                                        </button>
                                        <a class="btn btn-primary" href="/customer?action=delete&id=${temp.customerId}"
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
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 6
        });
    });
</script>
</html>
