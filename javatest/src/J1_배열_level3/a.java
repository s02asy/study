package J1_�迭_level3;

import java.util.Arrays;

public class a {
	/*
	 * # �����ϱ�
	 * 1. �ε��� 0���� �������� �˻��Ѵ�.
	 * 2. ���� ū ���� ã�� ��ȯ�Ѵ�.
	 * 3. �ε��� 1�����Ѵ�.
	 * 4. [1~3]�� ������ �ݺ��Ѵ�.
	 * ��)
	 * 10, 50, 30, 40, 80, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 30, 40, 10, 7
	 * 80, 50, 40, 30, 10, 7
	 */
	public static void main(String[] args) {

		int[] score = {10, 50, 30, 40, 80, 7};
		
		for(int i = 0; i < score.length - 1; i++) {
			int index = i;
			int check = score[i];
			for(int j = i + 1; j < score.length; j++) {
				if(check > score[j]) {
					check =score[j];
					index = j;
				}
			}
			int temp = score[i];
			score[i] = check;
			score[index] = temp;
		}
		System.out.println(Arrays.toString(score));
	}

}