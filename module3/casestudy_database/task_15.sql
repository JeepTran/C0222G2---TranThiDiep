use furama_resort;

-- 15.	Hiển thị thông tin của tất cả nhân viên bao gồm
-- ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi
--  mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.

select employee.employee_id, employee.employee_name, `level`.level_name, department.department_name,
employee.phone, employee.address, count(contract.employee_id) as quantity_of_contracts
from employee
join `level` on `level`.level_id = employee.level_id
join department on department.department_id = employee.department_id
join contract on contract.employee_id = employee.employee_id
where year(contract.contracting_date) in (2020,2021)
group by employee.employee_id 
having count(contract.employee_id) <=3
order by employee.employee_id ;