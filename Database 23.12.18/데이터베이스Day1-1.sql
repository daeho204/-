SELECT * 
FROM ����;
SELECT * 
FROM �μ�;

SELECT ����ID,  �н�����, �̸�, ����, ����
FROM ����
WHERE ���� = '��';

SELECT ����ID, �Ի��Ͻ�, �ֹε�Ϲ�ȣ, ����, �μ�ID
FROM ����;

SELECT �μ�ID, �μ���, �ٹ���
FROM �μ�;

SELECT ����ID, �����ڵ�, ����ó
FROM ��������ó;


SELECT * 
FROM ����;
SELECT * 
FROM �����ּ�;

SELECT * 
FROM ��������ó;

SELECT DISTINCT ����ID
FROM ��������ó
ORDER BY ����ID;

SELECT *
FROM ����
WHERE ���� IS NOT NULL;

SELECT *
FROM ����
WHERE �Ի��Ͻ� IS NULL;

SELECT �Ի��Ͻ�, COALESCE(�Ի��Ͻ�, NULL, 22/03/21)
FROM ����;

SELECT �Ի��Ͻ�, DECODE(�Ի��Ͻ�, '22/03/21', '����', '����')
FROM ����;

SELECT ����ID, �н�����, NVL(����, 20) AS ����
FROM ����;

SELECT ����ID, ����, ����, DECODE(����, '��', '�����Դϴ�', '�����Դϴ�') AS ����Ȯ��
FROM ����;

SELECT ����ID, ����, ����, DECODE(����,'��', '�����Դϴ�', '�����Դϴ�') AS ����Ȯ��
FROM ����;

SELECT ����ID, �ֹε�Ϲ�ȣ, SUBSTR(�ֹε�Ϲ�ȣ, 0,6) AS �������
/*SELECT ����ID, �ֹε�Ϲ�ȣ, SUBSTR(�ֹε�Ϲ�ȣ, 1,6) AS �������*/
FROM ����;

SELECT ����ID, �����ڵ�, ����ó, REPLACE(����ó, '-', '') AS ����ó��ȣ��
FROM ��������ó;

SELECT ROUND (3.1415, 3), CEIL(3.1415), FLOOR(3.1415), TRUNC(3.1415,3), ABS(-3.1415)
FROM DUAL;

SELECT TO_CHAR(SYSDATE, 'HH24:MI:SS') FROM DUAL;


