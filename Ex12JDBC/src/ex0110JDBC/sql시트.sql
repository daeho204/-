--주석--
--JDBC 실습 진행할 테이블 만들기--
create table jdbc_member(
id varchar2(100) primary key,
pw varchar2(100),
name varchar2(100),
birth varchar2(100)
);

insert into jdbc_member values ('test2', 'test2', 'test2', 'test2');
select * from jdbc_member;

