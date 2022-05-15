use furama_resort;

-- select * from employee
-- where 
-- (right(employee_name,position(' ' in reverse(employee_name))-1) like 'H%' 
-- or right(employee_name,position(' ' in reverse(employee_name))-1) like 'T%'
-- or right(employee_name,position(' ' in reverse(employee_name))-1) like 'K%') 
-- and length(employee_name) <=15;

select * from employee
where (employee_name like 'H%'
or employee_name like 'T%'
or employee_name like 'K%')
and length(employee_name) <= 15;