package K0_배열심화_기본;

import java.util.Scanner;

public class a {
	/*
	 * # 소수찾기[2단계]
	 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
	 * 예)
	 * 입력 : 20
	 * 2, 3, 5, 7, 11, 13, 17, 19
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 30;
		for(int i = 2; i <= num; i++) {
			int cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					cnt += 1;
				}
			}
			if(cnt == 2) {
				System.out.print(i);
				System.out.print("소수o");
				System.out.println();
			}
			else {
				System.out.print(i);
				System.out.print("소수x");
				System.out.println();
			}
			
		}
	
		System.out.println();

	}
		
}