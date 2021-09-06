package D0_if_이론;

import java.util.Random;
import java.util.Scanner;
/*
 * # 가위바위보 게임[2단계]를 if - else if 구문으로 변경해보자.
 */
public class D_if9_elseif활용 {
	public static void main(String[] args) {
	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int com = ran.nextInt(3);

		System.out.print("가위(0),바위(1),보(2) 입력 : ");
		int me = scan.nextInt();

		if (com == me) {
			System.out.println("비겼다.");
		} else if (com == 0 && me == 1) {
			System.out.println("이겼다.");
		} else if (com == 1 && me == 2) {
			System.out.println("이겼다.");
		} else if (com == 2 && me == 0) {
			System.out.println("이겼다.");
		} else {
			System.out.println("졌다.");
		}

	}
}
