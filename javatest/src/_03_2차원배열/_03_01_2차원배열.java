package _03_2�����迭;

import java.util.Arrays;

public class _03_01_2�����迭 {
	public static void main(String[] args) {
		int arr[][] = {
				{10,20,30},
				{40,50,60}
		};
		
		
		/*
		 * 1) ��������� 
		 * 2) ���������
		 * 3) ��ü�����
		 * 
		 */
		int garo[] = new int[arr.length];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				garo[i] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(garo));
		
		int sero[] =new int[arr[0].length];
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				sero[j] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(sero));
		
		int total = 0;
		for(int i =0; i < arr.length; i++) {
			for(int j = 0; j< arr[i].length; j++) {
				total += arr[i][j];
			}
		}
		System.out.println(total);
	}
}