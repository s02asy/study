package D1_if_Quiz;

import java.util.Scanner;

public class D1_if5_정답 {
	public static void main(String[] args) {
		
		/*
		 * # 회원가입 과 로그인 
		 * 1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
		 * 2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
		 * 3. 가입된 아이디와 비번과 로그인시 입력한 아이디와 비밀번호를 비교한다. 
		 * 예) 로그인 성공 or 로그인 실패
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int dbId = 0;
		int dbPw = 0;	
		System.out.println("=== 회원가입 ===");
		System.out.print("가입할 Id를 입력하세요 : ");
		dbId = scan.nextInt();
		System.out.print("가입할 Pw를 입력하세요 : ");
		dbPw = scan.nextInt();
		System.out.println("가입을 축하합니다.");
		
		System.out.println("=== 로그인 ===");
		System.out.print("ID 입력 : ");
		int myId = scan.nextInt();
		System.out.print("Pw 입력 : ");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("로그인 성공");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("로그인 실패");
		}		
	}
}
