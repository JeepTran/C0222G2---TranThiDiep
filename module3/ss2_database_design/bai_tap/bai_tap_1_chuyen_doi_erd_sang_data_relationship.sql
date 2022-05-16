drop database if exists ss2_supplies_management;
create database if not exists ss2_supplies_management;
use ss2_supplies_management;

create table supplier(
supplier_id int auto_increment primary key,
supplier_name varchar (255),
address varchar (255)
);

create table address (
address_id int auto_increment primary key,
address_value varchar(255),
supplier_id int,
foreign key (supplier_id) references supplier (supplier_id)
);

create table `order`(
order_id int auto_increment primary key,
order_date datetime,
supplier_id int,
foreign key (supplier_id) references supplier (supplier_id)
);

create table supplies (
supplies_id int auto_increment primary key,
supplies_name varchar(255)
);

create table supplies_detail_order (
order_id int,
supplies_id int, 
primary key (order_id,supplies_id),
foreign key (order_id) references `order`(order_id),
foreign key (supplies_id) references supplies (supplies_id)
);

create table import_order (
import_order_id int auto_increment primary key,
import_order_date datetime
);

create table supplies_detail_import_order (
import_order_id int,
supplies_id int,
import_price_per_unit double,
import_quantity int,
primary key (import_order_id,supplies_id),
foreign key (import_order_id) references import_order (import_order_id),
foreign key (supplies_id) references supplies (supplies_id)
);

create table export_order (
export_order_id int auto_increment primary key,
export_order_date datetime
);

create table supplies_detail_export_order (
export_order_id int,
supplies_id int,
export_price_per_unit double,
export_quantity int,
primary key (export_order_id,supplies_id),
foreign key (export_order_id) references export_order (export_order_id),
foreign key (supplies_id) references supplies (supplies_id)
);