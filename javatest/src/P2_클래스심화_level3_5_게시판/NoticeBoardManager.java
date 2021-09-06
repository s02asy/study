package P2_클래스심화_level3_5_게시판;

import java.util.Scanner;

public class NoticeBoardManager {
	NoticeBoardDAO DAO;
	MemberManager mm;
	Scanner scan = new Scanner(System.in);
	void init(NoticeBoardDAO DAO , MemberManager mm) {
		this.DAO = DAO;
		this.mm = mm;
	}
	
	void write() {
		System.out.println("[글쓰기]제목을 입력하세요.");
		String title = scan.nextLine();
		System.out.println("[글쓰기]내용을 입력하세요.");
		String content = scan.nextLine();
		NoticeBoard board = new NoticeBoard();
		board.title = title;
		board.content = content;
		DAO.plus(board , mm.memberlog);
	}
	
	void dummy() {
		DAO.dummy(mm.memberlog);
	}
	
	void read() {
		if(DAO.nbcnt > 0) {
			System.out.println("[긁읽기]번호를 선택해주세요.");
			int sel = scan.nextInt();
			DAO.writecheck(sel);
		}else {
			System.out.println("작성글이 없습니다.");
		}
	}
	
	void mywrite() {
		System.out.println(mm.memberlog + "님 작성글 목록");
		DAO.mycheck(mm.memberlog);
		System.out.println();
	}
	
	void next() {
		DAO.next();
	}
	
	void before() {
		DAO.before();
	}
	
	void print() {
		DAO.print();
		
	}
}
