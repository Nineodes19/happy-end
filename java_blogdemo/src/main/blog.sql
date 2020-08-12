drop database IF EXISTS blog;
create database blog;
use blog;
drop table if exists user;
create table user(
  userId INT not null PRIMARY KEY auto_increment,
  name varchar(50) not null,
  password varchar (50) not null
);

drop table if exists article;
create table article(
  id int PRIMARY KEY auto_increment,
  title varchar (255) not null,
  content text not null,
  userId int not null,
  foreign key(userId) references user(userId)

);