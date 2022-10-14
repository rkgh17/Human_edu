/*
INSERT
insert into 테이블명 values(값1, 값2, 값3....);

원하는 컬럼에 데이터 넣기
insert into 테이블명(컬럼명1, ...컬럼명n) values(값1, .... 값n);

MySQL의 경우 한 가지 방법 더 지원
insert into 테이블명 set 컬럼명1=값1, ...... 컬럼명n=값n;
*/
create table student(
name varchar2(12) not null,
gender char(1) default 'F', 
birthday char(8) default '00000000', 
mobile varchar2(12), 
area varchar2(20), 
english number(3) default 0, 
math number(3) default 0, 
korean number(3) default 0);
select * from student;
insert into student values('황지훈', 'M','19961001','01055554444','서울','100','100','100');
insert into student values('황혜린', 'F','19941001','01066664444','서울','100','100','100');

insert into student (name, gender, birthday, mobile, area) values('김용운','M','19960101','01011112222','서울');
insert into student (name, birthday, mobile, area) values('신현우','19960101','01022221111','서울');

/*
DELETE
delete from 테이블명 where 조건문[컬럼명 비교연산자 값]
ex) delete from student where name='John';
*/

delete from student where name='황지훈';
select * from student;
delete from student; --테이블 값 전체삭제>주의

/*
UPDATE
update 테이블명 set 컬럼명1=값1, ...... 컬럼명n=값n where 조건문[컬럼명 비교연산자 값]
ex) update student set mobile='00000000' where name = 'John';

null값일때
where 컬럼명 IS NULL;
where 컬럼명 IS NOT NULL;
*/
update student set mobile='00000000', area='경기' where name = '김용운';
update student set math=100; -- mathe행의 값 전체 100
select * from student;