package P2_클래스심화_level2;
import java.util.Scanner;
class User1{
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

class Seat1{
	String userID;
	int number;
	boolean check;
	
	void showNum() {
		System.out.print(number + " ");
	}
	void showData() {
		
		if(check == true) {
			System.out.print("■ ");
		}
		else {
			System.out.print("□ ");
		}
	}
}

class controller {
	Scanner scan = new Scanner(System.in);
	User1 userlist[] = new User1[10];
	Seat1 seatlist[] = new Seat1[10];
	String userlog = "";
	int usercnt = 0;
	
	void set() {
		for(int i = 0; i < seatlist.length; i++) {
			seatlist[i] = new Seat1();
			seatlist[i].number = i + 1;
			seatlist[i].check = false;
			seatlist[i].userID = "";
		}
		for(int i = 0; i < userlist.length; i++) {
			userlist[i] = new User1();
		}
	}
	
	void userplus() {
		if(usercnt == 10) {
			System.out.println("더이상 가입할 수 없습니다.");
			return;
		}
		if(userlog != "") {
			System.out.println("로그아웃 후 이용해주세요.");
			return;
		}
		System.out.println("아이디를 입력해주세요.");
		String myId = scan.next();
		boolean check = false;
		for(int i = 0; i < usercnt; i++) {
			if(userlist[i].id.equals(myId)) {
				check = true;
				break;
			}
		}
		if(check == false) {
			System.out.println("비밀번호를 입력해주세요.");
			String myPw = scan.next();
			userlist[usercnt].setData(myId, myPw);
			usercnt += 1;
			System.out.println(myId + "님 회원가입이 완료되었습니다.");
		}else {
			System.out.println("중복된 아이디입니다.");
		}
	}
	
	boolean login() {
		System.out.println("아이디를 입력하세요.");
		String myId = scan.next();
		System.out.println("비밀번호를 입력하세요.");
		String myPw = scan.next();
		for(int i = 0; i < usercnt; i++) {
			if(userlist[i].checkLog(myId, myPw)) {
				userlog = myId;
				return true;
			}
		}
		return false;
	}
	
	boolean loginmenu() {
		System.out.println("좌석 현황");
		for(int i = 0; i < seatlist.length; i++) {
			seatlist[i].showNum();
		}
		System.out.println();
		for(int i = 0; i < seatlist.length; i++) {
			seatlist[i].showData();
		}
		System.out.println();
		System.out.println(userlog + "님 환영합니다.");
		System.out.println("1)영화예매 2)예매취소 3)예매확인 0)로그아웃");
		int sel = scan.nextInt();
		if(sel == 1) {
			System.out.println("좌석 번호를 선택하세요.");
			int num = scan.nextInt();
			if(seatlist[num - 1].check == false) {
				seatlist[num - 1].check = true;
				seatlist[num - 1].userID = userlog;
				System.out.println(userlog + "님 " + num + "번 좌석 예매 완료되었습니다.");
			}else {
				System.out.println("이미 예약중인 좌석입니다.");
			}
		}else if(sel ==2) {
			boolean check = false;
			for(int i = 0; i < seatlist.length; i++) {
				if(seatlist[i].userID.equals(userlog)) {
					check = true;
				}
			}
			if(check == true) {
				System.out.println(userlog + "님 예매 현황");
				for(int i = 0; i < seatlist.length; i++) {
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for(int i = 0; i < seatlist.length; i++) {
					if(seatlist[i].userID.equals(userlog)) {
						System.out.print("■ ");
					}else {
						System.out.print("□ ");
					}
				}
				System.out.println();
				System.out.println("취소하실 좌석번호를 선택하세요.");
				int num = scan.nextInt();
				if(seatlist[num - 1].userID.equals(userlog)) {
					seatlist[num - 1].userID = "";
					seatlist[num - 1].check = false;
					System.out.println(userlog + "님 " + num + "번 좌석 예매취소 완료되었습니다.");
				}else {
					System.out.println("예매하신 좌석번호가 아닙니다.");
				}
			}else {
				System.out.println(userlog + "님 예매된 좌석이 없습니다.");
			}
		}else if(sel == 3) {
			boolean check = false;
			for(int i = 0; i < seatlist.length; i++) {
				if(seatlist[i].userID.equals(userlog)) {
					check = true;
				}
			}
			if(check == true) {
				while(true) {
					System.out.println(userlog + "님 예매 현황");
					for(int i = 0; i < seatlist.length; i++) {
						System.out.print((i + 1) + " ");
					}
					System.out.println();
					for(int i = 0; i < seatlist.length; i++) {
						if(seatlist[i].userID.equals(userlog)) {
							System.out.print("■ ");
						}else {
							System.out.print("□ ");
						}
					}
					System.out.println();
					System.out.println("0)뒤로가기");
					int pick = scan.nextInt();
					if(pick == 0) {
						break;
					}
				}
			}else {
				System.out.println(userlog + "님 예매된 좌석이 없습니다.");
			}
		}else if(sel == 0) {
			userlog = "";
			return false;
		}
		return true;
	}
	void run() {
		set();
		while(true) {
			System.out.println("1.회원가입 2.로그인 0.종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				userplus();
			}else if(sel == 2) {
				if(login() == true) {
					while(true) {
						if(loginmenu() == false) {
							break;
						}
					}
				}else {
					System.out.println("아이디 또는 패스워드가 틀렸습니다.");
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}
public class P2_클래스심화2_영화예매_문제 {
	public static void main(String[] args) {
		//[회원가입] [로그인] [예매] [취소] 등등 기능 만들어보기
		//클래스배열활용
		controller run = new controller();
		run.run();
	}
}