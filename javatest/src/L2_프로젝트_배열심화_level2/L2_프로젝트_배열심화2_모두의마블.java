package L2_프로젝트_배열심화_level2;

import java.util.Arrays;
import java.util.Scanner;

public class L2_프로젝트_배열심화2_모두의마블 {
	/*
	 * # 나만의 마블
	 * 옷 □ □ □ □ 
	 * □ ■ ■ ■ □ 
	 * □ ■ ■ ■ □ 
	 * □ ■ ■ ■ □ 
	 * □ □ □ □ □
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 옷이 이동숫자를 입력받을때마다 이동 하는데 
		// 외각으로만 이동 아래그림참조 
		
		/*
		 * # 나만의 마블
		 * 옷 □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		
		/*
		 * # 나만의 마블
		 * □ □ □ 옷 □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		 //입력 ==> 3 
		
		/*
		 * # 나만의 마블
		 * □ □ □ □ □ 
		 * □ ■ ■ ■ □ 
		 * □ ■ ■ ■ 옷 
		 * □ ■ ■ ■ □ 
		 * □ □ □ □ □
		 */
		int game[][] = {
				{1,2,3,4,5},
				{16,-1,-1,-1,6},
				{15,-1,-1,-1,7},
				{14,-1,-1,-1,8},
				{13,12,11,10,9},
		};
		
		
		int p = 1;
		for(int i = 0; i < game.length; i++) {
			for(int j = 0; j < game[i].length; j++) {
				if(p == game[i][j]) {
					System.out.print("옷" + " ");
				}else {
					if(game[i][j] == -1) {
						System.out.print("■" + " ");
					}else {
						System.out.print("□" + " ");
					}
				}
			}
			System.out.println();
		}
		while(true) {
			System.out.println("이동 숫자 입력 : ");
			int move = scan.nextInt();
			p += move;
			if(p > 16) {
				p -= 16;
			}
			for(int i = 0; i < game.length; i++) {
				for(int j = 0; j < game[i].length; j++) {
					if(p == game[i][j]) {
						System.out.print("옷" + " ");
					}else {
						if(game[i][j] == -1) {
							System.out.print("■" + " ");
						}else {
							System.out.print("□" + " ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}
