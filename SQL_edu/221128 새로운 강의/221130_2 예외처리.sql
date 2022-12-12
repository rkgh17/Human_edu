-- 예외처리
-- 374


-- 예외처리 없는 프로시저
CREATE OR REPLACE PROCEDURE no_exception_proc
IS
    vi_num NUMBER := 0;
BEGIN
    vi_num := 10 / 0;
    DBMS_OUTPUT.PUT_LINE('Success!');
END;
/

-- 예외처리 있는 프로시저
CREATE OR REPLACE PROCEDURE exception_proc
IS
    vi_num NUMBER := 0;
BEGIN
    vi_num := 10 / 0;
    DBMS_OUTPUT.PUT_LINE('Success!');
EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('오#류!');
END;
/

--예외처리가 없는 프로시저 실행
DECLARE
BEGIN
    no_exception_proc;
    DBMS_OUTPUT.PUT_LINE('프로시저 실행!');
END;
/ 
-- 오류발생

--예외처리가 있는 프로시저 실행
DECLARE
BEGIN
    exception_proc;
    DBMS_OUTPUT.PUT_LINE('프로시저 실행!');
END;
/ 
-- 실행은 됨



-- 예외처리 업그레이드
CREATE OR REPLACE PROCEDURE exception_proc
IS
    vi_num NUMBER := 0;
BEGIN
    vi_num := 10 / 0;
    DBMS_OUTPUT.PUT_LINE('Success!');
EXCEPTION WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('오#류!');
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR CODE: ' || SQLCODE);
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR MESSAGE: ' || SQLERRM);
END;
/

EXEC exception_proc;


-- 예외처리 ZERO_DIVIDE + 다른오류
CREATE OR REPLACE PROCEDURE exception_proc
IS
    vi_num NUMBER := 0;
BEGIN
    vi_num := 10 / 0;
    DBMS_OUTPUT.PUT_LINE('Success!');
EXCEPTION WHEN ZERO_DIVIDE THEN
    DBMS_OUTPUT.PUT_LINE('ZERO_DIVIDE 오류 발생!');
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR CODE: ' || SQLCODE);
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR MESSAGE: ' || SQLERRM);
    WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('다른 오류 발생!');
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR CODE: ' || SQLCODE);
    DBMS_OUTPUT.PUT_LINE( 'SQL ERROR MESSAGE: ' || SQLERRM);
END;
/
EXEC exception_proc;





CREATE OR REPLACE PROCEDURE no_jobid_proc(
    p_employee_id employees.employee_id%TYPE,
    p_job_id      jobs.job_id%TYPE
)
IS
    vn_cnt NUMBER := 0;
    
BEGIN
    SELECT 1
    INTO vn_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    UPDATE employees
    SET job_id = p_job_id
    WHERE employee_id= p_employee_id;
    
    COMMIT;

    EXCEPTION 
    WHEN NO_DATA_FOUND THEN
                 DBMS_OUTPUT.PUT_LINE(SQLERRM);
                 DBMS_OUTPUT.PUT_LINE(p_job_id ||'에 해당하는 job_id가 없습니다');
    WHEN OTHERS THEN
                 DBMS_OUTPUT.PUT_LINE('기타 에러: ' || SQLERRM);
END;
/

EXEC no_jobid_proc(200, 'SM_JOB4');

SELECT * FROM JOBS;




-- 에러로그 테이블 만들기
CREATE TABLE error_log_tb (
                 error_seq     NUMBER,              -- 에러 시퀀스
                 prog_name     VARCHAR2(80),        -- 프로그램명
                 error_code    NUMBER,              -- 에러코드
                 error_message VARCHAR2(300),       -- 에러 메시지
                 error_line    VARCHAR2(100),       -- 에러 라인
                 error_date    DATE DEFAULT SYSDATE -- 에러발생일자
);
-- 에러로그 시퀀스
CREATE SEQUENCE error_seq
           INCREMENT BY 1
           START WITH 1
           MINVALUE 1
           MAXVALUE 999999
           NOCYCLE
           NOCACHE;

