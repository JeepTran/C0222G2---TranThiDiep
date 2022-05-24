use furama_resort;

-- 18.	Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).

alter table customer add `status` bit(1) default 1;
set sql_safe_updates = 0;
update customer set `status` = 0
where customer.customer_id in
(select contract.customer_id from contract
where year(contract.contracting_date) < 2021
-- nếu điều kiện là 'những khách hàng có hợp đồng trước năm 2021 và không có hợp đồng từ năm 2021 trở đi': 
-- and customer.customer_id not in
-- (select contract.customer_id from contract
-- where year(contract.contracting_date) >= 2021)
);
set sql_safe_updates = 1;
