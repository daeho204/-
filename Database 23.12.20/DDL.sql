SELECT �л�ID, MAX(����)
 FROM ����ǥ
 GROUP BY �л�ID;
 
 SELECT �л�ID, ROUND(AVG(����), 1 ) AS ��ռ���
 FROM ����ǥ
 GROUP BY �л�ID;
 
 SELECT MAX(����) AS �ְ���, MIN(����) AS �ּҿ���
 FROM ����;
 
 SELECT �Ҽӹ�, COUNT(*) AS �ݺ��ο���
 FROM ����������
 GROUP BY �Ҽӹ�;
 
 SELECT �л�ID, AVG(����) AS �����������
 FROM ����ǥ
 WHERE ���� != '����'
 GROUP BY �л�ID;
 
 SELECT �μ�ID, SUM(����) AS �μ��������հ�
 FROM ����
 WHERE �μ�ID IS NOT NULL
 GROUP BY �μ�ID;
 
 SELECT A.����ID, COUNT(B.����ó) AS ����ó����
 FROM ���� A LEFT OUTER JOIN ��������ó B ON (A.����ID = B.����ID)
 GROUP BY A.����ID
 ORDER BY ����ID;
 
 SELECT �Ҽӹ�, COUNT(*) AS �ο���
 FROM ����������
 GROUP BY �Ҽӹ�
 HAVING COUNT(*) >= 3;
 
 SELECT �μ�ID, MAX(����)
 FROM ����
 GROUP BY �μ�ID
 HAVING MAX(����) = 7500;
 
 SELECT �л�ID, ROUND(AVG(����), 1) AS ��ռ���
 FROM ����ǥ
 GROUP BY �л�ID
 HAVING AVG(����) IS NOT NULL
 ORDER BY �л�ID;
 
 --CREATE OR DROP TABLE--
 
 CREATE TABLE QUIZ_TABLE (
 Q_ID NUMBER(3,0) NOT NULL,
 Q_CONTENT VARCHAR2(200) NOT NULL,
 Q_ANSWER VARCHAR(100) NOT NULL,
 REG_DATE DATE DEFAULT SYSDATE,
 Q_BINGO VARCHAR(100) DEFAULT 'O');
 
 CREATE TABLE ȸ������(
 ȸ��ID VARCHAR2(10) NOT NULL,
 �̸� VARCHAR2(20) NOT NULL,
 �������� DATE,
 ���� NUMBER DEFAULT 0);
 
 CREATE TABLE ȸ������ó(
 ȸ��ID VARCHAR2(10) NOT NULL,
 �����ڵ� VARCHAR2(10) NOT NULL,
 ����ó VARCHAR2(15) NOT NULL);
 
 CREATE TABLE ȸ���ּ�(
 ȸ��ID VARCHAR2(10) NOT NULL,
 ���θ��ּ� VARCHAR2(200) NOT NULL);
 
 ALTER TABLE ȸ������ ADD CONSTRAINT PK_ȸ������ PRIMARY KEY(ȸ��ID);
 ALTER TABLE ȸ������ó ADD CONSTRAINT PK_ȸ������ó PRIMARY KEY(ȸ��ID, �����ڵ�);
 ALTER TABLE ȸ���ּ� ADD CONSTRAINT PK_ȸ���ּ� PRIMARY KEY(ȸ��ID);
 
 
ALTER TABLE ȸ������ó ADD CONSTRAINT FK_ȸ������ó FOREIGN KEY(ȸ��ID) REFERENCES ȸ������(ȸ��ID);
ALTER TABLE ȸ���ּ� ADD CONSTRAINT FK_ȸ���ּ� FOREIGN KEY(ȸ��ID) REFERENCES ȸ������(ȸ��ID);

DROP TABLE ȸ������;
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'ȸ������';
DROP TABLE ȸ������ CASCADE CONSTRAINTS;


--SEQUENCE--

CREATE SEQUENCE ȸ��ID_SEQ;

SELECT ȸ��ID_SEQ.NEXTVAL
FROM DUAL;

DROP SEQUENCE ȸ��ID_SEQ;

--VIEW--
CREATE VIEW �μ����ְ���_VIEW AS
SELECT �μ�ID , MAX(����) AS �μ����ְ���
FROM ����
GROUP BY �μ�ID
ORDER BY �μ�ID;

SELECT * FROM �μ����ְ���_VIEW;

DROP VIEW �μ����ְ���_VIEW;
