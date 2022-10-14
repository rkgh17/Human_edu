--BUITIN FUNCTION 숫자

--ABS(숫자) : 절대값

SELECT ABS(-33.14) FROM DUAL;
SELECT * FROM EMPLOYEES WHERE ABS(SALARY) > 3000;

-- CEIL(n) : n과 같거나 가장 큰 정수를 반환. 큰 숫자중 가장 작은 정수 찾기

-- FLOOR(n) : n보다 작거나 가장 큰 정수를 반환. 작은 숫자 중 가장 큰 정수 찾기

/* ROUND(n, i) : n을 소수점기준(i+1)번째에서 반올림. i는 생략가능
                    i가 음수면 소수점 기준으로 왼쪽 i번째에서 반올림*/

-- TRUNC(n1, n2) : 소숫점 n2자리까지 무조건 자름

-- POWER(n) : 제곱 .ex)
SELECT POWER(2,3) FROM DUAL;

-- SQUT(n) : 제곱근
SELECT SQRT(4) FROM DUAL;

/*MOD()/REMAINDER() : 나머지
MYSQL에선 %

REMAINDER는 연산방식이 좀 달라 안쓰임
*/
SELECT MOD(19,4), REMAINDER(19,4) FROM DUAL;

