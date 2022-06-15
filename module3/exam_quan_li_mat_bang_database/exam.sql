drop database if exists exam_quan_ly_mat_bang;
create database if not exists exam_quan_ly_mat_bang;
use exam_quan_ly_mat_bang;

create table trang_thai(
ma_trang_thai int primary key auto_increment,
ten_trang_thai varchar(255)
);

create table loai_mat_bang(
ma_loai_mat_bang int primary key auto_increment,
ten_loai_mat_bang varchar(255)
);

create table mat_bang(
ma_mat_bang varchar(45) primary key,
ma_trang_thai int,
dien_tich double,
tang int,
ma_loai_mat_bang int,
gia_tien double,
ngay_bat_dau date,
ngay_ket_thuc date,
foreign key(ma_trang_thai) references trang_thai(ma_trang_thai),
foreign key(ma_loai_mat_bang) references loai_mat_bang(ma_loai_mat_bang)
);

insert into trang_thai(ten_trang_thai) values
("Trống"),
("Hạ tầng"),
("Đầy đủ");

insert into loai_mat_bang(ten_loai_mat_bang) values
("Văn phòng chia sẻ"),
("Văn phòng trọn gói");

insert into mat_bang values
("MBA-00-01",1,50,2,2,10000000,"2022-03-20","2022-09-30"),
("MBA-00-02",2,200,10,1,100000000,"2022-04-20","2022-09-30"),
("MBA-00-03",1,500,3,1,30000000,"2022-01-20","2022-07-30"),
("MBA-00-04",3,100,2,2,50000000,"2022-02-20","2022-09-30"),
("MBA-00-05",2,50,7,2,10000000,"2022-05-20","2022-12-30"),
("MBA-00-06",3,250,5,1,20000000,"2022-01-20","2022-09-30");

