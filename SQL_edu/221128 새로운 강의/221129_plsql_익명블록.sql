-- PL/SQL


-- 익명블록
-- 기본 구조
SET SERVEROUTPUT ON

DECLARE
    vi_num NUMBER;
    
BEGIN
    vi_num := 100;
    dbms_output.put_line('vi_num = ' || to_char(vi_num));
END;
/

-- 38라인
-- DML
-- 사원 ID가 100인 사원의 이름명, 부서명을 조회해라
DECLARE
    vs_emp_name VARCHAR2(80); -- 사원 변수
    vs_dep_name VARCHAR2(80); -- 부서명 변수
BEGIN

    SELECT A.EMP_NAME, B.DEPARTMENT_NAME
        INTO vs_emp_name, vs_dep_name
    FROM EMPLOYEES A, DEPARTMENTS B
    WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
        AND A.EMPLOYEE_ID = 100;
        
    dbms_output.put_line(vs_emp_name || ' - ' || vs_dep_name);
    
END;
/

-- 두 개의 숫자를 입력받아서 출력하는 예제
ACCEPT p_num1 prompt '첫번째 숫자를 입력하세요'
ACCEPT p_num2 prompt '두번째 숫자를 입력하세요'
DECLARE
    v_sum number(10);
BEGIN
    v_sum := &p_num1 + &p_num2;
    dbms_output.put_line('두 숫자의 합은 : ' || to_char(v_sum));
END;
/


select * from employees;
-- 문제 : 임의의 사원번호를 입력하면 employees 테이블에서 해당 사원번호의 급여를 출력하라
ACCEPT p_id prompt '사원 번호를 입력하시오'

DECLARE
    v_empsal number;
    v_name varchar2(30);
BEGIN
    select salary , emp_name
    into v_empsal, v_name
    from employees 
    where employee_id = &p_id;

    dbms_output.put_line('사원 이름 : ' || v_name || ' / 사원 급여 ' || to_char(v_empsal));
END;
/



-- 홀수짝수
accept p_num prompt '숫자를 입력'
begin
    if mod(&p_num, 2) = 0 then
        dbms_output.put_line
        ('짝수입니다');
    else
        dbms_output.put_line('홀수입니다');
    end if;

end;
/


-- 고소득자, 중간 소득자, 저소득자 구분
accept p_num prompt '사원번호 입력'
DECLARE
    v_empsal employees.salary%TYPE;
    v_name employees.emp_name%TYPE;
BEGIN
    select salary , emp_name
    into v_empsal, v_name
    from employees 
    where employee_id = &p_num;
    
    IF v_empsal > 5000 then
        dbms_output.put_line
        ('사원 이름 : ' || v_name || ' / 사원 급여 : ' || to_char(v_empsal) || '/ 구분 : 고소득자');
    ELSIF v_empsal >= 3000 then
        dbms_output.put_line
        ('사원 이름 : ' || v_name || ' / 사원 급여 : ' || to_char(v_empsal) || '/ 구분 : 중간 소득자');
    ELSE 
        dbms_output.put_line
        ('사원 이름 : ' || v_name || ' / 사원 급여 : ' || to_char(v_empsal) || '/ 구분 : 저소득자');
    END IF;

END;
/

select * from employees;
-- 문제
-- 사원 테이블에서 사원번호가 제일 큰 사원을 찾아낸 뒤
-- 이 번호 +1으로 아래의 사원을 사원테이블에 신규 입력하는 익명 블록을 만들어 보자

DECLARE
    vn_max_empno employees.employee_id%TYPE;
BEGIN
    select max(employee_id) 
        into vn_max_empno
        from employees;
    
    insert into employees (employee_id,
                                emp_name,
                                email,
                                hire_date,
                                department_id)
        values(vn_max_empno + 1, 'Harrison Ford', 'HARRIS', SYSDATE, 50);
        
    commit;
END;
/



-- 반복문

-- loop문 - 3단
DECLARE
    vn_base_num number := 3;
    vn_cnt number := 1;
BEGIN
    LOOP
        dbms_output.put_line
        (vn_base_num || ' * ' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1;
        
        EXIT WHEN vn_cnt>9;
    END LOOP;
END;
/


-- WHILE LOOP
DECLARE
    vn_base_num number := 4;
    vn_cnt number := 1;
BEGIN
    WHILE vn_cnt <= 9
    LOOP
        dbms_output.put_line
        (vn_base_num || ' * ' || vn_cnt || ' = ' || vn_base_num * vn_cnt);
        vn_cnt := vn_cnt + 1;

    END LOOP;
END;
/

-- FOR LOOP
DECLARE
    vn_base_num NUMBER := 5;
BEGIN
    FOR i IN 1..9
    LOOP
        dbms_output.put_line
        (vn_base_num || ' * ' || i || ' = ' || vn_base_num * i);
    END LOOP;
end;
/



-- 구구단
BEGIN
    dbms_output.put_line('-------------');
    
    FOR i IN 2..9
        LOOP
        
        FOR j IN 1..9
            loop
            dbms_output.put_line(i || ' * ' || j || ' = ' || i * j);
            END LOOP;
            
        dbms_output.put_line('-------------');
    END LOOP;
    
END;
/


