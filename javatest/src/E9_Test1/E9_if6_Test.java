package E9_Test1;

import java.util.Random;
import java.util.Scanner;

public class E9_if6_Test {
	public static void main(String[] args) {
		// 배달의 민족(조건문)

		// 철수는 음식주문을 받고 배달할려고 한다. 
		// 현재 철수는 y : 0 , x : 0 의 위치에 있다. 
		// 1) 이동해야할 방향은 숫자 0 ~ 3 으로 표현한다. 
		// 2) 각 숫자의 의미는 (북 : 0) ,(동 : 1) , (남 : 2) , (서 : 3) 이다.
		// 3) 이동할 거리는 1~10 사이이다. 


		//예를 들어 방향이 3 이고 , 거리가 8이면 	
		// 철수가 가야할위치는 첫번째 숫자3은 방향이므로 "서쪽" 이고 ,
		//					  두번째 숫자 8 은 거리는 이므로, 결국 x 가 -8 이된다.  
		// 이동할곳은 x : -8 , y : 0 이다.
		
		//-----------------------------------------------------------------------------

		//문제1) 랜덤으로 방향(0~3) 과 거리(1~10)을 저장하고 배달할 위치를 출력.
		// 예) 방향은 2 ,  거리는 3 ==> (y = -3 , x = 0)
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int x = 0;
		int y = 0;
		int 방향 = ran.nextInt(4);
		int 거리 = ran.nextInt(10) + 1;
		System.out.println("[메세지] 배달의 민족 주문 !!");
		System.out.println("1.주문 받기 2. 거절");
		int 철수의선택 = scan.nextInt();
		if(철수의선택 == 1) {
			System.out.println("[메세지] 배달 투하 좌표 수신중");
			if(방향 == 0) {
				y = y + 거리;
			}
			else if(방향 == 1) {
				x = x + 거리;
			}
			else if(방향 == 2) {
				y = y - 거리;
			}
			else if(방향 == 3) {
				x = x - 거리;
			}
			System.out.println("y : " + y + " , " + "x : " + x);
		}
		else if(철수의선택 == 2) {
			System.out.println("[메세지] 주문 거절 !!");
		}
	}
}