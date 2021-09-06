package P2_Ŭ������ȭ_level3_5_�Խ���;

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
		System.out.println("[�۾���]������ �Է��ϼ���.");
		String title = scan.nextLine();
		System.out.println("[�۾���]������ �Է��ϼ���.");
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
			System.out.println("[���б�]��ȣ�� �������ּ���.");
			int sel = scan.nextInt();
			DAO.writecheck(sel);
		}else {
			System.out.println("�ۼ����� �����ϴ�.");
		}
	}
	
	void mywrite() {
		System.out.println(mm.memberlog + "�� �ۼ��� ���");
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
