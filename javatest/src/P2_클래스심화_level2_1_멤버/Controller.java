package P2_Ŭ������ȭ_level2_1_���;

import java.util.Scanner;

public class Controller {
	Scanner scan;
	MemberDAO memberDAO;
	
	void init() {
		scan = new Scanner(System.in);
		memberDAO = new MemberDAO();
		memberDAO.init(100);
	}
	void run() {
		while(true) {
			System.out.println("[1]�߰� [2]���� [3]���� [4]���  [0]����");
			int sel = scan.nextInt();
			if(sel == 1) {
				memberDAO.join();
			}else if(sel == 2) {
				memberDAO.delete();
			}else if(sel == 3) {
				memberDAO.update();
			}else if(sel == 4) {
				memberDAO.printAll();
			}else if(sel == 0) {
				System.out.println("[����]");
				break;
			}
		}
	}
}
