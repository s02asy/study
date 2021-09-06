package D3_if_Quiz;

import java.util.Scanner;

public class D3_if4_로그인정답 {

public static void main(String[] args) {
		
		// 03:52 ~ 04:00 // 신호전송 전까지 
		int dbid = 1234;
		int dbpw = 1111;
				
		// 문제1) 아이디와 비밀번호를 입력받고 로그인성공 , 실패 출력 		
		// 조건) 아이디를 입력받고 아이디만 검사후 아이디가 맞으면 비밀번호 
		//      물어보기 	
		Scanner scan = new Scanner(System.in);		
		System.out.println("아이디 입력 : ");
		int id = scan.nextInt();
		if(id == dbid) {
			System.out.println("비밀번호 입력 : ");
			int pw = scan.nextInt();
			if(pw == dbpw) {
				System.out.println("로그인");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
	}
}
