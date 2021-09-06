package P2_Ŭ������ȭ_level3_3_Ÿ�ڰ���;

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
			System.out.println("[1] ȸ������ [2] �α��� [0] ����");
			int sel = scan.nextInt();
			if(sel == 1) {
				mm.join();
			}
			else if(sel == 2) {
				memberlog = mm.login();
				if(memberlog == null) {
					System.out.println("[�α��ν���]");
				}else {
					System.out.println("[�α��μ���]");
					gameMenu();
				}
			}
			else if(sel == 0) {
				System.out.println("[����]");
				break;
			}
		}
	}
	void gameMenu() {		
		while(true) {
			String menu = "[1] �ܾ��߰� [2] �ܾ���� [3] ���� [4] ��ŷȮ�� [0] �α׾ƿ�\n";
			System.out.println(menu);
			int sel = scan.nextInt();
			
			if(sel == 0) {
				System.out.println("[�α׾ƿ�]");
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
