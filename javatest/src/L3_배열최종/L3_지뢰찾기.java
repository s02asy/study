package L3_�迭����;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3_����ã�� {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = {
				{1,9,9,9,1},
				{9,9,1,9,1},
				{1,9,1,9,9},
				{1,9,9,1,1}
		};
		
		// ���� 9�� ���̴�.
		// ���� 1�� �����ִ� ��ġ�̴�.
		// ����1�� ��ġ�� �ε��� 2���� �Է¹ް� 
		// ����1���� ���� ����� ���� ��� 
		// ������ 8������ ���Ѵ�.
		// ��) 0,0 ==> 1�� �Ѱ��̹Ƿ� ==> 1��� 
		// ��) 2,0 ==> 1�� 2�� ����Ǿ������Ƿ� ==> 2��� 
		// ��) 3,3 ==> 1�� 4�� ����Ǿ������Ƿ� ==> 4��� 
		while(true) {
			int cnt = 0;
			for(int i = 0; i < arr.length; i++) {
				System.out.println(Arrays.toString(arr[i]));
			}
			System.out.println("y : ");
			int y = scan.nextInt();
			System.out.println("x : ");
			int x = scan.nextInt();
			if(y >= 0 && y < arr.length && x >= 0 && x < arr[0].length) {
				if(arr[y][x] == 1) {
					cnt += 1;
					for(int i = y - 1; i < y + 1; i++) {
						for(int j = x - 1; j < x + 1; j++) {
							if(i == y && j == x) {
								continue;
							}
							if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length) {
								continue;
							}
							if(arr[i][j] == 1) {
								cnt += 1;
								int y2 = i;
								int x2 = j;
								for(int k = y2 - 1; k < y2 + 1; k++) {
									for(int l = x2 - 1; l < x2 + 1; l++) {
										if(k == y2 && l == x2 && k == y && l == x) {
											continue;
										}
										if(k < 0 || l < 0 || k >= arr.length || l >= arr[0].length) {
											continue;
										}
										if(arr[y2][x2] == 1) {
											cnt += 1;
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}