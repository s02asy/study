package J1_배열_level3;

import java.util.Arrays;

public class J1_배열3_정렬 {
	/*
	 * # 정렬하기
	 * 1. 인덱스 0번이 나머지를 검사한다.
	 * 2. 제일 큰 값을 찾아 교환한다.
	 * 3. 인덱스 1증가한다.
	 * 4. [1~3]을 끝까지 반복한다.
	 * 예)
	 * 10, 50, 30, 40, 80, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 40, 30, 10, 7
	 */
	public static void main(String[] args) {
		int arr[] = {10,50,30,40,80,7};		
		// 버블 정렬 
		for(int i = 0; i < 6; i++) {			
			for(int j = 0; j < 6; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
			System.out.println(Arrays.toString(arr));
		}	
		System.out.println();
		// 선택 정렬 
		int a[] = {10,50,30,40,80,7};
		for(int i = 0; i < 6; i++) {
			int max = a[i];
			int maxindex = i;
			for(int j = i; j < 6; j++) {
				if(max < a[j]) {
					max = a[j];
					maxindex = j;
				}
			}
			int temp = a[i];
			a[i] = a[maxindex];
			a[maxindex] = temp;
			System.out.println(Arrays.toString(a));
		}
		System.out.println();
		// 선택 정렬 최종본
		int[] score = {10, 7, 30, 7, 7, 7};
		for(int i = 0; i < 6 - 1; i++) {
			int check = score[i];
			int scoreid = i;
			for(int j = i + 1; j < 6; j++) {
				if(check > score[j]) {
					check = score[j];
					scoreid = j;
				}
			}
			if(i != scoreid) {
				int temp = score[i];
				score[i] = check;
				score[scoreid] = temp;
				System.out.println(Arrays.toString(score));
			}
		}
	}
}