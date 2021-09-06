package K3_테스트_배열심화_level1;

import java.util.Scanner;

public class K3_테스트_배열심화1_소수여러개찾기2 {

	public static void main(String[] args) {
		/*
		 * # 소수 찾기[3단계]
		 * 1. 숫자를 한 개 입력받는다.
		 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
		 * 
		 * 예) Enter Number ? 1000
		 *    1000보다 큰 첫번재 소수는 1009
		 * 예) Enter Number ? 500
		 *    500보다 큰 첫번째 소수는 503
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		int index = number;
		for(int i = number; i <= number + 1000; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count += 1;
				}
			}
			if(count == 2 && i > number) {
				System.out.println(i);
				break;
			}
		}
	}
}