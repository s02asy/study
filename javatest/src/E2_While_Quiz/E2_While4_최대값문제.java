package E2_While_Quiz;

import java.util.Scanner;

public class E2_While4_최대값문제 {
	/*
	 * # 최대값 구하기[2단계]
	 * 1. 조건1) 양수
	 * 2. 조건2) 큰값은 짝수여야 한다.
	 * 3. 반복횟수를 입력받는다.
	 * 4. 입력받은 반복횟수만큼 숫자를 입력받고
	 * 5. 입력받은 숫자 중 가장 큰 값을 출력한다.
	 */

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("반복횟수를 입력하세요.");
		int 반복 = scan.nextInt();
		int run = 1;
		int max = 0;
		while(run <= 반복) {
			System.out.println("숫자를 입력하세요.");
			int 숫자 = scan.nextInt();
			if(숫자 > max && 숫자 % 2 == 0) {
				max = 숫자;
			}
			run += 1;
		}
		System.out.println("가장큰 짝수 : " + max);
	}

}