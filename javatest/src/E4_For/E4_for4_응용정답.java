package E4_For;

import java.util.Scanner;

public class E4_for4_응용정답 {
	public static void main(String[] args) {
		/*
		 * 
		 * 1. 5회 반복을 하면서 정수를 입력받는다.
		 * 2. 입력받은 정수를 전부 합을 출력한다. 
		 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
		 * 
		 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
		 * 
		 */		
		// 10 : 24 ~ 10 : 30 
		Scanner scan = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("숫자 입력 : ");
			int num = scan.nextInt();
			total = total + num;
			if(total >= 100) {
				i = 5;
			}
		}
		System.out.println(total);
		
		
	}
}