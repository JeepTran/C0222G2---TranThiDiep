drop database if exists shop_online;
create database if not exists shop_online;
use shop_online;

CREATE TABLE `app_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) DEFAULT b'0',
  `role_name` varchar(255) NOT NULL UNIQUE,
  PRIMARY KEY (`id`)
);

CREATE TABLE `app_user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `creation_date` date DEFAULT NULL,
  `is_deleted` bit(1) DEFAULT b'0',
  `password` varchar(255) NOT NULL,
  `user_name` varchar(255) NOT NULL ,
  PRIMARY KEY (`id`)
);

CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `is_deleted` bit(1) DEFAULT b'0',
  `role_id` int DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`),
  FOREIGN KEY (`role_id`) REFERENCES `app_role` (`id`)
);

CREATE TABLE `category` (
	`id` int not null auto_increment,
    `name` varchar(255),
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`)
);

CREATE TABLE `advertisement` (
	`id` int not null auto_increment,
    `name` varchar(255),   
    `image` varchar(255),
    `create_date` date,
    `start_date` date,
    `end_date` date,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`)
);

CREATE TABLE `product`(
	`id` int not null auto_increment,
    `name` varchar(255),
    `image` text,
    `origin_price` double,
    `color` varchar(255),
    `capacity` varchar(255),
    `origin_country` varchar(255),
    `publish_date` date,
	`discount_percentage` double,
    `description` longtext,
    `tech_specification` longtext,
    `product_set` varchar(255),
    `category_id` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
);

CREATE TABLE `coupon` (
	`id` int not null auto_increment,
    `code` varchar(255),
    `discount_percentage` double,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`)
);


