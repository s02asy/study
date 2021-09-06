package L3_배열최종;

import java.util.Random;
import java.util.Scanner;

public class b {
	/*
	 * # 스네이크 게임
	 * 1. 10x10 배열을 0으로 채운다.
	 * 2. 스네이크는 1234로 표시한다.
	 * 3. 머리 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
	 * 4. 자기몸하고 부딪히면, 사망한다.
	 * 5. 랜덤으로 아이템을 생성해
	 *    아이템을 먹으면 꼬리 1개가 자란다.
	 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int board[][] = new int[10][10];
		int y = 0;
		int x = 0;
		int cnt = 1;
		board[y][x] = 1;
		boolean item = true;
		while(true) {
			while(item) {
				int r1 = ran.nextInt(10);
				int r2 = ran.nextInt(10);
				if(board[r1][r2] == 0) {
					board[r1][r2] = -1;
					item = false;
				}
			}
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] == -1) {
						System.out.print("*" + " ");
					}else {
						System.out.print(board[i][j] + " ");
					}
				}
				System.out.println();
			}
			System.out.println("1.왼쪽 2.오른쪽 3.위 4.아래");
			int sel = scan.nextInt();
			if(sel == 1 && x > 0) {
				x -= 1;
			}else if(sel == 2 && x < board[0].length - 1) {
				x += 1;
			}else if(sel == 3 && y > 0) {
				y -= 1;
			}else if(sel == 4 && y < board.length - 1) {
				y += 1;
			}else if(sel < 1 || sel > 4) {
				continue;
			}
			if(board[y][x] != -1 && board[y][x] != 0) {
				System.out.println("GAME OVER");
				break;
			}
			if(board[y][x] == -1) {
				cnt += 1;
				item = true;
			}
			for(int i = 0; i < board.length; i++) {
				for(int j = 0; j < board[i].length; j++) {
					if(board[i][j] > 0) {
						board[i][j] += 1;
						if(board[i][j] > cnt) {
							board[i][j] = 0;
						}
					}
				}
			}
			board[y][x] = 1;
		}
	
	}
}
