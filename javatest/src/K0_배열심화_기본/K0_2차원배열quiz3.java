package K0_�迭��ȭ_�⺻;

import java.util.Arrays;

public class K0_2�����迭quiz3 {
	public static void main(String[] args) {

		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// ���� 1) ���� �� ���
		// ���� 1) 410, 810, 1210
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					garo[i] += arr[i][j];
				}
			}
			System.out.println(Arrays.toString(garo));
			
		// ���� 2) ���� �� ���
		// ���� 2) 603, 606, 609, 612
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					sero[j] += arr[i][j];
				}
			}
			System.out.println(Arrays.toString(sero));
	}
}