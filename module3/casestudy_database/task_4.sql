use furama_resort;

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. 
-- Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng. 
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.

select customer.customer_id, customer.customer_name, count(contract.customer_id) as booking_times 
from customer join contract on contract.customer_id = customer.customer_id 
join customer_type on customer.customer_type_id = customer_type.customer_type_id 
where customer_type.customer_type_name = 'Diamond'
group by customer.customer_id
order by booking_times;