package I1_테스트_배열_level2;

import java.util.Arrays;

public class I1_테스트_배열2_짝수홀수교환 {
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60};
		
		// 인덱스가 짝수번일때마다 그다음 홀수 번호와 교환 
		
		// arr[] = {20,10,40,30,60,50};
		
		for(int i = 0; i < 6; i++) {
			if(i % 2 == 0) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		System.out.print("arr[] = ");
		System.out.println(Arrays.toString(arr));
	}
}