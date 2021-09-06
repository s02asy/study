package K4_cospro2급준비문제;

import java.util.Arrays;
import java.util.Scanner;

public class K4_cospro2_회전 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int block[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		
		
		// 문제)  아래 명령어를 입력받을때마다 block배열을 90도 회전해보세요
		// [1.left_turn] [2.right_turn]
		/*
		 * 예) input ==>  1 ==> (왼쪽으로 90도 회전)
		 * 
		 * 4 8 12 16
		 * 3 7 11 15
		 * 2 6 10 14
		 * 1 5 9  13
		 */
		while(true) {
			System.out.println("[1.left_turn] [2.right_turn]");
			int sel = scan.nextInt();
			if(sel == 1) {
				int temp1[] = new int[4];
				int temp2[] = new int[4];
				int temp3[] = new int[4];
				int temp4[] = new int[4];
				
				for(int i = 0; i < 4; i++) {
					temp1[i] = block[0][i];
					temp2[i] = block[1][i];
					temp3[i] = block[2][i];
					temp4[i] = block[3][i];
				}
				int index = 3;
				for(int i = 0; i < 4; i++) {
					block[i][0] = temp1[index];
					block[i][1] = temp2[index];
					block[i][2] = temp3[index];
					block[i][3] = temp4[index];
					index -= 1;
				}
				for(int i = 0; i < block.length; i++) {
					for(int j = 0; j < block[i].length; j++) {
						System.out.printf("[%2d]",block[i][j]);
					}
					System.out.println();
				}
			}
			if(sel == 2) {
				int temp1[] = new int[4];
				int temp2[] = new int[4];
				int temp3[] = new int[4];
				int temp4[] = new int[4];
				
				for(int i = 0; i < 4; i++) {
					temp1[i] = block[0][i];
					temp2[i] = block[1][i];
					temp3[i] = block[2][i];
					temp4[i] = block[3][i];
				}
				for(int i = 0; i < 4; i++) {
					block[i][3] = temp1[i];
					block[i][2] = temp2[i];
					block[i][1] = temp3[i];
					block[i][0] = temp4[i];
				}
				for(int i = 0; i < block.length; i++) {
					for(int j = 0; j < block[i].length; j++) {
						System.out.printf("[%2d]",block[i][j]);
					}
					System.out.println();
				}
			}
		}
	}
}