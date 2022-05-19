use furama_resort;

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 
-- nhưng chưa từng được khách hàng đặt phòng trong năm 2021.

select service.service_id, service.service_name, service.area, service.max_pax, 
service.rental_fee, service_type.service_type_name from service
join service_type on service.service_type_id = service_type.service_type_id
join contract on service.service_id = contract.service_id
where year(contract.contracting_date) = 2020 and not service.service_id in
(select contract.service_id from contract
where year(contract.contracting_date) = 2021)
group by service.service_name;