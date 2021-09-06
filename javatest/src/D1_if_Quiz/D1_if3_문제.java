package D1_if_Quiz;

import java.util.Scanner;
import java.util.Random;

public class D1_if3_문제 {
	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 랜덤으로 1~100 사이를 저장한다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
		int com = ran.nextInt(100) + 1;
		System.out.println("숫자를 입력하세요.");
		int me = scan.nextInt();
		if(me < com) {
			System.out.println("Up!");
		}
		if(me == com) {
			System.out.println("Bingo!");
		}
		if(me > com) {
			System.out.println("Down!");
		}
	}
}
