use furama_resort;

-- 23.	Tạo Stored Procedure sp_xoa_khach_hang dùng để xóa thông tin của một khách hàng nào đó 
-- với ma_khach_hang được truyền vào như là 1 tham số của sp_xoa_khach_hang.

delimiter //
drop procedure if exists delete_customer_sp //
create procedure delete_customer_sp(in in_customer_id int)
begin
alter table customer add `status` bit(1) default 1;
set sql_safe_updates = 0;
update customer set `status` = 0
where customer_id = in_customer_id;
set sql_safe_updates = 1;
end //
delimiter ;

call delete_customer_sp(4);
select * from customer;



-- 24.	Tạo Stored Procedure sp_them_moi_hop_dong dùng để thêm mới vào bảng hop_dong với yêu cầu 
-- sp_them_moi_hop_dong phải thực hiện kiểm tra tính hợp lệ của dữ liệu bổ sung, 
-- với nguyên tắc không được trùng khóa chính và đảm bảo toàn vẹn tham chiếu đến các bảng liên quan.
