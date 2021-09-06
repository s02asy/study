package L2_프로젝트_배열심화_level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L2_프로젝트_배열심화2_1to50_작은수 {
	/* 
	 * # 1 to 50
	 * 1. 구글에서 1 to 50 이라고 검색한다.
	 * 2. 1 to 50 순발력 게임을 선택해 게임을 실습해본다.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int arr[][] = new int[5][5];
		int min = 1;
		int data = 1;
		while(true) {
			int r1 = ran.nextInt(5);
			int r2 = ran.nextInt(5);
			if(arr[r1][r2] == 0) {
				arr[r1][r2] = data;
				data += 1;
			}
			if(data > 25) {
				break;
			}
		}
		System.out.println("num : " + min);
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]" , arr[i][j]);
			}
			System.out.println();
		}
		
		while(true) {
			System.out.println("제일 작은수 입력 : ");
			int num = scan.nextInt();
			if(min >= 26) {
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(min == num && num == arr[i][j]) {
							arr[i][j] = 0;
							min += 1;
						}
					}
				}
				System.out.println("num : " + min);
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(arr[i][j] == 0) {
							System.out.print("[  ]");
						}
						else {
							System.out.printf("[%2d]" , arr[i][j]);
						}
					}
					System.out.println();
				}
			}
			if(min == 51) {
				System.out.println("종료.");
				break;
			}
			while(true) {
				if(min >= 26) {
					break;
				}
				int r = ran.nextInt(25)+26;
				boolean check = false;
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(arr[i][j] == r) {
							check = true;
							break;
						}
					}
					if(check == true) {
						break;
					}
				}
				if(check == true) {
					continue;
				}
				else if(check == false) {
					for(int i = 0; i < arr.length; i++) {
						for(int j = 0; j < arr[i].length; j++) {
							if(arr[i][j] == num && min == num) {
								arr[i][j] = r;
								min += 1;
							}
						}
					}
				}
				System.out.println("num : " + min);
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.printf("[%2d]" , arr[i][j]);
					}
					System.out.println();
				}
				break;
			}
		}
	}
}