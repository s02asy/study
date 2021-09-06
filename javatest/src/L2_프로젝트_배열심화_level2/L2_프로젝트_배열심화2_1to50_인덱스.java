package L2_������Ʈ_�迭��ȭ_level2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L2_������Ʈ_�迭��ȭ2_1to50_�ε��� {
	/* 
	 * # 1 to 50
	 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
	 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int arr[][] = new int[5][5];
		int data = 1;
		int min = 1;
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
			System.out.print("   " + i);
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j == 0) {
					System.out.print(i + " ");
				}
				System.out.printf("[%2d]" , arr[i][j]);
			}
			System.out.println();
		}
		while(true) {
			System.out.println("x : ");
			int x = scan.nextInt();
			System.out.println("y : ");
			int y = scan.nextInt();
			if(min >= 26) {
				if(arr[y][x] == min) {
					arr[y][x] = 0;
					min += 1;
				}
				System.out.println("num : " + min);
				for(int i = 0; i < arr.length; i++) {
					System.out.print("   " + i);
				}
				System.out.println();
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(j == 0) {
							System.out.print(i + " ");
						}
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
				System.out.println("����.");
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
				if(arr[y][x] == min && check == false) {
					arr[y][x] = r;
					min += 1;
				}
				System.out.println("num : " + min);
				for(int i = 0; i < arr.length; i++) {
					System.out.print("   " + i);
				}
				System.out.println();
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						if(j == 0) {
							System.out.print(i + " ");
						}
						System.out.printf("[%2d]" , arr[i][j]);
					}
					System.out.println();
				}
				break;
			}
		}
	}
}