-- 트리거

CREATE TABLE exam1(
        id NUMBER PRIMARY KEY,
        name VARCHAR2(20)
);

CREATE TABLE exam2(
        log VARCHAR2(100),
        regdate DATE Default SYSDATE
);

-- 상황 1. 
-- EXAM1 테이블에 간단하게 INSERT
-- EXAM2에 해당 로그 기록을 남김

CREATE OR REPLACE TRIGGER trig_insert_exam2
AFTER
        INSERT ON exam1
BEGIN
        INSERT INTO exam2(log) VALUES('추가작업 - 로그');
END;
/

SELECT * FROM exam2;

INSERT INTO exam1 VALUES(100,'홍길동');

SELECT * FROM exam1;
SELECT * FROM exam2;



-- 상황2
-- 만들어놨던 트리거 수정
CREATE OR REPLACE TRIGGER trig_insert_exam2
AFTER 
    INSERT OR UPDATE OR DELETE ON exam1
DECLARE 
    v_msg VARCHAR2(100);
BEGIN
    -- DML(INSERT, UPDATE, DELETE)시 로그 생성 세분화
    IF INSERTING THEN 
        v_msg := '> 추가 작업 - 로그';
    ELSIF UPDATING THEN 
        v_msg := '> 수정 작업 - 로그';
    ELSIF DELETING THEN 
        v_msg := '> 삭제 작업 - 로그';
    END IF;
    INSERT INTO exam2(log) VALUES (v_msg);
END;

INSERT INTO exam1 VALUES (101, '김길동');
UPDATE exam1 SET name='김길동' WHERE id = 100;
DELETE FROM exam1 WHERE id = 100;

SELECT * FROM exam1;
SELECT * FROM exam2;