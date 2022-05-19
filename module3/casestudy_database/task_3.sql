use furama_resort;

-- 3.	Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi
-- và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”

select * from customer 
where (timestampdiff(year, birthday, curdate()) between 18 and 50)
and (address like '%Đà Nẵng' or address like '%Quảng Trị');