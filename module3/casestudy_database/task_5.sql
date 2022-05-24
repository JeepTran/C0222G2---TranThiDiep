use furama_resort;

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien 
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, 
-- với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 
-- cho tất cả các khách hàng đã từng đặt phòng. 
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).

select customer.customer_id, customer.customer_name, customer_type.customer_type_name,
contract.contract_id, service.service_name, contract.contracting_date, contract.end_date,
(service.rental_fee + sum(ifnull(detailed_contract.quantity,0) * ifnull(included_service.price,0))) as total_payment
from customer
left join customer_type on customer.customer_type_id = customer_type.customer_type_id
left join contract on customer.customer_id = contract.customer_id
left join service on contract.service_id = service.service_id
left join detailed_contract on contract.contract_id = detailed_contract.contract_id
left join included_service on detailed_contract.included_service_id = included_service.included_service_id
group by contract.contract_id, customer.customer_id; 