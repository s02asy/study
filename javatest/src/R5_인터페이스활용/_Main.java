package R5_�������̽�Ȱ��;

import java.util.Scanner;

public class _Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
						
		Controller con = Controller.getInstance();
		con.init();		
		MemberDAO dao = MemberDAO.getInstance();
		dao.init();
		
		while (true) {
			System.out.println("==�޴�==");
			System.out.println("1) �߰�");
			System.out.println("2) ����");
			System.out.println("3) ����");
			System.out.println("4) ���");
			System.out.println("0) ����");
			int sel = scan.nextInt();
			if (sel == 1) {
				ActionInsert insert = (ActionInsert)con.getAction("insert");			
				insert.excute();
			} else if (sel == 2) {
				ActionDelete delete = (ActionDelete)con.getAction("delete");			
				delete.excute();
			} else if (sel == 3) {

			} else if (sel == 4) {

			} else if (sel == 0) {
				break;
			}
		}
		scan.close();

	}
}
