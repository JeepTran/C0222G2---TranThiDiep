use furama_resort;

-- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
-- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).

select included_service.included_service_id, included_service.included_service_name, sum(detailed_contract.quantity) as using_times 
from included_service
join detailed_contract on detailed_contract.included_service_id = included_service.included_service_id
join contract on detailed_contract.contract_id = contract.contract_id
group by detailed_contract.included_service_id 
having using_times >= all
(select sum(detailed_contract.quantity) from detailed_contract
 group by detailed_contract.included_service_id) ;