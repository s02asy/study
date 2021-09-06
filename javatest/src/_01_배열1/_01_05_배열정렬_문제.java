package _01_배열1;

import java.util.Arrays;
import java.util.Random;

public class _01_05_배열정렬_문제 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[5];
		
		/*
		 * 1) 배열에 랜덤값 (1~100사이) 5개를 저장한다.
		 * 2) 오름차순으로 정렬후 출력(낮은숫자가 앞으로)
		 */
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(100) + 1;
			arr[i] = r;
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}