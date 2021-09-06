package C0_Operator_이론;

import java.util.Scanner;

public class C_Scanner_입력받기문제 {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		// 문제 1) 숫자 2개를 입력받아, 합 출력
		System.out.println("숫자를 입력 하세요.");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력 하세요.");
		int num2 = scan.nextInt();
		System.out.println("두수의 합은 " + num1 + num2 + "입니다.");
		*/
		/*
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.println("숫자 1개를 입력하세요.");
		int num4 = scan.nextInt();
		System.out.println(num4 % 2 == 1);
		*/
		// 문제 3) 성적을 입력받아, 60점 이상이고 100점 이하이면 true 출력
		System.out.println("시험점수를 입력하세요.");
		int 점수 = scan.nextInt();
		System.out.println(점수 >= 60 && 점수 <= 100);
	}
}
