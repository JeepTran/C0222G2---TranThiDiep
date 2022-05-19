use furama_resort;

-- 11.	Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi 
-- những khách hàng có ten_loai_khach là “Diamond” 
-- và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.

select included_service.* , customer_type.customer_type_name, customer.address
from included_service
join detailed_contract on included_service.included_service_id = detailed_contract.included_service_id
join contract on detailed_contract.contract_id = contract.contract_id
join customer on contract.customer_id = customer.customer_id
join customer_type on customer.customer_type_id = customer_type.customer_type_id
where customer_type.customer_type_name = 'Diamond' 
and (customer.address like '%Vinh' or  customer.address like '%Quảng Ngãi')
-- group by included_service.included_service_id;

