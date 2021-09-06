package D1_if_Quiz;

import java.util.Scanner;

public class D1_if5_문제 {
	public static void main(String[] args) {
		/*
		 * # 회원가입 과 로그인 
		 * 1. 먼저 아이디와 비밀번호를 입력해서 회원가입한다. 
		 * 2. 이후 로그인을 위해 다시 아이디와 비밀번호를 입력받는다.
		 * 3. 가입된 아이디와 비번과 로그인시 입력한 아이디와 비밀번호를 비교한다. 
		 * 예) 로그인 성공 or 로그인 실패
		 */
		Scanner scan = new Scanner(System.in);
		int join_id = 0;
		int join_pw = 0;
		int log_id = 0;
		int log_pw = 0;
		System.out.println("회원가입할 아이디를 입력하세요.");
		join_id = scan.nextInt();
		System.out.println("회원가입할 아이디의 비밀번호를 입력하세요.");
		join_pw = scan.nextInt();
		
		System.out.println("회원가입을 축하합니다.");
		
		System.out.println("로그인");
		
		System.out.println("아이디를 입력하세요.");
		log_id = scan.nextInt();
		System.out.println("비밀번호를 입력하세요.");
		log_pw = scan.nextInt();
		if(join_id == log_id && join_pw == log_pw) {
			System.out.println("로그인 성공");
		}
		if(join_id != log_id || join_pw != log_pw) {
			System.out.println("로그인 실패");
		}
	}
}
