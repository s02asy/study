package R5_인터페이스활용;

import java.util.Scanner;

public class _Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
						
		Controller con = Controller.getInstance();
		con.init();		
		MemberDAO dao = MemberDAO.getInstance();
		dao.init();
		
		while (true) {
			System.out.println("==메뉴==");
			System.out.println("1) 추가");
			System.out.println("2) 삭제");
			System.out.println("3) 수정");
			System.out.println("4) 출력");
			System.out.println("0) 종료");
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
