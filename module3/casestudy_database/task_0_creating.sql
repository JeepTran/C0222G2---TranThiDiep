drop database if exists furama_resort;
create database furama_resort;
use furama_resort;

create table `position`(
position_id int primary key,
position_name varchar(45)
);

create table `level`(
level_id int primary key,
level_name varchar(45)
);

create table department(
department_id int primary key,
department_name varchar(45)
);

create table employee(
employee_id int primary key,
employee_name varchar(45) not null,
birthday date not null,
id_card varchar(45) not null,
salary double not null,
phone varchar(45) not null,
email varchar(45),
address varchar(45),
position_id int not null,
foreign key (position_id) references `position` (position_id),
level_id int not null,
foreign key (level_id) references `level` (level_id),
department_id int not null,
foreign key (department_id) references department (department_id)
);

create table customer_type(
customer_type_id int primary key,
customer_type_name varchar(45)
);

create table customer(
customer_id int primary key,
customer_name varchar(45) not null,
birthday date not null,
gender bit(1) not null,
id_card varchar(45) not null,
phone varchar(45) not null,
email varchar(45),
address varchar(45),
customer_type_id int not null,
foreign key (customer_type_id) references customer_type(customer_type_id)
);

create table rental_type(
rental_type_id int primary key,
rental_type_name varchar(45)
);

create table service_type(
service_type_id int primary key,
service_type_name varchar(45)
);

create table service(
service_id int primary key,
service_name varchar(45) not null,
area int,
rental_fee double not null,
max_pax int,
room_standard varchar(45),
other_conveniences varchar(45),
pool_area double,
num_of_floors int,
rental_type_id int not null,
foreign key (rental_type_id) references rental_type (rental_type_id),
service_type_id int not null,
foreign key (service_type_id) references service_type (service_type_id)
);

create table contract(
contract_id int primary key,
contracting_date datetime not null,
end_date datetime not null,
deposits double not null,
employee_id int not null,
foreign key (employee_id) references employee (employee_id),
customer_id int not null,
foreign key (customer_id) references customer (customer_id),
service_id int not null,
foreign key (service_id) references service (service_id)
);

create table included_service(
included_service_id int primary key,
included_service_name varchar(45) not null,
price double not null,
unit varchar(10) not null,
service_status varchar(45) 
);

create table detailed_contract(
detailed_contract_id int primary key,
quantity int  not null,
contract_id int not null,
foreign key (contract_id) references contract (contract_id),
included_service_id int not null,
foreign key (included_service_id) references included_service (included_service_id)
);
