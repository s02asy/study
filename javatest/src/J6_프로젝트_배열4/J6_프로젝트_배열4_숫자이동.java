package J6_프로젝트_배열4;
import java.util.Scanner;
public class J6_프로젝트_배열4_숫자이동 {
	/*
	 * # 숫자이동[1단계]
	 * 1. 각숫자는 기능이 있다. 
	 * 	 [1] 숫자8는 플레이어이다. 
	 *   [2] 숫자0은 이동할수있는 길이다. 
	 *   [3] 숫자1은 이동불가능한 벽이다. 
	 *   [4] 숫자3은 골인지점이다.
	 * 2. System.out.println("1.left  2.right 3.up 4.down");
	 * 	  	번호를 입력받고 각 방향으로 한칸씩 이동 가능 
	 * 
	 * 3. left 
	  		{1,1,1,1,1,
			 1,0,0,0,1,
			 1,8,0,0,1,
		     1,0,0,0,3,
			 1,1,1,1,1};
	 	 
	 * 4.계속 이동하다가 3에 도착하면 종료.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {1,1,1,1,1,
					  1,0,0,0,1,
					  1,0,8,0,1,
					  1,0,0,0,3,
					  1,1,1,1,1};
		
		int player = 12; // 현재 플레이어위치 
		
		while(true) {
			int gameindex = 0;
			for(int i = 0; i < 5; i++) {
				for(int j = 0; j < 5; j++) {
					System.out.print(game[gameindex] + " ");
					gameindex += 1;
				}
				System.out.println();
			}
			System.out.println("1.left 2.right 3.up 4.down");
			int sel = scan.nextInt();
			if(sel >= 1 && sel <= 4) {
				if(sel == 1) {
					player -= 1;
					if(game[player] != 1) {
						game[player + 1] = 0;
						game[player] = 8;
					}
					else {
						player += 1;
						System.out.println("벽에 막혔습니다.");
						continue;
					}
				}
				else if(sel == 2) {
					player += 1;
					if(game[player] == 3) {
						game[player - 1] = 0;
						game[player] = 8;
						int gameindex1 = 0;
						for(int i = 0; i < 5; i++) {
							for(int j = 0; j < 5; j++) {
								System.out.print(game[gameindex1] + " ");
								gameindex1 += 1;
							}
							System.out.println();
						}
						System.out.println("승리");
						break;
					}
					if(game[player] != 1) {
						game[player - 1] = 0;
						game[player] = 8;
					}
					else {
						player -= 1;
						System.out.println("벽에 막혔습니다.");
						continue;
					}
				}
				else if(sel == 3) {
					player -= 5;
					if(game[player] != 1) {
						game[player + 5] = 0;
						game[player] = 8;
					}
					else {
						player += 5;
						System.out.println("벽에 막혔습니다.");
						continue;
					}
				}
				else if(sel == 4) {
					player += 5;
					if(game[player] != 1) {
						game[player - 5] = 0;
						game[player] = 8;
					}
					else {
						player -= 5;
						System.out.println("벽에 막혔습니다.");
						continue;
					}
				}
			}
		}
	}
}