drop database if exists website;
create database website;
use website;
create table suppliers(
id int(11) auto_increment primary key,
name varchar(100) not null,
email varchar(50) not null,
phone_number varchar(20),
address varchar(500)
);
insert into suppliers value 
(null,'SONY','sony@gmail.com','09001','Quế Xuấn'),
(null,'SAMSUNG','samsung@gmail.com','09002','Đà Nẵng'),
(null,'TOSHIBA','toshiba@gmail.com','09003','Huế'),
(null,'APPLE','apple@gmail.com','09004','Quế Phú'),
(null,'FACEBOOK','facebook@gmail.com','09005','Cà Mau');
create table categories(
id int(11) auto_increment primary key,
name varchar(50) not null,
description varchar(500)
);
insert into categories value 
(null,'FTX001','blue color'),(null,'FTX002','red color'),(null,'FTX003','green color'),
(null,'FTX004','purple color'),(null,'FTX005','black color'),(null,'FTX006','white color');
create table products(
id int(11) auto_increment primary key,
name varchar(50) not null,
image_url varchar(1000) not null,
price decimal(18.2),
discount decimal(18.2),
stock decimal(18.2),
category_id int(11),
supplier_id int(11),
description varchar(1000),
foreign key (category_id) references categories(id) on delete cascade,
foreign key (supplier_id) references suppliers(id) on delete cascade
);
insert into products value
(null,'iphone01','www.iphones/info/pic.iphone01',2000,'20',12,1,5,'12in'),
(null,'iphone02','www.iphones/info/pic.iphone02',2200,'25',5,2,1,'13in'),
(null,'iphone03','www.iphones/info/pic.iphone03',2400,'15',9,3,2,'14in'),
(null,'iphone04','www.iphones/info/pic.iphone04',2600,'10',20,4,5,'15in'),
(null,'iphone05','www.iphones/info/pic.iphone05',2800,'5',3,3,4,'16in'),
(null,'iphone06','www.iphones/info/pic.iphone06',3000,'5',3,5,3,'16in');
create table employees(
id int(11) auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday datetime
);
insert into employees value
(null,'Suzumiya','Kotone','090201','Japan','kotone@gmail.com','1992-06-27'),
(null,'Abe','Mikako','090202','Tokyo','mikako@gmail.com','1994-02-21'),
(null,'Tsukasa','Aoi','090203','Osaka','aoi@gmail.com','1990-08-14'),
(null,'Erika','Momotani','090204','Tokyo','momotani@gmail.com','1994-06-15'),
(null,'Emiri','Suzuhara','090205','Japan','suzuhara@gmail.com','1994-03-26');
create table customers(
id int(11) auto_increment primary key,
first_name varchar(50) not null,
last_name varchar(50) not null,
phone_number varchar(20),
address varchar(500) not null,
email varchar(50) not null,
birthday date
);
insert into customers value
(null,'Miss','Tâm','090101','Hải Châu','tam@gmail.com','1980-01-01'),
(null,'Mrs','Trung','090102','Hòa Vang','trung@gmail.com','1985-02-02'),
(null,'Mrs','Hải','090103','Liên Chiểu','hai@gmail.com','1998-03-25'),
(null,'Mrs','Kiên','090104','Thanh Khê','kien@gmail.com','1994-03-25'),
(null,'Mrs','Đức','090105','Hải Châu','duc@gmail.com','1990-05-05'),
(null,'Miss','Hà','090106','Hòa Vang','duc@gmail.com','1990-05-05'),
(null,'Miss','Hiền','090107','Sơn Trà','duc@gmail.com','1990-05-05'),
(null,'Miss','Thu','090108','Cẩm Lệ','duc@gmail.com','1990-05-05');
create table orders(
id int(11) auto_increment primary key,
created_date datetime not null,
shipped_date datetime,
status varchar(50) not null,
description varchar(1000),
shipping_address varchar(500) not null,
shipping_City varchar(50) not null,
payment_type varchar(20) not null,
customer_id int(11),
employee_id int(11),
foreign key (customer_id) references customers(id) on delete cascade,
foreign key (employee_id) references employees(id) on delete cascade
);
insert into orders value
(null,'2020-03-03','2020-03-25','COMPLETED','description1','Cẩm Lệ','Đà Nẵng','CASH',1,2),
(null,'2020-02-15','2020-02-19','CANCELED','description2','Tô Hiến Thành','Sài Gòn','CREADIT CARD',1,3),
(null,'2020-01-07','2020-01-11','COMPLETED','description3','Cầu Giấy','Hà Nội','CREADIT CARD',3,4),
(null,'2020-03-11','2020-03-25','CANCELED','description4','Quế Xuân','Quảng Nam','CREADIT CARD',4,5),
(null,'2020-02-15','2020-03-25','COMPLETED','description5','Hùng Vương','Vũng Tàu','CASH',5,1),
(null,'2020-03-14','2020-03-27','COMPLETED','description6','Điện Biên Phủ','Đà Nẵng','CREADIT CARD',6,2),
(null,'2020-02-11','2020-02-22','COMPLETED','description7','Nguyễn Tất Thành','Đà Nẵng','CASH',7,4),
(null,'2020-02-07','2020-03-04','COMPLETED','description8','Hà Huy Tập','Đà Nẵng','CREADIT CARD',8,5);
create table orderdetails(
id int(11) auto_increment primary key,
order_id int(11),
product_id int(11),
quantity decimal(18,2),
foreign key (order_id) references orders(id) on delete cascade,
foreign key (product_id) references products(id) on delete cascade
);
insert into orderdetails value
(null,1,3,5),(null,1,4,8),(null,3,5,20),(null,4,1,10),(null,5,2,15),
(null,6,3,12),(null,7,5,14),(null,8,2,1);

