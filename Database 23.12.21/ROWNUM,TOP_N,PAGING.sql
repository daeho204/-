--1st SQL DEVELOPER �λ�����
SELECT ����ID, �̸�, ����
FROM ����
WHERE ����ID = 'A0005';

UPDATE ���� SET ���� = 7000 WHERE ����ID = 'A0005';
--TCL pg291--
COMMIT;
SELECT ����ID, ����
FROM ����;

--ROWNUM--
SELECT ROWNUM AS RN, ����ID, �̸�
FROM ����
WHERE ROWNUM <= 3;

SELECT *
FROM(
    SELECT ROWNUM AS RN,
    ����ID,
    �̸�
    FROM ����)
WHERE RN = 3;


--TOP-N--
SELECT * 
FROM(
    SELECT *
    FROM ����
    WHERE ���� IS NOT NULL
    ORDER BY ���� DESC)
WHERE ROWNUM <= 5;

SELECT *
FROM(
    SELECT *
    FROM ����
    WHERE  ���� IS NOT NULL
    ORDER BY ����)
WHERE ROWNUM <= 3;

SELECT *
FROM(
    SELECT *
    FROM ����
    WHERE �Ի��Ͻ� IS NOT NULL
    ORDER BY �Ի��Ͻ� DESC)
WHERE ROWNUM <= 3;

--����¡--

SELECT *
FROM(
    SELECT *
    FROM �Խ���
    ORDER BY �ۼ��Ͻ� DESC)
WHERE ROWNUM <= 20;

SELECT *
FROM(
    SELECT ROWNUM AS RN, A.*
        FROM(
        SELECT *
        FROM �Խ���
        ORDER BY �ۼ��Ͻ� DESC) A
    WHERE ROWNUM <= 40)
WHERE RN >= 21;

SELECT *
    FROM(
        SELECT ROWNUM AS RN, A.*
            FROM(
            SELECT *
            FROM �Խ���
            ORDER BY �ۼ��Ͻ� DESC) A
        WHERE ROWNUM <= 60)
WHERE RN >= 40;

