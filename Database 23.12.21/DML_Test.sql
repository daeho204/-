--UPDATE--
SELECT * FROM 수강생정보;
UPDATE 수강생정보 SET 학생ID = 'S0089', 학생이름 = '김민수' , 소속반= 'G' WHERE 학생ID = 'S0088';
UPDATE 수강생정보 SET 학생ID = 'S0089' WHERE 학생ID = 'S0087';

INSERT INTO 수강생정보 (학생ID, 학생이름, 소속반) VALUES ('S0090', '김민혁', 'H');
INSERT INTO 수강생정보 (학생ID, 학생이름, 소속반) VALUES ('S0091', '김민정', 'I');
INSERT INTO 수강생정보 (학생ID, 학생이름, 소속반) VALUES ('S0092', '김민지', 'J');

UPDATE 수강생정보 SET 소속반 = 'Z' WHERE 학생ID BETWEEN 'S0090' AND 'S0092';

--1--
INSERT INTO 직원 (직원ID, 패스워드, 이름, 나이, 입사일시, 주민등록번호, 연봉, 부서ID) 
VALUES ('A1000', 'hello1000', '신캐릭', 29, SYSDATE, '950120-1566221', 3500, 'D006');
COMMIT;
--2--
UPDATE 직원 SET 성별 = '남', 부서ID = 'D005', 패스워드 = 'hello1000!!!' WHERE 직원ID = 'A1000';
SELECT *
FROM 직원;
--3--
DELETE FROM 직원 WHERE 직원ID = 'A1000';
--4--
INSERT INTO 직원 (직원ID, 패스워드, 이름, 나이, 입사일시, 주민등록번호, 연봉, 부서ID) 
VALUES ('A2000', 'hello222', '이홍시', 40, SYSDATE, '830220-1566221', 5600, 'D006');
INSERT INTO 직원연락처(직원ID, 구분코드, 연락처)
VALUES ('A2000', '휴대폰', '010-5959-1111');
INSERT INTO 직원주소(직원ID, 구분코드, 주소) VALUES ('A2000', '집', '운천로 123');

COMMIT;
--5--

--TRUNCATE TABLE 성적표;--
DELETE FROM 성적표;
--6--
INSERT INTO 직원연락처(직원ID, 구분코드, 연락처) VALUES ('A2000','집전화', '062-123-1111');
SELECT * FROM 직원연락처;
UPDATE 직원연락처 SET 구분코드 = '휴대폰' WHERE 직원ID = 'A2000';
--7--
UPDATE 직원연락처 SET 연락처 = '010-3333-5959' WHERE 연락처 = '010-5959-1111';
UPDATE 직원연락처 SET 연락처 = '010-3333-5959' WHERE 직원ID = 'A2000' AND 구분코드 = '휴대폰';
SELECT * FROM 직원연락처;

--8-- 
DELETE FROM 직원주소 WHERE 직원ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--9--
DELETE FROM 직원연락처 WHERE 직원ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--10--
DELETE FROM 직원 WHERE 직원ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--11--
INSERT INTO 성적표(학생ID, 과목, 성적) VALUES ('S0001', '국어', 90);
INSERT INTO 성적표(학생ID, 과목, 성적) VALUES ('S0001', '수학', 85);
INSERT INTO 성적표(학생ID, 과목, 성적) VALUES ('S0001', '영어', 70);

--12--
UPDATE 성적표 SET 성적 = 80 WHERE 학생ID = 'S0001' AND 과목 = '영어';
SELECT * FROM 성적표;


