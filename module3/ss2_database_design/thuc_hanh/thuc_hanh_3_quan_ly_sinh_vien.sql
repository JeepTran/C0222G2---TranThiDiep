drop database if exists ss2_student_management;
create database if not exists ss2_student_management;
use ss2_student_management;

create table class (
class_id int not null auto_increment primary key,
class_name varchar(60) not null,
start_date datetime not null,
class_status bit(1)
);

create table student(
student_id int not null auto_increment primary key,
student_name varchar (30) not null,
address varchar (50),
phone varchar(20),
student_status bit(1),
class_id int not null, 
foreign key (class_id) references class (class_id)
);

create table subjects (
sub_id int not null auto_increment primary key,
sub_name varchar(30) not null,
credit tinyint not null default 1,
check (credit >= 1),
sub_status bit(1) default 1
);

create table mark (
mark_id int not null auto_increment primary key,
sub_id int not null,
foreign key (sub_id) references subjects (sub_id),  
student_id int not null ,
foreign key (student_id) references student (student_id),
unique (sub_id, student_id),
mark float default 0,
check (mark between 0 and 100),
exam_times tinyint default 1 
);





