package D1_if_Quiz;

import java.util.Scanner;

public class D1_if4_문제 {
	public static void main(String[] args) {
		/*
		 * # 로그인[1단계]
		 * 1. Id와 Pw를 입력받는다.
		 * 2. 입력받은 데이터와 db데이터를 비교해 로그인 처리를 진행한다.
		 * 예) 로그인 성공 or 로그인 실패
		 */
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("아이디를 입력하세요.");
		int Id = scan.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		int Pw = scan.nextInt();
		if(dbId == Id && dbPw == Pw) {
			System.out.println("로그인 성공");
		}
		if(dbId != Id || dbPw != Pw) {
			System.out.println("로그인 실패");
		}
	}
}
