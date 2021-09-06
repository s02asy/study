package P2_클래스심화_level2_2_영화예매;

import java.util.Scanner;

public class Controller {
	Scanner scan = new Scanner(System.in);

	SeatDAO seatDAO;
	UserDAO userDAO;
	String log;

	void init() {
		seatDAO = new SeatDAO();
		userDAO = new UserDAO();
		userDAO.init();
		seatDAO.init();
		log = null;
	}

	void run() {
		loginMenu();
	}
	void loginMenu() {
		
		while (true) {
			
			System.out.println("1)로그인 0)종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				log = userDAO.loginCheck();
				if(log != null) {
					seatMenu();
				}
			}else if(sel ==0) {
				System.out.println("[종료]");
				break;
			}					
		}
	}
	void seatMenu() {
		while(true) {
			System.out.println("1)영화예매 2)예매취소 3)예매확인 0)로그아웃");
			int sel = scan.nextInt();
			if(sel == 1) {
				seatDAO.ticketing(log);
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}else if(sel == 0) {
				System.out.println("[로그아웃]");
				break;
			}
		}
	}
}
