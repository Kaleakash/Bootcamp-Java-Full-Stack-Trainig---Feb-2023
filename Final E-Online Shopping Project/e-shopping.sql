use phase3_shopping_app;

show tables;

select * from admin;

-- Category table 

create table category(
cid int primary key auto_increment, 
categoryName varchar(50), 
categoryDescription varchar(1000),
categoryImageUrl longblob); 

desc category;

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


