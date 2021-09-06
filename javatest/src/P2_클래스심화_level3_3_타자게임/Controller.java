package P2_클래스심화_level3_3_타자게임;

import java.util.Scanner;

public class Controller {
	Scanner scan; 
	MemberManager mm;	
	GameManager wm;
	WordDAO wordDAO;
	ScoreDAO scoreDAO;
	MemberDAO memberDAO;
	Member memberlog;
	
	void init() {
		scan = new Scanner(System.in);
		mm = new MemberManager();			
		wm = new GameManager();	
		wordDAO = new WordDAO();			
		scoreDAO = new ScoreDAO();
		memberDAO = new MemberDAO();
		
		
		
		wm.init(wordDAO , scoreDAO);
		mm.init(memberDAO);	
		
		memberDAO.init(100);		
		wordDAO.init(100);
		scoreDAO.init(5);
		wordDAO.insertSampleList();		
		memberlog = null;
		
		
		mainMeue();
	}
	
	
	void mainMeue() {
		while(true) {
			System.out.println("[1] 회원가입 [2] 로그인 [0] 종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				mm.join();
			}
			else if(sel == 2) {
				memberlog = mm.login();
				if(memberlog == null) {
					System.out.println("[로그인실패]");
				}else {
					System.out.println("[로그인성공]");
					gameMenu();
				}
			}
			else if(sel == 0) {
				System.out.println("[종료]");
				break;
			}
		}
	}
	void gameMenu() {		
		while(true) {
			String menu = "[1] 단어추가 [2] 단어삭제 [3] 게임 [4] 랭킹확인 [0] 로그아웃\n";
			System.out.println(menu);
			int sel = scan.nextInt();
			
			if(sel == 0) {
				System.out.println("[로그아웃]");
				break;
			}else if(sel == 1) {
				wm.insertWord();
			}else if(sel == 2) {
				wm.removeWord();
			}else if(sel == 3) {
				wm.gameStart(memberlog, 10);
			}else if(sel == 4) {
				wm.printRank();
			}
		}
		
	}
	
	
}
