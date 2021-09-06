package K2_프로젝트_배열심화_1;

import java.util.Scanner;

public class K2_프로젝트_배열심화1_숫자지우기 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int arr[] = { 10, 32, 11, 56, 7 };
		int player = 2;
		boolean run = true;
		int select = 0;
		while (run) {

			System.out.println("[숫자 전부 지우기]");
			for (int i = 0; i < arr.length; i++) {
				
				System.out.printf("[%2d]", arr[i]);
			}
			System.out.println();
			for (int i = 0; i < arr.length; i++) {
				if (i == player) {
					System.out.print("[ ↑]");
				} else {
					System.out.print("[  ]");
				}
			}
			System.out.println();
			System.out.println("1) left 2) right 3)choice");
			select = scan.nextInt();
			if (select == 1 && player > 0) {
				player -= 1;
			} else if (select == 2 && player < arr.length - 1) {
				player += 1;
			} else if (select == 3) {
				arr[player] = 0;
				run = false;
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != 0) {
						run = true;
						break;
					}
				}
			}
		}
		System.out.println("[숫자 전부 지우기]");
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("[%2d]", arr[i]);
		}
		// (문제) 위 알고리즘을 응용해서 아래와 같이 틱택토 만들어보기
		// 핵심 (마우스가 없으나 인덱스 말고 다른 ui를 구현해서 표현)*/
		
		/* 1)LEFT 2) RIGHT 3) UP 4) DOWN 5) CHOICE
		 * [ ][ ][ ] 
		 * [ ][ ][ ] 
		 * [ ][ ][ ]
		 * -------------------------
		 * p1은 1로 
		 * [1][ ][ ] 
		 * [ ][ ][ ] 
		 * [ ][ ][ ]
		 * -------------------------
		 * p2는 2로 
		 * [2][ ][ ] 
		 * [ ][ ][ ] 
		 * [ ][ ][ ]
		 * 1)LEFT 2) RIGHT 3) UP 4) DOWN 5) CHOICE
		 */
		int tic[] = new int[9];
		int p1 = 4;
		int p2 = 4;
		int count = 0;
		boolean turn = false;
		boolean run = true;
		while(run) {
			if(turn == false) {
				for(int i = 0; i < 9; i++) {
					if(tic[i] == 0) {
						System.out.print("[ ]");
					}else {
						System.out.printf("[%1d]",tic[i]);
					}
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				System.out.println();
				for(int i = 0; i < 9; i++) {
					if(p1 == i) {
						System.out.print("[1]");
					}else {
						System.out.print("[ ]");
					}
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				System.out.println("1)LEFT 2) RIGHT 3) UP 4) DOWN 5) CHOICE");
				int sel = scan.nextInt();
				if(sel == 1) {
					if(p1 == 0 || p1 == 3 || p1 == 6) {
						System.out.println("You can't go to the left any more.");
					}else {
						p1 -= 1;
					}
				}else if(sel == 2) {
					if(p1 == 2 || p1 == 5 || p1 == 8) {
						System.out.println("You can't go to the right any more.");
					}else {
						p1 += 1;
					}
				}else if(sel == 3) {
					if(p1 == 0 || p1 == 1 || p1 == 2) {
						System.out.println("You can't go to the up any more.");
					}else {
						p1 -= 3;
					}
				}else if(sel == 4) {
					if(p1 == 6 || p1 == 7 || p1 == 8) {
						System.out.println("You can't go to the down any more.");
					}else {
						p1 += 3;
					}
				}else if(sel == 5) {
					if(tic[p1] != 0) {
						System.out.println("have no choice.");
					}else {
						tic[p1] = 1;
						p1 = 4;
						count += 1;
						turn = true;
					}
				}
				for(int i = 0; i < 9; i+=3) {
					if(tic[i] == 1 && tic[i + 1] == 1 && tic[i + 2] == 1) {
						System.out.println("p1 win!!");
						run = false;
					}
				}
				for(int i = 0; i < 3; i++) {
					if(tic[i] == 1 && tic[i + 3] == 1 && tic[i + 6] == 1) {
						System.out.println("p1 win!!");
						run = false;
					}
				}
				if(tic[0] == 1 && tic[4] == 1 && tic[8] == 1) {
					System.out.println("p1 win!!");
					break;
				}
				if(tic[2] == 1 && tic[4] == 1 && tic[6] == 1) {
					System.out.println("p1 win!!");
					break;
				}
				if(count == 9) {
					System.out.println("draw");
					for(int i = 0; i < 9; i++) {
						if(tic[i] == 0) {
							System.out.print("[ ]");
						}else {
							System.out.printf("[%1d]",tic[i]);
						}
						if(i % 3 == 2) {
							System.out.println();
						}
					}
					break;
				}
			}
			if(turn == true) {
				for(int i = 0; i < 9; i++) {
					if(tic[i] == 0) {
						System.out.print("[ ]");
					}else {
						System.out.printf("[%1d]",tic[i]);
					}
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				System.out.println();
				for(int i = 0; i < 9; i++) {
					if(p2 == i) {
						System.out.print("[2]");
					}else {
						System.out.print("[ ]");
					}
					if(i % 3 == 2) {
						System.out.println();
					}
				}
				System.out.println("1)LEFT 2) RIGHT 3) UP 4) DOWN 5) CHOICE");
				int sel = scan.nextInt();
				if(sel == 1) {
					if(p2 == 0 || p2 == 3 || p2 == 6) {
						System.out.println("You can't go to the left any more.");
					}else {
						p2 -= 1;
					}
				}else if(sel == 2) {
					if(p2 == 2 || p2 == 5 || p2 == 8) {
						System.out.println("You can't go to the right any more.");
					}else {
						p2 += 1;
					}
				}else if(sel == 3) {
					if(p2 == 0 || p2 == 1 || p2 == 2) {
						System.out.println("You can't go to the up any more.");
					}else {
						p2 -= 3;
					}
				}else if(sel == 4) {
					if(p2 == 6 || p2 == 7 || p2 == 8) {
						System.out.println("You can't go to the down any more.");
					}else {
						p2 += 3;
					}
				}else if(sel == 5) {
					if(tic[p2] != 0) {
						System.out.println("have no choice.");
					}else {
						tic[p2] = 2;
						p2 = 4;
						count += 1;
						turn = false;
					}
				}
				for(int i = 0; i < 9; i+=3) {
					if(tic[i] == 2 && tic[i + 1] == 2 && tic[i + 2] == 2) {
						System.out.println("p2 win!!");
						run = false;
					}
				}
				for(int i = 0; i < 3; i++) {
					if(tic[i] == 2 && tic[i + 3] == 2 && tic[i + 6] == 2) {
						System.out.println("p2 win!!");
						run = false;
					}
				}
				if(tic[0] == 2 && tic[4] == 2 && tic[8] == 2) {
					System.out.println("p2 win!!");
					break;
				}
				if(tic[2] == 2 && tic[4] == 2 && tic[6] == 2) {
					System.out.println("p2 win!!");
					break;
				}
			}
		}
	}
}