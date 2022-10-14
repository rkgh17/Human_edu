/*
OUTER JOIN

LEFT OUTER
RIGHT OUTER
FULL OUTER
*/

CREATE TABLE A (C1 VARCHAR2(4), C2 VARCHAR2(4));
CREATE TABLE B (C3 VARCHAR2(4), C4 VARCHAR2(4));
InSERT INTO A VALUES('5','c');
InSERT INTO B VALUES('e','y3');
select * from a;
select * from b;

-- 오라클의 외부조인은 (+)
select * from a, b where a.c2=b.c3; -- 누락되는 값이 있음
select * from a, b where a.c2=b.c3 (+); -- LEFT OUTER
select * from a, b where a.c2 (+) = b.c3 ; -- RIGHT OUTER
select * from a FULL OUTER JOIN B on a.c2 = b.c3 ; -- FULL OUTER

SELECT A.EMPLOYEE_ID 사원ID, A.EMP_NAME 사원명, A.MANAGER_ID 상사ID, B.EMP_NAME 상사명
FROM EMPLOYEES A, EMPLOYEES B
WHERE A.MANAGER_ID = B.EMPLOYEE_ID(+)
ORDER BY 사원ID;

/*매니저사번 -> 매니저명, 소속지원숫자*/
select b.emp_name 매니저명, count(*)
from employees a, employees b
where a.manager_id = b.employee_id(+)
group by b.emp_name
order by 매니저명;

/*부서코드 -> 부서명, 소속직원숫자*/
select b.department_name 부서명, b.department_id 부서코드, count(*) 소속직원
from employees a, departments b
where a.department_id=b.department_id(+)
group by b.department_name, b.department_id
order by 부서코드;

/*월급이 5천~만 사이의 사번, 이름, 월급 부서명*/
SELECT A.EMPLOYEE_ID, A.EMP_NAME, A.SALARY, B.DEPARTMENT_NAME
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = b.department_id AND A.SALARY BETWEEN 5000 AND 10000;

/*
ANSI STYLE
SELECT ~
FROM A LEFT OUTER JOIN B
ON A.C2 = B.C4
*/