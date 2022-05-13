create database student_management;
use student_management;

create table student(
id int,
student_name varchar(45),
age int,
country varchar(255));

create table class(
id int,
class_name varchar(255));

create table teacher(
id int,
teacher_name varchar(45),
age int,
country varchar(45));