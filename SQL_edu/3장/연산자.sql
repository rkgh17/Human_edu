/*
연산자

-산술연산자 : +, -, * (asterisk), /, || (문자열 연결연산자)
-비교연산자 : =, !=, <>, <, >=, <=m ISNULL, is not null
-논리연산자 : and, or, not
-집합연산자 : union/union all, intersect, minus : 합집합(중복여부), 교집합, 차집합

컬럼명 BETWEEN A AND B -> 컬럼명>=A AND 컬럼명<=B
컬럼명 IN(값1, ..... , 값n) -> 컬럼명=값1 or ....... or 컬럼명 = 값n
                        -> 컬럼명 = any(값1, ..., 값n)
*/
select 3+5 from dual;
select 3-5 from dual;
select 3*5 from dual;
select 3/5 from dual;

select salary from employees;
select salary, salary*1.1 from employees;
select emp_name,salary from employees where salary*2>20000;
select '['||emp_name||']'
from employees;

select salary from employees;
select * from employees where salary is not null;
select emp_name, salary, hire_date from employees where salary<5000 and hire_date< '05/01/01';


/*
SELECT
select 컬럼명1,....,컬럼명n from 테이블명1,.....,테이블명n;
ex)
select * from student; / *student 테이블의 모든 컬럼과 값을 읽어서 보여달라
*/
