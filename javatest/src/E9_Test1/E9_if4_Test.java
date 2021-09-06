package E9_Test1;

import java.util.Scanner;

public class E9_if4_Test {
	public static void main(String[] args) {

		// ATM 필수 암기 문제
		// 로그인 이후에 새로운 메뉴가 나오도록 하기.

		// 1. 로그인 ==> 1.입금 2.출금 3.조회
		int cash = 20000; // 입금시 감소 , 출금시 증가
		int balance = 30000; // 입금시 증가 , 출금시 감소
		int account = 11111; // 로그인시 사용
		int password = 1234; // 로그인시 사용

		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.로그인 2.종료");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("계좌 번호를 입력하세요.");
			int 계좌 = scan.nextInt();
			if(계좌 == account) {
				System.out.println("비밀번호를 입력하세요");
				int 비밀번호 = scan.nextInt();
				if(password == 비밀번호) {
					System.out.println("1.입금 2.출금 3.조회");
					int 선택 = scan.nextInt();
					if(선택 == 1) {
						System.out.println("입금하실 금액을 입력해주세요.");
						int 입금 = scan.nextInt();
						if(입금 <= cash) {
							System.out.println("입금성공");
							balance = balance + 입금;
							cash = cash - 입금;
							System.out.println("balance : " + balance);
							System.out.println("cash : " + cash);
						}
						else {
							System.out.println("입금잔액을 확인해주세요.");
						}
					}
					else if(선택 == 2) {
						System.out.println("출금하실 금액을 입력해주세요.");
						int 출금 = scan.nextInt();
						if(출금 <= balance) {
							System.out.println("입금성공");
							balance = balance - 출금;
							cash = cash + 출금;
							System.out.println("balance : " + balance);
							System.out.println("cash : " + cash);
						}
						else {
							System.out.println("출금잔액을 확인해주세요.");
						}
						
					}else if(선택 == 3) {
						System.out.println("조회");
						System.out.println("balance : " + balance);
						System.out.println("cash : " + cash);
					}
				}
				else {
					System.out.println("비밀번호를 확인해주세요.");
				}
			}
			else {
				System.out.println("계좌번호를 확인해주세요.");
			}
		} else if (select == 2) {
			System.out.println("종료");
		}

	}
}