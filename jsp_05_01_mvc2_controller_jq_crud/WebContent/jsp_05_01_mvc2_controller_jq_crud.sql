CREATE DATABASE jsp_05_01_mvc2_controller_jq_crud;
USE jsp_05_01_mvc2_controller_jq_crud;

CREATE TABLE member(
	id VARCHAR(20),
    passwd VARCHAR(20),
    name VARCHAR(20),
    reg_date DATETIME,
    address VARCHAR(100),
    tel VARCHAR(20)
);

SELECT * FROM member;