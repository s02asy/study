package K1_배열심화_level1;

import java.util.Arrays;
import java.util.Random;

public class K1_배열심화1_2차원정렬 {
	public static void main(String[] args) {

		//  2차원은복잡하니 1차원에 전부 저장후  1차원을 정렬한후 다시 2차원에저장
		//  문제 )  1~100 사이의 랜덤값을 darr 에 9개저장후 정렬 
		//  내림차순 : 높은순서대로 차례대로 출력.
		int darr[][] = new int[3][3];
		
		Random ran = new Random();
		
		int arr[] = new int[9];
		for(int i = 0; i < 9;) {
			int r = ran.nextInt(100) + 1;
			boolean check = false;
			for(int j = 0; j < i; j++) {
				if(arr[j] == r) {
					check = true;
					break;
				}
			}
			if(check == false) {
				arr[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < 9 - 1; i++) {
			int check1 = arr[i];
			int index = i;
			for(int j = i + 1; j < 9; j++) {
				if(check1 < arr[j]) {
					check1 = arr[j];
					index = j;
				}
			}
			int temp = arr[i];
			arr[i] = check1;
			arr[index] = temp;
		}
		System.out.println(Arrays.toString(arr));
		int arrid = 0;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				darr[i][j] = arr[arrid];
				arrid += 1;
			}
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.printf("[%3d]", darr[i][j]);
			}
			System.out.println();
		}
	}
}