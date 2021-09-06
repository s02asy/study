package P2_Ŭ������ȭ_level3_5_�Խ���;

import java.util.Scanner;

public class Controller {
	Scanner scan;
	MemberDAO DAO;
	MemberManager mm;
	NoticeBoardDAO DAO2;
	NoticeBoardManager nbm;
	void init() {
		scan = new Scanner(System.in);
		mm = new MemberManager();
		nbm = new NoticeBoardManager();
		DAO = new MemberDAO();
		DAO2 = new NoticeBoardDAO();
		
		DAO.init(100);
		DAO2.init(100);
		
		mm.init(DAO);
		nbm.init(DAO2, mm);
		
		run();
	}
	
	void run() {
		while(true) {
			for(int i = 0; i < mm.DAO.memcount; i++) {
				mm.DAO.memberlist[i].printmem();
			}
			System.out.println("[1]ȸ������ [2]ȸ��Ż�� [3]ȸ���������� [4]�α��� [5]��й�ȣ ã�� [0]����");
			int sel = scan.nextInt();
			if(sel == 1) {
				mm.join();
			}else if(sel == 2) {
				mm.del();
			}else if(sel == 3) {
				mm.change();
			}else if(sel == 4) {
				mm.login();
				if(mm.memberlog != "") {
					board();
				}
			}else if(sel == 5) {
				mm.findpw();
			}else if(sel == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
	
	void board() {
		while(true) {
			nbm.print();
			System.out.println("[1]�۾��� [2]���б� [3]���������� [4]���������� [5]�������� [6]���̻��� [0]�α׾ƿ�");
			int sel = scan.nextInt();
			if(sel == 1) {
				nbm.write();
			}else if(sel == 2) {
				nbm.read();
			}else if(sel == 3) {
				nbm.before();
			}else if(sel == 4) {
				nbm.next();
			}else if(sel == 5) {
				nbm.mywrite();
			}else if(sel == 6) {
				nbm.dummy();
			}else if(sel == 0) {
				System.out.println("�α׾ƿ�");
				mm.memberlog = "";
				break;
			}
		}
	}
}
