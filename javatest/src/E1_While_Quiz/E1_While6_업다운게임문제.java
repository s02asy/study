package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

public class E1_While6_업다운게임문제 {

	/*
	 * # Up & Down 게임[2단계]
	 * 1. com 은 랜덤으로 1~100사이를 저장한다.
	 * 2. me 는 1~100사이를 입력한다. 	 
	 * 3. com 과 me 를 비교해서 com 크면 "크다" , 
	 * 	  com 이작으면 "작다" 힌트제공 
	 * 4. 정답을 맞추면 게임은 종료된다.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int run = 1;
		int com = ran.nextInt(100) + 1;
		while(run == 1) {
			System.out.println("숫자 입력[1~100] :");
			int me = scan.nextInt();
			if(com > me) {
				System.out.println("크다");
			}
			else if(com < me) {
				System.out.println("작다");
			}
			else if(com == me) {
				System.out.println("정답");
				run = 0;
			}
		}
	}
}