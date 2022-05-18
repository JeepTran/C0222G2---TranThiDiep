use furama_resort;

select customer.customer_id, customer.customer_name, customer_type.customer_type_name,
contract.contract_id, service.service_name, contract.contracting_date, contract.end_date,
(service.rental_fee + detailed_contract.quantity * included_service.price) as total_payment
from customer
left join customer_type on customer.customer_type_id = customer_type.customer_type_id
left join contract on customer.customer_id = contract.customer_id
left join service on contract.service_id = service.service_id
left join detailed_contract on contract.contract_id = detailed_contract.contract_id
left join included_service on detailed_contract.included_service_id = included_service.included_service_id
group by contract.contract_id; 