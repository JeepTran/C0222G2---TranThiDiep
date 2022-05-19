use furama_resort;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm.
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, 
-- so_luong_dich_vu_di_kem (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).

select contract.contract_id, contract.contracting_date, contract.end_date,
contract.deposits, sum(detailed_contract.quantity) as quantity_of_inluded_service from contract
left join detailed_contract on contract.contract_id = detailed_contract.contract_id
group by contract.contract_id;

