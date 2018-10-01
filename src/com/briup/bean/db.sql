create table briup_student(
	id number primary key,
	name varchar2(20),
	age number,
	address varchar2(50)
);
create table customer1808(
	id number primary key,
	username varchar2(20),
	password varchar2(20),
				dob date,
	address varchar2(100)
);
create sequence customer1808_seq;
-- 一对一建表
create table wife(
	wid number primary key,
	name varchar2(30)
);
create table husband(
	hid number primary key,
	name varchar2(30),
	wife_id number references wife(wid)
);
create sequence wife_seq;
create sequence hus_seq;

-- 用户和小组的一对多
	create table t_group(
	  id number primary key,
	  name varchar2(50) not null
	);
	create table t_user(
	  id number primary key,
	  name varchar2(50) not null,
	  age number,
	  email varchar2(50),
	  phone varchar2(15),
	  group_id number references t_group(id)
	);
	create sequence t_group_seq;
	create sequence t_user_seq;
--3.学生和老师  多对多关系  多对多
	
	create table student(
	  id number primary key,
	  name varchar2(50) not null,
	  age number,
	  phone varchar2(50)
	);

	create table teacher(
	  id number primary key,
	  name varchar2(50) not null,
	  age number,
	  phone varchar2(50)
	);

	create table stu_tea(
	  id number primary key,
	  stu_id number references student(id),
	  tea_id number references teacher(id)
	);
	
        
	drop table student;
	drop table teacher;
	drop table stu_tea;


	insert into student(id,name,age,phone) values(1,'tom',11,'114-466-555');
	insert into student(id,name,age,phone) values(2,'tom2',12,'114-466-555');
	insert into student(id,name,age,phone) values(3,'tom3',13,'114-466-555');
	insert into student(id,name,age,phone) values(4,'tom4',14,'114-466-555');

	insert into teacher(id,name,age,phone) values(1,'tea1',31,'114-466-555');
	insert into teacher(id,name,age,phone) values(2,'tea2',32,'114-466-555');
	insert into teacher(id,name,age,phone) values(3,'tea3',33,'114-466-555');
	insert into teacher(id,name,age,phone) values(4,'tea4',34,'114-466-555');

	insert into stu_tea(id,stu_id,tea_id) values(1,1,1);
	insert into stu_tea(id,stu_id,tea_id) values(2,1,3);
	insert into stu_tea(id,stu_id,tea_id) values(3,3,1);
	insert into stu_tea(id,stu_id,tea_id) values(4,4,2);
--special mtbatis中
	create table t_user1(
		  id number primary key,
		  name varchar2(50),
		  gender varchar2(10)
		);


