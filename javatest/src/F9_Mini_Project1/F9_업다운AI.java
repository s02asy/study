package F9_Mini_Project1;

import java.util.Random;
import java.util.Scanner;

/*
 *  # 업다운 AI
 *  
 *  ----평범한 업다운게임 ----------------------------------
 *  원래 업다운은 COM 이 랜덤으로 1~100 사이의 숫자를 랜덤으로 저장하고,
 *  플레이는 1~100사이의 숫자를 맞추는게임이다.
 *  틀릴때마다 COM이 "업" 또는 "다운" 을 힌트로 출력한다. 
 *  --------------------------------------------------
 *  
 *  ---- 업다운AI---------------------------------------
 *  업다운을 반대로 하는것이다.
 *  내가 1~100 사이를 입력하면 COM 이 1~100 사이를 랜덤으로 입력하고
 *  내가 입력한 숫자를 맞추는게임이다.
 *  조건) COM 은 잘해야한다. 
 *  예를 들어 내가 50을 저장하고 , COM 이 20을 선택했다면 다음 차례부터는
 *  COM은 1~20은 고르지않는다.
 *  마찬가지로 COM 이 80 을 다음차례에 선택했다면 80~100은 이후 선택하지않는다.
 *  결국 COM은 거리를 좁혀가며 고르게 되어있고 결국 맞추게 되어있다. 

 */

public class F9_업다운AI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int min = 1;
		int max = 100;
		int max2 = 0;
		boolean run = true;
		System.out.println("힌트 Up : 1 Down : 2");
		System.out.println("숫자를 제시해 주세요.");
		int me = scan.nextInt();
		while(run) {
			int com = ran.nextInt(max) + min;
			System.out.println("com : " + com);
			if(me == com) {
				System.out.println("승리 !!");
				break;
			}
			else if(com < me) {
				System.out.println("힌트 : ");
				int 힌트 = scan.nextInt();
				if(힌트 == 1) {
					min = com + 1;
					max = 100 - (com + min);
				}
			}
			else if(com > me) {
				System.out.println("힌트 : ");
				int 힌트 = scan.nextInt();
				if(힌트 == 2) {
					max = com - min;
				}
			}
		}
	}

}