--UPDATE--
SELECT * FROM ����������;
UPDATE ���������� SET �л�ID = 'S0089', �л��̸� = '��μ�' , �Ҽӹ�= 'G' WHERE �л�ID = 'S0088';
UPDATE ���������� SET �л�ID = 'S0089' WHERE �л�ID = 'S0087';

INSERT INTO ���������� (�л�ID, �л��̸�, �Ҽӹ�) VALUES ('S0090', '�����', 'H');
INSERT INTO ���������� (�л�ID, �л��̸�, �Ҽӹ�) VALUES ('S0091', '�����', 'I');
INSERT INTO ���������� (�л�ID, �л��̸�, �Ҽӹ�) VALUES ('S0092', '�����', 'J');

UPDATE ���������� SET �Ҽӹ� = 'Z' WHERE �л�ID BETWEEN 'S0090' AND 'S0092';

--1--
INSERT INTO ���� (����ID, �н�����, �̸�, ����, �Ի��Ͻ�, �ֹε�Ϲ�ȣ, ����, �μ�ID) 
VALUES ('A1000', 'hello1000', '��ĳ��', 29, SYSDATE, '950120-1566221', 3500, 'D006');
COMMIT;
--2--
UPDATE ���� SET ���� = '��', �μ�ID = 'D005', �н����� = 'hello1000!!!' WHERE ����ID = 'A1000';
SELECT *
FROM ����;
--3--
DELETE FROM ���� WHERE ����ID = 'A1000';
--4--
INSERT INTO ���� (����ID, �н�����, �̸�, ����, �Ի��Ͻ�, �ֹε�Ϲ�ȣ, ����, �μ�ID) 
VALUES ('A2000', 'hello222', '��ȫ��', 40, SYSDATE, '830220-1566221', 5600, 'D006');
INSERT INTO ��������ó(����ID, �����ڵ�, ����ó)
VALUES ('A2000', '�޴���', '010-5959-1111');
INSERT INTO �����ּ�(����ID, �����ڵ�, �ּ�) VALUES ('A2000', '��', '��õ�� 123');

COMMIT;
--5--

--TRUNCATE TABLE ����ǥ;--
DELETE FROM ����ǥ;
--6--
INSERT INTO ��������ó(����ID, �����ڵ�, ����ó) VALUES ('A2000','����ȭ', '062-123-1111');
SELECT * FROM ��������ó;
UPDATE ��������ó SET �����ڵ� = '�޴���' WHERE ����ID = 'A2000';
--7--
UPDATE ��������ó SET ����ó = '010-3333-5959' WHERE ����ó = '010-5959-1111';
UPDATE ��������ó SET ����ó = '010-3333-5959' WHERE ����ID = 'A2000' AND �����ڵ� = '�޴���';
SELECT * FROM ��������ó;

--8-- 
DELETE FROM �����ּ� WHERE ����ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--9--
DELETE FROM ��������ó WHERE ����ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--10--
DELETE FROM ���� WHERE ����ID IN ('A0011', 'A0012', 'A0013', 'A2000');
--11--
INSERT INTO ����ǥ(�л�ID, ����, ����) VALUES ('S0001', '����', 90);
INSERT INTO ����ǥ(�л�ID, ����, ����) VALUES ('S0001', '����', 85);
INSERT INTO ����ǥ(�л�ID, ����, ����) VALUES ('S0001', '����', 70);

--12--
UPDATE ����ǥ SET ���� = 80 WHERE �л�ID = 'S0001' AND ���� = '����';
SELECT * FROM ����ǥ;


