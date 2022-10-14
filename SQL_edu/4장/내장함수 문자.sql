--BUITIN FUNCTION 문자

-- INITCAP : 첫문자 대문자로
SELECT INITCAP('HWANG JI HOON') FROM DUAL;

-- UPPER : 전부 대문자
SELECT UPPER('HWANG JI HOON') FROM DUAL;

-- LOWER : 소문자
SELECT LOWER('HWANG JI HOON') FROM DUAL;

-- CONCAT : 문자열 연결. ||과 비슷함
SELECT 'GOOD' || 'MORNING' || 'VIETNAM' FROM DUAL;
SELECT CONCAT(CONCAT('GOOD','MORNING'),'VIETNAM') FROM DUAL; --위의 두 문장은 동일결과. 사실상 ||이 더 편리



-- TRIM : 공백제거
SELECT LTRIM('                       World                             ') AS TRM FROM DUAL;
SELECT RTRIM('                        World                                ') AS TRM FROM DUAL;
SELECT TRIM('                         World                          ') AS TRM FROM DUAL;

-- PAD : 문자 채우기
-- PAD(문자열/컬럼명,전체길이,채울문자열)
SELECT LPAD('World',20,' ') AS LP from dual;
SELECT LPAD('World',20,'HELLO') AS LP from dual;
SELECT LPAD('World',20,'HELLO ') AS LP from dual;

-- ★SUBSTR(문자열/컬럼명, 시작인덱스, 길이[생략가능]) : 문자열을 시작인덱스부터 길이만큼 슬라이싱
SELECT SUBSTR('Good Morning',1,4) FROM DUAL;
SELECT SUBSTR(EMP_NAME,1,5) FROM EMPLOYEES;

-- ★INSTR : 어떤 문자열이 어디서부터(인덱스) 나타나는지 찾기. (못찾으면 0)
SELECT INSTR('Good Morning','Morning') from DUAL;
SELECT EMP_NAME, INSTR(EMP_NAME,' ') FROM EMPLOYEES;

SELECT EMP_NAME, SUBSTR(EMP_NAME,1,INSTR(EMP_NAME,' ')-1) FROM EMPLOYEES;
SELECT EMP_NAME, SUBSTR(EMP_NAME,INSTR(EMP_NAME,' ')+1) FROM EMPLOYEES;

/* ★ REPLACE : 문자열에서 부분문자열을 다른 문자열로 대치한다.
    REPLACE(문자열, 바꿀문자열, 대체할 문자열)
*/
SELECT REPLACE('Good Morning', 'Morning', 'Evening') from dual;
SELECT * FROM EMPLOYEES;
SELECT PHONE_NUMBER, REPLACE(PHONE_NUMBER, '.', '-') FROM EMPLOYEES;

-- LENGTH : 문자열 길이 구하기
SELECT EMP_NAME, LENGTH(EMP_NAME) FROM EMPLOYEES;
SELECT LENGTH('홍길동'), LENGTHB('홍길동') FROM DUAL;