/* 
������ ��� ������ �����غ��� ���� ���� �����Դϴ�. 
���� ���� [ WHERE ��ü ] 

HR ������ ������ �ִ� ���̺��� �̿��� ������ Ǯ�����ּ���. 
(���Ӽ��� â�� �߸� hr �� ����) 
*/ 



/* 
1. EMPLOYEES ���̺��� FIRST_NAME �� �빮�� S �� �����ϸ鼭 
   LAST_NAME �� �빮�� M ���� �����ϴ� ����� EMPLOYEE_ID , FIRST_NAME , LAST_NAME �� ������ּ���. 
   (��� ������ ��� �����ϴ�) 
   [��Ʈ : LIKE , AND Ȱ�� , LIKE ���� ��Ī�� ���� �ѵ���ǥ(') �� �����ּ���. 

[��°��] (�� 3��) 
EMPLOYEE_ID    FIRST_NAME   LAST_NAME  
    128	        Steven	     Markle
    203	        Susan	     Mavris
    194	        Samuel	     McCain
*/ 




/* 
2. DEPARTMENTS ���̺��� �μ����� ������ �����ϴ� ���̺��̸�, �� �μ����� MANAGER_ID �� �����մϴ�.  
   �� �� MANAGER_ID �� �������� ���� ����� ��� ����(*) �� ������ּ���. 
   [��Ʈ : IS NULL / IS NOT NULL ] 

[��°��] (�� 16��) 
DEPARTMENT_ID   DEPARTMENT_NAME    MANAGER_ID   LOCATION_ID 
    120	        Treasury		      NULL          1700
    130	        Corporate Tax		  NULL          1700
    140	        Control And Credit	  NULL	        1700
    ...         ...                   ...           ...
    260	        Recruiting		      NULL          1700
    270	        Payroll		          NULL          1700
*/ 



/* 
3. EMPLOYEES ���̺��� �������� SALARY(����) �� 6000 ~ 7000 �����̸鼭 
   COMMISSION_PCT(Ŀ�̼�)�� NULL�� �ƴ� ����� EMPLOYEE_ID , HIRE_DATE , SALARY , COMMISSION_PCT �� ������ּ���. 
   [��Ʈ : BETWEEN ] 

[��� ���] (�� 8��) 
EMPLOYEE_ID      HIRE_DATE          SALARY    COMMISSION_PCT 
    155	      2007-11-23 00:00:00	   7000	        0.15
    161	      2006-11-03 00:00:00	   7000	        0.25
    165	      2008-02-23 00:00:00	   6800	        0.1
    166	      2008-03-24 00:00:00	   6400	        0.1
    167	      2008-04-21 00:00:00	   6200	        0.1
    173	      2008-04-21 00:00:00	   6100	        0.1
    178	      2007-05-24 00:00:00	   7000	        0.15
    179	      2008-01-04 00:00:00	   6200	        0.1
*/ 



/* 
4. COUNTRIES ���̺��� REGION_ID �� 1 , 2 , 3 �� ����� ��� ������ ������ּ���. 
   [��Ʈ : IN Ȱ�� , Ȥ�� �����������ε� Ǯ�� ���� ] 


[��� ���] (�� 8��) 
COUNTRY_ID    COUNTRY_NAME               REGION_ID 
    AR         Argentina    	            2
    AU	       Australia	                3
    BE	       Belgium	                    1
    BR	       Brazil	                    2
    ...         ...                        ... 
    UK	       United Kingdom	            1
    US	       United States of America  	2
*/ 




/* 
5(��ȭ). EMPLOYEES ���̺��� �پ��� �������� �ֽ��ϴ�.
        �� �߿��� JOB_ID �� 'SA_REP' �̰�, SALARY �� 7000 ~ 9000 �̸鼭 FIRST_NAME�� �ҹ��� et �� ���Ե� 
        ����� EMPLOYEE_ID , FIRST_NAME , JOB_ID , SALARY �� ������ּ���. 

[��°�� (�� 3��) 
EMPLOYEE_ID   FIRST_NAME    JOB_ID  SALARY 
    152	        Peter	    SA_REP	 9000
    154	        Nanette	    SA_REP	 7500
    172	        Elizabeth	SA_REP	 7300
*/ 











--------------------------------------------------------
--1�� ��) 
SELECT EMPLOYEE_ID 
     , FIRST_NAME 
     , LAST_NAME 
  FROM EMPLOYEES 
 WHERE FIRST_NAME LIKE 'S%' 
   AND LAST_NAME LIKE 'M%';


--2�� ��) 
SELECT * 
  FROM DEPARTMENTS 
 WHERE MANAGER_ID IS NULL ; 
 
 
--3�� ��) 
SELECT EMPLOYEE_ID 
     , HIRE_DATE 
     , SALARY 
     , COMMISSION_PCT 
  FROM EMPLOYEES 
 WHERE SALARY BETWEEN 6000 AND 7000 
   AND COMMISSION_PCT IS NOT NULL ;


--4�� ��) 
SELECT * 
  FROM COUNTRIES 
 WHERE REGION_ID IN (1,2,3) ;
--Ȥ��
SELECT * 
  FROM COUNTRIES 
 WHERE REGION_ID != 4 ;


--5�� ��) 
SELECT EMPLOYEE_ID 
     , FIRST_NAME 
     , JOB_ID 
     , SALARY 
  FROM EMPLOYEES 
 WHERE SALARY BETWEEN 7000 AND 9000 
   AND JOB_ID = 'SA_REP' 
   AND FIRST_NAME LIKE '%et%';
