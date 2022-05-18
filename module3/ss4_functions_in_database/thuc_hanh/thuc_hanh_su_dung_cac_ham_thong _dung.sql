use ss2_student_management;

-- Hiển thị số lượng sinh viên ở từng nơi
select address, count(student_id) as quantity from student
group by address; 

-- Tính điểm trung bình các môn học của mỗi học viên
select student.student_name, avg(mark) as mark_average from mark
join student on student.student_id = mark.student_id
group by student.student_name; 

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.student_name, avg(mark) as mark_average from mark
join student on student.student_id = mark.student_id
group by student.student_name having mark_average >15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất
select student.student_name, avg(mark) as mark_average from mark
join student on student.student_id = mark.student_id
group by student.student_name 
having mark_average>= all
(select avg(mark) from mark group by student_id);
