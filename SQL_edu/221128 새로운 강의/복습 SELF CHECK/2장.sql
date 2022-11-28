-- 2-1
create table ORDERS (
    ORDER_ID NUMBER(12,0) PRIMARY KEY,
    ORDER_DATE DATE,
    ORDER_MODE VARCHAR2(8 BYTE) CONSTRAINT order_mode_check CHECK (ORDER_MODE in ('direct', 'online')),
    CUSTOMER_ID NUMBER(6,0),
    ORDER_STATUS NUMBER(2,0),
    ORDER_TOTAL NUMBER(8,0),
    SALES_REP_ID NUMBER(6,0),
    PROMOTION_ID NUMBER(6,0) default 0
    );
INSERT INTO ORDERS VALUES(1,'2015-11-11','direct',1,1,1,1,1);
select * from ORDERS;
drop table ORDERS;

-- 2-2
create table ORDER_ITEMS(
    ORDER_ID NUMBER(12,0),
    LINE_ITEM_ID NUMBER(3,0),
    PRODUCT_ID NUMBER(3,0),
    UNIT_PRICE NUMBER(8,2),
    QUANTITY NUMBER(8,0) DEFAULT 0,
    CONSTRAINT PK PRIMARY KEY(ORDER_ID, LINE_ITEM_ID)
    );
INSERT INTO ORDER_ITEMS VALUES(1,1,1,1,1);
INSERT INTO ORDER_ITEMS VALUES(1,0,1,1,1);
SELECT * FROM ORDER_ITEMS;
DROP TABLE ORDER_ITEMS;

-- 2-3
CREATE TABLE PROMOTIONS(
    PROMO_ID NUMBER(6,0) PRIMARY KEY,
    PROMO_NAME VARCHAR2(20)
);
INSERT INTO PROMOTIONS VALUES(1,1);
INSERT INTO PROMOTIONS VALUES(1,1);
SELECT * FROM PROMOTIONS;
DROP TABLE PROMOTIONS;

-- 2-4
--NUMBER는 38자리가 최대이므로 FLOAT(N)의 N를 십진수 변환했을때 38을 넘으면 안됨. 그래서 0.30103을 곱하는듯?

-- 2-5
CREATE SEQUENCE ORDERS_SEQ
INCREMENT BY 1 
 START WITH 1000
MINVALUE 1
MAXVALUE 99999999;

SELECT ORDERS_SEQ.NEXTVAL FROM DUAL;
SELECT ORDERS_SEQ.CURRVAL FROM DUAL;

DROP SEQUENCE ORDERS_SEQ;