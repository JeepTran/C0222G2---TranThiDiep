use ss5_thuc_hanh_classicmodels;

-- Tạo mới 1 stored procedure:
delimiter //
create procedure find_all_customers ()
begin
select * from customers;
end //
delimiter ;

call find_all_customers();

-- Sửa procedure: MySQL không cung cấp lệnh sửa, thường thì sẽ xóa lệnh cũ và tạo lệnh mới

delimiter //
drop procedure if exists find_all_customers //
create procedure find_all_customers()
begin
select * from customers where customerNumber = 175;
end //
delimiter ;

call find_all_customers();
