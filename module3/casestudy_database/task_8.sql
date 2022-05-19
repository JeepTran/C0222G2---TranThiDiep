use furama_resort;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.

-- cách 1:
select distinct customer_name from customer;

-- cách 2:
select customer_name from customer
union
select customer_name from customer;

-- cách 3: 
select customer_name from customer
group by customer_name;
