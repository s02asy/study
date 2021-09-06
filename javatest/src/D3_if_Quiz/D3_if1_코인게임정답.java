package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # 코인 게임
 * 1. 0 또는 1의 랜덤 숫자를 저장한다.
 * 2. 0은 동전의 앞면, 1은 동전의 뒷면이다.
 * 3. 동전의 앞뒷면을 맞추는 게임이다.
 */
public class D3_if1_코인게임정답 {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		
		
		System.out.print("동전의 앞면(0), 뒷면(1) 입력 : ");
		int me = scan.nextInt();
		if(coin == me) {
			System.out.println("빙고!");
		}
		if(coin != me) {
			System.out.println("땡!");
		}
		
		
		if(coin == 0) {
			System.out.println("정답 : 앞면"); // 정답 출력 
		}
		if(coin == 1) {
			System.out.println("정답 : 뒷면");
		}
				
	}
}
