drop TABLE IF EXISTS student;
CREATE  TABLE studeng(
  id INT NOT NULL PRIMARY KEY,
  sn INT UNIQUE ,
  name VARCHAR (20) DEFAULT 'unkown',
  qq_email VARCHAR (20)
);

DROP TABLE IF EXISTS classes;
CREATE table classes(
  id INT PRIMARY KEY auto_increment,
  name VARCHAR(20),
  `desc` VARCHAR (100)
);

drop table if exists student;
create table student(
  id INT PRIMARY KEY auto_increment,
  sn INT UNIQUE ,
  name VARCHAR (20) default 'unkown',
  qq_mail varchar (20),

);