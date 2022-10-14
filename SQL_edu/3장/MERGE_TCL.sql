/*
MERGE : 조건에 맞는 데이터가 없으면 INSERT, 있으면 UPDATE (ORACLE ONLY)
MySQL의 replace와 비슷
*/

/*
COMMIT / ROLLBACK

drop table : schema+data가 날아감, 복구불능
truncate table : data만 날아감, 복구불능
delete from : data만 날아감, 복구가능
*/
create table newstd(mid number(2) not null, name varchar2(12));
insert into newstd values(seq_mid.nextval, 'James');
insert into newstd values(seq_mid.nextval, 'Johanson');
insert into newstd values(seq_mid.nextval, 'Jane');
COMMIT;
DELETE FROM NEWSTD;
SELECT * FROM newstd;
ROLLBACK;
truncate table newstd; -- 롤백해도 없음
drop table newstd; -- 롤백해도 없음

/*
의사컬럼
ROWNUM
*/
SELECT ROWNUM,ROWID,EMPLOYEE_ID,EMP_NAME FROM EMPLOYEES;