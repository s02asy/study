package _01_�迭1;

import java.util.Arrays;
import java.util.Random;

public class _01_05_�迭����_���� {
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		
		/*
		 * 1) �迭�� ������ (1~100����) 5���� �����Ѵ�.
		 * 2) ������������ ������ ���(�������ڰ� ������)
		 */
		
		Random ran = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			int r = ran.nextInt(100) + 1;
			arr[i] = r;
		}
		
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