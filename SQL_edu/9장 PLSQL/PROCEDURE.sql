/* PLSQL PROCEDURE

CREATE OR REPLACE PROCEDURE 프로시저명
    (매개변수1 [IN | OUT | IN OUT] 데이터타입 [:= 디폴트 값], 
    매개변수2 [IN | OUT | IN OUT] 데이터타입 [:= 디폴트 값], ...)
IS
    변수, 상수 등 선언
BEGIN
     실행부
     [RETURN]
[EXCEPTION 예외처리부]
END [프로시저이름];
/

실행방법
SQLPLUS / SQL DEVELOPER 안에서
EXECUTE 프로시저명; <- 실행

삭제방법
DROP PROCEDURE 프로시저명;

*
funtion/procedure 이름(a number, b narchar2 :='', c number:=0)
이름(10,'x',4)
이름(10) == 이름(10,'',0)
이름(10,'x') == 이름(10,'x',0)
이름(10, , 4) 불가 -> 맨 뒷거만 생략가능
*/

-- 입력 : 부서코드. | 출력 : 부서명, 부서인원수, 월급합계
CREATE OR REPLACE PROCEDURE getSum(DID DEPARTMENTS.DEPARTMENT_ID%TYPE)
IS
    strDname DEPARTMENTS.DEPARTMENT_NAME%TYPE := '';
    total_sal number := 0;
    howmany number := 0;
BEGIN
    SELECT DEPARTMENT_NAME
    INTO strDname
    FROM DEPARTMENTS
    WHERE DEPARTMENT_ID = DID;

    SELECT SUM(SALARY), COUNT(*)
    INTO total_sal, howmany
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=DID
    GROUP BY DEPARTMENT_ID;
    dbms_output.put_line('부서명 ['||strDname||'], 총급여 ['||total_sal||'], 총인원수 ['||howmany||']');
END;
/

EXECUTE getSum(90);

select * from user_source where type='PROCEDURE';

-- 코드블럭 내의 함수와 프로시저 / getDname()< 함수 | getSum() <- 프로시저
DECLARE
    strName employees.emp_name%type;
    strDname departments.department_name%type;
BEGIN
    getSum(90); -- 프로시저를 코드블럭 내에서 호출할 때는 EXECUTE문이 필요 없다.
    SELECT EMP_NAME, getDname(DEPARTMENT_ID)
    INTO strName, strDname
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID=70 AND ROWNUM=1;
    DBMS_OUTPUT.PUT_LINE(strName||' - '||strDname);
END;
/

/* 함수를 프로시저로 수정
함수:
*/
create or replace function getDname(did varchar2)
return departments.department_name%type
is
    strName departments.department_name%type := ' ' ;
begin
    select department_name into strName
    from departments
    where did = department_id;
    return strName;
end;
/
drop function getDname;


create or replace procedure getDname
    (did in out number, dname out varchar2)
is
begin
    select department_name into dname
    from departments
    where department_id=did;
    did:=100;
end;
/

declare
    department_name departments.department_name%type;
begin
    getDname(90,department_name);
    dbms_output.put_line('부서명 = '||department_name);
end;
/

declare
    department_name departments.department_name%type;
    dep_id number := 80;
begin
    getDname(dep_id,department_name);
    dbms_output.put_line('부서명 = '||department_name||'['||dep_id||']');
end;
/





-- 실행은 안됨, IN과 OUT의 예시
CREATE OR REPLACE PROCEDURE PRAC(
    a IN NUMBER,
    b OUT NUMBER,
    c IN OUT NUMBER)
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE(a||','||b||','||c);
    a:=1;
    b:=2;
    c:=3;
    DBMS_OUTPUT.PUT_LINE(a||','||b||','||c);
END;
/

DECLARE
    x number:=10;
    y number:=20;
    z number:=30;
begin
    PRAC(x,y,z);
    DBMS_OUTPUT.PUT_LINE(x||','||y||','||z);
end;
/