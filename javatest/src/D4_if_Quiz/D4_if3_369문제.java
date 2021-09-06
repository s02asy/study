package D4_if_Quiz;

import java.util.Random;
/*
 * # 369게임[1단계]
 * 1. 1~50 사이의 랜덤 숫자를 저장한다.
 * 2. 위 수에 369의 개수가
 * 	1) 2개이면, 짝짝을 출력
 *  2) 1개이면, 짝을 출력
 *  3) 0개이면, 해당 숫자를 출력
 * 예)
 * 		33	 : 짝짝
 * 		16	 : 짝
 * 		 7	 : 7
 */
public class D4_if3_369문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int r = ran.nextInt(50) + 1;
		int 십 = r / 10;
		int 일 = r % 10;
		int count = 0;
		if(십 == 3 || 십 == 6 || 십 == 9) {
			count = count + 1;
		//십 != 0 && 십 % 3 == 0
		}
		if(일 == 3 || 일 == 6 || 일 == 9) {
			count = count + 1;
		}
		if(count == 2) {
			System.out.println("짝짝");
		}
		else if(count == 1) {
			System.out.println("짝");
		}
		else {
			System.out.println(r);
		}
	}
}
