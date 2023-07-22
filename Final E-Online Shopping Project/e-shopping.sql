use phase3_shopping_app;
show tables;
desc admin;
-- admin, category, order, product, productordersinfo 
show tables;

select * from admin;

-- Category table 

create table category(
cid int primary key auto_increment, 
categoryName varchar(50), 
categoryDescription varchar(1000),
categoryImageUrl longblob); 

desc category;
select * from orders;
drop table orders;
desc orders;
alter table orders modify orderDate timestamp default current_timestamp;



drop table category;
alter table category modify categoryImageUrl longblob;
alter table category modify categoryDescription varchar(500);

delete from category where cid=2;
select * from category;

-- Product table 

create table product(
pid int primary key auto_increment,
title varchar(30), 
description varchar(250),
price float,
discountPercentage float,
rating float,
stock int,
brand varchar(30),
cid int, 
thumbnail longblob, foreign key(cid) references category(cid));

desc product;

select * from product;
drop table product;
delete from product where pid=1;

select * from category;
select * from orders;

 create table orders(
	orderid int primary key auto_increment, 
	orderDate date,
	orderStatus varchar(50),
	email varchar(30),					
	shipmentCharges int,
	totalItems int, 
	totalAmount float
);

select * from orders;
drop table orders;
create table productsordersinfo(
poid int primary key auto_increment, 
oid int, 
pid int, 
qty int,
foreign key(oid) references orders(orderid),
foreign key(pid) references product(pid)
);
show tables;
drop table orders_prodcuts;
select * from orders;
select * from productsordersinfo;
select * from product;

drop table productsordersinfo;

select o.*, p.* from orders o, product p, productsordersinfo poi 
where p.pid =poi.pid and o.orderid = poi.oid;
 select * from orders;
 
select o.*, p.* from orders o, product p, productsordersinfo poi 
where p.pid =poi.pid and o.orderid = poi.oid and o.email='john.snow@gmail.com';

show tables;
drop table product_orders_info;
select * from product_orders_info;
create database phase3_shopping_app_customer_db;

use phase3_shopping_app_customer_db;
show tables;
drop table product_orders_info;
drop table orders;
create table users(
		emailid varchar(30) primary key,
		username varchar(30),
		fullName varchar(30),
		password varchar(250),
		img longblob,
		contact bigint,
	        street varchar(30),
		city varchar(30),
		state varchar(30),
		country varchar(30),
		pincode bigint
);
select * from users;

drop table users;

drop table orders;

delete from users;

-- Account table 

 create table account(
 accno int primary key auto_increment, 
 amount float, 
 emailid varchar(30),
 foreign key(emailid) references users(emailid)
 );
 select * from account;
 drop table account;
 update account set amount = 1000 where accno;
 



