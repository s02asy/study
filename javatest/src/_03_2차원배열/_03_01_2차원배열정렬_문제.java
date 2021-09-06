package _03_2차원배열;

import java.util.Arrays;
import java.util.Random;

public class _03_01_2차원배열정렬_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[][]  = new int[3][4];
		
		/*
		 *  1) arr 배열은 3 * 4사이즈이다.
		 *  2) arr 배열에 랜덤값 (100~200) 을 모두 저장후 출력 
		 *  3) arr 배열을 정렬후 오름차순 으로 출력 (낮은순에서 높은순으로)
		 *  4) 힌터 : 1차원배열에 저장하면 쉽게할수있다. 
		 */
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(101) + 100;
				k += 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int temp[] = new int[k];
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				temp[k] = arr[i][j];
				k += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		for(int i = 0; i < temp.length; i++) {
			int id = i;
			int check = temp[i];
			for(int j = i + 1; j < temp.length; j++) {
				if(check > temp[j]) {
					check = temp[j];
					id = j;
				}
			}
			int temp2 = temp[i];
			temp[i] = check;
			temp[id] = temp2;
		}
		System.out.println(Arrays.toString(temp));
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temp[k];
				k += 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}