CREATE TABLE `customer` (
	`id` int not null auto_increment,
    `name` varchar(255),
    `phone` varchar(255),
    `address` text,
    `email` varchar(255),
    `user_id` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`)
);

CREATE TABLE `bill` (
	`id` int not null auto_increment,
    `code` varchar(255),
    `ship_fee` double default 20000,
    `coupon_id` int,
    `total` double default 0,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`coupon_id`) REFERENCES `coupon` (`id`)
);

CREATE TABLE `cart` (
	`id` int not null auto_increment,
    `customer_id` int,
    `product_id` int,
    `quantity` int,
    `bill_id` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    FOREIGN KEY (`bill_id`) REFERENCES `bill` (`id`),
    FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
);


INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_ADMIN');
INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_USER');


INSERT INTO `app_user` (`password`, `user_name`, `creation_date`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiq', 'admin', '2022-08-30');
INSERT INTO `app_user` (`password`, `user_name`, `creation_date`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiqapp_user', 'user', '2022-08-31');


INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '2');

INSERT INTO `advertisement` (`name`, `image`, `create_date`, `start_date`,  `end_date`) VALUES 
('Lễ Lớn giảm Airpod', 'https://cdn.tgdd.vn/2022/09/banner/2880-800-1920x533-6.png', '2022-08-01', '2022-09-01','2022-09-30'),
('Tựu trường giảm MacBook', 'https://cdn.tgdd.vn/2022/08/banner/mac-2880-800-1920x533-1.png', '2022-08-01', '2022-09-10','2022-09-30'),
('Giảm Watch', 'https://cdn.tgdd.vn/2022/08/banner/w7-2880-800-1920x533.png', '2022-08-10', '2022-09-01','2022-09-15');

INSERT INTO `category` (`name`) VALUES ('IPhone'),('MacBook'), ('Đồng hồ'), ('Tai nghe') ;

INSERT INTO `product` (`name`, `image`, `origin_price`, `color`, `capacity`, `origin_country`, `publish_date`, 
`discount_percentage`,  `description`, `tech_specification`, `product_set` ,`category_id`  ) VALUES 
('IPhone 13', 'https://cdn.tgdd.vn/Products/Images/42/223602/s16/iphone-13-red-650x650.png', '24990000', 'Đỏ', '128GB', 'Mỹ', '2021-12-31',
'23','iPhone 13 Siêu Năng Lực Mới Của Bạn', 'Công nghệ màn hình: OLED, Độ phân giải: 1170 x 2532 Pixels, Màn hình rộng: 6.1" - Tần số quét 60 Hz, Độ sáng tối đa: 1200 nits, Mặt kính cảm ứng: Kính cường lực Ceramic Shield',
 'Hộp, Sách hướng dẫn, Cây lấy sim, Cáp Lightning - Type C', 1 ),
 ('IPhone 12', 'https://cdn.tgdd.vn/Products/Images/42/228736/s16/iphone-12-green-1-650x650.png', '21990000', 'Xanh lá', '128GB', 'Mỹ', '2021-01-01',
'19','iPhone 12 Siêu Năng Lực Mới Của Bạn', 'Công nghệ màn hình: OLED, Độ phân giải: 1170 x 2532 Pixels, Màn hình rộng: 6.1" - Tần số quét 60 Hz, Độ sáng tối đa: 1200 nits, Mặt kính cảm ứng: Kính cường lực Ceramic Shield',
 'Hộp, Sách hướng dẫn, Cây lấy sim, Cáp Lightning - Type C', 1 ) ,
 ('Apple Watch SE GPS', 'https://cdn.tgdd.vn/Products/Images/7077/234918/s16/apple-watch-se-40mm-vien-nhom-day-cao-su-vang-650x650.png', '8990000', 'Trắng kem', '40mm', 'Anh', '2020-01-01',
'10','Apple Watch - Tính năng vô vàn. Giá nhẹ nhàng', 'Công nghệ màn hình: OLED, Độ phân giải:324 x 394 pixels, Kích thước màn hình: 1.57 inch',
 'Đồng hồ, Dây đeo dự phòng, Sách hướng dẫn, Dây đế sạc Apple', 3 ) ,
 ('MacBook Air M2 2022 10-core GPU', 'https://cdn.tgdd.vn/Products/Images/44/282847/s16/apple-macbook-air-m2-2022-10-core-gpu-xanh-650x650.png', '39990000', 'Xanh đen', 'RAM 8GB - SSD 512GB', 'Việt Nam', '2022-01-01',
'7','MacBoo Air - Không thể xem nhẹ', 'Công nghệ CPU: Apple M2, Số nhân: 8, Tốc độ CPU: 100GB/s memory bandwidth, Tốc độ tối đa: Hãng không công bố',
 'Thùng máy, Sạc Laptop Apple, Cáp ( Type C - Sạc Magsafe )', 2 ) ,
 ('MacBook Pro 13 inch M2 2022 ', 'https://cdn.tgdd.vn/Products/Images/44/282885/s16/apple-pro-m2-2022-10-core-gpu-xam-650x650.png', '41990000', 'Xám', 'RAM 8GB - SSD 512GB', 'Mỹ', '2022-02-01',
'7','MacBook Pro 13 inch nay đa năng hơn bao giờ hết. Siêu mạnh mẽ với chip M2 thế hệ tiếp theo, đây là chiếc máy tính xách tay chuyên nghiệp nhỏ gọn nhất của Apple, cùng thời lượng pin lên đến 20 giờ.',
 'Công nghệ CPU: Apple M2, Số nhân: 8, Tốc độ CPU: 100GB/s memory bandwidth, Tốc độ tối đa: Hãng không công bố',
 'Thùng máy, Sạc Laptop Apple, Cáp ( Type-C )', 2 ) ;

INSERT INTO `coupon` (`code`, `discount_percentage`) VALUES 
('CP01', '23'),
('CP02', '20'),
('CP03', '15'),
('CP04', '17') ;

INSERT INTO `customer` (`name`, `phone`, `address`, `email`, `user_id`) VALUES 
('Nguyễn Như Mai', '0901222222', 'Đà Nẵng', 'mai@gmail.com', 2),
('Trần Thúy Thu', '0911222223', 'Quảng Nam', 'thu@gmail.com', 2),
('Lê Văn Đức', '0921222224', 'Hà Nội', 'duc@gmail.com', 2);

INSERT INTO `bill` (`code`, `ship_fee`, `coupon_id`) VALUES
('B01', 25000, 1),
('B02', 30000, null),
('B03', 25000, 2);

INSERT INTO `cart` (`customer_id`, `product_id`, `quantity`, `bill_id`) VALUES
(2, 2, 2, 1), 
(1, 3, 3, 2), 
(3, 1, 1, 3); 













