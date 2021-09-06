package L3_�迭����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class c {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
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
		
		int [][] game = new int[10][10];
		
		int size = game.length;
		int si = 3;
		int sj = 3;
		int body = 4;
		int tempi = 0;
		int tempj = 0;
		int itemCheck = 0;
		int [][] snake = new int[9][2];
		for(int i = 0; i < snake.length; i++) {
			snake[i][0] = si;
			snake[i][1] = sj;
			sj+=1;
		}
		sj = 3;
		for(int i = 0; i < snake.length; i++) {
			System.out.println(Arrays.toString(snake[i]));
		}
		boolean run = true;
		while(run) {
			int bodyNum = 1;
			int cnt=0;
			for(int i = 0; i < game.length; i++) {
				for(int j = 0; j < game[i].length; j++) {
					if(i == snake[cnt][0] && j == snake[cnt][1]) {
						tempi = snake[cnt][0];
						tempj = snake[cnt][1];
						game[tempi][tempj] = bodyNum;
						bodyNum+=1;
						cnt+=1;
						i=0; j=0;
					}
					if(cnt == body) {
						i=game.length;
						break;
					}
				}
			}
			if(itemCheck == 0) {
				for(int i = 0; i < 5;) {
					int r1 = ran.nextInt(10);
					int r2 = ran.nextInt(10);
					if(game[r1][r2] == 0) {
						game[r1][r2] = 9; // �������� ���� 9
						i+=1;
					}
				}
			}
			itemCheck = 1;
			
			for(int[] i : game) {
				for(int j : i) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			
			System.out.println("1)left 2)right 3)up 4)down");
			int sel = scan.nextInt();
			
			boolean check = false;
			if(sel == 1 && sj > 0 && game[si][sj-1] != 2) {
				sj-=1;
				check = true;
			}
			else if(sel == 2 && sj < size-1 && game[si][sj+1] != 2) {
				sj+=1;
				check = true;
			}
			else if(sel == 3 && si > 0 && game[si-1][sj] != 2) {
				si-=1;
				check = true;
			}
			else if(sel == 4 && si < size-1 && game[si+1][sj] != 2) {
				si+=1;
				check = true;
			}
			
			int death = game[si][sj];
			if(check == true) {
				game[tempi][tempj] = 0;
				for(int i = snake.length-2; i >= 0; i--) {
					snake[i+1][0] = snake[i][0];
					snake[i+1][1] = snake[i][1];
				}
				snake[0][0] = si; snake[0][1] = sj;
			}
			if(game[si][sj] == 9 && body < 8) {
				body+=1;
			}
			if(death >= 4 && death <= body) {
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}
		} // while
	}
}
