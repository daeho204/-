--SUBQUERY--
SELECT A.직원ID, A.연봉, A.부서ID, (
    SELECT 부서명
    FROM 부서
    WHERE 부서ID = A.부서ID) AS 부서명
FROM 직원 A
WHERE 직원ID BETWEEN 'A0001' AND 'A0006';

SELECT A.직원ID, A.연봉, A.부서ID, B.부서명
FROM 직원 A LEFT OUTER JOIN 부서 B ON (A.부서ID = B.부서ID)
WHERE A.직원ID BETWEEN 'A0001' AND 'A0006'
ORDER BY A.부서ID;

SELECT A.직원ID, A.연봉, A.부서ID, (SELECT 부서ID
                                                            FROM 부서
                                                            WHERE A.부서ID = 부서ID) AS 부서명
FROM 직원 A
WHERE A.직원ID BETWEEN 'A0001' AND 'A0006';

SELECT A.직원ID, A.이름, A.주민등록번호, (SELECT 연락처
                                                                        FROM 직원연락처
                                                                        WHERE A.직원ID = 직원ID) AS 휴대폰번호
FROM 직원 A
WHERE A.직원ID BETWEEN 'A0006' AND 'A0010';

SELECT A.직원ID, A.이름, A.주민등록번호, B.연락처 AS 휴대폰번호
FROM 직원 A LEFT OUTER JOIN 직원연락처 B ON (A.직원ID = B.직원ID)
AND B.구분코드 = '휴대폰'
WHERE A.직원ID BETWEEN 'A0006' AND 'A0010'
ORDER BY A.직원ID;

SELECT * FROM 직원;

SELECT *
FROM (SELECT *
            FROM 직원
            ORDER BY 나이 ASC)
WHERE ROWNUM <= 3;

--ORACLE 에서는 NULL이 가장 큰값으로 취급 / 다른 데베에서는 가장 작은 값으로 취급--

