-- 중첩서브쿼리--

--비상관 서브쿼리--
SELECT * 
FROM 직원
WHERE 연봉 >= (SELECT AVG(연봉) 
                                FROM 직원);
/* SELECT AVG 가 먼저 실행되어 값을 도출한다음 메인쿼리와 비교만 하기때문에 비상관으로 분류*/

--상관 서브쿼리--
SELECT * 
FROM 직원 A
WHERE 연봉 = (SELECT MIN(연봉)
                            FROM 직원
                            WHERE 부서ID = A.부서ID);
                            
SELECT *
FROM 직원 A
WHERE 연봉 = (SELECT MAX(연봉)
FROM 직원
WHERE 부서ID = A.부서ID);

SELECT *
FROM 직원 
WHERE 입사일시 = (SELECT MAX(입사일시)
FROM 직원);

SELECT *
FROM 직원
WHERE 연봉 = (SELECT MAX(연봉)
FROM 직원);

--단일행/다중행 연산자--
--단일행 : =, >=, <. !=
--다중행: IN, ANY, ALL, EXISTS, NOT EXISTS 등등...

SELECT *
FROM 직원
WHERE 연봉 IN (
                            SELECT MAX(연봉)
                            FROM 직원
                            GROUP BY 부서ID);
                            

SELECT 직원ID, 연봉
FROM 직원
WHERE 연봉 >= ANY(5000, 7500, 2800);

SELECT 직원ID, 연봉
FROM 직원
WHERE 연봉 >= ALL (5000, 7500, 2800);

SELECT 이름, 연봉
FROM 직원
WHERE 연봉 IN (SELECT 연봉
                            FROM 직원
                            WHERE 직원ID = 'A0006');
                            
SELECT 직원ID, 이름
FROM 직원 A
WHERE EXISTS (
                                SELECT 1
                                FROM 직원연락처
                                WHERE 직원ID = A.직원ID);
                                
SELECT 직원ID, 이름
FROM 직원  A
WHERE 직원ID IN (SELECT 직원ID
                                FROM 직원연락처
                                WHERE 직원ID = A.직원ID);
                                

                        
