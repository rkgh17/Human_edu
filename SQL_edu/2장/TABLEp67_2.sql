/*
CRUD

drop table : schema+data가 날아감, 복구불능
truncate table : data만 날아감, 복구불능
delete table : data만 날아감, 복구가능
*/
select table_name from user_tables; -- 유저가 만든 테이블 리스트

/*
UPDATE(ORACLE)
1. 테이블명 수정 : rename 테이블명 to 바꿀테이블명

2. (스키마)컬럼 수정
    컬럼이름 추가 : ALTER TABLE 테이블명 ADD /추가할 컬럼 타입/
    컬럼 삭제 : ALTER TABLE 테이블명 DROP COLUMN /삭제할 컬럼명/
    컬럼이름 변경 : ALTER TABLE 테이블명 RENAME COLUMN 컬럼명 TO 새컬럼명 - 타입은 그대로
    컬럼타입 변경 : ALTER TABLE 테이블명 MODIFY 기존컬럼명 /바꿀데이터타입/
    

UPDATE(MySQL)
MySQL은 컬럼 이름/타입/길이 수정이 ORACLE보다 간단
    컬럼 변경 : ALTER TABLE 테이블명 CHANGE 컬럼명 /새컬럼명 새타입 새길이/
    ex) alter table std change mobile phone varchar(12) -> mobile컬럼을 varchar(12)인 phone으로 바꿈
        alter table std change mobile phone phone char(24) -> 컬럼 수정
*/
 
CREATE TABLE STUDENT(
NAME VARCHAR2(12),
GENDER CHAR(1)
);
RENAME STUDENT TO STD;
select * from std;