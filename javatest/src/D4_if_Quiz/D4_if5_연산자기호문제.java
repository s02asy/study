package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # 연산자 기호 맞추기 게임
 * 1. 1~10 사이의 랜덤 숫자 2개를 저장한다.
 * 2. 1~4 사이의 랜덤 숫자 1개를 저장한다.
 * 3. 위 숫자는 연산자 기호에 해당된다.
 * 	  1) 덧셈	  2)  뺼셈     3) 곱셈	 4) 나머지	//11:26
 * 4. 사용자는 연산자 기호를 맞추는 게임이다.
 * 예) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    정답 : 1번
 */
public class D4_if5_연산자기호문제 {
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int r1 = ran.nextInt(10) + 1;
		int r2 = ran.nextInt(10) + 1;
		int r3 = ran.nextInt(4) + 1;
					   // 정답에 값을 안넣어주면 이클립스는 정답이
		int 정답 = 0;   // if문에 걸려있는걸 인식하지 못함 출력문이 if문 밖에 있기때문
		if(r3 == 1) {	
			정답 = r1 + r2;
		}
		else if(r3 == 2) {
			정답 = r1 - r2;
		}
		else if(r3 == 3) {
			정답 = r1 * r2;
		}
		else if(r3 == 4) {
			정답 = r1 % r2;
		}
		System.out.println(r1 + " ? " + r2 + " = " + 정답);
		System.out.println("1) + 2) - 3) * 4) %");
		System.out.println("번호를 선택하세요.");
		int 입력 = scan.nextInt();
		if(입력 == r3) {
			System.out.println("정답 입니다.");
		}
		else {
			System.out.println("오답 입니다.");
		}
	}
}
