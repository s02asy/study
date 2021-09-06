package J5_테스트_배열_level4;

import java.util.Arrays;

public class a {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,20,70,10,10,90};
		int b[] = {10,3,20,10,50,20,70,70,70,90};
		
		//문제) arr 배열 안의 값들중에서 b배열의 값이 있으면 
		//     b와 arr의 각각 겹치는값을  0으로 변경
		
		// 겹치는 값이 있으면 전부 0으로 변경 
		
		
		
		// 예) arr[] = {0,0,30,40,0};
		// 예) b[] = {0,3,0,0,50};
		int temp2 = 0;
		for(int i = 0; i < arr.length; i++) {
			int temp1 = arr[i];
			for(int j = 0; j < b.length; j++) {
				if(temp1 == b[j]) {
					temp2 = b[j];
					b[j] = 0;
				}
			}
			for(int k = 0; k < arr.length; k++) {
				if(temp2 == arr[k]) {
					arr[k] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}