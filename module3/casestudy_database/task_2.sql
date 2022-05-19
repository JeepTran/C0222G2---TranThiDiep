use furama_resort;

-- 2.	Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” 
-- và có tối đa 15 kí tự.

-- select theo first_name của employee: (

-- select * from employee
-- where 
-- (right(employee_name,position(' ' in reverse(employee_name))-1) like 'H%' 
-- or right(employee_name,position(' ' in reverse(employee_name))-1) like 'T%'
-- or right(employee_name,position(' ' in reverse(employee_name))-1) like 'K%') 
-- and char_length(employee_name) <=15;  )

select * from employee
where (employee_name like 'H%'
or employee_name like 'T%'
or employee_name like 'K%')
and char_length (employee_name) <= 15;