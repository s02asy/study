package J2_�׽�Ʈ_�迭_level3;

import java.util.Arrays;

public class J2_�׽�Ʈ_�迭3_���ļ������ {
	/*
	 * # ���� ���
	 * . ���� ������ ��ȣ���
	 */

	public static void main(String[] args) {

		int[] numList = {1001, 1002, 1003, 1004};
		int[] scoreList = { 87, 42,  11, 98};

		for(int i = 0; i < 4; i++) {
			int check = scoreList[i];
			int index = i;
			for(int j = i; j < 4; j++) {
				if(check < scoreList[j]) {
					check = scoreList[j];
					index = j;
				}
			}
			int temp = scoreList[i];
			scoreList[i] = check;
			scoreList[index] = temp;
			int temp2 = numList[i];
			numList[i] = numList[index];
			numList[index] = temp2;
		}
		System.out.println(Arrays.toString(numList));
		System.out.println(Arrays.toString(scoreList));
	}
}