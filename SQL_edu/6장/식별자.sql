/*  식별자

PRIMARY KEY : 기본키
NOT NULL , UNIQUE

FOREIGN KEY : 외래키
*/
CREATE TABLE STD(
NAME VARCHAR2(12) NOT NULL, 
MOBILE VARCHAR2(12) NOT NULL PRIMARY KEY, 
GENDER CHAR(1) DEFAULT 'F', 
CITIZEN_ID CHAR(13) NOT NULL, 
ADDRESS VARCHAR2(50), 
AREA VARCHAR2(12), 
POSTCODE CHAR(5)
);