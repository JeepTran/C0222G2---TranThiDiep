use furama_resort;

-- 12.	Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng),
-- ten_dich_vu, so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), 
-- tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 2020 
-- nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.

select contract.contract_id, employee.employee_name, customer.customer_name, customer.phone,
service.service_name, sum(detailed_contract.quantity) as included_service_quantity, contract.deposits
from contract
join employee on employee.employee_id = contract.employee_id
join customer on customer.customer_id = contract.customer_id
join service on service.service_id = contract.service_id
left join detailed_contract on detailed_contract.contract_id = contract.contract_id
where (year(contract.contracting_date) = 2020 and month(contract.contracting_date) in (10,11,12))
and contract.service_id not in
(select contract.service_id from contract
where year(contract.contracting_date) = 2021 and month(contract.contracting_date) in (1,2,3,4,5,6) 
group by contract.service_id)
group by contract.contract_id;