-- 예외가 발생할 때, 예외 로그 테이블에 에러 정보를 입력하는 프로시저를 생성한다. 
CREATE OR REPLACE PROCEDURE error_log_proc (
      p_prog_name error_log_tb.prog_name%TYPE,
      p_error_code error_log_tb.error_code%TYPE,
      p_error_messgge error_log_tb.error_message%TYPE,
      p_error_line error_log_tb.error_line%TYPE)
    IS

    BEGIN
      INSERT INTO error_log_tb (error_seq, prog_name, error_code, error_message, error_line)
           VALUES (error_seq.NEXTVAL, p_prog_name, p_error_code, p_error_messgge, p_error_line );

      COMMIT;
END;

-- 이제 익명 블록이나 다른 프로시저에서 예외가 발생했을 때, 예외처리 부분에서 위 프로시저를 호출한다. 
CREATE OR REPLACE PROCEDURE ins_emp2_proc ( 
                  p_emp_name       employees.emp_name%TYPE,
                  p_department_id  departments.department_id%TYPE,
                  p_hire_month  VARCHAR2  )
IS
   vn_employee_id  employees.employee_id%TYPE;
   vd_curr_date    DATE := SYSDATE;
   vn_cnt          NUMBER := 0;
   
   ex_invalid_depid EXCEPTION; -- 잘못된 부서번호일 경우 예외 정의
   PRAGMA EXCEPTION_INIT(ex_invalid_depid, -20000); -- 예외명과 예외코드 연결
   
   ex_invalid_month EXCEPTION; -- 잘못된 입사월인 경우 예외 정의
   PRAGMA EXCEPTION_INIT (ex_invalid_month, -1843); -- 예외명과 예외코드 연결
   
   -- 예외 관련 변수 선언
   v_err_code error_log_tb.error_code%TYPE;
   v_err_msg error_log_tb.error_message%TYPE;
   v_err_line error_log_tb.error_line%TYPE;
   
BEGIN
	
	 -- 부서테이블에서 해당 부서번호 존재유무 체크
	 SELECT COUNT(*)
	   INTO vn_cnt
	   FROM departments
	  WHERE department_id = p_department_id;
	  
	 IF vn_cnt = 0 THEN
	    RAISE ex_invalid_depid; -- 사용자 정의 예외 발생
	 END IF;
	 
	 -- 입사월 체크 (1~12월 범위를 벗어났는지 체크)
	 IF SUBSTR(p_hire_month, 5, 2) NOT BETWEEN '01' AND '12' THEN
	    RAISE ex_invalid_month; -- 사용자 정의 예외 발생
	 
	 END IF;
	 
	 -- employee_id의 max 값에 +1
	 SELECT MAX(employee_id) + 1
	   INTO vn_employee_id
	   FROM employees;
	 
	 -- 사용자예외처리 예제이므로 사원 테이블에 최소한 데이터만 입력함
	 INSERT INTO employees ( employee_id, emp_name, hire_date, department_id )
              VALUES (vn_employee_id, p_emp_name, TO_DATE(p_hire_month || '01'), p_department_id );
              
     COMMIT;              
              
EXCEPTION WHEN ex_invalid_depid THEN -- 사용자 정의 예외 처리
    v_err_code := SQLCODE;
    v_err_msg  := '해당 부서가 없습니다';
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN ex_invalid_month THEN -- 입사월 사용자 정의 예외 처리
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
WHEN OTHERS THEN
    v_err_code := SQLCODE;
    v_err_msg  := SQLERRM;
    v_err_line := DBMS_UTILITY.FORMAT_ERROR_BACKTRACE;
    ROLLBACK;
    error_log_proc('ins_emp2_proc', v_err_code, v_err_msg, v_err_line);
END;    

-- 에러 내보기
-- 부서번호 잘못 입력
EXEC ins_emp2_proc('HONG', 1000, '201401');

-- 잘못된 월
EXEC ins_emp2_proc('EVAN', 100, '202213');

-- 에러 로그 테이블 확인
SELECT * FROM error_log_tb;