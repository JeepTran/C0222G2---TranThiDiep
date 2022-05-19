use furama_resort;

-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, 
-- so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).

select detailed_contract.contract_id, service_type.service_type_name, included_service.included_service_name,
count(detailed_contract.included_service_id) as using_times
from detailed_contract
join included_service on included_service.included_service_id = detailed_contract.included_service_id
join contract on contract.contract_id = detailed_contract.contract_id 
join service on contract.service_id = service.service_id
join service_type on service.service_type_id = service_type.service_type_id
group by included_service.included_service_name
having using_times = 1
order by contract_id;

