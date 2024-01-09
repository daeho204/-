/* 
������ ��� ������ �����غ��� ���� ���� �����Դϴ�. 
���� ���� [ FROM ��ü ] 

HR ������ ������ �ִ� ���̺��� �̿��� ������ Ǯ�����ּ���. 
(���Ӽ��� â�� �߸� hr �� ����) 
*/ 




/* 
1. EMPLOYEES ���̺�� DEPARTMENTS ���̺��� ���ÿ� �����͸� �������� ���� ������ �Ϸ��� �մϴ�. 
   �츮�� ���������� �ϴ� �����ʹ� �Ʒ��� �����ϴ�.

   [ EMPLOYEES   => EMPLOYEE_ID , FIRST_NAME , DEPARTMENT_ID ] 
   [ DEPARTMENTS => DEPARTMENT_NAME , LOCATION_ID ] 
   
   ��, ������ ����(SALARY)�� 4500 ~ 6000 ������ ��� ������ּ���.    
   *��Ʈ : EMPLOYEES �� DEPARTMENTS ���̺��� DEPARTMENT_ID ��� �÷����� ���� ���踦 ������ �ֽ��ϴ�. 
   
[��°��] (�� 5��)  *��� ���� ��� x 

EMPLOYEE_ID    FIRST_NAME   DEPARTMENT_ID   DEPARTMENT_NAME    LOCATION_ID   
    202	          Pat	        20	          Marketing	          1800	         
    124	          Kevin	        50	          Shipping	          1500	          
    105	          David	        60	          IT	              1400	          
    104	          Bruce	        60	          IT	              1400	          
    106	          Valli	        60	          IT	              1400	    
*/ 




/* 
2. ������ �ۼ��� ������ ANSI ����� �������� ��ȯ�غ�����.
   [ ��Ʈ : ����Ŭ���� (+) ��ȣ�� ���� ������ INNER JOIN �Դϴ�. ] 

[��°��] (�� 5��)  *��� ���� ��� x 

EMPLOYEE_ID    FIRST_NAME   DEPARTMENT_ID   DEPARTMENT_NAME    LOCATION_ID   
    202	          Pat	        20	          Marketing	          1800	         
    124	          Kevin	        50	          Shipping	          1500	          
    105	          David	        60	          IT	              1400	          
    104	          Bruce	        60	          IT	              1400	          
    106	          Valli	        60	          IT	              1400	          
*/ 




 
/* 
3. DEPARTMENTS ���̺��� LOCATION_ID �� 1700�� �μ��� ������ ����ϵ�, MANAGER_ID (������ID) �� �̸��� �Բ� ����ϰ��� �մϴ�.  
   ��, �츮�� �������� ���� �÷��� ������ �����ϴ�. 
   
   [DEPARTMENTS => DEPARTMENT_ID , DEPARTMENT_NAME , MANAGER_ID ] 
   [EMPLOYEES   => EMPLOYEE_ID , FIRST_NAME , LAST_NAME ] 

   ��, DEPARTMENTS ���̺��� MANAGER_ID �� NULL�� �����͵� ��µǵ��� ���ּ���.

   ��Ʈ  : �� ���̺��� �����Ͱ� �ְ�, �ٸ� ���̺��� ���� �����͸� �������� ���� OUTER JOIN �� Ȱ���� �� �ֽ��ϴ�. 
   ��Ʈ2 : DEPARTMENTS ���̺��� MANAGER_ID �� EMPLOYEES ���̺��� EMPLOYEE_ID �÷��� ���� ���踦 ������ �ֽ��ϴ�. 
     
[��� ���] (�� 21��) *��� ���� ��� x 

DEPARTMENT_ID   DEPARTMENT_NAME   MANAGER_ID   FIRST_NAME   LAST_NAME 
    90	            Executive	     100	    Steven	    King
    100	            Finance	         108	    Nancy	    Greenberg
    30	            Purchasing	     114	    Den	        Raphaely
    ...             ...              ...        ...         ... 
    130         	Corporate Tax    null       null        null 			
    120	            Treasury		 null       null        null 

*/ 





