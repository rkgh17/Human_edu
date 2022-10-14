/* PLSQL 제어문

0번 이상 실행
WHILE문

WHILE 조건
LOOP
    실행문;
END LOOP;

LOOP문

1번 이상 실행
LOOP
    실행문;
    EXIT [WHEN 조건];
END LOOP;

*/

--WHILE

DECLARE
    VN_X INTEGER :=1;
    TOTAL INTEGER:=0;
BEGIN
    WHILE VN_X <= 100
    LOOP
        TOTAL:=TOTAL+VN_X;
        VN_X:=VN_X+1;
    END LOOP;
    DBMS_OUTPUT.PUT_LINE('TOTAL = '||TOTAL);
END;
/

/*구구단 2단 - WHILE*/
DECLARE
    VN_X INTEGER := 2;
    VN_Y INTEGER := 1;
BEGIN
    WHILE VN_Y<10
    LOOP
        DBMS_OUTPUT.PUT_LINE(VN_X|| ' x ' ||VN_Y||' = '||(VN_X*VN_Y));
        VN_Y:=VN_Y+1;
    END LOOP;
END;
/

/*구구단 2단 - LOOP*/
DECLARE
    VN_X INTEGER := 2;
    VN_Y INTEGER := 1;
BEGIN
    LOOP
        DBMS_OUTPUT.PUT_LINE(VN_X|| ' x ' ||VN_Y||' = '||(VN_X*VN_Y));
        EXIT WHEN VN_Y=9;
        VN_Y:=VN_Y+1;
    END LOOP;
END;
/

/*구구단*/
DECLARE
    VN_X INTEGER := 2;
    VN_Y INTEGER := 1;
    V_TMP VARCHAR2(1000);
BEGIN
    V_TMP:=CHR(10);
    WHILE VN_X<10
    LOOP
        WHILE VN_Y<10
        LOOP
        DBMS_OUTPUT.PUT_LINE(VN_X|| ' x ' ||VN_Y||' = '||(VN_X*VN_Y));
        VN_Y:=VN_Y+1;
        END LOOP;
        VN_Y:=1;
        VN_X:=VN_X+1;
        DBMS_OUTPUT.PUT_LINE(V_TMP);
    END LOOP;
END;
/