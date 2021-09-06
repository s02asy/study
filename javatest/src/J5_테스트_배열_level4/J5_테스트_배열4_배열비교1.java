package J5_테스트_배열_level4;

import java.util.Arrays;

public class J5_테스트_배열4_배열비교1 {

	public static void main(String[] args) {
		int arr[] = {10,20,30,20,40};
		int b[] = {10,3,20,10,50};
		
		//문제) arr 배열 안의 값들중에서 b배열의 값이 있으면 
		//     b와 arr의 각각 겹치는값을  0으로 변경
		
		// 예) 10 과 20이 겹치므로 
		// 예) arr[] = {0,0,30,40};
		// 예) b[] = {0,3,0,50};
		
		// 10 과 20이 겹치므로 
		int temp2 = 0;
		for(int i = 0; i < 5 ; i++) {
			int temp = arr[i];
			for(int j = 0; j <5 ; j++) {
				if(temp == b[j]) {
					temp2 = b[j];
					b[j] = 0;
				}
				if(temp2 == arr[j]) {
					arr[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(b));
	}
}