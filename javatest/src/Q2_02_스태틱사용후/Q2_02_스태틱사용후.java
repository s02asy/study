package Q2_02_����ƽ�����;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

class User{
	private String id;
	private String pw;
	private String name;
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getPw() {
		return pw;
	}
	void setPw(String pw) {
		this.pw = pw;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
}
class UserDAO{
	static Scanner scan  = new Scanner(System.in);
	static Vector<User> userlist = new Vector<User>();
	static void dataSetting(String data){
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			User user = new User();
			String token2[] = token[i].split("/");
			user.setId(token2[0]);
			user.setPw(token2[1]);
			user.setName(token2[2]);
			userlist.add(user);
		}
	}	
	static boolean checkId(String id) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId())) {
				return true;
			}
		}
		
		return false;
	}
	static boolean checkLogin(String id , String pw) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId()) && 
					pw.equals(userlist.get(i).getPw())) {
				return true;
			}
		}
		
		return false;
	}
	
	static void join() {
		System.out.println("[ȸ������] id �� �Է��ϼ���. ");
		String id = scan.next();
		if(checkId(id)) {
			System.out.println("�ߺ�id �Դϴ�.");
		}else {
			System.out.println("[ȸ������] ��й�ȣ�� �Է��ϼ���. ");
			String pw = scan.next();
			System.out.println("[ȸ������] �̸��� �Է��ϼ���. ");
			String name = scan.next();
			User user =new User();
			user.setId(id);
			user.setPw(pw);
			user.setName(name);
			userlist.add(user);
			AccountDAO.openAccount(id);
			System.out.println("ȸ�������� �����մϴ�.");
		}
	}
}
class Account{
	private String userId;
	private String accountId;
	private int money;
	String getUserId() {
		return userId;
	}
	void setUserId(String userId) {
		this.userId = userId;
	}
	String getAccountId() {
		return accountId;
	}
	void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	int getMoney() {
		return money;
	}
	void setMoney(int money) {
		this.money = money;
	}
	
}
class AccountDAO{
	static Scanner scan  = new Scanner(System.in);
	static Vector<Account> accountlist = new Vector<Account>();
	static void dataSetting(String data){
		String token[] = data.split("\n");
		for(int i = 0; i < token.length; i++) {
			Account ac = new Account();
			String token2[] = token[i].split("/");
			ac.setUserId(token2[0]);
			ac.setAccountId(token2[1]);
			ac.setMoney(Integer.parseInt(token2[2]));
			accountlist.add(ac);
		}
	}	
	static void openAccount(String id) {
		Random ran = new Random();
		String acId = "";
		for(int i = 0; i < 3; i++) {
			int r1 = ran.nextInt(10);
			acId += r1;
			int r2 = ran.nextInt(10);
			acId += r2;
			int r3 = ran.nextInt(10);
			acId += r3;
			int r4 = ran.nextInt(10);
			acId += r4;
			if(i < 3 - 1) {
				acId += "-";
			}
		}
		System.out.println("[���»���]" +  id  + " : " + acId);
		Account ac = new Account();
		ac.setAccountId(acId);
		ac.setUserId(id);
		ac.setMoney(0);
		accountlist.add(ac);
	}
	static void accountPlus() {
		System.out.println("[�����߰�] id �� �Է��ϼ���. ");
		String id = scan.next();
		System.out.println("[�����߰�] pw �� �Է��ϼ���. ");
		String pw = scan.next();
		if(UserDAO.checkLogin(id, pw)) {
			Random ran = new Random();
			String acId = "";
			for(int i = 0; i < 3; i++) {
				int r1 = ran.nextInt(10);
				acId += r1;
				int r2 = ran.nextInt(10);
				acId += r2;
				int r3 = ran.nextInt(10);
				acId += r3;
				int r4 = ran.nextInt(10);
				acId += r4;
				if(i < 3 - 1) {
					acId += "-";
				}
			}
			System.out.println("[�����߰�]" +  id  + " : " + acId);
			Account ac = new Account();
			ac.setAccountId(acId);
			ac.setUserId(id);
			ac.setMoney(0);
			accountlist.add(ac);
		}
	}
	static Vector<Account> getPersonalAccount(String id){
		Vector<Account> personalList = new Vector<Account>();
		for(int i = 0; i < accountlist.size(); i++) {
			if(accountlist.get(i).getUserId().equals(id)) {
				personalList.add(accountlist.get(i));
			}
		}
		return personalList;
	}
	
	static void deposit() {
		System.out.println("[�Ա�] id �� �Է��ϼ���. ");
		String id = scan.next();
		System.out.println("[�Ա�] pw �� �Է��ϼ���. ");
		String pw = scan.next();
		if(UserDAO.checkLogin(id, pw)) {
			System.out.println("[�Ա�] ���¹�ȣ�� �����ϼ���");
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}
			int sel = scan.nextInt();
			System.out.println("[�Ա�] �ݾ��� �Է��ϼ���.");
			int money = scan.nextInt();
			int depositMoney = personalAccount.get(sel).getMoney();
			personalAccount.get(sel).setMoney(depositMoney + money);
		}
	}
	static void checkBalance() {
		System.out.println("[�Ա�] id �� �Է��ϼ���. ");
		String id = scan.next();
		System.out.println("[�Ա�] pw �� �Է��ϼ���. ");
		String pw = scan.next();
		if(UserDAO.checkLogin(id, pw)) {			
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}			
		}
	}
} 

class Controller{	
	Scanner scan  = new Scanner(System.in);	
	
	Controller(){
		setSampleData();
		run();
	}
	
	void setSampleData() {
		String userdata = "test01/pw1/��ö��\n";
		userdata += "test02/pw2/�̿���\n";
		userdata += "test03/pw3/�Źμ�\n";
		userdata += "test04/pw4/�ֻ��";
		
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";
		// 1) test01 ��ö�� �� ���¸� 3�� �������ִ�.
		// 2) test02 �̿��� �� ���¸� 2�� �������ִ�.
		// 3) test03 �Źμ� �� ���¸� 2�� �������ִ�.
		// 4) test04 �ֻ�� �� ���¸� 1�� �������ִ�. 		
		UserDAO.dataSetting(userdata);
		AccountDAO.dataSetting(accountdata);	
	}
	
	
	void run() {
		
		while(true) {
			System.out.println("(1)ȸ������ (2)�Ա� (3)��ȸ (4)�����߰� (0)����");
			int sel = scan.nextInt();
			if(sel == 1) {
				UserDAO.join();						
			}
			else if(sel == 2) {
				AccountDAO.deposit();				
			}
			else if(sel == 3) {
				AccountDAO.checkBalance();				
			}
			else if(sel == 4) {
				AccountDAO.accountPlus();
			}
			else if(sel == 0) {
				System.out.println("����");
				break;
			}
		}
		
	}
}
public class Q2_02_����ƽ����� {
	public static void main(String[] args) {
	
		Controller bank = new Controller();
	}
}