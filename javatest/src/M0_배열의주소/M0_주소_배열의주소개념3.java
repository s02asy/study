package M0_배열의주소;

import java.util.Arrays;

public class M0_주소_배열의주소개념3 {
	public static void main(String[] args) {

		int[][] darr = new int[3][];
		
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {1,2,3,4};
		int arr3[] = {5,4,3,2,1};
		
		darr[0] = arr1;
		darr[1] = arr2;
		darr[2] = arr3;
		
		for(int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("====================");

		for(int i = 0; i < darr.length; i++) {
			System.out.println(Arrays.toString(darr[i]));
		}
	}

}