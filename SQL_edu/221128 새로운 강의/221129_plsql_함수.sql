-- 함수


-- 나머지를 반환하는 함수
CREATE OR REPLACE FUNCTION my_mod(num1 NUMBER, num2 NUMBER)
    RETURN NUMBER -- 반환 데이터 타입 지정
IS
    -- 변수 선언
    vn_remainder NUMBER := 0; -- 반환할 나머지
    vn_quotient NUMBER :=0; -- 몫
BEGIN
    -- 수식 작성
    vn_quotient := FLOOR(num1/num2);
    vn_remainder := num1-(num2 * vn_quotient);
    
    RETURN vn_remainder;

END;
/

select my_mod(14,3) 나머지 FROM DUAL;

-- 국가명 반환하는 함수
-- 52790(US), 52784(NL)
SELECT * FROM COUNTRIES;

CREATE OR REPLACE FUNCTION fn_get_country_name(p_country_id NUMBER)
    RETURN VARCHAR2
    
IS 
    vs_country_name countries.country_name%TYPE;
BEGIN

    SELECT country_name
    INTO vs_country_name
    FROM countries
    WHERE country_id = p_country_id;
    
        RETURN vs_country_name;
        
END;
/

SELECT 
    fn_get_country_name(52790) 나라1
    , fn_get_country_name(52784) 나라2 
FROM
    dual;

SELECT
    fn_get_country_name(111111) 나라1 -- NULL
    , fn_get_country_name(52784) 나라2 
FROM
    dual;
 
-- null처리   
CREATE OR REPLACE FUNCTION fn_get_country_name(p_country_id NUMBER)
    RETURN VARCHAR2
IS 
    vs_country_name countries.country_name%TYPE;
    vn_count NUMBER := 0;
BEGIN

    SELECT count(*)
    INTO vn_count
    FROM countries
    WHERE country_id = p_country_id;
    
    IF vn_count = 0 THEN
        vs_country_name := '국가없음';
    ELSE
        SELECT country_name
        INTO vs_country_name
        FROM countries
        WHERE country_id = p_country_id;
    END IF;
    
        RETURN vs_country_name;
END;
/
