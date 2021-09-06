package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # 가위(0)바위(1)보(2) 게임[2단계] 
 * 1. com은 0~2 사이의 랜덤한 숫자를 저장한다.
 * 2. me는 0~2 사이의 숫자를 입력받는다. 
 * 3. com과 me를 비교해, 1) 비겼다. 2) 내가 이겼다. 3) 내가 졌다. 를 출력한다.
 */
public class D3_if3_가위바위보문제 {
	public static void main(String[] args) {		

		Scanner scan = new Scanner(System.in);

		Random ran = new Random();

		int com = ran.nextInt(3);

		System.out.print("가위(0),바위(1),보(2) 입력 : ");
		int me = scan.nextInt();

		if(com == me) {
			System.out.println("비겼다.");
		}
		else if(com == 0 && me == 1) {
			System.out.println("이겼다.");
		}
		else if(com == 1 && me == 2) {
			System.out.println("이겼다.");
		}
		else if(com == 2 && me == 0) {
			System.out.println("이겼다.");
		}
		else {
			System.out.println("졌다");
		}
	}
}
