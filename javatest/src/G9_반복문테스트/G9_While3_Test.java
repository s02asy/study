package G9_반복문테스트;

import java.util.Scanner;

public class G9_While3_Test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	/*
		//문제1) 아이디와 비밀번호를 입력받고 
		// 조건) 3번틀리면 "가까운 은행을 방문해주세요" 후 종료.
		// 조건) 맞으면   "로그인" 후 종료.
		id = 1234;
		pw = 4321;	
	*/
		int dbid = 1111;
		int dbpw = 2222;
		int fail = 0;
		boolean run = true;
		while(run) {
			System.out.println("아이디를 입력해 주세요.");
			int id = scan.nextInt();
			System.out.println("비밀번호를 입력해주세요.");
			int pw = scan.nextInt();
			if(dbid == id && dbpw == pw) {
				System.out.println("로그인");
				break;
			}
			else {
				fail += 1;
				System.out.println("잘못된 아이디 이거나 비밀번호가 틀립니다.");
				System.out.println("남은 횟수 : " + fail + "/3");
			}
			if(fail == 3) {
				System.out.println("3회 틀렸습니다. 가까운 은행으로 방문해주세요.");
				break;
			}
		}
	}
}