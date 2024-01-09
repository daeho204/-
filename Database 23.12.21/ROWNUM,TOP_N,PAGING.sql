--1st SQL DEVELOPER 인사담당자
SELECT 직원ID, 이름, 연봉
FROM 직원
WHERE 직원ID = 'A0005';

UPDATE 직원 SET 연봉 = 7000 WHERE 직원ID = 'A0005';
--TCL pg291--
COMMIT;
SELECT 직원ID, 연봉
FROM 직원;

--ROWNUM--
SELECT ROWNUM AS RN, 직원ID, 이름
FROM 직원
WHERE ROWNUM <= 3;

SELECT *
FROM(
    SELECT ROWNUM AS RN,
    직원ID,
    이름
    FROM 직원)
WHERE RN = 3;


--TOP-N--
SELECT * 
FROM(
    SELECT *
    FROM 직원
    WHERE 연봉 IS NOT NULL
    ORDER BY 연봉 DESC)
WHERE ROWNUM <= 5;

SELECT *
FROM(
    SELECT *
    FROM 직원
    WHERE  연봉 IS NOT NULL
    ORDER BY 연봉)
WHERE ROWNUM <= 3;

SELECT *
FROM(
    SELECT *
    FROM 직원
    WHERE 입사일시 IS NOT NULL
    ORDER BY 입사일시 DESC)
WHERE ROWNUM <= 3;

--페이징--

SELECT *
FROM(
    SELECT *
    FROM 게시판
    ORDER BY 작성일시 DESC)
WHERE ROWNUM <= 20;

SELECT *
FROM(
    SELECT ROWNUM AS RN, A.*
        FROM(
        SELECT *
        FROM 게시판
        ORDER BY 작성일시 DESC) A
    WHERE ROWNUM <= 40)
WHERE RN >= 21;

SELECT *
    FROM(
        SELECT ROWNUM AS RN, A.*
            FROM(
            SELECT *
            FROM 게시판
            ORDER BY 작성일시 DESC) A
        WHERE ROWNUM <= 60)
WHERE RN >= 40;

