<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap-5/normalize.css">
    <title>Book List</title>
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
    <table id="tableBook" class="table table-info table-striped">
        <thead>
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Author</th>
            <th>Quantity</th>
            <th>Description</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${bookList}" var="book">
            <tr>
                <td>${book.bookId}</td>
                <td>${book.bookName}</td>
                <td>${book.author}</td>
                <td>${book.quantity}</td>
                <td>${book.description}</td>
                <c:choose>
                    <c:when test="${book.quantity == 0}">
                        <td>
                            <button type="button" class="btn btn-secondary" data-bs-toggle="modal"
                                    data-bs-target="#staticBackdrop${book.bookId}">
                                Borrow
                            </button>
                        </td>
                    </c:when>
                    <c:otherwise>
                        <td><a class="btn btn-warning" href="/book?action=borrow&bookId=${book.bookId}">Borrow</a></td>
                    </c:otherwise>
                </c:choose>
            </tr>

            <!-- Button trigger modal -->


            <!-- Modal -->
            <div class="modal fade" id="staticBackdrop${book.bookId}" data-bs-backdrop="static" data-bs-keyboard="false"
                 tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="staticBackdropLabel">Lỗi!!!</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            <p>Cuốn sách này tạm thời đã cho mượn hết, vui lòng chọn sách khác</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Button trigger modal -->
            <%--            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal">--%>
            <%--                Launch demo modal--%>
            <%--            </button>--%>

            <!-- Modal -->
            <%--            <div class="modal fade" id="exampleModal${book.bookId}" tabindex="-1" aria-labelledby="exampleModalLabel"--%>
            <%--                 aria-hidden="true">--%>
            <%--                <div class="modal-dialog">--%>
            <%--                    <div class="modal-content">--%>
            <%--                        <div class="modal-header">--%>
            <%--                            <h5 class="modal-title" id="exampleModalLabel">Lỗi!!!</h5>--%>
            <%--                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>--%>
            <%--                        </div>--%>
            <%--                        <div class="modal-body">--%>
            <%--                            <p>Cuốn sách này tạm thời đã cho mượn hết, vui lòng chọn sách khác</p>--%>
            <%--                        </div>--%>
            <%--                        <div class="modal-footer">--%>
            <%--                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">OK</button>--%>
            <%--                        </div>--%>
            <%--                    </div>--%>
            <%--                </div>--%>
            <%--            </div>--%>
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
        $('#tableBook').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 7
        });
    });
</script>

</html>