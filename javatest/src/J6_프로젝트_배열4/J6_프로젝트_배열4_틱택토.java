package J6_프로젝트_배열4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class J6_프로젝트_배열4_틱택토 {
	/* 
	 * 틱택토 : 
	 * 	조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
	 * 	          아래와같이 만들어보기.
	 *  조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
	 *  조건3) 먼저 한줄을 완성하면 승리
	 *  [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
	 *
	 *=============
	 * [처음화면]
	 * 0,0,0
	 * 0,0,0
	 * 0,0,0
	 * [p1]인덱스 입력 : 6
	 * =============
	 * [1턴]
	 * 0,0,0
	 * 0,0,0
	 * 1,0,0
	 * [p2]인덱스 입력 : 1
	 * =============
	 * [2턴]
	 * 0,2,0
	 * 0,0,0
	 * 1,0,0
	 * [p1]인덱스 입력 : 3
	 * =============
	 * [3턴]
	 * 0,2,0
	 * 1,0,0
	 * 1,0,0
	 * [p2]인덱스 입력 : 2
	 * =============
	 * [4턴]
	 * 0,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1]인덱스 입력 : 0
	 * =============
	 * [5턴]
	 * 1,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1] 승리
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] tic = new int[9];
		System.out.println("[처음화면]");  // 처음화면 출력.
		int ticid = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print("[" + tic[ticid] + "]");
				ticid += 1;
			}
			System.out.println();
		}
		
		boolean check[] = new boolean[9]; // 중복 인덱스 방지를 위한 체크.
		int turnnum = 1; // 턴이 몇번 돌아 갔는지 체크.
		boolean run = false;
		int p1count = 0;
		int comcount = 0;
		
		while(true) {
			while(run) {
				System.out.println("[" + turnnum + "턴]");
				ticid = 0;
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						System.out.print("[" + tic[ticid] + "]");
						ticid += 1;
					}
					System.out.println();
				}
				turnnum += 1;
				break;
			}
			if(comcount == 1) {
				System.out.println("com 승리 !!");
				break;
			}
			System.out.println("[p1]인덱스 입력 : ");
			int p1 = scan.nextInt();
			if(check[p1] == false) {
				check[p1] = true;
				tic[p1] = 1;
			}
			else {
				System.out.println("이미 선택된 인덱스 이거나 중복 인덱스 입니다.");
				continue;
			}
			System.out.println("[" + turnnum + "턴]");
			ticid = 0;
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					System.out.print("[" + tic[ticid] + "]");
					ticid += 1;
				}
				System.out.println();
			}
			for(int i = 0; i < 9;) {
				if(tic[i] == 1 && tic[i + 1] == 1 && tic[i + 2] == 1) {
					p1count += 1;
				}
				i += 3;
			}
			for(int i = 0; i < 3; i++) {
				if(tic[i] == 1 && tic[i + 3] == 1 && tic[i + 6] == 1) {
					p1count += 1;
				}
			}
			if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
				p1count += 1;
			}
			if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
				p1count += 1;
			}
			if(p1count == 1) {
				System.out.println("p1 승리 !!");
				break;
			}
			if(turnnum == 9 && p1count == 0 && comcount == 0) {
				System.out.println("무승부");
				break;
			}
			while(true) {
				int comr = ran.nextInt(9);
				if(check[comr] == false) {
					System.out.println("[com]인덱스 입력 : ");
					System.out.println(comr);
					check[comr] = true;
					tic[comr] = 2;
					break;
				}
			}
			for(int i = 0; i < 9;) {
				if(tic[i] == 2 && tic[i + 1] == 2 && tic[i + 2] == 2) {
					comcount += 1;
				}
				i += 3;
			}
			for(int i = 0; i < 3; i++) {
				if(tic[i] == 2 && tic[i + 3] == 2 && tic[i + 6] == 2) {
					comcount += 1;
				}
			}
			if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
				comcount += 1;
			}
			if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
				comcount += 1;
			}
			turnnum += 1;
			run = true;
		}
	}
}