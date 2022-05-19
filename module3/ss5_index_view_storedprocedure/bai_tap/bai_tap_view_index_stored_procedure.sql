drop database if exists ss5_index_view_sp;
create database ss5_index_view_sp;

use ss5_index_view_sp;
create table products(
id int auto_increment primary key,
product_code varchar(45),
product_name varchar(255),
product_price double,
product_amount int,
product_description text,
product_status bit(1)
);

insert into products values
(1, 'P1', 'Product 1', 200000, 2, 'Good', b'1'),
(2, 'P2', 'Product 2', 400000, 8, 'So so', b'0'),
(3, 'P3', 'Product 3', 500000, 5, 'Nice', b'0'),
(4, 'P4', 'Product 4', 100000, 12, 'Excellent', b'1')
;

-- Bước 3:
-- drop index product_code_idx on products;
explain select * from products;
create unique index product_code_idx on products(product_code);
create index product_name_price_idx on products(product_name, product_price);

-- Bước 4:
create view products_view as select product_code, product_name, product_price, product_status from products;
select * from products_view;
update products_view set product_price = 1000000 where product_code = 'P2';
drop view products_view;

-- Bước 5:
delimiter //
create procedure get_info_products ()
begin 
select * from products;
end
// delimiter ; 
call get_info_products();

delimiter //
create procedure insert_new_product(id int, product_code varchar(45), product_name varchar(255), product_price double,
product_amount int, product_description text, product_status bit(1))
begin 
insert into products values (id, product_code, product_name, product_price,
product_amount, product_description, product_status);
end
// delimiter ; 
call insert_new_product(5, 'P5', 'Product 5', 100000, 12, 'Excellent', b'1');

delimiter //
create procedure update_product_by_id(old_id int, new_id int)
begin 
set sql_safe_updates = 0;
update products set id = new_id where id = old_id;
set sql_safe_updates = 1;
end
// delimiter ; 
call update_product_by_id(2,7);

delimiter //
create procedure delete_product_by_id(delete_id int)
begin
set sql_safe_updates = 0 ;
delete from products where id = delete_id;
set sql_safe_updates = 1;
end
// delimiter ; 
call delete_product_by_id(4);
