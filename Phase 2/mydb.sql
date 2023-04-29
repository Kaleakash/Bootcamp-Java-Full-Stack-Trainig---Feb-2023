use my_java_db;
show tables;

create table employee(id int primary key,name varchar(10), salary float);
select * from login;
desc product;
select * from employee;
select * from product;
alter table product modify pid int primary key auto_increment;

create table product(pid int primary key auto_increment, pname varchar(30), price float);
