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

CREATE TABLE `position` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
);
CREATE TABLE `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `gender` int DEFAULT NULL,
  `image` text,
  `is_deleted` bit(1) DEFAULT b'0',
  `name` varchar(255) DEFAULT NULL,
  `phone_number` varchar(255) DEFAULT NULL UNIQUE,
  `salary` double DEFAULT NULL,
  `user_id` int DEFAULT NULL,
  `position_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`),
  FOREIGN KEY (`position_id`) REFERENCES `position` (`id`)
);

CREATE TABLE `category` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
	PRIMARY KEY (`id`)
);


CREATE TABLE `customer` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
    `phone_number` varchar(255),
    `address` text,
    `image` text,
    `status` bit(1) DEFAULT b'0',
    `email` varchar(255),
    `user_id` int unique,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`user_id`) REFERENCES `app_user` (`id`)
);

CREATE TABLE `promotion` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `product` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
    `operating_system` varchar(255),
    `cpu` varchar(255),
    `ram` varchar(255),
    `screen_resolution` varchar(255),
    `release_time` date,
    `graphic_card` varchar(255),
    `price` double,
    `real_price` double,
    `description` text,
    `image` text,
    `category_id` int,
    `promotion_id` int,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`category_id`) REFERENCES `category` (`id`),
    FOREIGN KEY (`promotion_id`) REFERENCES `promotion` (`id`)
);

CREATE TABLE `coupon` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
    `discount_percent` int,
    `product_id` int,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
);

CREATE TABLE `bill` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `name` varchar(255),
	PRIMARY KEY (`id`)
);

CREATE TABLE `feedback` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `content` varchar(255),
    `feedback_date` date,
    `image` text,
    `rate` int,
    `bill_id` int,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`bill_id`) REFERENCES `bill` (`id`)
);

CREATE TABLE `order` (
	`id` int not null auto_increment,
    `is_deleted` bit(1) DEFAULT b'0',
    `quantity` int,
    `customer_id` int,
    `product_id` int,
    `bill_id` int,
	PRIMARY KEY (`id`),
    FOREIGN KEY (`product_id`) REFERENCES `product` (`id`),
    FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
    FOREIGN KEY (`bill_id`) REFERENCES `bill` (`id`)
);

INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_ADMIN');
INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_STAFF');
INSERT INTO `app_role` (`role_name`) VALUES ('ROLE_USER');

INSERT INTO `app_user` (`password`, `user_name`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiq', 'admin');
INSERT INTO `app_user` (`password`, `user_name`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiq', 'staff');
INSERT INTO `app_user` (`password`, `user_name`) VALUES ('$2a$10$CqdLCRz4f8HGTqmChZQ9q.5brX6Ry.If8q8D9dYS1gOF1rnUSCmiqapp_user', 'user');

INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('1', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('3', '1');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('2', '2');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('3', '2');
INSERT INTO `user_role` (`role_id`, `user_id`) VALUES ('3', '3');