package _03_2�����迭;

import java.util.Arrays;
import java.util.Random;

public class _03_01_2�����迭����_���� {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[][]  = new int[3][4];
		
		/*
		 *  1) arr �迭�� 3 * 4�������̴�.
		 *  2) arr �迭�� ������ (100~200) �� ��� ������ ��� 
		 *  3) arr �迭�� ������ �������� ���� ��� (���������� ����������)
		 *  4) ���� : 1�����迭�� �����ϸ� �����Ҽ��ִ�. 
		 */
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(101) + 100;
				k += 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		int temp[] = new int[k];
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				temp[k] = arr[i][j];
				k += 1;
			}
		}
		System.out.println(Arrays.toString(temp));
		for(int i = 0; i < temp.length; i++) {
			int id = i;
			int check = temp[i];
			for(int j = i + 1; j < temp.length; j++) {
				if(check > temp[j]) {
					check = temp[j];
					id = j;
				}
			}
			int temp2 = temp[i];
			temp[i] = check;
			temp[id] = temp2;
		}
		System.out.println(Arrays.toString(temp));
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = temp[k];
				k += 1;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}