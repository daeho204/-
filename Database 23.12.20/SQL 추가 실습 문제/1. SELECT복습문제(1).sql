
/* 
������ ��� ������ �����غ��� ���� ���� �����Դϴ�. 
���� �Ʒ��� ���� ������ ���� �׽�Ʈ �������� hr ������ ����� �����ϰڽ��ϴ�. 

1. SQL COMMAND LINE �� ������ CONN SYSTEM/12345; �� �Է��� ������ �������� ����
2. Connected. �� ���������� ������ �Ʒ� ������ �״�� �ۼ�
   ALTER USER HR ACCOUNT UNLOCK;
   ALTER USER HR IDENTIFIED BY 12345;
   �Ѵ� �ۼ� �� ����
3. User altered. �� ���������� ������ ���� SQL DEVELOPER �� ���� ��� + ��ȣ�� Ŭ���� DB ���� ó�� 
   => name �� HR , ������̸��� hr , ��й�ȣ�� 12345 

�Ʒ����ʹ� �����Դϴ�. �߰��߰� �� ���� ���� �Է� �� ������ �غ�����. (���Ӽ��� â�� �߸� hr �� ����)
����� ���� �κ��� ������ �ִٸ�(���� ��� ���Ῥ�� ���� ����) Ǯ�� �����ŵ� �˴ϴ�. 
���� ���� [ SELECT ó�� ~ SELECT ����/�Լ��� ���Ῥ����� ] 
*/ 




/*
1. COUNTRIES ��� ���̺��� ���� �÷��� ������ּ���. 
   ������ �÷� : COUNTRY_ID , COUNTRY_NAME 

[��°��] (�� 25���� ���) 
COUNTRY_ID   COUNTRY_NAME    <--�̰� �÷��̸� 
    AR	     Argentina
    AU  	 Australia
    ...         ... 
    ZW     	 Zimbabwe
*/ 




/*
2. EMPLOYESS ��� ���̺��� EMPLOYEE_ID , EMAIL , PHONE_NUMBER �÷��� ����ϵ�, 
   ���� ����ID , �̸��� , �ڵ�����ȣ ��� ��Ī�� �ο��Ͽ� ������ּ���. 
   
[��°��] (�� 107���� ���) 
����ID   �̸���   �ڵ�����ȣ    <--�̰� �÷��̸� 
    AR	     Argentina
    AU  	 Australia
    ...         ... 
    ZW     	 Zimbabwe
*/ 





/*
3. JOBS ��� ���̺��� ��� �÷��� ����ǵ��� �����͸� ������ּ���. 

[��°��] (�� 19 ��) 
JOB_ID   JOB_TITLE                   MIN_SALARY   MAX_SALARY    <--�̰� �÷��̸� 
AD_PRES	 President	                    20080	    40000
AD_VP	Administration Vice President	15000	    30000
...        ...                           ...         ... 
HR_REP	Human Resources Representative	4000	    9000
PR_REP	Public Relations Representative	4500	    10500
*/




/*
4. EMPLOYEES ���̺��� JOB_ID �÷��� �ֽ��ϴ�. 
   �� JOB_ID �÷��� ������ �� �ߺ��� ���� ��µǵ��� ���ּ���. (��¼����� ��������ϴ�) 
   
[��°��] (�� 19 ��) 
JOB_ID      <--�̰� �÷��̸�
AC_ACCOUNT
AC_MGR
AD_ASST
AD_PRES
  ... 
ST_MAN

*/ 





/* 
5. EMPLOYEES ���̺��� EMPLOYEE_ID �� SALARY �� ������ּ���.
   �߰��� SALARY �� 1000 ���� ���ؼ� BONUS ��� ���ο� ��Ī�� ���� ������ �÷��� ������ּ���. 

[��°��] (�� 107��)
EMPLOYEE_ID   SALARY   BONUS    <--�̰� �÷��̸� 
    100	      24000	   25000
    101	      17000	   18000
    102	      17000	   18000
    ...        ...      ... 
    205 	  12008	   13008
    206	       8300	    9300    
*/ 








/****************************************************/

--1�� ��) 
SELECT COUNTRY_ID 
     , COUNTRY_NAME 
  FROM COUNTRIES ;

--2�� ��) 
SELECT EMPLOYEE_ID AS ����ID 
     , EMAIL       AS �̸��� 
     , PHONE_NUMBER AS �ڵ�����ȣ 
  FROM EMPLOYEES ;

--3�� ��) 
SELECT * FROM JOBS;

--4�� ��) 
SELECT DISTINCT JOB_ID 
  FROM EMPLOYEES ;

--5�� ��) 
SELECT EMPLOYEE_ID 
     , SALARY 
     , SALARY + 1000 AS BONUS 
  FROM EMPLOYEES  ;

