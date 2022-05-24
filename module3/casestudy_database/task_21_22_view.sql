use furama_resort;

-- 21.	Tạo khung nhìn có tên là v_nhan_vien để lấy được thông tin của tất cả các nhân viên
-- có địa chỉ là “Hải Châu” (-> Đà Nẵng) và 
-- đã từng lập hợp đồng cho một hoặc nhiều khách hàng bất kì với ngày lập hợp đồng là “12/12/2019” (-> 2021-04-25).

drop view if exists employee_view;
create view employee_view as
select * from employee
where address like '%Đà Nẵng%' and employee_id in
(select contract.employee_id from contract
where date(contracting_date) = '2021-04-25'
group by contract_id);

-- 22.	Thông qua khung nhìn v_nhan_vien thực hiện cập nhật địa chỉ thành “Liên Chiểu” 
-- đối với tất cả các nhân viên được nhìn thấy bởi khung nhìn này.

set sql_safe_updates = 0;
update employee_view set address = 'Liên Chiểu, Đà Nẵng';
set sql_safe_updates = 1;
