<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/30/2022
  Time: 10:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Calculation</title>
    <style>
      input{
        margin: 5px;
      }
    </style>
  </head>
  <body>
  <form action="/calculateDiscount" method="post">
    <label>Product Description: </label>
    <input type="text" name="product" placeholder="Enter Product Description"><br>
    <label>List Price: </label>
    <input type="text" name="price" placeholder="Enter Price"><br>
    <label>Discount Percent: </label>
    <input type="text" name="rate" placeholder="Enter Discount Percent"><br>
    <input id = "submit" type="submit" value="Calculate Discount">

  </form>
  </body>
</html>
