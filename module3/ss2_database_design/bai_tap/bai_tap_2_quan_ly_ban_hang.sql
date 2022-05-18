drop database if exists ss2_product_order_management;
create database if not exists ss2_product_order_management;
use ss2_product_order_management;

create table customer (
customer_id int primary key auto_increment,
customer_name varchar(45),
age int
);

create table `order` (
order_id int primary key auto_increment,
customer_id int,
order_date datetime,
total_price double,
foreign key (customer_id) references customer (customer_id)
);

create table product (
product_id int primary key,
product_name varchar (45),
price double
);

-- create table product_order (
-- order_id int,
-- product_id int,
-- foreign key (order_id) references `order`(order_id),
-- foreign key (product_id) references product (product_id),
-- primary key (order_id, product_id)
-- );

create table order_detail(
order_id int,
product_id int,
foreign key (order_id) references `order` (order_id),
foreign key (product_id) references product (product_id),
order_quantity int
);
