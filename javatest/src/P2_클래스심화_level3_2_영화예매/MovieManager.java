package P2_Ŭ������ȭ_level3_2_��ȭ����;

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
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		System.out.println("��й�ȣ �Է� : ");
		String pw = scan.next();
		
		log = userDAO.checkLog(id, pw);
		if(log == null) {
			System.out.println("[�α��� ����]");
			return null;
		}else {
			System.out.println(log + " �α��� ����");
			return log;
		}		
	}
	
	void ticketing(String log) {
		seatDAO.printSeat();
		System.out.println("[����] ��ȣ�� �Է� : ");
		int sel = scan.nextInt();
		if(sel <= 0 || sel > seatDAO.getMaxSize()) {
			return;
		}
		sel -= 1;
		
		
		if(seatDAO.checkTicketing(sel) == false) {
			
			seatDAO.setTicketing(sel, log , true);
			
			System.out.println("[���޿Ϸ�]");
			seatDAO.printSeat();
		}else {
			System.out.println("[�����Ҽ������ϴ�]");
		}
		
	}
	
	
}
