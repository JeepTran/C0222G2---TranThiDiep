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
    `origin` varchar(255),
    `publish_date` date,
	`discount_percentage` int,
    `description` text,
    `tech_specification` text,
    `product_set` varchar(255),
    `category_id` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`category_id`) REFERENCES `category` (`id`)
);

CREATE TABLE `coupon` (
	`id` int not null auto_increment,
    `name` varchar(255),
    `discount_percentage` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`)
);

CREATE TABLE `admin` (
	`id` int not null auto_increment,
    `name` varchar(255) default 'admin',
    `user_id` int unique default '1',
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`)
);

CREATE TABLE `customer` (
	`id` int not null auto_increment,
    `name` varchar(255),
    `phone_number` varchar(255),
    `address` text,
    `email` varchar(255),
    `user_id` int unique,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`)
);

CREATE TABLE `order` (
	`id` int not null auto_increment,
    `customer_id` int,
    `product_id` int,
    `quantity` int,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
);

CREATE TABLE `bill` (
	`id` int not null auto_increment,
    `name` varchar(255),
    `order_id` int,
    `ship_fee` double default 20000,
    `coupon_id` int,
    `total` double,
    `is_deleted` bit(1) DEFAULT b'0',
	PRIMARY KEY (`id`),
    FOREIGN KEY (`order_id`) REFERENCES `order` (`id`),
    FOREIGN KEY (`coupon_id`) REFERENCES `coupon` (`id`)
);


INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_ADMIN');
INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_USER');


INSERT INTO `app_user` (`password`, `user_name`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiq', 'admin');
INSERT INTO `app_user` (`password`, `user_name`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiqapp_user', 'user');


INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '2');
