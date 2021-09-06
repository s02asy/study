
CREATE DATABASE jsp_03_02_mvc2_board;

use jsp_03_02_mvc2_board;

CREATE TABLE board(
	num INT,
    writer VARCHAR(20),
    email VARCHAR(20),
    subject VARCHAR(50),
    pw VARCHAR(20),
    content VARCHAR(100),
    regDate VARCHAR(20),
    ref INT,
    reStep INT,
    reLevel INT,
    readCount INT
);
	
