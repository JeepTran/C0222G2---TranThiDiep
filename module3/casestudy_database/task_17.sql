use furama_resort;

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ.
-- (Với tổng tiền được tính theo công thức như sau: 
-- Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) 

 set sql_safe_updates = 0;
 
 update customer set customer.customer_type_id =
 (select customer_type.customer_type_id from customer_type where customer_type.customer_type_name = 'Diamond')
 where ((customer.customer_type_id =
 (select customer_type.customer_type_id from customer_type where customer_type.customer_type_name = 'Platinium'))
 and (customer.customer_id in
 (select * from (select customer.customer_id
 from customer
 -- join customer_type on customer.customer_type_id = customer_type.customer_type_id
 join contract on contract.customer_id = customer.customer_id
 join detailed_contract on detailed_contract.contract_id = contract.contract_id
 join included_service on included_service.included_service_id = detailed_contract.included_service_id
 join service on service.service_id = contract.service_id
 where year(contract.contracting_date) = 2021 and (service.rental_fee + ifnull(detailed_contract.quantity,0) * ifnull(included_service.price,0)) > 10000000
 group by customer.customer_id) customer_with_payment_over_10mil)));
 
 set sql_safe_updates = 1;
 
 
 
 
 