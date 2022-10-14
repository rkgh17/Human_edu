/* PLSQL 제어문

FOR문

FOR 인덱스변수 IN [FEVERSE] 초깃값..최종값
LOOP
    처리문;
END LOOP;


CONTINUE문

CONTINUE WHEN 조건

*/

--구구단 2단
DECLARE
BEGIN
    FOR I IN 1..9
    LOOP
        DBMS_OUTPUT.PUT_LINE('2 * ' ||I||' = '||2*I);
    END LOOP;
END;
/

DECLARE
BEGIN
    FOR I IN REVERSE 1..9
    LOOP
        DBMS_OUTPUT.PUT_LINE('2 * ' ||I||' = '||2*I);
    END LOOP;
END;
/