package P2_클래스심화_level3_2_영화예매;

import java.util.Scanner;

public class MovieManager {
	Scanner scan= new Scanner(System.in);
	String log = "";
	SeatDAO seatDAO;
	UserDAO userDAO; 
	
	void init(UserDAO userdao , SeatDAO seatdao) {
		userDAO = userdao;
		seatDAO = seatdao;	
	}
	
	String loginCheck() {
		System.out.println("아이디 입력 : ");
		String id = scan.next();
		System.out.println("비밀번호 입력 : ");
		String pw = scan.next();
		
		log = userDAO.checkLog(id, pw);
		if(log == null) {
			System.out.println("[로그인 실패]");
			return null;
		}else {
			System.out.println(log + " 로그인 성공");
			return log;
		}		
	}
	
	void ticketing(String log) {
		seatDAO.printSeat();
		System.out.println("[예매] 번호를 입력 : ");
		int sel = scan.nextInt();
		if(sel <= 0 || sel > seatDAO.getMaxSize()) {
			return;
		}
		sel -= 1;
		
		
		if(seatDAO.checkTicketing(sel) == false) {
			
			seatDAO.setTicketing(sel, log , true);
			
			System.out.println("[예메완료]");
			seatDAO.printSeat();
		}else {
			System.out.println("[예매할수없습니다]");
		}
		
	}
	
	
}
