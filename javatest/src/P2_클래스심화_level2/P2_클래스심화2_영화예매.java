package P2_Ŭ������ȭ_level2;
import java.util.Scanner;
class User{
	String id;
	String pw;
	void setData(String id , String pw) {
		this.id = id; 
		this.pw = pw;
	}
	
	boolean checkLog(String id , String pw) {
		if(this.id.equals(id) && this.pw.equals(pw)) {
			return true;
		}
		return false;
	}
}
class Seat{
	String userID;
	int number;
	boolean check;
	
	void showNum() {
		System.out.print(number + " ");
	}
	void showData() {
		
		if(check == true) {
			System.out.print("�� ");
		}
		else {
			System.out.print("�� ");
		}
	}
	
}
class MovieController{
	User[] userList; 
	int userCount;
	Scanner scan= new Scanner(System.in);
	String log = "";
	
	Seat[] seatList = new Seat[8];
	
	
	void init() {
		String userData = "qwer/1234,asdf/4321";
		String[] userTokens = userData.split(",");
		userCount = userTokens.length;
		userList = new User[userCount];
		for(int i = 0; i < userList.length; i++) {
			userList[i] = new User();
			String[] userTokens2 = userTokens[i].split("/");
			userList[i].setData(userTokens2[0], userTokens2[1]);
		}
		printUserList();
		
		for(int i = 0; i < seatList.length; i++) {
			seatList[i] = new Seat();
			seatList[i].number = i + 1;
			seatList[i].userID = "";
			seatList[i].check = false;
		}
	}
	
	void printUserList() {
		for(int i = 0; i < userCount; i++) {
			System.out.println(userList[i].id + " " + userList[i].pw);
		}
	}
	
	boolean menuLogin() {
		System.out.println(log + "��");
		System.out.println("1)��ȭ���� 2)������� 3)����Ȯ�� 0)�α׾ƿ�");
		int sel = scan.nextInt();
		if(sel == 1) {
			
		}else if(sel ==2) {
			
		}else if(sel == 3) {
			
		}else if(sel == 0) {
			log = "";
			return false;
		}
		return true;
	}
	boolean loginCheck() {
		System.out.println("���̵� �Է� : ");
		String id = scan.next();
		System.out.println("��й�ȣ �Է� : ");
		String pw = scan.next();
		
		for(int i = 0; i < userCount; i++) {
			if(userList[i].checkLog(id, pw)) {
				log = id;
				return true;
			}
		}	
		return false;
	}
	
	void run() {
		
		while(true) {
			System.out.println("1)�α��� 0)����");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(loginCheck() == true) {
					while(true) {
						if(menuLogin() == false) {
							break;
						}					
					}				
				}
			}else if(sel == 0) {
				System.out.println("[����]");
				break;
			}
		}
	}
}

public class P2_Ŭ������ȭ2_��ȭ���� {
	public static void main(String[] args) {
		MovieController mc = new MovieController();
		mc.init();
		mc.run();
		
	}
}