<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../../bootstrap-5/normalize.css">
    <title>Book List</title>
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
        <a class="navbar-brand fw-bolder" href="/library">ABC LIBRARY</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
                aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link fw-bold" aria-current="page" href="/book">Books List</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-bold" href="/borrow">Borrowed Books</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container justify-content-center">
    <div class="container m-4">
        <h3 class="col-auto text-center">Mượn sách</h3>
    </div>
    <div class="container d-flex justify-content-center">
        <form class="w-50" action="/book?action=borrow&bookId=${book.bookId}" method="post">
            <div class="row mb-3 ">
                <label for="borrowId" class="col-sm-3 col-form-label">Borrow ID</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="borrowId" name="borrowId">
                </div>
            </div>
            <div class="row mb-3">
                <label for="bookName" class="col-sm-3 col-form-label">Book Name</label>
                <div class="col-sm-9">
                    <input type="text" class="form-control" id="bookName" name="bookName" value="${book.bookName}"
                           readonly>
                </div>
            </div>
            <div class="row mb-3 ">
                <label for="std" class="col-sm-3 col-form-label">Student</label>
                <div class="col-sm-9">
                    <select class="form-control" id="std" name="studentId">
                        <option value="">--Select Student--</option>
                        <c:forEach items="${studentList}" var="student">
                            <option value="${student.studentId}">${student.studentName}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="row mb-3">
                <label for="borrowDate" class="col-sm-3 col-form-label">Borrowing Date</label>
                <div class="col-sm-9">
                    <input type="date" class="form-control" id="borrowDate" name="borrowDate" value="${borrowDate}" readonly>
                </div>
            </div>
            <div class="row mb-3">
                <label for="returnDate" class="col-sm-3 col-form-label">Returning Date</label>
                <div class="col-sm-9">
                    <input type="date" class="form-control" id="returnDate" name="returnDate">
                </div>
            </div>

            <div class="mt-5">
                <button type="submit" class="btn btn-primary ms-3">Submit</button>
                <button class="btn btn-secondary float-end me-3">Cancel</button>
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