-- Câu 1: Viết câu lệnh UPDATE để cập nhật Price với điều kiện: Các mặt hàng có Price <= 100000 
-- thì tăng thêm 10%
-- SET SQL_SAFE_UPDATES = 0;
-- update products set price=price*110/100 where price<=100000;
-- select * from products;
-- Câu 2: Viết câu lệnh UPDATE để cập nhật DISCOUNT với điều kiện: Các mặt hàng có Discount <= 10% 
-- thì tăng thêm 5%
-- SET SQL_SAFE_UPDATES = 0;
-- update products set discount=discount+5 where discount<=10;
-- select * from products;
-- Câu 3: Hiển thị tất cả các mặt hàng có giảm giá <= 10%
-- select * from products where discount<=10;
-- Câu 4: Hiển thị tất cả các mặt hàng có tồn kho <= 5
-- select * from products where stock<=5;
-- Câu 5 : Hiển thị tất cả các khách hàng có địa chỉ ở Quận Hải Châu
-- select * from customers where address='Hải Châu';
-- Câu 6: Hiển thị tất cả các khách hàng có năm sinh 1990
--  select * from customers where year(birthday)=1990;
-- Câu 7: Hiển thị tất cả các khách hàng có sinh nhật là hôm nay
-- select * from customers where month(now())=month(birthday) and day(now())=day(birthday);
-- Câu 8: Hiển thị tất cả các đơn hàng có trạng thái là COMPLETED
-- select * from orders where status='COMPLETED';
-- câu 9: Hiển thị tất cả các đơn hàng có trạng thái là COMPLETED trong ngày hôm nay
-- select * from orders where status='COMPLETED' and year(shipped_date)=year(now())and
-- month(shipped_date)=month(now())and day(shipped_date)=day(now());
-- Câu 10: Hiển thị tất cả các đơn hàng có trạng thái là CANCELED
-- select * from orders where status='CANCELED';
-- Câu 11: Hiển thị tất cả các đơn hàng có hình thức thanh toán là CASH
-- select * from orders where payment_type='CASH';
-- Câu 12: Hiển thị tất cả các đơn hàng có hình thức thanh toán là CREADIT CARD
-- select * from orders where payment_type='CREADIT CARD';
-- Câu 13: Hiển thị tất cả các đơn hàng có địa chỉ giao hàng là Hà Nội
-- select * from orders where shipping_City='Hà Nội';
-- Câu 14: Hiển thị tất cả các nhân viên có sinh nhật là hôm nay
-- select * from employees where month(now())=month(birthday) and day(now())=day(birthday);
-- Câu 15: Hiển thị tất cả các nhà cung cấp có tên là: (SONY, SAMSUNG, TOSHIBA, APPLE)
-- select * from suppliers where name='SONY'or name='SAMSUNG'or name='TOSHIBA'or name='APPLE';
-- Câu 16: Hiển thị tất cả các mặt hàng cùng với CategoryName
-- select products.name,categories.name as categoriesName from products join categories 
-- where categories.id=products.category_id;
-- Câu 17: Hiển thị tất cả các đơn hàng cùng với thông tin chi tiết khách hàng (Customer)
-- select * from customers join orders on customers.id=orders.customer_id;
-- Câu 18: Hiển thị tất cả các mặt hàng cùng với thông tin chi tiết của Category và Supplier
-- select * from products join categories on products.category_id=categories.id
-- join suppliers on products.supplier_id=suppliers.id;
-- Câu 19: Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục(Viết 2 cách)
-- Cách 1:
-- select categories.id,categories.name,sum(products.stock) from categories  join products
-- on categories.id=products.category_id group by categories.id;
-- Cách 2:
-- select category_id,sum(products.stock)  from products where exists(select category_id from categories
-- where category_id= categories.id)group by category_id;
-- Câu 20: Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp(Viết 2 cách)\
-- Cách 1:
-- select suppliers.id,suppliers.name,sum(products.stock) from suppliers join products
-- on suppliers.id=products.supplier_id group by suppliers.id;
-- Cách 2:
-- select supplier_id,sum(products.stock) from  products where exists(select supplier_id from suppliers
-- where supplier_id= suppliers.id)group by supplier_id;
-- select suppliers.id,suppliers.name,sum(products.stock) from suppliers,products
-- where suppliers.id=products.supplier_id group by suppliers.id;
-- câu 21: Hiển thị tất cả các mặt hàng được bán trong khoảng từ ngày, đến ngày(Khoảng cách ngày 
-- các bạn tuỳ chọn theo data phù hợp với mỗi người) 
-- select products.* from products join orderdetails on products.id=orderdetails.product_id
-- join orders on orderdetails.order_id=orders.id where created_date between '2020-02-15' and '2020-03-10'
-- and status='COMPLETED';
-- Câu 22: Hiển thị tất cả các khách hàng mua hàng trong khoảng từ ngày, đến ngày((Khoảng cách ngày 
-- các bạn tuỳ chọn theo data phù hợp với mỗi người))
-- select customers.*,orders.created_date,orders.status from customers join orders
-- on customers.id=orders.customer_id where created_date between '2020-02-15' and '2020-03-10'
-- and status='COMPLETED';
-- Câu 23: Hiển thị tất cả các khách hàng mua hàng (với tổng số tiền) trong khoảng từ ngày, 
-- đến ngày(viêt bằng 2 cách, ngày tuỳ chọn )
-- select customers.*,sum(price*quantity*(100-discount)/100) as TongTien from customers 
-- join orders on customers.id=orders.customer_id 
-- join orderdetails on orders.id=orderdetails.order_id
-- join products on orderdetails.product_id=products.id
-- where created_date between '2020-02-15' and '2020-03-10' and status<>'CANCEL'
-- group by customers.id;
-- Câu 24: Hiển thị tất cả đơn hàng với tổng số tiền
-- select orders.id,sum(price*quantity*(100-discount)/100) from orders 
-- join orderdetails on orders.id=orderdetails.order_id
-- join products on orderdetails.product_id=products.id 
-- where status<>'CANCEL' group by orders.id;
-- câu 25: Hiển thị tất cả các nhân viên bán hàng với tổng số tiền bán được
-- select employees.first_name,employees.last_name,sum(price*quantity*(100-discount)/100) from employees
-- join orders on employees.id=orders.employee_id
-- join orderdetails on orderdetails.order_id=orders.id
-- join products on orderdetails.product_id=products.id 
-- where status<>'CANCEL' group by employees.id;
-- Câu 26: Hiển thị tất cả các mặt hàng không bán được
-- select * from products where not exists(select products.id from orderdetails 
-- where products.id=orderdetails.product_id);
-- Câu 27: Hiển thị tất cả các nhà cung cấp không bán được trong khoảng từ ngày, đến ngày
-- select suppliers.* from suppliers 
-- where suppliers.id not in (select suppliers.id from suppliers
-- right join products on suppliers.id=products.supplier_id
-- left join orderdetails on products.id=orderdetails.product_id
-- left join orders on orders.id=orderdetails.order_id 
-- where  date(created_date) between '2020-02-15' and '2020-03-03'and status='COMPLETED');
-- (((((right join products để chọn ra những nhà cung cấp có sản phẩm trong products
-- left join orderdetails để chọn ra những nhà cung cấp có sản phẩm và có trong đơn hàng chi tiết))))))
-- Câu 28: Hiển thị top 3 các nhân viên bán hàng với tổng số tiền bán được từ 
-- cao đến thấp trong khoảng từ ngày, đến ngày
-- select employees.first_name,employees.last_name,
-- sum(price*quantity*(100-discount)/100),orders.created_date from employees
-- join orders on employees.id=orders.employee_id
-- join orderdetails on orderdetails.order_id=orders.id
-- join products on orderdetails.product_id=products.id where status<>'CANCEL' 
-- and date(created_date) between '2020-02-02' and '2020-04-04' 
-- group by employees.id
-- order by sum(price) desc limit 3 ;
-- ((((((Bỏ 2 dòng and date... và order by...,sau đó thêm 2 dòng đó và so sánh 2 kết quả.)))))))))))
-- Câu 29: Hiển thị top 5 các khách hàng mua hàng với tổng số tiền 
-- mua được từ cao đến thấp trong khoảng từ ngày, đến ngày
-- select customers.first_name,customers.last_name,
-- sum(price*quantity*(100-discount)/100) as TongTien,orders.created_date from customers 
-- join orders on customers.id=orders.customer_id 
-- join orderdetails on orders.id=orderdetails.order_id
-- join products on orderdetails.product_id=products.id
-- where created_date between '2020-02-02' and '2020-04-04' and status<>'CANCEL'
-- group by customers.id order by TongTien desc limit 5;
-- Câu 30: Hiển thị danh sách các mức giảm giá của cửa hàng
-- select id,name,discount from products;
-- Câu 31: Hiển thị tất cả danh mục (Categories) với tổng số tiền bán được trong mỗi danh mục
-- Cách 1:
-- select categories.id,categories.name,sum(price) from categories 
--  join products on categories.id=products.category_id group by categories.id;
-- Cách 2.1:
-- select category_id,sum(price) from products 
-- where exists(select category_id from categories
-- where category_id= categories.id)
-- group by category_id;
-- select categories.id
-- ,categories.name
-- , (select sum(products.price) from products 
-- where products.category_id = categories.id group by categories.id) as total from categories;
-- Cách 2.2:
-- select categories.id
-- ,categories.name
-- , sum(products.price)as total from categories,products 
-- where products.category_id = categories.id group by categories.id;
















-- XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
-- Câu 19: Hiển thị tất cả danh mục (Categories) với số lượng hàng hóa trong mỗi danh mục(Viết 2 cách)
-- Cách 1:
-- select categories.name,count(categories.id) from categories join products 
-- on products.category_id=categories.id group by categories.id;
-- Cách 2:
-- drop temporary table  if exists Temp1;
-- create temporary table  Temp1
-- select 1 as categories_id
-- union select 2 as categories_id
-- union select 3 as categories_id
-- union select 4 categories_id
-- union select 5 as categories_id;
-- select categories_id,count(category_id) as Số_sản_phẩm from Temp1 left join products
-- on categories_id=products.category_id group by category_id;
-- Câu 20: Hiển thị tất cả nhà cung cấp (Suppliers) với số lượng hàng hóa mỗi nhà cung cấp(Viết 2 cách)
-- Cách 1:
-- select suppliers.name,count(suppliers.id) from suppliers join products 
-- on products.supplier_id=suppliers.id group by suppliers.id;
-- Cách 2:
-- drop temporary table  if exists Temp2;
-- create temporary table  Temp2
-- select 1 as suppliers_id
-- union select 2 as suppliers_id
-- union select 3 as suppliers_id
-- union select 4 suppliers_id
-- union select 5 as suppliers_id;
-- select suppliers_id,count(supplier_id) as Số_sản_phẩm from Temp2 left join products
-- on suppliers_id=products.supplier_id group by supplier_id;


