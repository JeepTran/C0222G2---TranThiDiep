use `ss2_product_order_management`;

insert into customer values
(1,'Minh Quan',10),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into `order` values 
(1,1,'2006-3-21',Null),
(2,2,'2006-3-23',Null),
(3,1,'2006-3-16',Null);

insert into product values 
(1,'May Giat',3),
(2,'Tu Lanh',5),
(3,'Dieu Hoa',7),
(4,'Quat',1),
(5,'Bep Dien',2);

insert into order_detail values
(1,1,3), (1,3,7),
(1,4,2), (2,1,1),
(3,1,8), (2,5,4),
(2,3,3);


-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order
select order_id, order_date, total_price from `order`;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách
select customer.customer_name, product.product_name from customer 
join `order` on customer.customer_id = `order`.customer_id
join order_detail on `order`.order_id = order_detail.order_id
join product on order_detail.product_id = product.product_id;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào
-- cách 1:
select customer.customer_name from customer 
left join `order` on customer.customer_id = `order`.customer_id
where `order`.customer_id is null;

-- cách 2:
select customer.customer_name, count(`order`.customer_id) as buying_times from customer 
left join `order` on customer.customer_id = `order`.customer_id
group by customer.customer_name having count(`order`.customer_id) = 0;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 
-- (giá một hóa đơn được tính bằng tổng giá bán của từng loại mặt hàng xuất hiện trong hóa đơn. 
-- Giá bán của từng loại được tính = odQTY*pPrice)

select `order`.order_id, `order`.order_date, (`order_detail`.order_quantity*product.price) as payment from `order`
join order_detail on `order`.order_id = `order_detail`.order_id
join product on `order_detail`.product_id = product.product_id;












