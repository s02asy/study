package P2_Ŭ������ȭ_level2;
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
			System.out.print("�� ");
		}
		else {
			System.out.print("�� ");
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
			System.out.println("���̻� ������ �� �����ϴ�.");
			return;
		}
		if(userlog != "") {
			System.out.println("�α׾ƿ� �� �̿����ּ���.");
			return;
		}
		System.out.println("���̵� �Է����ּ���.");
		String myId = scan.next();
		boolean check = false;
		for(int i = 0; i < usercnt; i++) {
			if(userlist[i].id.equals(myId)) {
				check = true;
				break;
			}
		}
		if(check == false) {
			System.out.println("��й�ȣ�� �Է����ּ���.");
			String myPw = scan.next();
			userlist[usercnt].setData(myId, myPw);
			usercnt += 1;
			System.out.println(myId + "�� ȸ�������� �Ϸ�Ǿ����ϴ�.");
		}else {
			System.out.println("�ߺ��� ���̵��Դϴ�.");
		}
	}
	
	boolean login() {
		System.out.println("���̵� �Է��ϼ���.");
		String myId = scan.next();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
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
		System.out.println("�¼� ��Ȳ");
		for(int i = 0; i < seatlist.length; i++) {
			seatlist[i].showNum();
		}
		System.out.println();
		for(int i = 0; i < seatlist.length; i++) {
			seatlist[i].showData();
		}
		System.out.println();
		System.out.println(userlog + "�� ȯ���մϴ�.");
		System.out.println("1)��ȭ���� 2)������� 3)����Ȯ�� 0)�α׾ƿ�");
		int sel = scan.nextInt();
		if(sel == 1) {
			System.out.println("�¼� ��ȣ�� �����ϼ���.");
			int num = scan.nextInt();
			if(seatlist[num - 1].check == false) {
				seatlist[num - 1].check = true;
				seatlist[num - 1].userID = userlog;
				System.out.println(userlog + "�� " + num + "�� �¼� ���� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("�̹� �������� �¼��Դϴ�.");
			}
		}else if(sel ==2) {
			boolean check = false;
			for(int i = 0; i < seatlist.length; i++) {
				if(seatlist[i].userID.equals(userlog)) {
					check = true;
				}
			}
			if(check == true) {
				System.out.println(userlog + "�� ���� ��Ȳ");
				for(int i = 0; i < seatlist.length; i++) {
					System.out.print((i + 1) + " ");
				}
				System.out.println();
				for(int i = 0; i < seatlist.length; i++) {
					if(seatlist[i].userID.equals(userlog)) {
						System.out.print("�� ");
					}else {
						System.out.print("�� ");
					}
				}
				System.out.println();
				System.out.println("����Ͻ� �¼���ȣ�� �����ϼ���.");
				int num = scan.nextInt();
				if(seatlist[num - 1].userID.equals(userlog)) {
					seatlist[num - 1].userID = "";
					seatlist[num - 1].check = false;
					System.out.println(userlog + "�� " + num + "�� �¼� ������� �Ϸ�Ǿ����ϴ�.");
				}else {
					System.out.println("�����Ͻ� �¼���ȣ�� �ƴմϴ�.");
				}
			}else {
				System.out.println(userlog + "�� ���ŵ� �¼��� �����ϴ�.");
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
					System.out.println(userlog + "�� ���� ��Ȳ");
					for(int i = 0; i < seatlist.length; i++) {
						System.out.print((i + 1) + " ");
					}
					System.out.println();
					for(int i = 0; i < seatlist.length; i++) {
						if(seatlist[i].userID.equals(userlog)) {
							System.out.print("�� ");
						}else {
							System.out.print("�� ");
						}
					}
					System.out.println();
					System.out.println("0)�ڷΰ���");
					int pick = scan.nextInt();
					if(pick == 0) {
						break;
					}
				}
			}else {
				System.out.println(userlog + "�� ���ŵ� �¼��� �����ϴ�.");
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
			System.out.println("1.ȸ������ 2.�α��� 0.����");
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
					System.out.println("���̵� �Ǵ� �н����尡 Ʋ�Ƚ��ϴ�.");
				}
			}else if(sel == 0) {
				break;
			}
		}
	}
}
public class P2_Ŭ������ȭ2_��ȭ����_���� {
	public static void main(String[] args) {
		//[ȸ������] [�α���] [����] [���] ��� ��� ������
		//Ŭ�����迭Ȱ��
		controller run = new controller();
		run.run();
	}
}