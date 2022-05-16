drop database if exists student_manage;
create database if not exists student_manage;
use student_manage;

create table student(
id char(5) primary key,
student_name varchar(45),
birthday date,
mark double,
pass boolean
);

insert into student 
values("C0201", "Thu", '2000-11-11', 9,1);

insert into student 
values("C0202", "Dong", "2000-11-11", 4,false);

