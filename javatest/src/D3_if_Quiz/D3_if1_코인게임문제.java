package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 * 4. 현금이 1000원 있다. 맞추면 2배 , 틀리면 -1000
 */
public class D3_if1_코인게임문제 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int 현금 = 1000;
		System.out.println("동전 방향 선택 (앞 : 0 , 뒤 : 1)");
		int a = scan.nextInt();
		System.out.println("동전을 던진다.");
		int b = ran.nextInt(2);
		if(b == 0) {
			System.out.println("앞면");
		}
		if(b == 1) {
			System.out.println("뒷면");
		}
		if(a == b) {
			현금 = 현금 * 2;
			System.out.println("성공 (현금 * 2)");
			System.out.println("현금 : " + 현금);
		}
		if(a != b) {
			현금 = 현금 - 1000;
			System.out.println("실패 (현금 - 1000)");
			System.out.println("현금 : " + 현금);
		}
	}
}
