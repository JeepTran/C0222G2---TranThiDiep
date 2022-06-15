use library_jsp_servlet;

insert into book values
("S-0001","Số Đỏ", "Vũ Trọng Phụng",0,"Nhân vật chính Xuân Tóc Đỏ..."),
("S-0002","Tắt Đèn", "Ngô Tất Tố",15,"Nhân vật chính Chị Dậu..."),
("S-0003","Truyện Kiều", "Nguyễn Du",5,"Nhân vật chính Thúy Kiều...");

insert into class values
(1, "C0222G1"),
(2, "C0222G2"),
(3, "C0322G1"),
(4, "C0422G1");

insert into student values
(1,"Nguyễn Quang Hải",1),
(2,"Nguyễn Thị Ngọc Hoa",2),
(3,"Nguyễn Tiến Linh",1),
(4,"Lê Văn Đức",3),
(5,"Đinh Thị Thúy",3),
(6, "Hà Thu Trang",2);

insert into book_status values
(0, "Đã trả"),
(1, "Đang mượn");

insert into borrow_card values
("MS-0001","S-0001",1,1,"2022-06-01","2022-06-03"),
("MS-0002","S-0002",1,1,"2022-06-01","2022-06-03"),
("MS-0003","S-0003",3,1,"2022-06-02","2022-06-05"),
("MS-0004","S-0003",4,1,"2022-06-04","2022-06-10"),
("MS-0005","S-0002",3,1,"2022-06-06","2022-06-09");