
-- 创建数据库
CREATE DATABASE IF NOT EXISTS java_0425;

-- 选中该库
USE java_0425;

-- 创建表；
CREATE TABLE goods(
	goods_id INT COMMENT '商品id',
	good_name VARCHAR(10) COMMENT '商品名称',
	unit_price INT COMMENT '商品单价：分',
	category VARCHAR(10) COMMENT'商品类别',
	provider VARCHAR(20) COMMENT '供应商'
);
CREATE TABLE customer(
	customer_id INT COMMENT '客户ID',
	name VARCHAR(10) COMMENT '客户姓名',
	address VARCHAR(10) COMMENT '客户地址',
	email VARCHAR(10) COMMENT '客户邮箱',
	sex TINYINT COMMENT '性别',
	card_id VARCHAR(20) COMMENT '身份证id'
);
CREATE TABLE purchase(
	order_id INT COMMENT '订单ID',
	customer_id INT COMMENT '客户id',
	goods_id INT COMMENT '商品ID',
	nums INT COMMENT '购买数量'
);


CREATE TABLE student(
	id INT COMMENT 'ID',
	sn INT COMMENT '学号',
	name VARCHAR(10) COMMENT '学生姓名',
	qq_email VARCHAR(10)COMMENT 'QQ邮箱'
);

-- 单行全列插入
INSERT INTO student(id,sn,name,qq_email) VALUES(1,1023,'jiuge','12@qq.com');

INSERT INTO student VALUES(2,1024,'九','14@qq.com');

-- 指定列插入
INSERT INTO student (id,sn,name)VALUES(2,1025,"小酒");

-- 多行全列插入
INSERT INTO student(id,sn,name,qq_email)VALUES
(3,1025,'叶','ye.qq.com'),(4,1026,'韩','han@qq.com'),(5,1027,'苏','su@qq.com');





-- 单行全列插入
INSERT INTO student VALUES(5,0001,'木','mu@qq.com');
-- 单行指定列插入
INSERT INTO student(id,sn,name)VALUES(6,0002,'林','lin@qq.com');
-- 多行全列插入
INSERT INTO student VALUES
(7,0003,'lu','lu@qq.com'),
(8,0004,'liu','liu@qq.com'),
(9,0005,'jiu','jiu@qq.com');
-- 多行指定列插入
INSERT INTO student(id,sn,name)VALUES
(10,0006,'mo'),
(11,0007,'sun'),
(12,0008,'muling');


CREATE TABLE exam_result(
	id int,
	name VARCHAR(10),
	chinese DECIMAL(3,1),
	math DECIMAL(3,1),
	english DECIMAL(3,1)
);
INSERT INTO exam_result(id,name,chinese,math,english) VALUES
(1,'叶修',95,85,99.5),
(2,'张佳乐',85,95,99),
(3,'方锐',85,95,95),
(4,'周泽楷',99,98,99.5),
(5,'王杰希',95,99.5,85);

INSERT INTO exam_result (id,name, chinese, math, english) VALUES
(6,'孙悟空', 87.5, 78, 77),
(7,'猪悟能', 88, 98.5, 90),
(8,'曹孟德', 82, 84, 67),
(9,'刘玄德', 55.5, 85, 45),
(10,'孙权', 70, 73, 78.5),
(11,'宋公明', 75, 65, 30),
(12,'唐三藏', 67, 98, 56);
select id,name,chinese from exam_result;

SELECT * from exam_result
where math > 95;

SELECT name form exam_result
where name LIKE '%孙';

UPDATE exam_result SET math = 99.9 
 where name = '曹孟德';
 
UPDATE exam_result set math = math + 30 
 order by (math + chinese + english) asc LIMIT 3;
 
select a from A
where a between 1 and 50 or
(a IN(25,70,95)and between 25 and 75)