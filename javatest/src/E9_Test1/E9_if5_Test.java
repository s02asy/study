package E9_Test1;

import java.util.Random;
import java.util.Scanner;

public class E9_if5_Test {
	public static void main(String[] args) {
		//문제3) 모두의 마블 
		// 철수는 지금 모두의 마블을 하고있다.
		// 게임은 0 ~ 20까지 이동할수있는거리가있다.
		// 지금 철수의 차례이고 , 현재의 위치는 
		// 시작점으로부터  9 만큼 이동했다.
		// 1 ~ 6이 있는 주사위 2개를 돌려 
		// 주사위 숫자의  합만큼 이동한다. 
		// 다음 이동할 철수의 위치를 출력하시오.

		//--- 조건 ----
		// 1) 두 주사위 숫자가 서로다를경우는 현재위치에서
		// 		주사위숫자 합만큼 이동한다. 예) 3, 5 ==> 8 만큼이동

		// 2) 두 주사위 숫자가 같은경우 보너스 이동거리 6 추가 
		//      예) 2 ,2  ==> 4  + 6  이동

		// 3) 14,15,16 번의 위치에 함정이 있다. 
		//	  함정에 걸리면 주사위2개를 다시 던지고 
		//	  그합이 6이하이면 처음위치(0)로 이동
	    //    그합이 7이상이면 함정탈출(아무일없음)

		// 4) 20 이상의 값이 나오면 "승리" 출력
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int 철수 = 9;
		int 보너스 = 6;
		System.out.println("모두의 마블에 오신것을 환영합니다.");
		System.out.println("1.게임 시작 2.게임 종료");
		int 선택 = scan.nextInt();
		if(선택 == 1) {
			System.out.println("[메세지] 1번을 눌러 주사위 굴리기.");
			int a = scan.nextInt();
			if(a == 1) {
				int 주사위1 = ran.nextInt(6) + 1;
				int 주사위2 = ran.nextInt(6) + 1;
				System.out.println("주사위1 : " + 주사위1);
				System.out.println("주사위2 : " + 주사위2);
				System.out.println("철수 : " + 철수);
				if(주사위1 == 주사위2) {
					System.out.println("[메세지] 보너스 당첨 !" );
					철수 = 주사위1 + 주사위2 + 철수 + 보너스;
					System.out.println("보너스 : " + "+" + 보너스);
				}
				else {
					철수 = 주사위1 + 주사위2 + 철수;
				}
				if(철수 == 14 || 철수 == 15 || 철수 == 16) {
					System.out.println("[메세지] 함정에 빠졌습니다.");
					System.out.println("[메세지] 주사위를 다시굴립니다.");
					주사위1 = ran.nextInt(6) + 1;
					주사위2 = ran.nextInt(6) + 1;
					System.out.println("주사위1 : " + 주사위1);
					System.out.println("주사위2 : " + 주사위2);
					if(주사위1 + 주사위2 <= 6) {
						System.out.println("[메세지] 함정 탈출 실패.");
						System.out.println("[메세지] 처음 위치로 이동");
						철수 = 0;
					}
					else {
						System.out.println("[메세지] 함정 탈출 성공.");
					}
				}
				if(철수 >= 20) {
					System.out.println("[메세지] 승리 !!");
				}
				System.out.println("철수 : " + 철수);
			}
		}
		else if(선택 == 2){
			System.out.println("게임을 종료합니다.");
		}
		
	}
}