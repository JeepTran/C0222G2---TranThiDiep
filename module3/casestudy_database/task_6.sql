use furama_resort;

select service.service_id, service_name, area, rental_fee, service_type.service_type_name 
from service 
join service_type on service.service_type_id = service_type.service_type_id
join contract on service.service_id = contract.service_id
where (year(contract.contracting_date) = 2021 and month(contract.contracting_date)>3) 
group by service_name