SELECT ����ID, �̸�, ����, �Ի��Ͻ�
FROM  ����
WHERE ����>9000;

SELECT ����ID, �н�����, �̸�, ����, ����, �Ի��Ͻ�, �ֹε�Ϲ�ȣ, ����, �μ�ID
FROM ����
WHERE �̸� = '������';

SELECT ����ID, �����ڵ�, ����ó
FROM ��������ó
WHERE  ����ó = '010-1231-1234';

SELECT �μ���
FROM �μ�
WHERE �ٹ��� = '����';

SELECT �ּ� 
FROM �����ּ�
WHERE ����ID = 'A0007';

SELECT ����ó 
FROM ��������ó
WHERE ����ID = 'A0001'
AND �����ڵ� = '����ȭ';

SELECT  *
FROM  ����
WHERE ���� = '��'
AND ���� >= 30
AND �μ�ID = 'D003';

SELECT *
FROM ����
 WHERE ����ID = 'A0001'
 OR ����ID = 'A0005'
 OR ����ID = 'A0007';
 
SELECT *
FROM ����
WHERE ����ID IN ('A0001', 'A0002');

SELECT *
FROM  ����
WHERE �̸� LIKE ('��%');

SELECT ����ID, �̸�, ����
FROM ����
WHERE �̸� LIKE ('%ö%');

SELECT ����ID, ����, �Ի��Ͻ�
FROM ���� 
WHERE ���� BETWEEN 7000 AND 9000;

SELECT *
FROM �����ּ�
WHERE �ּ� LIKE('����%');

SELECT *
FROM ����
WHERE �Ի��Ͻ� LIKE('%/11/%');

SELECT *
FROM ����
WHERE �Ի��Ͻ� LIKE('__/11/__');

SELECT *
FROM ����
WHERE TO_CHAR(�Ի��Ͻ�, 'MM') = '11';

--JOIN �̶�...

SELECT * 
FROM ���� A, �μ� B
WHERE A.�μ�ID = B.�μ�ID;

SELECT *
FROM ���� A 
FULL OUTER JOIN �μ� B ON
A.�μ�ID = B.�μ�ID; 

SELECT *
FROM ���� A, ��������ó B
WHERE A.����ID = B.����ID;

SELECT A.����ID, A.�̸�, B.�ּ�
FROM ���� A, �����ּ� B
WHERE A.����ID = B.����ID;
--AND B.�ּ� IS NOT NULL ;

SELECT A.����ID, A.�̸�, B.�ּ�
FROM ���� A LEFT OUTER JOIN  �����ּ� B ON A.����ID = B.����ID;

SELECT A.����ID AS ����_����ID, A.����, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A, �����ּ� B
WHERE A.����ID = B.����ID;

SELECT A.����ID AS ����_����ID, A.����, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A, �����ּ� B
WHERE A.����ID = B.����ID
AND A.����ID = 'A0007';

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A, �����ּ� B 
WHERE A.����ID = B.����ID(+);

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A, �����ּ� B 
WHERE A.����ID = B.����ID(+)
AND B.�ּ� IS NULL;

SELECT A.����ID, A.�̸�, A.����, B.����ó, C.�ּ�
FROM ���� A, ��������ó B, �����ּ� C
WHERE A.����ID = B.����ID
AND B. ����ID = C.����ID;

SELECT A.����ID, A.�̸�, A.�Ի��Ͻ�, B.����ó
FROM ���� A, ��������ó B
WHERE A.����ID = B.����ID
--AND A.����ID IN ('A0001', 'A0002', 'A0003')
AND A.����ID  BETWEEN 'A0001' AND 'A0003'
AND B.�����ڵ� = '�޴���';

SELECT A.����ID, A.�̸�, B.�μ�ID, B. �μ���
FROM ���� A, �μ� B
WHERE A.�μ�ID = B.�μ�ID;

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A INNER JOIN �����ּ� B ON (A.����ID = B.����ID);

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A LEFT OUTER JOIN �����ּ� B ON (A.����ID = B.����ID);

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A LEFT JOIN �����ּ� B ON (A.����ID = B.����ID);

SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A RIGHT OUTER JOIN �����ּ� B ON (A.����ID = B.����ID);


SELECT A.����ID AS ����_����ID, A.�̸�, A.����, B.����ID AS �ּ�_����ID, B.�����ڵ�, B.�ּ�
FROM ���� A, �����ּ� B 
WHERE A.����ID = B.����ID(+);

SELECT A.����ID, A.�̸�, B.�ּ�
FROM ���� A LEFT OUTER JOIN �����ּ� B ON (A.����ID = B.����ID)
WHERE A.����ID IN ('A0005', 'A0008');

SELECT B.����ID, B.�̸� , A.�ּ�
FROM �����ּ� A RIGHT OUTER JOIN ���� B ON (B.����ID = A.����ID);

SELECT A.����ID, A.�̸�, A.����, B.����ó
FROM ���� A INNER JOIN ��������ó B ON (A.����ID = B.����ID);

SELECT A.����ID, A.�̸�, A.����, B.����ó, C.�ּ�
FROM ���� A INNER JOIN ��������ó B ON (A.����ID = B.����ID)
INNER JOIN �����ּ� C ON (B.����ID = C.����ID);







