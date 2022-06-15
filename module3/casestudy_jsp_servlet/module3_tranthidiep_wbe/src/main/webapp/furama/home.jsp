<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/4/2022
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Furama - Home</title>
    <style>
        .col-1 {
            width: 8.33%;
        }

        .col-2 {
            width: 16.66%;
        }

        .col-3 {
            width: 25%;
        }

        .col-4 {
            width: 33.33%;
        }

        .col-5 {
            width: 41.66%;
        }

        .col-6 {
            width: 50%;
        }

        .col-7 {
            width: 58.33%;
        }

        .col-8 {
            width: 66.66%;
        }

        .col-9 {
            width: 75%;
        }

        .col-10 {
            width: 83.33%;
        }

        .col-11 {
            width: 91.66%;
        }

        .col-12 {
            width: 100%;
        }

        .row {
            display: inline-block;
            float: left;
        }

        [class*=col-] {
            float: left;
        }

        #head-info, #footer {
            height: 80px;
            background-color: beige;
        }

        div ul {
            list-style: none;
        }

        #logo-img {
            width: 50px;
            height: auto;
            margin: 15px;
        }

        #student-name {
            vertical-align: center;
            margin: 30px 0px;
        }

        #navbar div ul li {
            float: left;
            margin: auto 15px;
            font-weight: bold;
        }

        #navbar div ul li a {
            text-decoration: none;
            color: darkcyan;
        }

        #navbar div ul li a:hover {
            color: black;
        }

        #navbar {
            background-color: aquamarine;
            height: 50px;
        }

        #menu-list, #search-div {
            height: 50px;
            vertical-align: center;
        }

        .search {
            margin: 10px 0;
        }

        #search-input {
            border-radius: 5px;
            height: 30px;
            width: 60%;
        }

        #search-div a {
            height: 50px;
        }

        #left-side ul li {
            margin: 10px;
        }

        #container {
            height: 100%;
        }

        #welcome-img {
            display: block;
            text-align: center;
            height: 80%;
            margin: 10px;
        }

        body {
            position: relative;
        }

        #body {
            height: 100%;
        }

        #footer {
            bottom: 0px;
            left: 0px;
        }

    </style>
</head>
<body>
<div id="header" class="row col-12">
    <div id="head-info" class="row col-12">
        <div class="col-1">
            <img id="logo-img"
                 src="https://media.istockphoto.com/vectors/white-daisy-flower-in-flat-style-vector-simple-illustration-vector-id1137687921?k=20&m=1137687921&s=612x612&w=0&h=pyA93P9oLZnXFnLkQQmQF0FTZzk-jhM-1P6PcKmYUGs=">
        </div>
        <div class="col-9" style="height: 50px"></div>
        <div id="student-name" class="col-2">Tran Thi Diep</div>
    </div>
    <div id="navbar" class="row col-12">
        <div class="col-7" id="menu-list">
            <ul>
                <li><a href="/furama">Home</a></li>
                <li><a href="/employee">Employee</a></li>
                <li><a href="/customer">Customer</a></li>
                <li><a href="/service">Service</a></li>
                <li><a href="/contract">Contract</a></li>
            </ul>
        </div>
        <div class="col-5" id="search-div">
            <a class="search"><img height="20px"
                                   src="https://cdn.icon-icons.com/icons2/2551/PNG/512/search_icon_152764.png"></a>
            <input class="search" id="search-input" type="text" name="search" placeholder="search">
        </div>

    </div>
</div>
<div id="container" class="row col-12">
    <div id="left-side" class="col-2">
        <ul>
            <li><a href="/furama?action=create">Create New Customer</a></li>
            <li>Item Two</li>
            <li>Item Three</li>
        </ul>
    </div>
    <div id="body" class="col-10">
        <img id="welcome-img" src="https://www.chudu24.com/wp-content/uploads/2018/11/furama.jpg">
        <br>
        <p id="welcome-text">Welcome to Furama Resort Danang!</p>
    </div>
</div>
<div id="footer" class="row col-12">
    <div class="col-6">
        <h4>Furama Resort Danang</h4>
        <p>Ngũ Hành Sơn, Đà Nẵng</p>
    </div>
    <div class="col-6">
        <p>Copyright</p>
        <p>Contact (+84)123 456 789</p>
    </div>
</div>
</body>
</html>
