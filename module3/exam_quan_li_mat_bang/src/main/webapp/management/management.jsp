<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/13/2022
  Time: 10:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap-5/normalize.css">
    <title>TComplex List</title>
    <link rel="stylesheet" href="../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../datatables/css/dataTables.bootstrap4.min.css">
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <link rel="stylesheet" href="../bootstrap-5/css/bootstrap.min.css">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light bg-danger">
    <div class="container-fluid">
        <a class="navbar-brand fw-bolder" href="/management">TComplex</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link fw-bold" aria-current="page" href="/management">Danh Sách Mặt Bằng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-bold" href="/management?action=create">Thêm mới</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Tìm kiếm</button>
            </form>
        </div>
    </div>
</nav>


<div class="container">
    <table id="myTable" class="table table-info table-striped">
        <thead>
        <tr>
            <th>Mã Mặt Bằng</th>
            <th>Trạng Thái</th>
            <th>Diện Tích</th>
            <th>Tầng</th>
            <th>Loại Mặt Bằng</th>
            <th>Giá Tiền</th>
            <th>Ngày Bắt Đầu</th>
            <th>Ngày Kết Thúc</th>
            <th>Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${matBangList}" var="temp">
            <tr>
                <td>${temp.maMatBang}</td>
                <c:forEach items="${trangThaiList}" var="i">
                    <c:if test="${temp.maTrangThai == i.maTrangThai}">
                        <td>${i.tenTrangThai}</td>
                    </c:if>
                </c:forEach>
                <td>${temp.dienTich}</td>
                <td>${temp.tang}</td>
                <c:forEach items="${loaiMatBangList}" var="k">
                    <c:if test="${temp.maLoaiMatBang == k.maLoaiMatBang}">
                        <td>${k.tenLoaiMatBang}</td>
                    </c:if>
                </c:forEach>
                <td>${temp.giaTien}</td>
                <td>${temp.ngayBatDau}</td>
                <td>${temp.ngayKetThuc}</td>
                <td>
                    <button class="btn btn-primary" data-bs-toggle="modal"
                            data-bs-target="#exampleModal${temp.maMatBang}">Delete
                    </button>
                </td>
            </tr>

            <div class="modal fade" id="exampleModal${temp.maMatBang}" tabindex="-1"
                 aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Xóa Mặt Bằng</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <p>Bạn có chắc chắn muốn xóa mặt bằng với mã số
                                <strong class="text-primary">${temp.maMatBang}</strong>
                                không?
                            </p>
                        </div>
                        <div class="modal-footer">
                            <a type="submit" class="btn btn-success" data-bs-dismiss="modal"
                               href="/management?action=delete&id=${temp.maMatBang}"}>Có</a>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Không</button>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
<script src="../bootstrap-5/js/bootstrap.bundle.min.js"></script>
<script src="../jquery/jquery-3.5.1.min.js"></script>
<script src="../datatables/js/jquery.dataTables.min.js"></script>
<script src="../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#myTable').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>

</html>
