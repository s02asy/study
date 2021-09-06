package O0_클래스;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */


class GameMove{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}


public class O0_09_클래스숫자이동 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GameMove e = new GameMove();
		int player = 0;
		for(int i = 0; i < e.game.length; i++) {
			if(e.game[i] == 2) {
				player = i;
			}
		}
		while(true) {
			for(int i = 0; i < e.game.length; i++) {
				if(e.game[i] == 0) {
					System.out.print("[ ]");
				}else if(e.game[i] == 1) {
					System.out.print("[X]");
				}else if(e.game[i] == 2) {
					System.out.print("[읏]");
				}
			}
			System.out.println();
			System.out.println("왼쪽(1) 오른쪽(2) 종료(3)");
			System.out.println("입력 : ");
			int sel = scan.nextInt();
			if(sel == 1) {
				if(e.game[player - 1] == 0) {
					e.game[player] = 0;
					player -= 1;
					e.game[player] = 2;
				}else {
					System.out.println("벽에 막혔습니다.");
				}
			}else if(sel == 2) {
				if(e.game[player + 1] == 0) {
					e.game[player] = 0;
					player += 1;
					e.game[player] = 2;
				}else {
					System.out.println("벽에 막혔습니다.");
				}
			}else if(sel == 3) {
				break;
			}
		}
	}
}