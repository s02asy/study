package E2_While_Quiz;

import java.util.Scanner;

public class E2_While3_응용정답 {
	/*
	 * # 
	 * 1. 5회 반복을 하면서 정수를 입력받는다.
	 * 2. 입력받은 정수를 전부 합을 출력한다. 
	 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
	 * 
	 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		int total = 0;
		while (i < 5) {			
			if(total >= 100) {
				System.out.println("프로그램 종료");
				i = 5;
			}else {
				System.out.print("숫자 입력[종료 : 합(100)] : ");
				int num = scan.nextInt();
				total += num;
				System.out.println("합 : " + total);
				i += 1;	
			}
		}
	}
}