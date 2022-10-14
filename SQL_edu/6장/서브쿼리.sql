/*서브쿼리 : SQL문 안에 하나이상의 SQL문이 들어있는 경우

SELECT 일반서브쿼리
FROM 인라인 뷰
WHERE 중첩 서브쿼리
*/

/*월급이 5천~만 사이의 사번, 이름, 월급 부서명*/
SELECT A.EMPLOYEE_ID, A.EMP_NAME, A.SALARY, B.DEPARTMENT_NAME
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = b.department_id AND A.SALARY BETWEEN 5000 AND 10000;

SELECT A.EMPLOYEE_ID, A.EMP_NAME, A.SALARY, B.DEPARTMENT_NAME
FROM (
    SELECT EMPLOYEE_ID, EMP_NAME, SALARY, DEPARTMENT_ID 
    FROM EMPLOYEES 
    WHERE SALARY BETWEEN 5000 AND 10000) A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID; -- 인라인 뷰

--연관성 없는 서브쿼리
SELECT COUNT(*)
FROM EMPLOYEES
WHERE SALARY>=(SELECT AVG(SALARY) FROM EMPLOYEES);

SELECT COUNT(*)
FROM EMPLOYEES
WHERE DEPARTMENT_ID IN (SELECT DEPARTMENT_ID FROM DEPARTMENTS WHERE PARENT_ID IS NULL);

COMMIT;
ROLLBACK;

SELECT EMPLOYEE_ID, EMP_NAME, JOB_ID
FROM EMPLOYEES
WHERE (EMPLOYEE_ID, JOB_ID) IN (SELECT EMPLOYEE_ID, JOB_ID FROM JOB_HISTORY);

UPDATE EMPLOYEES
SET SALARY=(SELECT AVG(SALARY) FROM EMPLOYEES);

DELETE EMPLOYEES
WHERE SALARY<=(SELECT AVG(SALARY) FROM EMPLOYEES);

/*제품별 매출액 합계 -> 제품명, 매출액*/
--조인
SELECT A.PROD_ID 제품코드, A.PROD_NAME 제품명, SUM(B.AMOUNT_SOLD) 매출액
FROM PRODUCTS A, SALES B
WHERE A.PROD_ID = B.PROD_ID (+)
group by A.PROD_ID, A.PROD_NAME
ORDER BY 제품코드; -- 내 답

SELECT B.PROD_ID, SUM(A.AMOUNT_SOLD)
FROM SALES A, PRODUCTS B
WHERE A.PROD_ID = B.PROD_ID
GROUP BY B.PROD_ID
ORDER BY B.PROD_ID;

/*고객별 매출액 합계 -> 고객명, 매출액*/
SELECT B.CUST_ID 고객ID, B.CUST_NAME 고객명, SUM(A.AMOUNT_SOLD) 매출액
FROM SALES A, CUSTOMERS B
WHERE A.CUST_ID = B.CUST_ID
GROUP BY B.CUST_ID, B.CUST_NAME
ORDER BY 고객ID;

SELECT B.CUST_ID 고객ID, B.CUST_NAME 고객명, SUM(A.AMOUNT_SOLD) 매출액
FROM SALES A, CUSTOMERS B
WHERE A.CUST_ID = B.CUST_ID
GROUP BY B.CUST_ID, B.CUST_NAME
HAVING SUM(A.Amount_sold)<8
ORDER BY 고객ID;

/*상위부서가 없는 부서에 속한 직원의 명단, 부서명
이름1 부서명
이름2 부서명*/
SELECT EMP_NAME 직원명단, DEPARTMENT_NAME 부서명
FROM EMPLOYEES A, (SELECT * FROM DEPARTMENTS WHERE PARENT_ID IS NULL) B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID; -- 내답

select a.emp_name, department_name
from employees a, departments b
where a.department_id in (select department_id from departments where parent_id is null)
and a.department_id = b.department_id;

select a.emp_name, b.department_name
from employees a, (select department_id, department_name
                                from departments
                                where parent_id is null) b
where a.department_id = b.department_id;                         

commit;

--상위부서번호가 90인 사람들의 평균 급여
select a.department_id, avg(salary)
from employees a
where a.department_id in (select department_id
                                    from departments
                                    where parent_id = 90)
group by a.department_id;

update employees a
set a.salary = (select sal
                    from (select b.department_id, avg(c.salary) as sal
                                from departments b, employees c
                                where b.parent_id = 90
                                        and b.department_id = c.department_id
                                group by b.department_id) d
                                where a.department_id = d.department_id)
where a.department_id in (select department_id
                                    from departments
                                    where parent_id = 90);                                