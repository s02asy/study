package L2_프로젝트_배열심화_level2;

import java.util.Random;
import java.util.Scanner;

public class L2_프로젝트_배열심화2_오목 {

	public static void main(String[] args) {
		// 우리가 알고있는오목을 만들어보자.
		//[응용] 3 3 규칙을 만들어보자.
		
		Scanner scan = new Scanner(System.in);

		int[][] omok = {
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0},
		};
		int p1[][] = new int [9][9];
		int id1 = 4;
		int id2 = 4;
		p1[id1][id2] = 1;
		int p2[][] = new int [9][9];
		int id3 = 4;
		int id4 = 4;
		p2[4][4] = 2;
		boolean turn = false;
		boolean run = true;
		while(run) {
			if(turn == false) {
				for(int i = 0; i < omok.length; i++) {
					for(int j = 0; j < omok[i].length; j++) {
						if(omok[i][j] == 1) {
							System.out.print("[●]");
						}
						else if(omok[i][j] == 2) {
							System.out.print("[○]");
						}else {
							System.out.print("[ ]");
						}
					}
					System.out.println();
				}
				if(run == false) {
					break;
				}
				System.out.println();
				for(int i = 0; i < p1.length; i++) {
					for(int j = 0; j < p1[i].length; j++) {
						if(p1[i][j] == 1) {
							System.out.print("[↑]");
						}else {
							System.out.print("[ ]");
						}
					}
					System.out.println();
				}
				System.out.println("1. 왼쪽 2. 오른쪽 3. 위 4. 아래 5. 선택");
				int sel = scan.nextInt();
				
				if(sel == 2) {
					if(id2 < 8) {
						p1[id1][id2] = 0;
						id2 += 1;
						p1[id1][id2] = 1;
					}else {
						System.out.println("You can't go to the right any more.");
					}
				}else if(sel == 1) {
					if(id2 > 0) {
						p1[id1][id2] = 0;
						id2 -= 1;
						p1[id1][id2] = 1;
					}else {
						System.out.println("You can't go to the left any more.");
					}
				}else if(sel == 3) {
					if(id1 > 0) {
						p1[id1][id2] = 0;
						id1 -= 1;
						p1[id1][id2] = 1;
					}else {
						System.out.println("You can't go to the up any more.");
					}
				}else if(sel == 4) {
					if(id1 < 8) {
						p1[id1][id2] = 0;
						id1 += 1;
						p1[id1][id2] = 1;
					}else {
						System.out.println("You can't go to the down any more.");
					}
				}else if(sel == 5) {
					if(id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && omok[id1 - 1][id2] == 1 && omok[id1 + 1][id2] == 1 && omok[id1][id2 - 1] == 1 &&
							omok[id1][id2 + 1] == 1 || id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && omok[id1 - 1][id2 - 1] == 1 && omok[id1 + 1][id2 + 1] == 1 &&
							omok[id1 - 1][id2 + 1] == 1 && omok[id1 + 1][id2 - 1] == 1 || id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && omok[id1][id2 + 1] == 1 &&
							omok[id1][id2 + 2] == 1 && omok[id1 + 1][id2 + 1] == 1 && omok[id1 - 1][id2 + 1] == 1 || id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && 
							omok[id1 + 1][id2] == 1 && omok[id1 + 2][id2] == 1 && omok[id1 + 1][id2 + 1] == 1 && omok[id1 + 1][id2 - 1] == 1 || id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && 
							omok[id1 - 1][id2] == 1 && omok[id1 - 2][id2] == 1 && omok[id1 - 1][id2 + 1] == 1 && omok[id1 - 1][id2 - 1] == 1 || id1 > 1 && id2 > 1 && id1 < 7 && id2 < 7 && 
							omok[id1][id2 - 1] == 1 && omok[id1][id2 - 2] == 1 && omok[id1 - 1][id2 - 1] == 1 && omok[id1 + 1][id2 - 1] == 1 ) {
						System.out.println("3 3 입니다.");
						continue;
					}else {
						if(omok[id1][id2] == 0) {
							omok[id1][id2] = 1;
							p1[id1][id2] = 0;
							id1 = 4;
							id2 = 4;
							p1[id1][id2] = 1;
							turn = true;
						}else {
							System.out.println("이미 선택한 자리입니다.");
							continue;
						}
					}
					for(int i = 0; i < omok.length; i++) {
						for(int j = 0; j < omok[i].length - 4; j++) {
							if(omok[i][j] == 1 && omok[i][j + 1] == 1 && omok[i][j + 2] == 1 &&
									omok[i][j + 3] == 1 && omok[i][j + 4] == 1) {
								System.out.println("p1 승리!!");
								run = false;
								break;
							}
						}
					}
					for(int i = 0; i < omok.length - 4; i++) {
						for(int j = 0; j < omok[i].length; j++) {
							if(omok[i][j] == 1 && omok[i + 1][j] == 1 && omok[i + 2][j] == 1 &&
									omok[i + 3][j] == 1 && omok[i + 4][j] == 1) {
								System.out.println("p1 승리!!");
								run = false;
								break;
							}
						}
					}
				}
			}
			if(turn == true) {
				for(int i = 0; i < omok.length; i++) {
					for(int j = 0; j < omok[i].length; j++) {
						if(omok[i][j] == 1) {
							System.out.print("[●]");
						}
						else if(omok[i][j] == 2) {
							System.out.print("[○]");
						}else {
							System.out.print("[ ]");
						}
					}
					System.out.println();
				}
				if(run == false) {
					break;
				}
				System.out.println();
				for(int i = 0; i < p1.length; i++) {
					for(int j = 0; j < p1[i].length; j++) {
						if(p2[i][j] == 2) {
							System.out.print("[↑]");
						}else {
							System.out.print("[ ]");
						}
					}
					System.out.println();
				}
				System.out.println("1. 왼쪽 2. 오른쪽 3. 위 4. 아래 5. 선택");
				int sel = scan.nextInt();
				
				if(sel == 2) {
					if(id4 < 8) {
						p2[id3][id4] = 0;
						id4 += 1;
						p2[id3][id4] = 2;
					}else {
						System.out.println("You can't go to the right any more.");
					}
				}else if(sel == 1) {
					if(id4 > 0) {
						p2[id3][id4] = 0;
						id4 -= 1;
						p2[id3][id4] = 2;
					}else {
						System.out.println("You can't go to the left any more.");
					}
				}else if(sel == 3) {
					if(id3 > 0) {
						p2[id3][id4] = 0;
						id3 -= 1;
						p2[id3][id4] = 2;
					}else {
						System.out.println("You can't go to the up any more.");
					}
				}else if(sel == 4) {
					if(id3 < 8) {
						p2[id3][id4] = 0;
						id3 += 1;
						p2[id3][id4] = 2;
					}else {
						System.out.println("You can't go to the down any more.");
					}
				}else if(sel == 5) {
					if(id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && omok[id3 - 1][id4] == 2 && omok[id3 + 1][id4] == 2 && omok[id3][id4 - 1] == 2 &&
							omok[id3][id4 + 1] == 2 || id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && omok[id3 - 1][id4 - 1] == 2 && omok[id3 + 1][id4 + 1] == 2 &&
							omok[id3 - 1][id4 + 1] == 2 && omok[id3 + 1][id4 - 1] == 2 || id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && omok[id3][id4 + 1] == 2 &&
							omok[id3][id4 + 2] == 2 && omok[id3 + 1][id4 + 1] == 2 && omok[id3 - 1][id4 + 1] == 2 || id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && 
							omok[id3 + 1][id4] == 2 && omok[id3 + 2][id4] == 2 && omok[id3 + 1][id4 + 1] == 2 && omok[id3 + 1][id4 - 1] == 2 || id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && 
							omok[id3 - 1][id4] == 2 && omok[id3 - 2][id4] == 2 && omok[id3 - 1][id4 + 1] == 2 && omok[id3 - 1][id4 - 1] == 2 || id3 > 1 && id4 > 1 && id3 < 7 && id4 < 7 && 
							omok[id3][id4 - 1] == 2 && omok[id3][id4 - 2] == 2 && omok[id3 - 1][id4 - 1] == 2 && omok[id3 + 1][id4 - 1] == 2 ) {
						System.out.println("3 3 입니다.");
						continue;
					}else {
						if(omok[id3][id4] == 0) {
							omok[id3][id4] = 2;
							p2[id3][id4] = 0;
							id3 = 4;
							id4 = 4;
							p2[id3][id4] = 2;
							turn = false;
						}else {
							System.out.println("이미 선택한 자리입니다.");
							continue;
						}
					}
					for(int i = 0; i < omok.length; i++) {
						for(int j = 0; j < omok[i].length - 4; j++) {
							if(omok[i][j] == 2 && omok[i][j + 1] == 2 && omok[i][j + 2] == 2 &&
									omok[i][j + 3] == 2 && omok[i][j + 4] == 2) {
								System.out.println("p2 승리!!");
								run = false;
								break;
							}
						}
					}
					for(int i = 0; i < omok.length - 4; i++) {
						for(int j = 0; j < omok[i].length; j++) {
							if(omok[i][j] == 2 && omok[i + 1][j] == 2 && omok[i + 2][j] == 2 &&
									omok[i + 3][j] == 2 && omok[i + 4][j] == 2) {
								System.out.println("p2 승리!!");
								run = false;
								break;
							}
						}
					}
				}
			}
		}
	}
}