/*
VIEW
복잡한 조건의 select문이 반복적으로 사용될 때, 번거로움을 줄여주기 위해서

create or replace view 뷰명 as select 문장;
문장 >    컬럼명1,.....컬럼명n
            where 조건문

drop view 뷰명;
*/
select emp_name, salary from employees; 
create or replace view worker as select emp_name, salary from employees;
select * from worker;
drop view worker;
select view_name from user_views; -- 사용자가 만든 뷰

/*
INDEX
DATA의 검색속도를 빠르게 하기 위해 사용

create [unique][or replace] index 인덱스명 on 테이블명(컬럼1,......컬럼n);
drop index 인덱스명
*/
create unique index ndx_name on student(name);
select * from user_indexes; --많이 안나옴
select index_name from user_indexes;

/*
SYNONYM 
데이터객체에 별명 붙여주기

create [or replace] synonym 별명 for 테이블;
drop synonym 별명;
*/

/*
SEQUENCE
일련번호 자동 생성기(number generator)

CREATE SEQUENCE 시퀀스명
START WITH 시작숫자
INCREMENT BY 증감숫자
(NO)MINVALUE / MINVALUE 최솟값
(NO)MAXVALUE / MAXVALUE 최대값
(NO)CYCLE / CYCLE

MySQL
: auto increment


시퀀스명.nextval -> 시퀀스번호 증감
select 시퀀스명.currval from dual -> 마지막 시퀀스 번호 확인
*/
drop table newstd;
create table newstd(mid number(2) not null, name varchar2(12));
select * from newstd;
insert into newstd values(1,'John');
insert into newstd values(2,'James');
insert into newstd values(3,'Johanson');

drop table newstd;
create table newstd(mid number(2) not null, name varchar2(12));
create sequence seq_mid start with 1 increment by 1;
drop sequence seq_mid;
insert into newstd values(seq_mid.nextval, 'John');
insert into newstd values(seq_mid.nextval, 'James');
insert into newstd values(seq_mid.nextval, 'Johanson');
insert into newstd values(seq_mid.nextval, 'Jane');
select * from newstd;
select seq_mid.currval from dual;

CREATE SEQUENCE S1 START WITH 10 INCREMENT BY -2 MAXVALUE 10;
SELECT S1.NEXTVAL FROM DUAL; -- 이것만 쳐도 증감적용

/*
SELECT
select 컬럼명1,....,컬럼명n from 테이블명1,.....,테이블명n;
ex)
select * from student; / *student 테이블의 모든 컬럼과 값을 읽어서 보여달라
*/
