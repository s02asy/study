package _03_2�����迭;

import java.util.Arrays;
import java.util.Random;

public class _03_01_2�����迭����_���� {
	public static void main(String[] args) {
		int arr[][]  = new int[3][4];			
		/*
		 *  1) arr �迭�� 3 * 4�������̴�.
		 *  2) arr �迭�� ������ (100~200) �� ��� ������ ��� 
		 *  3) arr �迭�� ������ �������� ���� ��� (���������� ����������)
		 *  4) ��Ʈ : 1�����迭�� �����ϸ� �����Ҽ��ִ�. 
		 */
		
		Random ran = new Random();
		
		//[1] ������ arr �� ���� , 
		//[2] ���� k �� �������迭�� �ε����� �������迭 �̶� �ٸ��⶧���� �ʿ�
		int k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ran.nextInt(101) + 100;
				k += 1;
			}
		}
		System.out.println("----------Ȯ�ο����------------");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		//[3] arr �� ����Ǿ��ִ� ���� 1�����迭�� temp �� ���� 
		int temp[] = new int[k];
		k = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				temp[k] = arr[i][j];
				k += 1;
			}
		}
		
		//[4] ���� 
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < k; j++) {
				if(temp[i] < temp[j]) {
					int t = temp[i];
					temp[i] = temp[j];
					temp[j] = t;
				}
			}
		}
		System.out.println("----------Ȯ�ο����------------");
		System.out.println(Arrays.toString(temp));
		
	}
}