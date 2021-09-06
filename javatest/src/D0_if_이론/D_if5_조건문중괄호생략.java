package D0_if_이론;

import java.util.Random;

public class D_if5_조건문중괄호생략 {
	public static void main(String[] args) {

		
		// if문 중괄호 생략
		
		// if 문의 경우 내용이 한줄일경우 {} 를 생략할수있다. 
		// 두줄이상일경우 생략하면 이상한 결과를 초래한다.
		
		int num = 10;
		if (num % 2 == 0) {
			System.out.println("짝수");
		}
		if (num % 2 == 1) {
			System.out.println("홀수");
		}
		System.out.println("-------------------------");
		
		if (num % 2 == 0)
			System.out.println("짝수");
		if (num % 2 == 1)
			System.out.println("홀수");

	}
}
