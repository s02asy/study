package P2_클래스심화_level3_5_게시판;

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
			System.out.println("[1]회원가입 [2]회원탈퇴 [3]회원정보수정 [4]로그인 [5]비밀번호 찾기 [0]종료");
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
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
	
	void board() {
		while(true) {
			nbm.print();
			System.out.println("[1]글쓰기 [2]글읽기 [3]이전페이지 [4]다음페이지 [5]내가쓴글 [6]더미생성 [0]로그아웃");
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
				System.out.println("로그아웃");
				mm.memberlog = "";
				break;
			}
		}
	}
}
