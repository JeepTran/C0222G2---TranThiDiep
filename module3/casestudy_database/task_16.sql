use furama_resort;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.

set sql_safe_updates = 0;
delete from employee
where employee.employee_id not in 
(select contract.employee_id
from contract
where year(contract.contracting_date) between 2019 and 2021
group by contract.employee_id);
set sql_safe_updates = 1;

-- Hiển thị những nhân viên còn lại:
select * from employee;