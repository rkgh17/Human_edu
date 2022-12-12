-- 문제 1
select * from tb_point;

-- 문제 2
select customer_cd, point_memo, point from tb_point;

-- 문제 3
select customer_cd as 고객코드, point_memo as "포인트 내용", point as 포인트 from tb_point;

-- 문제 4
select customer_cd, customer_nm, email, total_point from tb_customer where total_point < 10000;

-- 문제 5
select customer_cd, seq_no, point from tb_point where customer_cd = '2017053' and seq_no = 2;

-- 문제 6
select * from tb_grade where class_cd ='A' or class_cd ='B'
union
select * from tb_grade where kor >80 and eng > 80 and mat > 80;

-- 문제 7
select * from tb_point where reg_dttm like '2018%' and point between 10000 and 50000;

-- 문제 8
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where birth_day like '198%' and total_point >= 20000;

-- 문제 9
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and birth_day like ('____05%') or birth_day like ('____06%') or birth_day like ('____07%');

-- 문제 10 > 9번 중복
select customer_cd, customer_nm, mw_flg, birth_day, total_point from tb_customer where mw_flg = 'M' and birth_day like ('____05%') or birth_day like ('____06%') or birth_day like ('____07%');

-- 문제 11
select * from tb_item_info where item_cd in ('S01', 'S04', 'S06', 'S10');

-- 문제 12
select * from 
(select * from tb_point where customer_cd = '2017042' or customer_cd = '2018087' or customer_cd = '2019095')
where point_memo like ('%구매%');

-- 문제 13
select * from 
(select * from tb_point where reg_dttm like ('2019%'))
where point_memo like ('%구매%')
order by point desc;

-- 문제 14
select kor, eng, mat, (kor + eng + mat) as 합계 from tb_grade where class_cd = 'B' order by 합계 desc;

-- 문제 15
select sales_dt, product_nm, sum(sales_count) as 총판매수 
from tb_sales 
where sales_dt = '20190802' or sales_dt = '20190803' 
group by sales_dt, product_nm
order by sales_dt, product_nm asc;

-- 문제 16
select distinct product_nm from tb_sales where sales_dt between 20190801 and 20190802;

-- 문제 17
select a.customer_cd, a.customer_nm, a.mw_flg, b.seq_no, b.point_memo, b.point
from tb_customer a inner join tb_point b
on a.customer_cd = b.customer_cd
where a.customer_cd = 2019069;

-- 문제 18
select customer_cd, customer_nm, total_point,
    case
        when total_point between 1000 and 20000 then '실버' 
        when total_point between 20000 and 50000 then '골드'
        when total_point > 50000 then 'VIP'
        else '일반'
        end as 고객_등급
from tb_customer ;

-- 문제 19
select rownum, a.* 
from tb_grade a
where a.class_cd = 'A' or a.class_cd = 'C';

-- 문제 20
select * from
    (select * from tb_customer
    where customer_cd like ('2018%') or customer_cd like ('2019%')
    
    intersect
    
    select * from tb_customer
    where birth_day like ('199%') or birth_day like ('200%')
    )
where phone_number is not null;

-- 문제 21
select 300/60 , 
        to_char(sysdate, 'yyyy-mm-dd') as "오늘 날짜",
        to_char(sysdate + 30 , 'yyyy-mm-dd') as "30일 후 날짜" 
from dual;
        
-- 문제 22
select a.*, b.point_memo
from tb_customer a
    inner join (select * from tb_point where point_memo like ('%이벤트%')) b
    on a.customer_cd = b.customer_cd;