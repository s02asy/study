package L3_�迭����;

import java.util.Random;
import java.util.Scanner;

public class b {
	/*
	 * # ������ũ ����
	 * 1. 10x10 �迭�� 0���� ä���.
	 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
	 * 3. �Ӹ� �����¿�� �̵��� �����ϸ�, ������ ����´�.
	 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
	 * 5. �������� �������� ������
	 *    �������� ������ ���� 1���� �ڶ���.
	 * 6. ������ �ִ� 8������ ������ �� �ִ�.
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
			System.out.println("1.���� 2.������ 3.�� 4.�Ʒ�");
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
