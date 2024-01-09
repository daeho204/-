--1--
/*
FUNNYDB �� ������ ���� ������ ���⶧���� ���Ѻο�
GRANT CREATE SESSION TO FUNNYDB; 
*/

--2--
/*
���������� FROM ������ ALIAS �� CUST_INFO A 
 , CUST_TEL_INFO B �� �����߱⶧���� 
 WHERE�������� CUST_TEL_INFO.CUST_NO �� �ƴ� B.CUST_INFO �� ����ؾ��Ѵ� */
 
 --3--
 /* WHERE �������� �����Լ��� ����� �� ���⶧���� ����� 6000���� ū�� �������� Ȯ���� AVG(����) > 6000 �� ���Ұ�.
    ������ HAVING ������ ��տ����� 6000�� �Ѵ��� ���θ� Ȯ���ϱ����� WHERE���� ������ �μ��� NULL�ϼ� ���ٰ� ���� ��,
    �μ��� ��տ���ġ�� �˱����� �μ�ID�� GROUP �ϰ� HAVING������ �����Լ��� ����� ��������� ������ 6000���� ū�� ������ ���Ͽ�
    ���� ���.
    
    SELECT �μ�ID, SUM(����) AS �հ�, AVG(����) AS ���, COUNT(*) AS ������
    FROM ���� 
    WHERE ���� IS NOT NULL
    AND �μ�ID IS NOT NULL
    GROUP BY �μ�ID
    HAVING AVG(����) > 6000
    ORDER BY �μ�ID;
*/

--4--
/* SQL�� ������� �� ORDER BY���� WHERE���� ���� ����Ǳ⿡
   ���� ����� ���������� ���� �� ���� 3���� ������ �������°��� �ƴ�
   �������̺��� 1-3 Ʃ���� ���� �� ������ ������������ �����ϱ⶧����
   TOP-N�� ����Ͽ� ������ ��׺��� ������������ ���� �� 1-3 Ʃ���� �������½����� ��������� �ٲ����.
   
SELECT ROWNUM, �̸�, ����
FROM (         
                    SELECT �̸�,����
                    FROM ����
                    WHERE ���� IS NOT NULL
                    ORDER BY ���� DESC)
WHERE ROWNUM <= 3
ORDER BY ROWNUM;
   
*/


--5--

/* 
SQL ���� ����Ǵ� ������
FROM�� -> WHERE�� -> GROUP BY�� -> HAVING�� -> SELECT�� -> ORDER BY�� �̴�
*/

--6--
/* 

SELECT A.����ID, A.�̸�, B.�μ���
FROM ���� A LEFT OUTER JOIN �μ� B ON (A.�μ�ID = B.�μ�ID);

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
INSERT INTO PEOPLE(NAME, AGE) VALUES ('�����', 40);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('������', 25);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('������', NULL);
INSERT INTO PEOPLE(NAME, AGE) VALUES ('����', 40);

7.4
SELECT NAME, AGE
FROM PEOPLE 
WHERE AGE IS NULL
OR AGE = 40;
*/

--8--
/*
8-1 ������ OTHERSERVICE �� ������ �߰��ϵ�, ��й�ȣ�� 12345 �� �����Ͻÿ�.
CREATE USER OTHERSERVICE IDENTIFIED BY 12345;

8-2. OTHERSERVICE ������ VIEW�� SESSION�� ������ �� �ֵ��� ������ �ο��ϼ���. 
GRANT CREATE VIEW, CREATE SESSION TO OTHERSERVICE;

8-3. OTHERSERVICE �������Լ� VIEW�� ������ �� �ִ� ������ ȸ���ϼ���.

REVOKE CREATE VIEW FROM OTHERSERVICE;

8-4. ���� ROLE ������ OTHERSERVICE �������� �ο��Ͻÿ�. 
 (ROLE�� �̸��� ��ROLE2���� �����ϼ���)
 [ ROLE �� ������ �߰��ϼ��� : PROCEDURE ���� ����, CLUSTER ���� ���� ]
 CREATE ROLE ROLE2;
 GRANT CREATE PROCEDURE, CREATE CLUSTER TO ROLE2;
 GRANT ROLE2 TO OTHERSERVICE;
 */



















