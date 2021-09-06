package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

public class E1_While3_구구단문제 {
	
	/*
	 * # 구구단 게임[3단계]
	 * 1. 구구단 게임을 5회 반복한다.
	 * 2. 정답을 맞추면 20점이다.
	 * 3. 게임 종료 후, 성적을 출력한다.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int i = 1;
		int c = 0;
		while(i == 1) {
			int r1 = ran.nextInt(8) + 1;
			int r2 = ran.nextInt(9) + 1;
			int 정답 = r1 * r2;
			System.out.println(r1 + " * " + r2 + " = ");
			System.out.println("정답을 입력하세요.");
			int 입력 = scan.nextInt();
			if(정답 == 입력) {
				System.out.println("정답!");
				c += 1;
			}
			else {
				System.out.println("오답!");
			}
			if(c == 5) {
				System.out.println("종료.");
				i = 0;
			}
		}
		int s = c * 20;
		System.out.println("성적 : " + s + "점");
	}
}
