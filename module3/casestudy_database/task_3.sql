use furama_resort;

select * from customer 
where (year(curdate())-year(birthday) between 18 and 50) 
and (address like '%Đà Nẵng' or address like '%Quảng Trị');