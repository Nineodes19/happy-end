-- insert into [表名](……字段)Values (……字段的值);

-- 最重要的就是查询，各种查询一定要熟练掌握，要多练
-- 全列查询 select * from 【表名】;
-- 指定列查询 select (字段)from [表名];

-- 查询字段为表达式：
-- select name,math+english from [表名];

-- 别名 select name,math+english+chinese as 总分 from [表名];
--  其中as可省略

-- 去重 
-- distinct关键字

-- 排序 order by
--  order by desc---->降序
--  order by asc---->升序

-- 条件查询  where关键词

-- 分页查询

-- 从0开始删选n条结果
--  select ... from table_name 
-- 	where...
-- 	order by ...
--	limit n;

-- 从s开始筛选n条结果
--  SELECT ... FROM TABLE_NAME 
-- 	WHERE...
-- 	ORDER BY ...
--	LIMIT N OFFSET S;

-- 数据库约束
-- MYSQL帮助我们进行更严格的检查和校验

-- NOT NULL 表示这一列不能为空
-- UNIQUE 表示这一列是唯一的
-- default 默认
-- primary key 主键约束 指定哪一列为主键，不能重复，不能为空NOT NULL+UNIQUE的结合
-- foreign key 外键约束

CREATE DATABASE java30_0429 CHARACTER set utf8;
USE java3_0429;
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	sn VARCHAR(20) default '000000' NOT NULL,
	name VARCHAR(20)default 'bit' UNIQUE NULL,
	qq_email VARCHAR(20) NOT NULL
);

INSERT INTO student(id,sn,name,qq_email)VALUES(1,'bt','1234567');

-- id 作为主键
INSERT INTO student(sn,name,qq_email)VALUES(1001,'叶修','1234567@qq.com');
INSERT INTO student(sn,name,qq_email)VALUES(1002,'苏沐秋','2345678@qq.com');


-- NOT NULL  插入失败，为什么id没有自增
INSERT INTO student(sn,name,qq_email) VALUES (1004,'bit4','12345678910@qq.com');





CREATE TABLE classes(
	id INT PRIMARY KEY auto_increment,
	name VARCHAR(20)
);
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	sn INT UNIQUE,
	name VARCHAR(20)default 'unkown',
	qq_email VARCHAR(20) NOT NULL,
	classes_id INT,
	FOREIGN KEY (classes_id) REFERENCES classes(id)
);

INSERT INTO classes(name) VALUES('java20');
INSERT INTO classes(name) VALUES('java30');

INSERT INTO student(name,qq_email,classes_id)VALUES('yexiu','1234567@qq.com',1);
INSERT INTO student(name,qq_email,classes_id)VALUES('sumuqiu','2345678@qq.com',2);
INSERT INTO student(name,qq_email,classes_id)VALUES('sumucheng','3456789@qq.com',1);

CREATE TABLE student1(
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(20) UNIQUE,
	sex VARCHAR(10) default '保密' NOT NULL,
	age INT  default 0 NOT NULL,
	height INT default 0 NOT NULL,
	weight INT default 0 NOT NULL
);



CREATE DATABASE blogdemo character set utf8;
USE blogdemo;
-- 用户表
CREATE TABLE users(
	id INT PRIMARY KEY ATUO_ICREMENT,
	name VARCHAR(20) UNIQUE,
	password VARCHAR(20) default NOT NULL
);

INSERT INTO users(name,password) VALUES('jiuge','123456');
INSERT INTO users(name,password) VALUES('xiaojiu','234567');
-- 文章表
CREATE TABLE articles(
	id INT PRIMARY KEY ATUO_ICREMENT,
	author_id INT NOT NULL,
	titl VARCHAR(20) NOT NULL,
	content TEST NOT NULL,
	published_at DATETIME NOT NULL
);

INSERT INTO articles(author_id,titl,content,published_at)VALUES
(2,'java30666','VERY','2020-04-29 21:00:48');
-- 评论表
CREATE TABLE comments(
	id INT PRIMARY KEY ATUO_ICREMENT,
	author_id INT NOT NULL,
	articles INT NOT NULL,
	content TEST NOT NULL,
	published_at DATETIME NOT NULL
);

CREATE TABLE kidos(
	user_id INT NOT NULL,
	articles_id INT NOT NULL,
	PRIMARY KEY (user_id,articles_id)
);