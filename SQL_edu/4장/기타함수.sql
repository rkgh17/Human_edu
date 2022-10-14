-- 기타함수

/*
 ★ DECODE(칼럼명/표현식, 값1, 출력1, ......, 값n, 출력n);
*/
select * from CHANNELS;
select * from SALES; --숫자만 가지곤 무슨의미인지 모름
SELECT DECODE(CHANNEL_ID, 3, 'DIRECT', 2, 'PARTNERS',4,'INTERNET',5,'CATALOG',9,'TELE') FROM SALES;