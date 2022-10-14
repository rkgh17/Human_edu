create table student(
name varchar2(32),
mobile varchar2(12)
);
insert into student values('John','77778888');
insert into student values('James','44445555');
insert into student values('Jacob','23235656');
select * from student;
delete from student where name='Jacob';
update student set mobile='33335555' where name = 'James';

create table member(name char(12), gender char(1));
select * from member;
insert into member values('John','M');
insert into member values('Johanson','F');
SELECT '['||NAME||']' FROM MEMBER; 
/*문자열CHAR타입 : 데이터 길이가 최대길이보다 작으면 나머지를 빈칸으로 채운다. -> 데이터를 낭비. 
가변형 변수인 VARCHAR2 : 최대길이보다 작게, 데이터길이만큼만 할당.
MySQL은 VARCHAR*/
DROP TABLE MEMBER;

create table member(name varchar2(12), gender char(1));
select * from member;
insert into member values('John','M');
insert into member values('Johanson','F');
SELECT '['||NAME||']' FROM MEMBER; 

DROP TABLE MEMBER;
create table member(m_id number(5/*전체 길이(소숫점 포함)*/,2/*소수점 이하길이*/), name varchar2(12), gender char(1));
insert into member values(1,'John','M');
insert into member values(100000,'John','M'); --error
select * from member;

DROP TABLE MEMBER;
create table member(m_id number, name varchar2(12), gender char(1));
insert into member values(1,'John','M');
insert into member values(100000,'John','M');
select * from member;

DROP TABLE MEMBER;
create table member(m_id decimal, name varchar2(12), gender char(1));
insert into member values(1,'John','M');
insert into member values(100000,'John','M');
select * from member;


/*
날짜
date
timestamp
*/
DROP TABLE MEMBER;
create table member(m_id decimal, name varchar2(12), gender char(1), created date, ts timestamp);
insert into member values(1,'John','M',sysdate,systimestamp);
insert into member values(100000,'Johanson','F',sysdate,systimestamp);
select * from member;

drop table student;
create table student(
name varchar2(12), gender char(1), birthday varchar2(8), mobile varchar2(20), region varchar2(20)
);
select * from student;

drop table student;
create table student(
name varchar2(12), mobile varchar2(20)
);
insert into student values('Jane',null);
insert into student values(null,null);
insert into student values('James','null');
insert into student (name) values('Jacob'); -- insert문의 또다른 표현
select * from student;

--제약조건 constraints
-- not null
drop table student;
create table student(
name varchar2(12) not null, mobile varchar2(20)
);
insert into student values('Jane',null);
insert into student values(null,null); -- error. name에 not null이란 제약조건을 설정했으므로
select * from student;

--unique
drop table student;
create table student(
name varchar2(12) not null, mobile varchar2(20) unique
);
insert into student values('Jane',null);
insert into student values(null,null); -- error
insert into student values('James','null');
insert into student (name) values('Jacob'); -- unique 비교 대상에서 null은 제외됨.
insert into student (name,mobile) values('Jacob','44445555');
insert into student (name,mobile) values('Johanson','44445555'); -- Jacob과 mobile이 같음. unique 위배

--default
drop table student;
create table student(
name varchar2(12) not null, now date default sysdate
);
select * from student;
insert into student values('John','22/09/09');
insert into student(name) values('James'); -- date에 아무것도 안넣었지만, default로 sysdate를 설정했기 때문에 가능

drop table student;
create table student(
name varchar2(12) not null, gender char(1) default 'F'
);
insert into student values('John','M');
insert into student(name) values('John');
select * from student;

--테이블 복사
/*
CREATE TABLE 테이블명 AS SELECT 컬럼1,....컬럼n FROM 복사할 테이블명

MYSQL은 AS안들어감
*/
create table stu1 AS
select * from student;

create table stu2 AS
select name from student; -- 특정 컬럼만 따와서 복사 가능