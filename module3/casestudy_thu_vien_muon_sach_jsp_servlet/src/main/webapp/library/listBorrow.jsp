<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap-5/normalize.css">
    <title>Library</title>
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


<div class="container">
    <table id="tableBorrow" class="table table-info table-striped">
        <thead>
        <tr>
            <th>Borrow ID</th>
            <th>Book</th>
            <th>Student</th>
            <th>Status</th>
            <th>Borrow Date</th>
            <th>Return Date</th>
            <th>Return</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${borrowCardList}" var="borrow">
            <tr>
                <td>${borrow.borrowId}</td>
                <c:forEach items="${bookList}" var="book">
                    <c:if test="${book.bookId == borrow.bookId}">
                        <td>${book.bookName}</td>
                    </c:if>
                </c:forEach>
                <c:forEach items="${studentList}" var="student">
                    <c:if test="${student.studentId == borrow.studentId}">
                        <td>${student.studentName}</td>
                    </c:if>
                </c:forEach>
                <c:forEach items="${bookStatusList}" var="status">
                    <c:if test="${status.statusId == borrow.statusId}">
                        <td>${status.status}</td>
                    </c:if>
                </c:forEach>
                <td>${borrow.borrowDate}</td>
                <td>${borrow.returnDate}</td>
                <td>
                    <button class="btn btn-primary" data-bs-toggle="modal"
                            data-bs-target="#exampleModal${borrow.borrowId}">Return
                    </button>
                </td>
            </tr>
            <!-- Button trigger modal -->
            <%--            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
            <%--                Launch demo modal--%>
            <%--            </button>--%>

            <!-- Modal -->
            <div class="modal fade" id="exampleModal${borrow.borrowId}" tabindex="-1"
                 aria-labelledby="exampleModalLabel"
                 aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Trả Sách</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <p>Học sinh
                                <c:forEach items="${studentList}" var="student">
                                    <c:if test="${student.studentId == borrow.studentId}"><strong class="text-primary">${student.studentName}</strong></c:if>
                                </c:forEach>
                                thực hiện trả sách
                                <c:forEach items="${bookList}" var="book">
                                    <c:if test="${book.bookId == borrow.bookId}"><strong class="text-primary">${book.bookName}</strong></c:if>
                                </c:forEach>
                            </p>
                        </div>
                        <div class="modal-footer">
                            <a type="submit" class="btn btn-success" data-bs-dismiss="modal"
                               href="/borrow" }>OK</a>
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cancel</button>
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
        $('#tableBorrow').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>

</html>