drop database if exists ss12_user_management;
create database if not exists ss12_user_management;
use ss12_user_management;

create table users(
id int(3) not null auto_increment primary key,
`name` varchar(120) not null,
email varchar(220) not null,
country varchar(120)
);

insert into users(`name`, email, country) values
('Minh', 'minh@codegym.vn','Viet Nam'),
('Christian', 'christian@coop.us','USA'),
('Yoonte', 'yoon@nyk.kr','Koria'),
('Kante', 'kante@che.uk','Kenia');











