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
public class D2_if1_점수유효성문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int 점수 = scan.nextInt();
		if(점수 >= 60 && 점수 <= 100) {
			System.out.println("합격");
		}
		if(점수 < 60 && 점수 >= 0) {
			System.out.println("불합격");
		}
		if(점수 < 0 || 점수 > 100) {
			System.out.println("점수 오류");
		}
	}
}
