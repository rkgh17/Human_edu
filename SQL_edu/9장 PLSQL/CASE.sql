/* PLSQL 제어문

CASE

<1>
CASE 표현식
    WHEN 결과1 THEN
            처리문1;
    WHEN 결과2 THEN
            처리문2;
    ...
    ELSE
            기타 처리문;
END CASE;

<2>
CASE WHEN 표현식1 THEN
                처리문1;
        WHEN 표현식2 THEN
                처리문2;
        ...
        ELSE
                기타 처리문;
END CASE;
*/

DECLARE
    VN_SALARY EMPLOYEES.SALARY%TYPE;
    VN_DID departments.department_id%TYPE;
BEGIN
    SELECT SALARY INTO VN_SALARY
    FROM EMPLOYEES
    WHERE DEPARTMENT_ID = 90 AND ROWNUM=1;
    
    DBMS_OUTPUT.PUT_LINE(VN_SALARY);
    
    CASE
        WHEN VN_SALARY BETWEEN 1 AND 3000 THEN
            DBMS_OUTPUT.PUT_LINE('낮음');
        WHEN VN_SALARY BETWEEN 3001 AND 6000 THEN
            DBMS_OUTPUT.PUT_LINE('중간');
        WHEN VN_SALARY BETWEEN 6001 AND 10000 THEN
            DBMS_OUTPUT.PUT_LINE('높음');
        ELSE
            DBMS_OUTPUT.PUT_LINE('최상위');
    END CASE;
END;
/


