create database RUNOOB;
use RUNOOB;
create table if not exists runoob_tbl(
  runoob_id int not null  auto_increment,
  runoob_title varchar(100) not null,
  runoob_author varchar(40) not null,
  submission_date DATE ,
  PRIMARY KEY (runoob_id)
);
insert into runoob_tbl(runoob_title,runoob_author,submission_date)values
('学习Python','RUNOOB.COM','2017-7-9'),
('学习C#','菜鸟教程','2019-8-25'),
('Java教程','RUNOOB.COM','2020-9-4');

update runoob_tbl set runoob_title='学习C++' where runoob_title='java教程';

create table if not exists Websites(
  id int not null  auto_increment,
  name varchar(100) not null,
  url varchar(40) not null,
  alexa int ,
  country varchar(5),
  PRIMARY KEY (id)
);
insert into Websites(name,url,alexa,country)values
('Google','https://www.google.cm/',1,'USA'),
('淘宝','https://www.taobao.com/',13,'CN'),
('菜鸟教程','http://www.runoob.com/',4589,'CN'),
('微博','http://weibo.com/',20,'CN'),
('Facebook','https://www.facebook.com/',3,'USA'),
('stackoverflow','http://stackoverflow.com/',0,'IND');


create table if not exists apps(
  id int not null  auto_increment,
  app_name varchar(100) not null,
  url varchar(40) not null,
  country varchar(5),
  PRIMARY KEY (id)
);
insert into apps(app_name,url,country)values
('QQ APP',' http://im.qq.com/','CN'),
('微博APP','http://weibo.com/','CN'),
('淘宝APP','https://www.taobao.com/','CN');


DROP TABLE IF EXISTS `employee_tbl`;
CREATE TABLE `employee_tbl` (
  `id` int(11) NOT NULL,
  `name` char(10) NOT NULL DEFAULT '',
  `date` datetime NOT NULL,
  `singin` tinyint(4) NOT NULL DEFAULT '0' COMMENT '登录次数',
  PRIMARY KEY (`id`)
);

