SELECT * 
FROM 직원;
SELECT * 
FROM 부서;

SELECT 직원ID,  패스워드, 이름, 성별, 연봉
FROM 직원
WHERE 성별 = '남';

SELECT 직원ID, 입사일시, 주민등록번호, 연봉, 부서ID
FROM 직원;

SELECT 부서ID, 부서명, 근무지
FROM 부서;

SELECT 직원ID, 구분코드, 연락처
FROM 직원연락처;


SELECT * 
FROM 직원;
SELECT * 
FROM 직원주소;

SELECT * 
FROM 직원연락처;

SELECT DISTINCT 직원ID
FROM 직원연락처
ORDER BY 직원ID;

SELECT *
FROM 직원
WHERE 나이 IS NOT NULL;

SELECT *
FROM 직원
WHERE 입사일시 IS NULL;

SELECT 입사일시, COALESCE(입사일시, NULL, 22/03/21)
FROM 직원;

SELECT 입사일시, DECODE(입사일시, '22/03/21', '정답', '오답')
FROM 직원;

SELECT 직원ID, 패스워드, NVL(나이, 20) AS 나이
FROM 직원;

SELECT 직원ID, 성별, 연봉, DECODE(성별, '남', '남성입니다', '여성입니다') AS 남녀확인
FROM 직원;

SELECT 직원ID, 성별, 연봉, DECODE(성별,'여', '여성입니다', '남성입니다') AS 남녀확인
FROM 직원;

SELECT 직원ID, 주민등록번호, SUBSTR(주민등록번호, 0,6) AS 생년원일
/*SELECT 직원ID, 주민등록번호, SUBSTR(주민등록번호, 1,6) AS 생년원일*/
FROM 직원;

SELECT 직원ID, 구분코드, 연락처, REPLACE(연락처, '-', '') AS 연락처번호만
FROM 직원연락처;

SELECT ROUND (3.1415, 3), CEIL(3.1415), FLOOR(3.1415), TRUNC(3.1415,3), ABS(-3.1415)
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'HH24:MI:SS') FROM DUAL;


