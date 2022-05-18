use ss2_student_management;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select `subject`.* from `subject`
where credit >= all (select credit from `subject`);

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select `subject`.*, mark from mark
join `subject` on mark.sub_id = `subject`.sub_id
where mark >= all (select mark from mark);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.*, avg(mark) from student
join mark on mark.student_id = student.student_id
group by student_id
order by mark desc;
