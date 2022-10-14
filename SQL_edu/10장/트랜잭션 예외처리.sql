/* 트랜잭션
Transaction 시작(암묵적)
- SQLPlus / SQL Developer 실행시
- COMMIT/ROLLBACK 실행후

Transaction 종룍(암묵적)
- SQLPlus / SQL Developer 종료(자동 COMMIT실행)
- SQLPlus / SQL Developer 비정상 종료 (ROLLBAKC)
=> 정전, 윈도우 비정상종료

Transaction에 포함되지 않는 SQL문
: DDL (CREATE / DROP / ALTER / TRANCATE / GRANT / REVOKE)

ROLLBACK
: COMMIT된 상황으로 되돌아감.

SAVEPOINT 레이블
ROLLBACK [to 레이블];
*/

/* 예외처리
DECLARE
BEGIN
    실행문;
    EXCEPTION 
    WHEN 예외종류 THEN
        예외처리 구문;
    ...
    WHEN OTHERS THEN 
        예외처리 구문N;
*/

--오류
DECLARE
    VI_NUM NUMBER :=0;
BEGIN
    VI_NUM := 10/0;
    DBMS_OUTPUT.PUT_LINE('SUCCESS');
    
    EXCEPTION WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('오류발생 - Divided by ZERO');
        DBMS_OUTPUT.PUT_LINE('SQL error code ['||sqlcode||']');
        DBMS_OUTPUT.PUT_LINE('error message ['||sqlerrm||']');
END;
/

--특정 에러
DECLARE
    VI_NUM NUMBER :=0;
BEGIN
    VI_NUM := 10/0;
    DBMS_OUTPUT.PUT_LINE('SUCCESS');
    
    EXCEPTION WHEN zero_divide THEN
        DBMS_OUTPUT.PUT_LINE('오류발생 - Divided by ZERO');
        DBMS_OUTPUT.PUT_LINE('SQL error code ['||sqlcode||']');
        DBMS_OUTPUT.PUT_LINE('error message ['||sqlerrm||']');
    WHEN invalid_number THEN
    
    WHEN  ..... THEN
    
END;
/

/*사용자 정의 예외처리
DECLARE
    myExcept EXCEPTION;
BEGIN
    ...
    IF ~ THEN
        RAISE myExcept; -> 일부로 예외 발생시킴
    END IF;
    .....
    EXCEPTION WHEN ... THEN
        실행문;
    WHEN myExcept THEN
        실행문;
end;
*/