package P2_Ŭ������ȭ_level3_1_���_���Ͼ���;

import java.util.Scanner;

public class Controller {
	MemberManager mm;
	MemberDAO memberDAO;
	Scanner scan = new Scanner(System.in);
	
	void init() {
		mm =new MemberManager();
		memberDAO = new MemberDAO();
		
		mm.init(memberDAO);
		memberDAO.init(100);	
		
		memberMenu();
	}
	
	void memberMenu() {
		while(true) {
			System.out.println("[1]�߰� [2]���� [3]���� [4]���  [0]����");
			int sel = scan.nextInt();
			if(sel == 1) {
				mm.join();
			}else if(sel == 2) {
				mm.delete();
			}else if(sel == 3) {
				mm.update();
			}else if(sel == 4) {
				mm.printAll();
			}
		}
	}
}
