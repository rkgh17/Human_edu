-- day2afternoon.sql
--92line

-- 프로시저

CREATE OR REPLACE PROCEDURE my_new_job_proc(
            p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE )
IS

BEGIN
	
	INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	          VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);
	          
	COMMIT;
	
	
END;
/

DROP PROCEDURE my_new_job_proc;

-- 프로시저 실행
select * from jobs;
EXEC my_new_job_proc('SM_JOB1', 'Sample JOB1', 1000, 5000);
delete from jobs where min_salary = 1000;
rollback;

-- 프로젝트 할때 스프링과 연계해서 사용하는거 고민해보기


-- 프로시저 수정
CREATE OR REPLACE PROCEDURE my_new_job_proc(
            p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE )
IS
    vn_cnt NUMBER := 0;
BEGIN

    SELECT COUNT(*) INTO vn_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    -- cnt가0 이다
	IF vn_cnt = 0 THEN
        INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
        VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);   

    ELSE
        UPDATE jobs
        SET job_title = p_job_title,
             min_salary = p.min_sal,
             max_salary = p_max_sal,
             update_date = SYSDATE
        WHERE job_id = p_job_id;
        
    END IF;
    
    COMMIT;

END;
/
EXEC my_new_job_proc('SM_JOB1', 'Sample JOB1', 1000, 5000);
EXEC my_new_job_proc('SM_JOB1', 'Sample JOB1', 1500, 5000);



-- 디폴트 값
CREATE OR REPLACE PROCEDURE my_new_job_proc(
            p_job_id    IN JOBS.JOB_ID%TYPE,
            p_job_title IN JOBS.JOB_TITLE%TYPE,
            p_min_sal   IN JOBS.MIN_SALARY%TYPE := 10,
            p_max_sal   IN JOBS.MAX_SALARY%TYPE := 1000 )
IS
    vn_cnt NUMBER := 0;
BEGIN

    SELECT COUNT(*) INTO vn_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    -- cnt가0 이다
	IF vn_cnt = 0 THEN
        INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
        VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, SYSDATE, SYSDATE);   

    ELSE
        UPDATE jobs
        SET job_title = p_job_title,
             min_salary  = p_min_sal,
             max_salary = p_max_sal,
             update_date = SYSDATE
        WHERE job_id = p_job_id;
        
    END IF;
    
    COMMIT;

END;
/
EXEC my_new_job_proc('SM_JOB1', 'Sample JOB1');
select * from jobs;



-- IN / OUT / IN OUT 매개변수 이해
-- 270
SET SERVEROUTPUT ON

CREATE OR REPLACE PROCEDURE my_parameter_test_proc (
               p_var1        VARCHAR2,
               p_var2 OUT    VARCHAR2,
               p_var3 IN OUT VARCHAR2 )
IS

BEGIN
	 DBMS_OUTPUT.PUT_LINE('p_var1 value = ' || p_var1);
	 DBMS_OUTPUT.PUT_LINE('p_var2 value = ' || p_var2);
	 DBMS_OUTPUT.PUT_LINE('p_var3 value = ' || p_var3);
	 
	 p_var2 := 'B2';
	 p_var3 := 'C2';
	
END;
/


-- 익명블록 테스트
DECLARE 
   v_var1 VARCHAR2(10) := 'A';
   v_var2 VARCHAR2(10) := 'B';
   v_var3 VARCHAR2(10) := 'C';
BEGIN
	 my_parameter_test_proc (v_var1, v_var2, v_var3);
	 
	 DBMS_OUTPUT.PUT_LINE('v_var2 value = ' || v_var2);
	 DBMS_OUTPUT.PUT_LINE('v_var3 value = ' || v_var3);
END;
/

--my_parameter_test_proc는 세 개의 매개변수를 가지고 있다.
--(DBMS_OUTPUT.PUT_LINE('p_var1 value = ' || p_var1);) 는
--    (v_var1 VARCHAR2(10) := 'A';) 그대로 A 출력
--    
--(DBMS_OUTPUT.PUT_LINE('p_var2 value = ' || p_var2);) 는 (p_var2 OUT)이므로 익명블록의 B값이 OUT
--OUT 후에 프로시저에서 값을 B2로 할당했으므로 (DBMS_OUTPUT.PUT_LINE('v_var2 value = ' || v_var2);)에서는 B2출력
--
--(DBMS_OUTPUT.PUT_LINE('p_var3 value = ' || p_var3);) 는 (p_var3 IN OUT) 이므로 익명블록 값(C)을 그대로 출력하고
-- OUT한다. 마찬가지로 OUT 후에 프로시저에서 값을 C2로 할당했으므로 
-- (DBMS_OUTPUT.PUT_LINE('v_var3 value = ' || v_var3);)에서는 C2 출력



-- 리턴문
-- 300
-- 프로시저에서의 RETURN문은 종료를 의미
CREATE OR REPLACE PROCEDURE my_new_job_proc(
    p_job_id IN jobs.job_id%TYPE,
    p_job_title IN jobs.job_title%TYPE,
    p_min_sal IN jobs.min_salary%TYPE := 10,
    p_max_sal IN jobs.max_salary%TYPE := 100
)
IS
    vn_cnt NUMBER := 0;
    vn_cur_date jobs.update_date%TYPE := SYSDATE;
BEGIN
    -- 1000보다 작으면 메시지 출력 후 빠져나가기
    IF p_min_sal <1000 THEN
        DBMS_OUTPUT.PUT_LINE('최소 급여값은 1000 이상이어야 함');
        RETURN;
    END IF;
    
	SELECT COUNT(*)
	  INTO vn_cnt
	  FROM JOBS
	 WHERE job_id = p_job_id;
	 
	-- 없으면 INSERT 
	IF vn_cnt = 0 THEN 
	
	   INSERT INTO JOBS ( job_id, job_title, min_salary, max_salary, create_date, update_date)
	             VALUES ( p_job_id, p_job_title, p_min_sal, p_max_sal, vn_cur_date, vn_cur_date);
	             
	ELSE -- 있으면 UPDATE
	
	   UPDATE JOBS
	      SET job_title   = p_job_title,
	          min_salary  = p_min_sal,
	          max_salary  = p_max_sal,
	          update_date = vn_cur_date
	    WHERE job_id = p_job_id;
	
    END IF;
  
	          
	COMMIT;    
END;
/

EXEC my_new_job_proc('SM_JOB1', 'Sample JOB1', 999, 50000);
select * from jobs;

