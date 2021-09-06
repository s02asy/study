package E3_While_Quiz;

import java.util.Scanner;

public class E3_While4_ATM2문제 {

	public static void main(String[] args) {
		/*
		 * # ATM
		 * 1. 로그인
		 * . 로그인 후 재 로그인 불가
		 * . 로그아웃 상태에서만 이용 가능	 4:00
		 * 2. 로그아웃
		 * . 로그인 후 이용가능
	     * 3. 조회 (로그인 후 이용가능)
		 */
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 10000;
		
		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 20000;
		
		int log = -1; // -1(로그아웃), 1(dbAcc1로그인), 2(dbAcc2로그인)
		
		boolean run = true;
		while(run) {
			
			System.out.println("1.로그인");
			System.out.println("2.로그아웃");
            System.out.println("3.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				if(log == -1) {
					System.out.println("아이디를 입력하세요.");
					int id = scan.nextInt();
					System.out.println("비밀번호를 입력하세요.");
					int pw = scan.nextInt();
					if(id == dbAcc1 && pw == dbPw1) {
						log = 1;
						System.out.println(dbAcc1 + "님 환영합니다.");
					}
					else if(id == dbAcc2 && pw == dbPw2) {
						log = 2;
						System.out.println(dbAcc2 + "님 환영합니다.");
					}
					else {
						System.out.println("가입되지 않은 아이디거나 비밀번호가 틀립니다.");
					}
				}
				else if(log != -1) {
					System.out.println("이미 로그인이 되어있습니다.");
				}
			}
			else if(sel == 2) {
				if(log != -1) {
					System.out.println("로그아웃 합니다.");
					log = -1;
				}
				else if(log == -1) {
					System.out.println("로그인 후 이용가능");
				}
			}
			else if(sel == 3) {
				if(log == 1) {
					System.out.println("현재 잔액은 : " + dbMoney1);
				}
				else if(log == 2) {
					System.out.println("현재 잔액은 : " + dbMoney2);
				}
				else if(log == -1) {
					System.out.println("로그인후 조회가 가능합니다.");
				}
			}
			else if(sel == 0) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

}