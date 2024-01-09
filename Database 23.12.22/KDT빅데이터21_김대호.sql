--1--
/*
FUNNYDB 가 세션을 만들 권한이 없기때문에 권한부여
GRANT CREATE SESSION TO FUNNYDB; 
*/

--2--
/*
조인쿼리의 FROM 절에서 ALIAS 를 CUST_INFO A 
 , CUST_TEL_INFO B 로 설정했기때문에 
 WHERE절에서도 CUST_TEL_INFO.CUST_NO 가 아닌 B.CUST_INFO 로 사용해야한다 */
 
 --3--
 /* WHERE 문에서는 집계함수를 사용할 수 없기때문에 평균이 6000보다 큰지 적은지를 확인할 AVG(연봉) > 6000 이 사용불가.
    때문에 HAVING 절에서 평균연봉이 6000이 넘는지 여부를 확인하기위해 WHERE절에 연봉과 부서가 NULL일수 없다고 설정 후,
    부서별 평균연봉치를 알기위해 부서ID로 GROUP 하고 HAVING절에서 집계함수를 사용해 연봉평균을 구한후 6000보다 큰지 작은지 비교하여
    값을 출력.
    
    SELECT 부서ID, SUM(연봉) AS 합계, AVG(연봉) AS 평균, COUNT(*) AS 직원수
    FROM 직원 
    WHERE 연봉 IS NOT NULL
    AND 부서ID IS NOT NULL
    GROUP BY 부서ID
    HAVING AVG(연봉) > 6000
    ORDER BY 부서ID;
*/

--4--
/* SQL의 실행순서 상 ORDER BY보다 WHERE절이 먼저 실행되기에
   가장 고액의 연봉순으로 정렬 후 상위 3명의 정보를 꺼내오는것이 아닌
   직원테이블의 1-3 튜플을 들고온 후 연봉의 내림차순으로 정렬하기때문에
   TOP-N을 사용하여 연봉의 고액부터 내림차순으로 정렬 후 1-3 튜플을 가져오는식으로 실행순서를 바꿔야함.
   
SELECT ROWNUM, 이름, 연봉
FROM (         
                    SELECT 이름,연봉
                    FROM 직원
                    WHERE 연봉 IS NOT NULL
                    ORDER BY 연봉 DESC)
WHERE ROWNUM <= 3
ORDER BY ROWNUM;
   
*/


--5--

/* 
SQL 문이 실행되는 순서는
FROM절 -> WHERE절 -> GROUP BY절 -> HAVING절 -> SELECT절 -> ORDER BY절 이다
*/

--6--
/* 

SELECT A.직원ID, A.이름, B.부서명
FROM 직원 A LEFT OUTER JOIN 부서 B ON (A.부서ID = B.부서ID);

*/

--7--
/*
7.1
CREATE TABLE PEOPLE(
NAME VARCHAR2(20) NOT NULL,
AGE NUMBER(5)
);

7.2
ALTER TABLE PEOPLE ADD CONSTRAINT PK_NAME_PEOPLE PRIMARY KEY(NAME);

7.3
INSERT INTO PEOPLE(NAME, AGE) VALUES ('박희순', 40);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('김태희', 25);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('마동석', NULL);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('김희연', 40);

7.4
SELECT NAME, AGE
FROM PEOPLE 
WHERE AGE IS NULL
OR AGE = 40;
*/

--8--
/*
8-1 계정이 OTHERSERVICE 인 계정을 추가하되, 비밀번호를 12345 로 설정하시오.
CREATE USER OTHERSERVICE IDENTIFIED BY 12345;

8-2. OTHERSERVICE 계정이 VIEW와 SESSION을 생성할 수 있도록 권한을 부여하세요. 
GRANT CREATE VIEW, CREATE SESSION TO OTHERSERVICE;

8-3. OTHERSERVICE 계정에게서 VIEW를 생성할 수 있는 권한을 회수하세요.

REVOKE CREATE VIEW FROM OTHERSERVICE;

8-4. 다음 ROLE 권한을 OTHERSERVICE 계정에게 부여하시오. 
 (ROLE의 이름은 ‘ROLE2’로 설정하세요)
 [ ROLE 은 다음을 추가하세요 : PROCEDURE 생성 권한, CLUSTER 생성 권한 ]
 CREATE ROLE ROLE2;
 GRANT CREATE PROCEDURE, CREATE CLUSTER TO ROLE2;
 GRANT ROLE2 TO OTHERSERVICE;
 */



















