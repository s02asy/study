package J3_프로젝트_배열_level3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class a {
	/*
	 * # 미니마블
	 * 1. 플레이어는 p1과 p2 2명이다.
	 * 2. 번갈아가며 1~3 사이의 숫자를 입력해 이동한다.
	 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
	 *    상대 플레이어는 잡히게 되어 인덱스(0)으로 되돌아간다.
	 * 4. 맨뒤를 넘어가면 맨앞으로 나온다. 먼저 3바퀴를 돌면 이긴다.
	 * 5. 인덱스 0의 위치에 둘다 있으면 잡힌걸로 하지않는다. (처음위치는 안전지대)
	 * [응용문제] p2는 com으로 대체해서 해보자
	 *  
	 *  [p1]1~3 입력 : 1
	 *  1 0 0 0 0 0 0 0 
	 *  2 0 0 0 0 0 0 0 
	 *  
	 *  [p2]1~3 입력 : 3
	 *  0 1 0 0 0 0 0 0 
	 *  0 0 0 2 0 0 0 0 
	 *  
	 *  [p1]1~3 입력 : 2
	 *  [p1]이 p2를 잡았다!
	 *  0 0 0 0 1 0 0 0 
	 *  2 0 0 0 0 0 0 0 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] p1   = {1, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {2, 0, 0, 0, 0, 0, 0, 0};
		boolean turn = false;
		int p1id = 0;
		int p2id = 0;
		int c1 = 0;
		int c2 = 0;
		while(true) {
			System.out.println("p1 = " + Arrays.toString(p1) + "    c1 : " + c1);
			System.out.println("p2 = " + Arrays.toString(p2) + "    c2 : " + c2);
			if(turn == false) {
				System.out.println("p1 : ");
				int p1move = scan.nextInt();
				if(p1move >= 1 && p1move <= 3) {
					if(turn == false) {
						p1[p1id] = 0;
						p1id += p1move;
						if(p1id >= 8) {
							p1id -= 8;
							c1 += 1;
						}
						p1[p1id] = 1;
						turn = true;
					}
				}
			}
			else {
				System.out.println("p2 : ");
				int p2move = ran.nextInt(3) + 1;
				System.out.println(p2move);
				p2[p2id] = 0;
				p2id += p2move;
				if(p2id >= 8) {
					p2id -= 8;
					c2 += 1;
				}
				p2[p2id] = 2;
				turn = false;
			}
			if(p1id == p2id && p1id != 0 && turn == true) {
				System.out.println("p1이 p2를 잡음");
				p2[p2id] = 0;
				p2id = 0;
				p2[p2id] = 2;
			}
			else if(p1id == p2id && p1id != 0 && turn == false) {
				System.out.println("p2가 p1을 잡음");
				p1[p1id] = 0;
				p1id = 0;
				p1[p1id] = 1;
			}
			if(c1 == 3) {
				System.out.println("p1 승리");
				break;
			}
			else if(c2 == 3) {
				System.out.println("p2 승리");
				break;
			}
			
		}

	}
}