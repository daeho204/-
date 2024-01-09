/* 
������ ��� ������ �����غ��� ���� ���� �����Դϴ�. 
���� ���� [ GROUP BY - HAVING - ORDER BY ��ü ] 

HR ������ ������ �ִ� ���̺��� �̿��� ������ Ǯ�����ּ���. 
(���Ӽ��� â�� �߸� hr �� ����) 
*/ 



/* 
1. EMPLOYEES ���̺��� JOB_ID ��� �÷��� �ֽ��ϴ�. 
   GROUP BY ������ �̿��ؼ� JOB_ID ���� ���� ���� ����ִ��� Ȯ�����ּ���.
   [ ��Ʈ : COUNT ] 

[��°��] (�� 19��)  *��� ���� ��� x 
JOB_ID    ������    <-- �̰� �÷��̸�
FI_MGR	    1
HR_REP	    1
  ... 
SA_REP	    30
SH_CLERK    20
  ...
ST_MAN      5
*/ 




/* 
2. �� 1�� ������ ���ؼ� HAVING �� Ȱ���Ͽ� �������� 10���̻��� ��� ������ּ���.
[��°��] (�� 3��)  *��� ���� ��� x 
JOB_ID    ������    <-- �̰� �÷��̸�
SA_REP	    30
SH_CLERK	20
ST_CLERK	20
*/ 




/* 
3. DEPARTMENTS ���̺��� MANAGER_ID �� NULL�� �ƴϸ鼭 LOCATION_ID �� 1700�� ��� ���� 
   DEPARTMENT_NAME �÷��� �������� �������� �����ؼ� ��� �÷��� ������ּ���. 
   [ ��Ʈ : ORDER BY ] 

[��°��] 
DEPARTMENT_ID  DEPARTMENT_NAME   MANAGER_ID   LOCATION_ID 
    110	        Accounting	        205	        1700
    10	        Administration	    200	        1700
    90	        Executive	        100	        1700
    100	        Finance	            108	        1700
    30	        Purchasing	        114	        1700
*/ 





/* 
4. �����鿡�� SALARY�� �����ؾ��մϴ�.
   �������� ��� JOB_ID �� ���� �ϳ��� ������ �ִµ�, ������ JOB_ID ���� ���� SALARY �� å���� �ؾ��ϴ��� 
   �Ʒ��� ���� ����� ���ּ���. 

[��°��] (�� 19��) *��� ��� ��� ����

JOB_ID    å�������հ�    <-- �̰� �÷��̸�
IT_PROG	    28800
AC_MGR	    12008
  ...        ...
ST_CLERK	55700
HR_REP	     6500
*/ 





/* 
5. �� 4�� ���� ����� ���ؼ� å�������հ谡 50000 �̻��� ��� ����� �ϵ� , 
   å�������հ� �÷��� �������� �������� �����Ͽ� �����ּ���. 

[��°��] (�� 4��) *��� ��� ��� ����

JOB_ID    å�������հ�    <-- �̰� �÷��̸�
SA_REP	    250500
SH_CLERK	 64300
SA_MAN	     61000
ST_CLERK	 55700
*/ 

   




--------------------------------------------------------
--1�� ��) 
SELECT JOB_ID , COUNT(*) AS ������
  FROM EMPLOYEES 
 GROUP BY JOB_ID ; 
 
--2�� ��)
SELECT JOB_ID , COUNT(*) AS ������
  FROM EMPLOYEES 
 GROUP BY JOB_ID 
 HAVING COUNT(*) >= 10; 

--3�� ��) 
SELECT * 
  FROM DEPARTMENTS 
 WHERE MANAGER_ID IS NOT NULL 
   AND LOCATION_ID = 1700
 ORDER BY DEPARTMENT_NAME; 

--4�� ��) 
SELECT JOB_ID , SUM(SALARY) AS å�������հ�
  FROM EMPLOYEES
 GROUP BY JOB_ID ;
 
--5�� ��)
SELECT JOB_ID , SUM(SALARY) AS å�������հ�
  FROM EMPLOYEES
 GROUP BY JOB_ID 
HAVING SUM(SALARY) >= 50000 
ORDER BY å�������հ� DESC;
