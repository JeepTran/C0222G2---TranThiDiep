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

drop procedure if exists get_user_by_id;
delimiter //
create procedure get_user_by_id(in id int)
begin
select * from users where id = id;
end //
delimiter ;

drop procedure if exists insert_user;
delimiter //
create procedure insert_user(in `name` varchar(120), in email varchar(220), in country varchar(120))
begin
insert into users (`name`, email,country) values (`name`, email, country);
end //
delimiter ;






