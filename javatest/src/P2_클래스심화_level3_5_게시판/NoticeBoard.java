package P2_클래스심화_level3_5_게시판;

public class NoticeBoard {
	int number;
	String title;
	String name;
	int inquiry;
	String content;
	int pageNum;
	
	void boardprint() {
		System.out.println("[" + number + "]" + "[제목 " + title + "]" +  "[작성자 " + name + "]" + "[조회수 " + inquiry + "]");
	}
}
