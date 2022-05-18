use ss2_student_management;

insert into class (class_name, start_date, class_status) values 
('A1','2008-12-20',1),
('A2','2008-12-22',1),
('B3',current_date,0);

insert into student (student_name, address, phone, student_status, class_id) values
('Hung','Ha Noi','0912113113',1,1),
('Hoa','Hai Phong',null,1,1),
('Manh','HCM','0123123123',0,2);

insert into `subject` (sub_name, credit, sub_status) values 
('CF',5,1),
('C',6,1),
('HDJ',5,1),
('RDBMS',10,1);

insert into mark (sub_id,student_id,mark,exam_times) values
(1,1,8,1),
(1,2,10,2),
(2,1,12,1);