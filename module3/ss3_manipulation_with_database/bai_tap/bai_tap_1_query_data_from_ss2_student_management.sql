use ss2_student_management;

select * from student
where student_name like 'h%';

select * from class
where month(start_date) = 12;

select * from `subject`
where credit between 3 and 5;

set sql_safe_updates = 0;
update student set class_id = 2
where student_name = 'Hung';
set sql_safe_updates = 1;

select student_name, sub_name, mark from student
join mark on student.student_id = mark.student_id
join `subject` on mark.sub_id = `subject`.sub_id
order by mark desc, student_name 