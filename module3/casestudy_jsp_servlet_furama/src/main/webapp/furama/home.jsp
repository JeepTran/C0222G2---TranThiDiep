<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/6/2022
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="../bootstrap-5/normalize.css">
    <title>Furama Home</title>
    <style>
        <%@include file="/css/style.css" %>
    </style>
    <link rel="stylesheet" href="../bootstrap-5/bootstrap.min.css">
    <style>
        .carousel-item {
            height: 80%;
        }
    </style>
</head>
<body>

<div id="header" class="row col-12">
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
                            <a class="nav-link active" aria-current="page" href="/employee">Employee</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/customer">Customer</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/service">Service</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/contract">Contract</a>
                        </li>
                    </ul>
                    <div class="col-5" id="search-div">
                        <form action="/furama" method="get">
                            <input type="hidden" name="action" value="search">
                            <input class="search" id="search-input" type="text" name="search"
                                   placeholder="Search" style="width: 200px" value="${searchName}">
                            <input type="submit" value="Search" style="border-radius: 5px; border: 1px solid #0c5460">
                        </form>
                    </div>
                </div>
            </div>
        </nav>
    </div>
</div>
<div id="container" class="row col-12">
    <div id="left-side" class="col-2">
        <ul>
            <li>Item One</li>
            <li>Item Two</li>
            <li>Item Three</li>
        </ul>
    </div>
    <div id="body" class="col-10">

        <p id="welcome-text">Welcome to Furama Resort Danang!</p>
        <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="../image/img0.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img1.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img2.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img3.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img4.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img5.jpg" class="d-block w-100" alt="...">
                </div>
                <div class="carousel-item">
                    <img src="../image/img6.jpg" class="d-block w-100" alt="...">
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls"
                    data-bs-slide="prev">
                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Previous</span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls"
                    data-bs-slide="next">
                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                <span class="visually-hidden">Next</span>
            </button>
        </div>
        <%--        <img id="welcome-img" src="https://www.chudu24.com/wp-content/uploads/2018/11/furama.jpg">--%>

    </div>
</div>
<div id="footer" class="row col-12">
    <div class="col-6">
        <p><b>Furama Resort Danang</b></p>
        <p>Ngũ Hành Sơn, Đà Nẵng</p>
    </div>
    <div class="col-6">
        <p>Copyright</p>
        <p>Contact (+84)123 456 789</p>
    </div>
</div>
</body>
<script src="../bootstrap-5/bootstrap.bundle.min.js"></script>
</html>
