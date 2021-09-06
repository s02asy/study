package Q2_01_스태틱사용전;
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
	Scanner scan  = new Scanner(System.in);
	Vector<User> userlist = new Vector<User>();
	void dataSetting(String data){
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
	boolean checkId(String id) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId())) {
				return true;
			}
		}
		
		return false;
	}
	boolean checkLogin(String id , String pw) {
		for(int i =0; i < userlist.size(); i++) {
			if(id.equals(userlist.get(i).getId()) && 
					pw.equals(userlist.get(i).getPw())) {
				return true;
			}
		}
		
		return false;
	}
	
	void join(AccountDAO am) {
		System.out.println("[회원가입] id 를 입력하세요. ");
		String id = scan.next();
		if(checkId(id)) {
			System.out.println("중복id 입니다.");
		}else {
			System.out.println("[회원가입] 비밀번호를 입력하세요. ");
			String pw = scan.next();
			System.out.println("[회원가입] 이름을 입력하세요. ");
			String name = scan.next();
			User user =new User();
			user.setId(id);
			user.setPw(pw);
			user.setName(name);
			
			userlist.add(user);
			am.openAccount(id);
			System.out.println("회원가입을 축하합니다.");
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
	Scanner scan  = new Scanner(System.in);
	Vector<Account> accountlist = new Vector<Account>();
	void dataSetting(String data){
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
	Vector<Account> getPersonalAccount(String id){
		Vector<Account> personalList = new Vector<Account>();
		for(int i = 0; i < accountlist.size(); i++) {
			if(accountlist.get(i).getUserId().equals(id)) {
				personalList.add(accountlist.get(i));
			}
		}
		return personalList;
	}
	void openAccount(String id) {
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
		System.out.println(id + " : " + acId);
		Account ac = new Account();
		ac.setAccountId(acId);
		ac.setUserId(id);
		ac.setMoney(0);
	
		accountlist.add(ac);
	}
	void deposit(UserDAO um) {
		System.out.println("[입금] id 를 입력하세요. ");
		String id = scan.next();
		System.out.println("[입금] pw 를 입력하세요. ");
		String pw = scan.next();
		if(um.checkLogin(id, pw)) {
			System.out.println("[입금] 계좌번호를 선택하세요");
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}
			int sel = scan.nextInt();
			System.out.println("[입금] 금액을 입력하세요.");
			int money = scan.nextInt();
			int depositMoney = personalAccount.get(sel).getMoney();
			personalAccount.get(sel).setMoney(depositMoney + money);
		}
	}
	void checkBalance(UserDAO um) {
		System.out.println("[입금] id 를 입력하세요. ");
		String id = scan.next();
		System.out.println("[입금] pw 를 입력하세요. ");
		String pw = scan.next();
		if(um.checkLogin(id, pw)) {			
			Vector<Account> personalAccount = getPersonalAccount(id);
			for(int i = 0; i < personalAccount.size(); i++) {
				System.out.print("[" + i + "] " + personalAccount.get(i).getAccountId() + " : ");
				System.out.println(personalAccount.get(i).getMoney());
			}			
		}
	}
}
class Controller{
	AccountDAO am;
	UserDAO um;
	Scanner scan  = new Scanner(System.in);
	
	Controller() {		
		um = new UserDAO();		
		am = new AccountDAO();
			
		setSampleData();
		run();
	}
	void setSampleData() {
		String userdata = "test01/pw1/김철수\n";
		userdata += "test02/pw2/이영희\n";
		userdata += "test03/pw3/신민수\n";
		userdata += "test04/pw4/최상민";
				
		String accountdata = "test01/1111-1111-1111/8000\n";
		accountdata += "test02/2222-2222-2222/5000\n";
		accountdata += "test01/3333-3333-3333/11000\n";
		accountdata += "test03/4444-4444-4444/9000\n";
		accountdata += "test01/5555-5555-5555/5400\n";
		accountdata += "test02/6666-6666-6666/1000\n";
		accountdata += "test03/7777-7777-7777/1000\n";
		accountdata += "test04/8888-8888-8888/1000";		
		// 1) test01 김철수 는 계좌를 3개 가지고있다.
		// 2) test02 이영희 는 계좌를 2개 가지고있다.
		// 3) test03 신민수 는 계좌를 2개 가지고있다.
		// 4) test04 최상민 은 계좌를 1개 가지고있다. 
		
		um.dataSetting(userdata);
		am.dataSetting(accountdata);
	}
	
	void run() {
		
		while(true) {
			System.out.println("(1)회원가입  (2)입금 (3)조회 (4)계좌추가 (5)이체 (6)회원탈퇴 (7)계좌삭제 (0)종료");
			int sel = scan.nextInt();
			if(sel == 1) {
				um.join(am);				
			}
			else if(sel == 2) {
				am.deposit(um);
			}
			else if(sel == 3) {
				am.checkBalance(um);
			}
			else if(sel == 4) {
				//만들어보세요.
                //회원탈퇴시 (가지고있는계좌도 전부삭제)
			}
			else if(sel == 0) {
				System.out.println("종료");
				break;
			}
		}		
	}
}
public class Q2_01_스태틱사용전 {
	public static void main(String[] args) {
		Controller bank = new Controller();		
	}
}