/* 
4. 3������ �ۼ��� ������ ANSI����� ���ι������� �ٲپ��ּ���. 

[��� ���] (�� 21��) *��� ���� ��� x 

DEPARTMENT_ID   DEPARTMENT_NAME   MANAGER_ID   FIRST_NAME   LAST_NAME 
    90	            Executive	     100	    Steven	    King
    100	            Finance	         108	    Nancy	    Greenberg
    30	            Purchasing	     114	    Den	        Raphaely
    ...             ...              ...        ...         ... 
    130         	Corporate Tax    null       null        null 			
    120	            Treasury		 null       null        null 
*/ 





/* 
5(��ȭ). ���̺� 3���� �ѹ��� �����غ����� �մϴ�. 
        �츮�� �����͸� �ѹ��� ���������� �ϴ� ���̺�� �÷��� �Ʒ��� �����ϴ�. 
        [ DEPARTMENTS  => DEPARTMENT_ID , DEPARTMENT_NAME , LOCATION_ID ] 
        [ LOCATIONS    => CITY , COUNTRY_ID ]
        [ COUNTRIES   => COUNTRY_NAME ] 

        ���̺� DEPARTMENTS �� LOCATIONS ������ LOCATION_ID �÷����� ���� �ǹ̰� ����Ǿ��ֽ��ϴ�.
        ���̺� LOCATIONS �� COUNTRY_ID �� COUNTRY_ID �÷����� ���� �ǹ̰� ����Ǿ��ֽ��ϴ�. 

        INNER JOIN �� ���� �� ���̺��� ��� ���������� �����ϵ��� �����͸� ������ּ���. 
        ��, DEPARTMENT_ID �� 10,50,60 �� �����͸� ������ּ���. 

[��°�� (�� 3��) *��� ��� ��� X 
DEPARTMENT_ID   DEPARTMENT_NAME   LOCATION_ID    CITY                COUNTRY_ID     COUNTRY_NAME
     60	         IT	                 1400	     Southlake	            US	        United States of America
     50	         Shipping	         1500	     South San Francisco	US	        United States of America
     10	         Administration	     1700	     Seattle	            US	        United States of America
*/ 











--------------------------------------------------------
--1�� ��) 
SELECT A.EMPLOYEE_ID 
     , A.FIRST_NAME 
     , A.DEPARTMENT_ID
     , B.DEPARTMENT_NAME 
     , B.LOCATION_ID
  FROM EMPLOYEES A
     , DEPARTMENTS B 
 WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID
   AND A.SALARY BETWEEN 4500 AND 6000 ;


--2�� ��) 
SELECT A.EMPLOYEE_ID 
     , A.FIRST_NAME 
     , A.DEPARTMENT_ID
     , B.DEPARTMENT_NAME 
     , B.LOCATION_ID
  FROM EMPLOYEES A INNER JOIN DEPARTMENTS B ON ( A.DEPARTMENT_ID = B.DEPARTMENT_ID ) 
 WHERE A.SALARY BETWEEN 4500 AND 6000 ;
 
 
--3�� ��) 
SELECT A.DEPARTMENT_ID 
     , A.DEPARTMENT_NAME 
     , A.MANAGER_ID 
     , B.FIRST_NAME 
     , B.LAST_NAME 
  FROM DEPARTMENTS A 
     , EMPLOYEES B 
 WHERE A.MANAGER_ID = B.EMPLOYEE_ID(+)
   AND A.LOCATION_ID = 1700 ;


--4�� ��) 
SELECT A.DEPARTMENT_ID 
     , A.DEPARTMENT_NAME 
     , A.MANAGER_ID 
     , B.FIRST_NAME 
     , B.LAST_NAME 
  FROM DEPARTMENTS A LEFT OUTER JOIN EMPLOYEES B ON (A.MANAGER_ID = B.EMPLOYEE_ID) 
 WHERE A.LOCATION_ID = 1700 ;


--5�� ��) 
SELECT A.DEPARTMENT_ID 
     , A.DEPARTMENT_NAME 
     , A.LOCATION_ID 
     , B.CITY 
     , B.COUNTRY_ID
     , C.COUNTRY_NAME
  FROM DEPARTMENTS A 
     , LOCATIONS B
     , COUNTRIES C 
 WHERE A.LOCATION_ID = B.LOCATION_ID 
   AND B.COUNTRY_ID = C.COUNTRY_ID 
   AND A.DEPARTMENT_ID IN(10 , 50 , 60);