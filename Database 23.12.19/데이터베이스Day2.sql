SELECT 직원ID, 이름, 나이, 입사일시
FROM  직원
WHERE 연봉>9000;

SELECT 직원ID, 패스워드, 이름, 성별, 나이, 입사일시, 주민등록번호, 연봉, 부서ID
FROM 직원
WHERE 이름 = '이현정';

SELECT 직원ID, 구분코드, 연락처
FROM 직원연락처
WHERE  연락처 = '010-1231-1234';

SELECT 부서명
FROM 부서
WHERE 근무지 = '서울';

SELECT 주소 
FROM 직원주소
WHERE 직원ID = 'A0007';

SELECT 연락처 
FROM 직원연락처
WHERE 직원ID = 'A0001'
AND 구분코드 = '집전화';

SELECT  *
FROM  직원
WHERE 성별 = '여'
AND 나이 >= 30
AND 부서ID = 'D003';

SELECT *
FROM 직원
 WHERE 직원ID = 'A0001'
 OR 직원ID = 'A0005'
 OR 직원ID = 'A0007';
 
SELECT *
FROM 직원
WHERE 직원ID IN ('A0001', 'A0002');

SELECT *
FROM  직원
WHERE 이름 LIKE ('김%');

SELECT 직원ID, 이름, 나이
FROM 직원
WHERE 이름 LIKE ('%철%');

SELECT 직원ID, 연봉, 입사일시
FROM 직원 
WHERE 연봉 BETWEEN 7000 AND 9000;

SELECT *
FROM 직원주소
WHERE 주소 LIKE('동구%');

SELECT *
FROM 직원
WHERE 입사일시 LIKE('%/11/%');

SELECT *
FROM 직원
WHERE 입사일시 LIKE('__/11/__');

SELECT *
FROM 직원
WHERE TO_CHAR(입사일시, 'MM') = '11';

--JOIN 이란...

SELECT * 
FROM 직원 A, 부서 B
WHERE A.부서ID = B.부서ID;

SELECT *
FROM 직원 A 
FULL OUTER JOIN 부서 B ON
A.부서ID = B.부서ID; 

SELECT *
FROM 직원 A, 직원연락처 B
WHERE A.직원ID = B.직원ID;

SELECT A.직원ID, A.이름, B.주소
FROM 직원 A, 직원주소 B
WHERE A.직원ID = B.직원ID;
--AND B.주소 IS NOT NULL ;

SELECT A.직원ID, A.이름, B.주소
FROM 직원 A LEFT OUTER JOIN  직원주소 B ON A.직원ID = B.직원ID;

SELECT A.직원ID AS 직원_직원ID, A.성별, A.나이, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A, 직원주소 B
WHERE A.직원ID = B.직원ID;

SELECT A.직원ID AS 직원_직원ID, A.성별, A.나이, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A, 직원주소 B
WHERE A.직원ID = B.직원ID
AND A.직원ID = 'A0007';

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A, 직원주소 B 
WHERE A.직원ID = B.직원ID(+);

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A, 직원주소 B 
WHERE A.직원ID = B.직원ID(+)
AND B.주소 IS NULL;

SELECT A.직원ID, A.이름, A.나이, B.연락처, C.주소
FROM 직원 A, 직원연락처 B, 직원주소 C
WHERE A.직원ID = B.직원ID
AND B. 직원ID = C.직원ID;

SELECT A.직원ID, A.이름, A.입사일시, B.연락처
FROM 직원 A, 직원연락처 B
WHERE A.직원ID = B.직원ID
--AND A.직원ID IN ('A0001', 'A0002', 'A0003')
AND A.직원ID  BETWEEN 'A0001' AND 'A0003'
AND B.구분코드 = '휴대폰';

SELECT A.직원ID, A.이름, B.부서ID, B. 부서명
FROM 직원 A, 부서 B
WHERE A.부서ID = B.부서ID;

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A INNER JOIN 직원주소 B ON (A.직원ID = B.직원ID);

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A LEFT OUTER JOIN 직원주소 B ON (A.직원ID = B.직원ID);

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A LEFT JOIN 직원주소 B ON (A.직원ID = B.직원ID);

SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A RIGHT OUTER JOIN 직원주소 B ON (A.직원ID = B.직원ID);


SELECT A.직원ID AS 직원_직원ID, A.이름, A.연봉, B.직원ID AS 주소_직원ID, B.구분코드, B.주소
FROM 직원 A, 직원주소 B 
WHERE A.직원ID = B.직원ID(+);

SELECT A.직원ID, A.이름, B.주소
FROM 직원 A LEFT OUTER JOIN 직원주소 B ON (A.직원ID = B.직원ID)
WHERE A.직원ID IN ('A0005', 'A0008');

SELECT B.직원ID, B.이름 , A.주소
FROM 직원주소 A RIGHT OUTER JOIN 직원 B ON (B.직원ID = A.직원ID);

SELECT A.직원ID, A.이름, A.나이, B.연락처
FROM 직원 A INNER JOIN 직원연락처 B ON (A.직원ID = B.직원ID);

SELECT A.직원ID, A.이름, A.나이, B.연락처, C.주소
FROM 직원 A INNER JOIN 직원연락처 B ON (A.직원ID = B.직원ID)
INNER JOIN 직원주소 C ON (B.직원ID = C.직원ID);







