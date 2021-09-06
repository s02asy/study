package D2_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # 구구단 게임[1단계]
 * 1. 구구단 문제를 출제하기 위해, 숫자 2개를 입력받는다.
 * 2. 입력받은 숫자를 토대로 구구단 문제를 출력한다.
 * 예)	3 x 7 = ?
 * 3. 문제에 해당하는 정답을 입력받는다.
 * 4. 정답을 비교 "정답" 또는 "땡"을 출력한다.
 */
public class D2_if5_구구단문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		/*System.out.println("첫번째숫자를 입력하세요.");
		int 숫자1 = scan.nextInt();
		System.out.println("두번째숫자를 입력하세요.");
		int 숫자2 = scan.nextInt();
		System.out.println(숫자1 + " * " + 숫자2 + " = " + "?");
		int 정답 = scan.nextInt();
		int 답 = 숫자1 * 숫자2;
		if(정답 == 답) {
			System.out.println("정답");
		}
		if(정답 != 답) {
			System.out.println("땡");
		}*/
		System.out.println("첫번째숫자 랜덤출력.");
		int 숫자1 = ran.nextInt(8) +2;
		System.out.println(숫자1);
		System.out.println("두번째숫자를 랜덤출력.");
		int 숫자2 = ran.nextInt(9) +1;
		System.out.println(숫자2);
		System.out.println(숫자1 + " * " + 숫자2 + " = " + "?");
		int 정답 = scan.nextInt();
		int 답 = 숫자1 * 숫자2;
		if(정답 == 답) {
			System.out.println("정답");
		}
		if(정답 != 답) {
			System.out.println("땡");
		}
	}
}
