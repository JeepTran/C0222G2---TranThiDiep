use furama_resort;

-- 9.	Thực hiện thống kê doanh thu theo tháng, 
-- nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.

select month(contract.contracting_date) as month_of_2021, count(contract.contract_id) as contract_quantity 
from contract
where year(contract.contracting_date) = 2021
group by month(contract.contracting_date)
order by month(contract.contracting_date);