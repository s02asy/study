package O5_메서드리턴_level2;

import java.util.Scanner;

//# ATM
// 아래 내용을 클래스 배열로 바꿔보시요


class Bank1{
	Scanner scan = new Scanner(System.in);	
	String name = "";	
	String[] arAcc = {"1111", "2222", "3333", "", ""};
	String[] arPw  = {"1234", "2345", "3456", "", ""};
	int[] arMoney  = {87000, 34000, 17500, 0, 0};	
	int count = 3;
	int loginCheck = -1;
	
	void showMember() {
		for(int i = 0; i < count; i++) {
			System.out.println("계좌번호 : " + arAcc[i] + " 비밀번호 : " + arPw[i] + " 잔액 : " + arMoney[i]);
		}
	}
	
	void showMenu() {
		System.out.print("# 로그인 상태 : ");
		if(loginCheck == -1){
			System.out.println("로그아웃");
		}else {
			System.out.println(arAcc[loginCheck] + "님, 로그인 중...");
		}

		System.out.println("=== " + name + " ===");
		System.out.println("1.회원가입");	
		System.out.println("2.회원탈퇴");
		System.out.println("3.로그인");
		System.out.println("4.로그아웃");
		System.out.println("5.입금하기");
		System.out.println("6.이체하기");
	}
	
	boolean checkAcc(String myAcc) {
		boolean check = false;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				check = true;
				break;
			}
		}
		return check;
	}
	
	int checkAcc() {
		System.out.println("탈퇴하실 계좌번호를 입력하세요.");
		String myAcc = scan.next();
		int accCheck = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc)) {
				accCheck = i;
			}
		}
		return accCheck;
	}
	
	int checkPw(int index) {
		System.out.println("비밀번호를 입력하세요.");
		String myPW = scan.next();
		int checkPw = -1;
		if(arPw[index].equals(myPW)) {
			checkPw = 1;
		}
		return checkPw;
	}
	void num1() {
		if(count == 5) {
			System.out.println("더이상 가입할 수 없습니다.");
		}
		System.out.println("가입하실 계좌번호를 입력하세요.");
		String myAcc = scan.next();
		boolean check = checkAcc(myAcc);
		if(check == true) {
			System.out.println("계좌번호가 중복 되었습니다.");
		}else {
			System.out.println("비밀번호를 입력하세요.");
			String myPw = scan.next();
			arAcc[count] = myAcc;
			arPw[count] = myPw;
			arMoney[count] = 1000;
			count += 1;
			System.out.println(myAcc + "님 회원가입을 축하드립니다.");
		}
	}
	
	void num2() {
		if(count == 0) {
			System.out.println("탈퇴하실 회원정보가 없습니다.");
			return;
		}
		if(loginCheck != -1) {
			System.out.println("로그아웃 후 진행해주세요.");
			return;
		}
		int accCheck = checkAcc();
		if(accCheck != -1) {
			int pwCheck = checkPw(accCheck);
			if(pwCheck == -1) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				for(int i = accCheck; i < count - 1; i++) {
					arAcc[i] = arAcc[i + 1];
					arPw[i] = arPw[i + 1];
					arMoney[i] = arMoney[i + 1];
				}
				count -= 1;
				arAcc[count] = "";
				arPw[count] = "";
				arMoney[count] = 0;
			}
		}else {
			System.out.println("계좌 정보가 없습니다.");
		}
	}
	
	void num3() {
		if(loginCheck != -1) {
			System.out.println("로그인 중입니다.");
			return;
		}
		System.out.println("계좌번호를 입력하세요.");
		String myAcc = scan.next();
		System.out.println("비밀번호를 입력하세요.");
		String myPw = scan.next();
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(myAcc) && arPw[i].equals(myPw)) {
				loginCheck = i;
			}
		}
		if(loginCheck == -1) {
			System.out.println("계좌번호 또는 비밀번호가 틀렸습니다.");
		}else {
			System.out.println("로그인 성공.");
		}
	}
	
	void num4() {
		if(loginCheck == -1) {
			System.out.println("로그인 후 진행해주세요.");
		}else {
			loginCheck = -1;
			System.out.println("로그아웃 성공.");
		}
	}
	
	void num5() {
		if(loginCheck == -1) {
			System.out.println("로그인 후 진행해주세요.");
			return;
		}
		System.out.println("입금하실 금액을 입력해주세요.");
		int money = scan.nextInt();
		arMoney[loginCheck] += money;
		System.out.println("입금을 완료하였습니다.");
	}
	
	void num6() {
		if(loginCheck == -1) {
			System.out.println("로그인 후 진행해주세요.");
			return;
		}
		System.out.println("이체하실 계좌번호를 입력해주세요.");
		String Acc = scan.next();
		int check = -1;
		for(int i = 0; i < count; i++) {
			if(arAcc[i].equals(Acc)) {
				check = i;
			}
		}
		if(check == -1) {
			System.out.println("계좌번호를 확인해주세요.");
		}else {
			System.out.println("이체하실 금액을 입력해주세요.");
			int money = scan.nextInt();
			if(arMoney[loginCheck] >= money) {
				arMoney[check] += money;
				arMoney[loginCheck] -= money;
				System.out.println("이체를 완료하였습니다.");
			}else {
				System.out.println("잔액이 부족합니다.");
			}
		}
	}
}


public class O5_매서드리턴_ATM_문제 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Bank1 woori = new Bank1();
		woori.name = "우리은행";
		
		while(true) {
			woori.showMember();
			woori.showMenu();
			System.out.print("메뉴를 선택해주세요 : ");
			int choice = scan.nextInt();
			if(choice == 1) {
				woori.num1();
			}else if(choice == 2) {
				woori.num2();
			}else if(choice == 3) {
				woori.num3();
			}else if(choice == 4) {
				woori.num4();
			}else if(choice == 5) {
				woori.num5();
			}else if(choice == 6) {
				woori.num6();
			}
			
		}		

		
	}
}