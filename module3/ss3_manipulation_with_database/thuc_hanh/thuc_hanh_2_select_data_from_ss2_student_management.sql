use ss2_student_management;

-- Hiển thị danh sách tất cả các học viên
select * from student;

-- Hiển thị danh sách các học viên đang theo học
select * from student
where student_status = 1;

-- Hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ
select * from `subject`
where credit < 10; 

-- Hiển thị danh sách học viên lớp A1
select student.*, class_name, class_status from student
join class on student.class_id = class.class_id
where class_name = 'A1';

-- Hiển thị điểm môn CF của các học viên
select student.student_id, student_name, mark, exam_times, mark.sub_id, sub_name from student
join mark on student.student_id = mark.student_id
join `subject` on mark.sub_id = `subject`.sub_id 
where sub_name = 'CF'; 


