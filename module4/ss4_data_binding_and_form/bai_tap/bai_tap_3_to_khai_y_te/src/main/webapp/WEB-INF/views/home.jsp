<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 6/19/2022
  Time: 10:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Health Declaration</title>
    <style>
        .align-center {
            text-align: center;
        }
    </style>


</head>
<body>
<h3 class="align-center">TỜ KHAI Y TẾ</h3>
<h5 class="align-center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ
    LIÊN LẠC KHI CẦN THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h5>
<h6 class="align-center">Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình sự</h6>

<form:form action="declare" modelAttribute="person" method="post">
    <div><label>Họ tên (ghi chữ IN HOA)</label>
        <form:input path="fullName"/>
    </div>
    <div><label>Năm sinh</label>
        <form:input path="yearOfBirth"/>
        <label>Giới tính</label>
        <form:input path="gender"/>
        <label>Quốc tịch</label>
        <form:input path="nationality"/>
    </div>

    <div>
        <label>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</label>
        <form:input path="idCard"/>
    </div>
    <div>
        <label>Thông tin đi lại</label>
        <form:radiobuttons path="travelInfo" items="${travel}"/>
    </div>
    <div><label>Số hiệu phương tiện</label>
        <form:input path="signalPlate"/>
        <label>Số ghế</label>
        <form:input path="seatNumber"/>
    </div>
    <div>
        <label>Ngày khởi hành</label>
        <form:input path="startDate"/>
        <label>Ngày kết thúc</label>
        <form:input path="endDate"/>
    </div>
    <label>Trong vòng 14 ngày qua, anh/chị có đến tỉnh/thành phố nào?</label>
    <form:textarea path="travel14DaysInfo"/>

    <form:button>Submit</form:button>
</form:form>


</body>
</html>
