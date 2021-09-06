package D1_if_Quiz;

import java.util.Scanner;

public class D1_if2_정답 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 예시) 숫자에 값을 입력받고 그숫자가  값이  4의 배수면 "4의 배수" 출력.
		System.out.println("예시) 숫자 입력 : ");
		int num2 = scan.nextInt();
		if (num2 % 4 == 0) {
			System.out.println("4의 배수이다.");
		}
		if (num2 % 4 != 0) {
			System.out.println("4의 배수가 아니다.");
		}

		// 문제1 ) 점수를 입력 받고 그 점수가 60 점이상이면 "합격", 아니면 "불합격" 출력.
		System.out.println("문제1) 점수 입력 : ");
		int score = scan.nextInt();
		if (score >= 60) {
			System.out.println("합격");
		}
		if (score < 60) {
			System.out.println("불합격");
		}
		
		// 문제2 ) 숫자를 입력받고 "짝수" "홀수" "0" 을 출력.
		
		// 문제3 ) 숫자 2개를 입력받고 더큰숫자를 출력 

	}
}
