<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/13/2022
  Time: 10:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Tạo Mới</title>
    <link rel="stylesheet" href="../../bootstrap413/css/bootstrap.min.css">
    <link rel="stylesheet" href="../../datatables/css/dataTables.bootstrap4.min.css">
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <link rel="stylesheet" href="../../bootstrap-5/bootstrap.min.css">
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


<div class="container justify-content-center">
    <div class="container m-4">
        <h3 class="col-auto text-center">Thêm Mới Mặt Bằng</h3>
    </div>
    <div class="container d-flex justify-content-center">
        <form class="w-50" action="/management?action=create" method="post">
            <div class="row mb-3 ">
                <label for="maMatBang" class="col-sm-3 col-form-label">Mã Mặt Bằng</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="maMatBang" name="maMatBang">
                </div>
            </div>
            <div class="row mb-3">
                <label for="dienTich" class="col-sm-3 col-form-label">Diện Tích</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="dienTich" name="dienTich">
                </div>
            </div>
            <div class="row mb-3 ">
                <label for="trangThai" class="col-sm-3 col-form-label">Trạng Thái</label>
                <div class="col-sm-9">
                    <select class="form-control" id="trangThai" name="maTrangThai">
                        <option value="">--Chọn Trạng Thái--</option>
                        <c:forEach items="${trangThaiList}" var="temp">
                            <option value="${temp.maTrangThai}">${temp.tenTrangThai}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="tang" class="col-sm-3 col-form-label">Tầng</label>
                <div class="col-sm-9">
                    <input type="number" class="form-control" id="tang" name="tang">
                </div>
            </div>
            <div class="row mb-3 ">
                <label for="loaiMatBang" class="col-sm-3 col-form-label">Loại Văn Phòng</label>
                <div class="col-sm-9">
                    <select class="form-control" id="loaiMatBang" name="maLoaiMatBang">
                        <option value="">--Chọn Loại Mặt Bằng--</option>
                        <c:forEach items="${loaiMatBangList}" var="temp">
                            <option value="${temp.maLoaiMatBang}">${temp.tenLoaiMatBang}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="giaTien" class="col-sm-3 col-form-label">Giá Cho Thuê (VNĐ)</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="giaTien" name="giaTien">
                </div>
            </div>

            <div class="row mb-3">
                <label for="ngayBatDau" class="col-sm-3 col-form-label">Ngày Bắt Đầu</label>
                <div class="col-sm-9">
                    <input type="date" class="form-control" id="ngayBatDau" name="ngayBatDau">
                </div>
            </div>

            <div class="row mb-3">
                <label for="ngayKetThuc" class="col-sm-3 col-form-label">Ngày Kết Thúc</label>
                <div class="col-sm-9">
                    <input type="date" class="form-control" id="ngayKetThuc" name="ngayKetThuc">
                </div>
            </div>

            <div class="mt-5">
                <button type="submit" class="btn btn-primary ms-3">Lưu</button>
                <button class="btn btn-secondary float-end me-3">Hủy</button>
            </div>
        </form>
    </div>
</div>

</body>
<script src="../../bootstrap-5/bootstrap.bundle.min.js"></script>
<script src="../../jquery/jquery-3.5.1.min.js"></script>
<script src="../../datatables/js/jquery.dataTables.min.js"></script>
<script src="../../datatables/js/dataTables.bootstrap4.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableBook').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>

</html>
