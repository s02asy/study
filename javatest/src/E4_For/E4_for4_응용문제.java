package E4_For;

import java.util.Scanner;

public class E4_for4_응용문제 {
	/*
	 * 
	 * 1. 5회 반복을 하면서 정수를 입력받는다.
	 * 2. 입력받은 정수를 전부 합을 출력한다. 
	 * 3. 만약에 입력받은 합이 100 이상이면  반복이 5회가 아닐지라도 즉시 종료 
	 * 
	 * 예) 7 ==> 합 : 7 ,  14 ==> 합 : 21 , 1000 ==> 합 : 1021 !종료
	 * 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 5; i++) {
			if(total >= 100) {
				break;
			}
			else {
				System.out.println("정수 입력 [합 100이상 즉시종료] : ");
				int answer = scan.nextInt();
				total = total + answer;
				System.out.println(total);
			}
		}
	}

}