-- ��ø��������--

--���� ��������--
SELECT * 
FROM ����
WHERE ���� >= (SELECT AVG(����) 
                                FROM ����);
/* SELECT AVG �� ���� ����Ǿ� ���� �����Ѵ��� ���������� �񱳸� �ϱ⶧���� �������� �з�*/

--��� ��������--
SELECT * 
FROM ���� A
WHERE ���� = (SELECT MIN(����)
                            FROM ����
                            WHERE �μ�ID = A.�μ�ID);
                            
SELECT *
FROM ���� A
WHERE ���� = (SELECT MAX(����)
FROM ����
WHERE �μ�ID = A.�μ�ID);

SELECT *
FROM ���� 
WHERE �Ի��Ͻ� = (SELECT MAX(�Ի��Ͻ�)
FROM ����);

SELECT *
FROM ����
WHERE ���� = (SELECT MAX(����)
FROM ����);

--������/������ ������--
--������ : =, >=, <. !=
--������: IN, ANY, ALL, EXISTS, NOT EXISTS ���...

SELECT *
FROM ����
WHERE ���� IN (
                            SELECT MAX(����)
                            FROM ����
                            GROUP BY �μ�ID);
                            

SELECT ����ID, ����
FROM ����
WHERE ���� >= ANY(5000, 7500, 2800);

SELECT ����ID, ����
FROM ����
WHERE ���� >= ALL (5000, 7500, 2800);

SELECT �̸�, ����
FROM ����
WHERE ���� IN (SELECT ����
                            FROM ����
                            WHERE ����ID = 'A0006');
                            
SELECT ����ID, �̸�
FROM ���� A
WHERE EXISTS (
                                SELECT 1
                                FROM ��������ó
                                WHERE ����ID = A.����ID);
                                
SELECT ����ID, �̸�
FROM ����  A
WHERE ����ID IN (SELECT ����ID
                                FROM ��������ó
                                WHERE ����ID = A.����ID);
                                

                        
