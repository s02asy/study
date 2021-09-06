package E0_loop_이론;

import java.util.Scanner;

public class E0_loop5_continue {
	/*
	 * # 보조제어문
	 * 
	 * 2. 	continue . 반복문의 조건식으로 바로 이동 . 아래식을 실행시키고 싶지 않을 때 사용
	 *      continue 는 else 를 이용해서 충분히 사용하지않고도 식을 만들수가있다.
	 *      continue 는 굳이 사용안해도된다.
	 */

	public static void main(String[] args) {
		// continue
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.햄버거");
			System.out.println("2.콜라");
			System.out.println("3.감자");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			if (sel == 1) {
				System.out.println("햄버거");
			} else if (sel == 2) {
				System.out.println("콜라");
			} else if (sel == 3) {
				System.out.println("감자");
			}
		}
	}
}