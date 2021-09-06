package P2_클래스심화_level3_2_영화예매;

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

			System.out.println("1)로그인 0)종료");
			int sel = scan.nextInt();
			if (sel == 1) {
				log = mm.loginCheck();
				if (log != null) {
					seatMenu();
				}
			} else if (sel == 0) {
				System.out.println("[종료]");
				break;
			}
		}
	}

	void seatMenu() {
		while (true) {
			System.out.println("1)영화예매 2)예매취소 3)예매확인 0)로그아웃");
			int sel = scan.nextInt();
			if (sel == 1) {
				mm.ticketing(log);
			} else if (sel == 2) {

			} else if (sel == 3) {

			} else if (sel == 0) {
				System.out.println("[로그아웃]");
				break;
			}
		}
	}

}
