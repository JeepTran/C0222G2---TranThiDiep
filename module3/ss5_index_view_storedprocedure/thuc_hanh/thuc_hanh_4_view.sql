use ss5_thuc_hanh_classicmodels;

create view customers_view as
select customers.customerNumber, customers.customerName, customers.phone from customers;

select * from customers_view;

-- Cập nhật VIEW:
-- Một view có thể cập nhật khi nó thỏa mãn các điều kiện:
-- + View được định nghĩ từ một và chỉ một bảng cơ sở
-- + Trong câu lệnh SELECT định nghĩa view không được sử dụng từ khoá DISTINCT, TOP, GROUP BY, HAVING, ORDER_BY và UNION.
-- + Trong view không có bất kỳ SUBQUERIES nào được định nghĩa
-- + Các thành phần xuất hiện trong danh sách chọn của câu lệnh SELECT phải là các cột trong các bảng cơ sở. Trong danh sách chọn không được chứa các biểu thức tính toán, các hàm gộp.
-- + Các cột được ước lượng không thể bị cập nhật.
-- + Tất cả các cột NOT NULL từ bảng ban đầu phải được bao trong view để cho truy vấn INSERT vận hành.

create or replace view customers_view as
select customers.customerNumber, customers.customerName, customers.phone from customers
where city = 'Nantes';

select * from customers_view;

-- XÓA VIEW:
drop view customers_view;