--SUBQUERY--
SELECT A.����ID, A.����, A.�μ�ID, (
    SELECT �μ���
    FROM �μ�
    WHERE �μ�ID = A.�μ�ID) AS �μ���
FROM ���� A
WHERE ����ID BETWEEN 'A0001' AND 'A0006';

SELECT A.����ID, A.����, A.�μ�ID, B.�μ���
FROM ���� A LEFT OUTER JOIN �μ� B ON (A.�μ�ID = B.�μ�ID)
WHERE A.����ID BETWEEN 'A0001' AND 'A0006'
ORDER BY A.�μ�ID;

SELECT A.����ID, A.����, A.�μ�ID, (SELECT �μ�ID
                                                            FROM �μ�
                                                            WHERE A.�μ�ID = �μ�ID) AS �μ���
FROM ���� A
WHERE A.����ID BETWEEN 'A0001' AND 'A0006';

SELECT A.����ID, A.�̸�, A.�ֹε�Ϲ�ȣ, (SELECT ����ó
                                                                        FROM ��������ó
                                                                        WHERE A.����ID = ����ID) AS �޴�����ȣ
FROM ���� A
WHERE A.����ID BETWEEN 'A0006' AND 'A0010';

SELECT A.����ID, A.�̸�, A.�ֹε�Ϲ�ȣ, B.����ó AS �޴�����ȣ
FROM ���� A LEFT OUTER JOIN ��������ó B ON (A.����ID = B.����ID)
AND B.�����ڵ� = '�޴���'
WHERE A.����ID BETWEEN 'A0006' AND 'A0010'
ORDER BY A.����ID;

SELECT * FROM ����;

SELECT *
FROM (SELECT *
            FROM ����
            ORDER BY ���� ASC)
WHERE ROWNUM <= 3;

--ORACLE ������ NULL�� ���� ū������ ��� / �ٸ� ���������� ���� ���� ������ ���--

