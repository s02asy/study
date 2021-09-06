CREATE DATABASE jsp_05_02_mvc2_board;

use jsp_05_02_mvc2_board;

CREATE TABLE board(
    writer VARCHAR(20),
    title VARCHAR(50),
    pw VARCHAR(20),
    content VARCHAR(100),
    regDate VARCHAR(20),
    ref INT,
    reStep INT,
    reLevel INT,
    readCount INT
);
	
    
    insert into board value('블리츠', '인간시대의 끝이 도래했다.', null, '종교를 믿습니까 휴면?', '2021-06-11 7:54:12', 1, 1, 1, 24);
    insert into board value('아리', '저랑 같이 노실분 구해요~', '2134', '저랑 놀려면 게임을 아주 잘하셔야해요', '2021-06-21 1:00:07', 2, 1, 1, 59);
    insert into board value('에코', '계획세우기 토론방', null, '시간이 얼마나있는지 상관없어 어떻게 쓰느냐가 중요하지', '2021-06-30 4:24:07', 3, 1, 1, 22);
    insert into board value('이즈리얼', '정보공유방', '415', '나만 믿으라구!', '2021-07-02 12:11:13', 4, 1, 1, 28);
    insert into board value('쓰레쉬', '영혼에 관심이 있는자..', '131', '엉청난 고통을 선사해주마.', '2021-07-07 13:41:23', 5, 1, 1, 15);
    insert into board value('카직스', '내삶의 변화가 필요할때', null, '변화는 좋은거야', '2021-07-10 11:24:07', 6, 1, 1, 1);
    insert into board value('티모', '크기가 전부는 아니잖아요', '5123', '핫둘셋넷!', '2021-07-11 17:24:07', 7, 1, 1, 42);
	insert into board value('녹턴', '어둠을 맞이하라', '3194', '한여름밤의 축제! 같이가실분 구함', '2021-07-11 23:43:59', 8, 1,1,0);
    insert into board value("철수", null, null, '나도 놀고 싶어', '2021-07-11 23:43:59', 2, 2, 2 , 0);
    insert into board value("영희", null, null, '싸움이야? 나도 끼어야지', '2021-07-11 23:43:59', 2, 2, 4, 0);
    insert into board value("민수", null, null, '너뭐해', '2021-07-11 23:43:59', 2, 3, 3, 0);
    insert into board value("브랜드", null, null, '세상을 불태울 준비는 되었나?', '2021-07-13 00:02:49', 8, 2, 2, 0);
    insert into board value("가렌", null, null, '정의의 이름으로', '2021-07-13 00:03:30', 8, 3, 3, 0);
    insert into board value("케넨", null, null, '그래그래!', '2021-07-13 00:03:57', 7, 2, 3, 0);
    insert into board value("람머스", null, null, '그래', '2021-07-13 00:04:07', 7, 2, 2, 0);
    insert into board value("렝가", null, null, 'ㅡㅡ', '2021-07-13 00:04:39', 6, 2, 2, 0);
    insert into board value("고양이", null, null, '야옹야옹', '2021-07-13 00:04:50', 6, 3, 3, 0);
    insert into board value("강아지", null, null, 'ㄹㅇ', '2021-07-13 00:05:18', 6, 4, 4, 0);
    insert into board value("루시안", null, null, '뭐래', '2021-07-13 00:05:39', 5, 2, 2, 0);
    insert into board value("승현", null, null, '아니요', '2021-07-13 00:08:19', 1, 2, 3, 0);
    insert into board value("오리아나", null, null, '재밌겠네요', '2021-07-13 00:08:35', 1, 2, 2, 0);
    