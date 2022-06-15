drop database if exists library_jsp_servlet;
create database if not exists library_jsp_servlet;
use library_jsp_servlet;

create table book(
book_id varchar (45) primary key,
book_name varchar(255) not null,
author varchar(255),
quantity int not null,
`description` text
);

create table class(
class_id int auto_increment primary key,
class_name varchar(45) not null
);

create table student(
student_id int auto_increment primary key,
student_name varchar(255) not null,
class_id int not null,
foreign key(class_id) references class(class_id)
);

create table book_status(
status_id bit(1) primary key,
`status` varchar(45)
);

create table borrow_card(
borrow_id varchar (45) primary key,
book_id varchar (45) not null,
student_id int not null,
status_id bit(1) not null default 1,
borrow_date date not null,
return_date date not null,
foreign key (book_id) references book(book_id),
foreign key (student_id) references student(student_id),
foreign key (status_id) references book_status(status_id)
);



