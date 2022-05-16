drop database if exists ss2_examscore_management;
create database if not exists ss2_examscore_management;
use ss2_examscore_management;

create table student(
student_id varchar(20) primary key,
student_name varchar(45),
bod date,
class varchar(20),
examiner varchar(45)
);

create table studying_subject(
subject_id varchar(20) primary key,
subject_name varchar (50)
);

create table score(
student_id varchar (20),
subject_id varchar (20),
score int,
exam_date datetime,
primary key (student_id, subject_id),
foreign key(student_id) references student (student_id),
foreign key (subject_id) references studying_subject (subject_id) 
);

create table teacher (
teacher_id varchar (20) primary key,
teacher_name varchar(45),
phone varchar(10)
);

alter table studying_subject add teacher_id varchar(20);
alter table studying_subject add foreign key (teacher_id) references teacher (teacher_id); -- constraint FK_teacher_id 








