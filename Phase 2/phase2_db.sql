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