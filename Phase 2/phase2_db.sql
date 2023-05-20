create database phase2_db;
use phase2_db;

-- Admin table 

create table admin(emailid varchar(30) primary key, password varchar(30));
insert into admin values('admin@gmail.com','admin@123');

-- Category table 

create table category(cid int primary key auto_increment, 
categoryName varchar(50), 
categoryDescription varchar(250),
categoryImageUrl blob); 

alter table category modify categoryImageUrl longblob;
alter table category modify categoryDescription varchar(500);

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
thumbnail blob, foreign key(cid) references category(cid));


create table users(
		emailid varchar(30) primary key,
		username varchar(30),
		fullName varchar(30),
		password varchar(30),
		img blob,
		contact bigint,
        street varchar(30),
		city varchar(30),
		state varchar(30),
		country varchar(30),
		pincode bigint
);
select * from product;

select * from users;


create table orders(
orderid int primary key auto_increment, 
orderDate date,
orderStatus varchar(50),
email varchar(30),					
shipmentCharges int,
totalItems int, 
totalAmount float,
foreign key(email) references users(emailid)
);

select * from users;

create table product_orders_info(
poid int primary key auto_increment, 
oid int, 
pid int, 
qty int,
foreign key(oid) references orders(orderid),
foreign key(pid) references product(pid)
);

drop table product;
drop table product_orders_info;
select * from orders;
select * from product_orders_info;
select orderid from orders order by orderid desc;
delete from orders;

-- Stored Procedure 

delimiter &
create procedure getProductName(in v_pid int, out v_pname varchar(100))
begin 
select title into v_pname from product where pid = v_pid;
end &

call getProductName(1,@vname);
select @vname;
drop procedure getProductName;

 -- 
 select * from orders;
 
 select distinct orderid  from orders o, product_orders_info poi, product p where o.orderid=poi.oid and poi.pid = p.pid 