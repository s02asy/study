package P3_02_���������_���;

import java.util.Scanner;

public class Controller {
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);

	void init() {
		memberDAO = new MemberDAO();
		memberDAO.init("src/P3_02_���������_���/memberList.txt" , 100);
		
		mainMenu();
	}

	
	void mainMenu() {
		while (true) {
			System.out.println("[1]�߰� [2]���� [3]���� [4]��� "
					+ "[5]���� [6]�ε� [0]����");
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