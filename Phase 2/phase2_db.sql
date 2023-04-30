create database phase2_db;
use phase2_db;

-- Admin table 

create table admin(emailid varchar(30) primary key, password varchar(30));
insert into admin values('admin@gmail.com','admin@123');

