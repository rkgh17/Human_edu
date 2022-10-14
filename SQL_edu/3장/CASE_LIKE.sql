/*
CASE
: SELECT 안에만 사용(WHERE에서 사용 안함)

CASE WHEN 조건1 THEN 값1 WHEN 조건2 THEN 값2 ........ ELSE 기타 값 END
*/

/*
SELECT
select 컬럼명1,....,컬럼명n from 테이블명1,.....,테이블명n;
ex)
select * from student; / *student 테이블의 모든 컬럼과 값을 읽어서 보여달라

컬럼명 AS ALIASNAME
*/
select * from employees;
select employee_id,emp_name,salary from employees where salary>=5000 and salary<10000;
select employee_id,emp_name,salary from employees where salary BETWEEN 5000 and 9999;
select emp_name,manager_id from employees;
select emp_name,manager_id from employees where manager_id is null;
select emp_name, manager_id from employees where manager_id = '100';

COMMIT;

SELECT EMPLOYEE_ID AS EID, SALARY, 
    CASE  WHEN SALARY<=5000 THEN '    C' 
            WHEN SALARY>=5000 AND SALARY<=10000 THEN '    B' 
            ELSE '    A' END AS GRADE
    FROM EMPLOYEES; -- MYSQL은 AS필요없음

CREATE TABLE STS AS
SELECT EMPLOYEE_ID AS EID, EMP_NAME AS ENAME, SALARY FROM EMPLOYEES;
SELECT * FROM STS;

SELECT SALARY FROM EMPLOYEES WHERE NOT SALARY>10000;
select emp_name, salary from employees where salary between 5800 and 7000;

select emp_name, salary from employees where salary in (3000,4000,5000,6000,7000);
select emp_name, salary from employees where salary=any (3000,4000,5000,6000,7000);
select emp_name, salary from employees where salary=some (3000,4000,5000,6000,7000); -- 위 셋은 같은 결과

select emp_name from employees order by emp_name;
select emp_name from employees where emp_name like 'John%';
select emp_name from employees where emp_name like '%son %';
select emp_name from employees where emp_name like '% S%';


/*
LIKE    % : 0개 이상의 문자
         _ : 1개 문자 단일
*/
select emp_name from employees where (emp_name like '%y%' OR emp_name like '%Y%');
select emp_name from employees where REGEXP_LIKE(emp_name, 'Y|y'); -- 위아래 동일