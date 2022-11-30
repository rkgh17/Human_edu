-- SQL subquery 연습문제

-- 문제1 2015년 평균 기대수명보다 높은 모든 정보
select *
from populations 
where 
    year=2015 
    and 
    life_expectancy > (select avg(life_expectancy) from populations);
    
-- 문제2  countries2 테이블에 있는 capital과 매칭되는 cities테이블의 정보 조회
select b.name, b.country_code, b.urbanarea_pop
from countries2 a inner join cities b
on a.capital = b.name;

-- 문제3 
select code, inflation_rate, unemployment_rate 
from economies;

select code, inflation_rate, unemployment_rate 
from economies 
order by inflation_rate asc;

select * 
from countries2
where (gov_form, country_name) not in (select gov_form, country_name 
                                       from countries2 
                                       where gov_form = 'Constitutional Monarchy' 
                                       or
                                       country_name like ('%Republic%'));

-- 문제4
select * from countries2;
select * from economies;

select continent, country_name, inflation_rate from (select a.country_name, a.continent, b.inflation_rate from countries2 a
                                                     inner join economies b
                                                     on a.code = b.code
                                                     where b.year = 2015) k
where (continent, inflation_rate) in (select continent, max(inflation_rate) as "Inflation_rate" 
                                      from
                                        (select a.country_name, a.continent, b.inflation_rate from countries2 a
                                         inner join economies b
                                         on a.code = b.code
                                         where b.year = 2015)
                                         group by continent);


-- 윈도우 함수 연습문제

-- 문제1
select Rownum as "ROW_N", A.* 
from summer_medals A ;

-- 문제2
select rownum as "ROW_N", a.* 
from (select * 
      from summer_medals 
      order by year asc) a;

-- 문제3

-- 3-1
WITH RANKING AS(
  select ATHLETE, COUNT(MEDAL) AS "MEDAL_COUNT" FROM summer_medals
  GROUP BY ATHLETE
  ORDER BY "MEDAL_COUNT" ASC)

SELECT * FROM RANKING;

-- 3-2
WITH RANKING AS(
  select ATHLETE, COUNT(MEDAL) AS "MEDAL_COUNT" FROM summer_medals
  GROUP BY ATHLETE
  ORDER BY "MEDAL_COUNT" ASC)

SELECT ATHLETE, MEDAL_COUNT, DENSE_RANK() OVER (ORDER BY MEDAL_COUNT DESC) MEDAL_RANK
FROM RANKING;

-- 문제 4
SELECT
    Year,
    ATHLETE AS champion,
    LAG(ATHLETE) OVER(ORDER BY Year) AS CHAMP_PREV
  FROM summer_medals
  WHERE
    Discipline = 'Weightlifting' AND
    Event = '69KG' AND
    Gender = 'Men' AND
    Medal = 'Gold';