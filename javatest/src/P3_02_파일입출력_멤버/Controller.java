package P3_02_파일입출력_멤버;

import java.util.Scanner;

public class Controller {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);

	void init() {
		memberDAO = new MemberDAO();
		memberDAO.init("src/P3_02_파일입출력_멤버/memberList.txt" , 100);
		
		mainMenu();
	}

	
	void mainMenu() {
		while (true) {
			System.out.println("[1]추가 [2]삭제 [3]수정 [4]출력 "
					+ "[5]저장 [6]로드 [0]종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				memberDAO.join();
			}else if(sel == 2) {
				memberDAO.delete();
			}else if(sel == 3) {
				memberDAO.update();
			}else if(sel == 4) {
				memberDAO.printMemberList();
			}else if(sel == 5) {
				memberDAO.save();
			}else if(sel == 6) {
				memberDAO.load();
			}else if(sel == 0) {
				break;
			}
		}
	}
}