package K2_프로젝트_배열심화_1;

import java.util.Random;
import java.util.Scanner;

public class K2_프로젝트_배열심화1_빙고 {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int p1[][] = new int[5][5];					//p1 랜덤값 1~45 저장 중복숫자 x
		boolean check[] = new boolean[45];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5;) {
				int r = ran.nextInt(45);
				if(check[r] == false) {
					check[r] = true;
					p1[i][j] = r + 1;
					j += 1;
				}
			}
		}
		int p2[][] = new int[5][5];					//p2 랜덤값 1~45 저장 중복숫자 x
		boolean check2[] = new boolean[45];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5;) {
				int r = ran.nextInt(45);
				if(check2[r] == false) {
					check2[r] = true;
					p2[i][j] = r + 1;
					j += 1;
				}
			}
		}
		//p1 출력
		System.out.println("========= p1 =========");
		for(int i = 0; i < 5; i++) {
			System.out.print("   " + i);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 0) {
					System.out.print(i + " ");
				}
				System.out.printf("[%2d]" , p1[i][j]);
			}
			System.out.println();
		}
		//p2 출력
		System.out.println("========= p2 =========");
		for(int i = 0; i < 5; i++) {
			System.out.print("   " + i);
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(j == 0) {
					System.out.print(i + " ");
				}
				System.out.printf("[%2d]" , p2[i][j]);
			}
			System.out.println();
		}
		//p1 , p2 턴 설정.
		boolean turn = false;
		while(true) {
			int p1bingo = 0;
			int p2bingo = 0;
			if(turn == false) {
				System.out.println("p1 x좌표 입력 (범위 1~4) : ");
				int p1x = scan.nextInt();
				if(p1x < 0 || p1x > 4) {
					System.out.println("범위를 확인해주세요.");
					continue;
				}
				System.out.println("p1 y좌표 입력 (범위 1~4) : ");
				int p1y = scan.nextInt();
				if(p1y < 0 || p1y > 4) {
					System.out.println("범위를 확인해주세요.");
					continue;
				}
				if(p1[p1y][p1x] != 0) {
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(p1[p1y][p1x] == p2[i][j]) {
								p2[i][j] = 0;
								break;
							}
						}
					}
					p1[p1y][p1x] = 0;
					System.out.println("========= p1 =========");
					for(int i = 0; i < 5; i++) {
						System.out.print("   " + i);
					}
					System.out.println();
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(j == 0) {
								System.out.print(i + " ");
							}
							System.out.printf("[%2d]" , p1[i][j]);
						}
						System.out.println();
					}
					System.out.println("========= p2 =========");
					for(int i = 0; i < 5; i++) {
						System.out.print("   " + i);
					}
					System.out.println();
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(j == 0) {
								System.out.print(i + " ");
							}
							System.out.printf("[%2d]" , p2[i][j]);
						}
						System.out.println();
					}
					turn = true;
				}else {
					System.out.println("이미 지워진 자리입니다.");
					continue;
				}
			}
			else if(turn == true) {
				System.out.println("p2 x좌표 입력 (범위 1~4) : ");
				int p2x = scan.nextInt();
				if(p2x < 0 || p2x > 4) {
					System.out.println("범위를 확인해주세요.");
					continue;
				}
				System.out.println("p2 y좌표 입력 (범위 1~4) : ");
				int p2y = scan.nextInt();
				if(p2y < 0 || p2y > 4) {
					System.out.println("범위를 확인해주세요.");
					continue;
				}
				if(p2[p2y][p2x] != 0) {
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(p2[p2y][p2x] == p1[i][j]) {
								p1[i][j] = 0;
								break;
							}
						}
					}
					p2[p2y][p2x] = 0;
					System.out.println("========= p1 =========");
					for(int i = 0; i < 5; i++) {
						System.out.print("   " + i);
					}
					System.out.println();
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(j == 0) {
								System.out.print(i + " ");
							}
							System.out.printf("[%2d]" , p1[i][j]);
						}
						System.out.println();
					}
					System.out.println("========= p2 =========");
					for(int i = 0; i < 5; i++) {
						System.out.print("   " + i);
					}
					System.out.println();
					for(int i = 0; i < 5; i++) {
						for(int j = 0; j < 5; j++) {
							if(j == 0) {
								System.out.print(i + " ");
							}
							System.out.printf("[%2d]" , p2[i][j]);
						}
						System.out.println();
					}
					turn = false;
				}else {
					System.out.println("이미 지워진 자리입니다.");
					continue;
				}
			}
			//가로검사.
			for(int i = 0; i < 5; i++) {
				int p1garo = 0;
				int p2garo = 0;
				for(int j = 0; j < 5; j++) {
					p1garo += p1[i][j];
					p2garo += p2[i][j];
				}
				if(p1garo == 0) {
					p1bingo += 1;
				}
				if(p2garo == 0) {
					p2bingo += 1;
				}
			}
			//세로검사.
			for(int i = 0; i < 5; i++) {
				int p1sero = 0;
				int p2sero = 0;
				for(int j = 0; j < 5; j++) {
					p1sero += p1[j][i];
					p2sero += p2[j][i];
				}
				if(p1sero == 0) {
					p1bingo += 1;
				}
				if(p2sero == 0) {
					p2bingo += 1;
				}
			}
			//대각선검사.
			while(true) {
				int p1daegak = 0;
				int p2daegak = 0;
				for(int i = 0; i < 5; i++) {
					p1daegak += p1[i][i];
					p2daegak += p2[i][i];
				}
				if(p1daegak == 0) {
					p1bingo += 1;
				}
				if(p2daegak == 0) {
					p2bingo += 1;
				}
				int p1daegak2 = 0;
				int p2daegak2 = 0;
				int lastindex = 4;
				for(int i = 0; i < 5; i++) {
					p1daegak2 += p1[i][lastindex];
					p2daegak2 += p2[i][lastindex];
					lastindex -= 1;
				}
				if(p1daegak2 == 0) {
					p1bingo += 1;
				}
				if(p2daegak2 == 0) {
					p2bingo += 1;
				}
				break;
			}
			System.out.println("p1bingo : " + p1bingo);
			System.out.println("p2bingo : " + p2bingo);
			if(p1bingo == 4) {
				System.out.println("p1 승리!!");
				break;
			}
			if(p2bingo == 4) {
				System.out.println("p2 승리!!");
				break;
			}
		}
	}
}
