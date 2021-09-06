package D1_if_Quiz;

import java.util.Scanner;

public class D1_if3_정답 {
	public static void main(String[] args) {
		/*
		 * # Up & Down 게임[1단계]
		 * 1. com은 8이다.
		 * 2. me는 숫자를 하나입력받는다.
		 * 3. com 과 me 를 비교해서 다음과 같은 메세지를 출력한다.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("숫자 입력 : ");
		int me = scan.nextInt();
		
		if(me < com) { System.out.println("Up!"); }
		if(me > com) { System.out.println("Down!"); }
		if(me == com) { System.out.println("Bingo!"); }
		
		/*
		 * 16 : 입력받기 위해 Scanner 클래스를 작성한다.
		 * 18 : com은 컴퓨터를 의미한다. 컴퓨터의 숫자는 8로 고정된다.
		 * 20 : 안내 멘트 
		 * 21 : 변수 me에 사용자로부터 숫자 한 개를 입력받는다.
		 * 23 : me가 8보다 작으면 Up을 출력한다. 
		 */
		
	}
}
