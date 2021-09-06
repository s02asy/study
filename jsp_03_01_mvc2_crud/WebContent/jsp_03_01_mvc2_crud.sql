CREATE DATABASE jsp_03_01_mvc2_crud;

USE jsp_03_02_mvc1_crud;

CREATE TABLE member(
    id VARCHAR(20),
    pw VARCHAR(20),
    name VARCHAR(20),
    tel VARCHAR(20),
    email VARCHAR(30),
    field VARCHAR(20),       -- 지원분야
    skill VARCHAR(300),       -- 기술능력
    major VARCHAR(20)        -- 전공분야
);

SELECT * FROM member;