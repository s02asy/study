package L3_배열최종;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class L3_지뢰찾기 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = {
				{1,9,9,9,1},
				{9,9,1,9,1},
				{1,9,1,9,9},
				{1,9,9,1,1}
		};
		
		// 숫자 9는 벽이다.
		// 숫자 1은 고를수있는 위치이다.
		// 숫자1의 위치를 인덱스 2개를 입력받고 
		// 숫자1끼리 서로 연결된 개수 출력 
		// 연결은 8방향을 말한다.
		// 예) 0,0 ==> 1이 한개이므로 ==> 1출력 
		// 예) 2,0 ==> 1이 2개 연결되어있으므로 ==> 2출력 
		// 예) 3,3 ==> 1이 4개 연결되어있으므로 ==> 4출력 
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