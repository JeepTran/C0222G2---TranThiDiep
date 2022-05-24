use ss5_thuc_hanh_classicmodels;

-- Tham số loại IN
delimiter //
drop procedure if exists get_customer_by_id //
create procedure get_customer_by_id (in cus_id int(11))
begin
select * from customers where customerNumber = cus_id;
end //
delimiter ;

call get_customer_by_id(175);

-- Tham số loại OUT:
-- Khi truyền tham số dạng OUT mục đích là lấy dữ liệu trong Proedure và sử dụng ở bên ngoài.
-- Khi truyền tham số vào dạng OUT phải có chữ @ đằng trước biến
-- Hoạt động giống tham chiếu nên biến truyền vào dạng OUT không cần định nghĩa trước, chính vì vậy khởi đầu nó có giá trị NULL
delimiter //
drop procedure if exists get_customer_quantity_by_city //
create procedure get_customer_quantity_by_city (in in_city varchar(50), out quantity int)
begin
select count(customerNumber) into quantity
from customers
where city = in_city;
end //
delimiter ;

call get_customer_quantity_by_city('Lyon', @quantity);
select @quantity;

-- Tham số loại INOUT:
delimiter //
drop procedure if exists set_counter //
create procedure set_counter (inout counter int, in inc int)
begin
set counter = counter + inc;
end //
delimiter ;

set @counter = 3;
call set_counter(@counter, 2);
select @counter;




