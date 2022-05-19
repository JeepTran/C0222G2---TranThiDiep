use furama_resort;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ 
-- chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).

select service.service_id, service_name, area, rental_fee, service_type.service_type_name 
from service 
join service_type on service.service_type_id = service_type.service_type_id
join contract on service.service_id = contract.service_id
where not contract.service_id in 
(select contract.service_id from contract 
where month(contract.contracting_date) in (1,2,3))
group by service_name;