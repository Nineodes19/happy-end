DROP DATABASE IF EXISTS lib;
CREATE DATABASE lib;
USE lib;
DROP TABLE IF EXISTS student;
CREATE TABLE student(

	stu_xh INT  comment '学号' AUTO_INCREMENT primary key,
	stu_name VARCHAR(20) COMMENT '姓名',
	stu_pwd VARCHAR(20) COMMENT '密码',
	stu_sex VARCHAR(20) COMMENT '性别',
	stu_age INT COMMENT '年龄',
	stu_mobile VARCHAR(20) COMMENT '联系方式',
	stu_addrss VARCHAR(20) COMMENT '地址'
);

insert into student values
(10000,'Nineods','Nineodes123','女',20,15127893654,'陕西');
insert into student(stu_name,stu_pwd,stu_sex,stu_age,stu_mobile,stu_addrss) values
('小邹','xiaozou123','女',20,15698453625,'安徽');


DROP TABLE IF EXISTS user;
CREATE TABLE user(
	u_id INT AUTO_INCREMENT primary key,
	u_LoginName VARCHAR(20),
	u_realName VARCHAR(20),
	u_pwd VARCHAR(20)
);
insert into user values(000001,'xiaozou','小邹','xiaozou123');

DROP TABLE IF EXISTS book;
CREATE TABLE book(
	b_id INT AUTO_INCREMENT primary key,
	b_name VARCHAR(20) unique ,
	b_author VARCHAR(20),
	b_type VARCHAR(20),
	b_publish VARCHAR(20) COMMENT'出版社',
	b_condition VARCHAR(10) COMMENT'借阅状态',
	b_price DECIMAL(3,1)COMMENT'图书标价',
	b_position VARCHAR(15)
);
insert into book values (0000001,'Java程序设计','辛运帷','专业书籍','清华大学出版社','未借出','13.29','AX_0001');

-- book.setB_name("Java面向对象程序设计");
--         book.setB_author("耿祥义");
--         book.setB_type("专业书籍");
--         book.setB_publish("清华大学出版社");
--         book.setB_condition("未借出");
--         book.setB_price(63.84);
--         book.setB_position("AX_0002");
insert into book(b_name,b_author,b_type,b_publish,b_condition,b_price,b_position) values
('Java面向对象程序设计','耿祥义','专业书籍','清华大学出版社','未借出',63.84,'AX_0002');


create table card(
  c_id INT  comment '卡号' AUTO_INCREMENT primary key,
  stu_xh int comment '持卡人id'not null ,
  c_money decimal (19,2),
  constraint stu_xh foreign key(stu_xh) references lib.student(stu_xh)
);
insert into card values(null,10000,100);
