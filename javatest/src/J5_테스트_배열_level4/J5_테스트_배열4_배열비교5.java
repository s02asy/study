package J5_테스트_배열_level4;

import java.util.Arrays;

public class J5_테스트_배열4_배열비교5 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,50};
		int temp = 0;
		//문제) arr 배열 안의 값들중에서 b배열의 값이 있으면 
		//     b와 arr의 각각 겹치는값을  0으로 변경
		
		// 겹치는 값이 있으면 전부 0으로 변경 
		
		
		
		// 예) arr[] = {0,0,30,40,0};
		// 예) b[] = {0,3,0,0,50};
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(arr[i] == b[j]) {
					temp = arr[i];
					b[j] = 0;
				}
			}
			for(int k = 0; k < 5; k++) {
				if(temp == arr[k]) {
					arr[k] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}

}