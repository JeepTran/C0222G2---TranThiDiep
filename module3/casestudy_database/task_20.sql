-- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm 
-- id (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.

use furama_resort;

select employee.employee_id as id, employee.employee_name as full_name, employee.email as email, 
employee.phone as phone, employee.birthday as birthday, employee.address as address, 'employee' as 'role'
from employee
union
select customer.customer_id, customer.customer_name, customer.email, 
customer.phone, customer.birthday, customer.address, 'customer' as 'role'
from customer;