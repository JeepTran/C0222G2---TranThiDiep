-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.

use furama_resort;

set sql_safe_updates = 0;
update included_service set price = price*2
where included_service_id in
(select * from (select included_service.included_service_id from included_service
join detailed_contract on detailed_contract.included_service_id = included_service.included_service_id
join contract on contract.contract_id = detailed_contract.contract_id
where year(contract.contracting_date) = 2020 and detailed_contract.quantity > 10) icl_service_used_over_10_times);
set sql_safe_updates = 1;