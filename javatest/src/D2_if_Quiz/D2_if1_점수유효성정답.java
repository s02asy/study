package D2_if_Quiz;

import java.util.Scanner;

/*
 * # 점수 유효성 검사
 * 1. 점수을 입력받는다.
 * 2. 점수가  60점 이상이면 합격, 60점 미만이면 불합격이다.
 * 3. 단, 입력받은 정수가 
 *    음수이거나 100점을 초과하면, 예외 메세지를 출력한다.
 *    예) 점수를  잘못 입력했습니다.
 */
public class D2_if1_점수유효성정답 {
	public static void main(String[] args) {		
Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = scan.nextInt();
		
		if(60 <= score && score <= 100) {
			System.out.println("합격1");
		}
		
		System.out.println("------------------------------------");
		
		//# if문 안의 if문
		 
		if(score >= 60) {
			if(score <= 100) {
				System.out.println("합격2");
			}
		}
		
		if(0 <= score && score < 60) {
			System.out.println("불합격");
		}
		
		if(100 < score || score < 0) {
			System.out.println("점수를 잘못 입력했습니다.");
		}
		
				
	}
}
