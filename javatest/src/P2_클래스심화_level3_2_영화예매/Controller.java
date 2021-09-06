package P2_Ŭ������ȭ_level3_2_��ȭ����;

import java.util.Scanner;

public class Controller {
	MovieManager mm;
	SeatDAO seatDAO;
	UserDAO userDAO;
	Scanner scan = new Scanner(System.in);
	String log = "";

	void init() {
		mm = new MovieManager();
		seatDAO = new SeatDAO();
		userDAO = new UserDAO();

		mm.init(userDAO, seatDAO);

		userDAO.init();
		userDAO.printUserList();

		seatDAO.init();

		userMenu();
	}

	void userMenu() {

		while (true) {

			System.out.println("1)�α��� 0)����");
			int sel = scan.nextInt();
			if (sel == 1) {
				log = mm.loginCheck();
				if (log != null) {
					seatMenu();
				}
			} else if (sel == 0) {
				System.out.println("[����]");
				break;
			}
		}
	}

	void seatMenu() {
		while (true) {
			System.out.println("1)��ȭ���� 2)������� 3)����Ȯ�� 0)�α׾ƿ�");
			int sel = scan.nextInt();
			if (sel == 1) {
				mm.ticketing(log);
			} else if (sel == 2) {

			} else if (sel == 3) {

			} else if (sel == 0) {
				System.out.println("[�α׾ƿ�]");
				break;
			}
		}
	}

}
