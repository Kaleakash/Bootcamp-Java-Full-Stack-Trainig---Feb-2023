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

create table product(pid int primary key auto_increment,
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
)