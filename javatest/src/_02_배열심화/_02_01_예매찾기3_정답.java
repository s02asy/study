package _02_�迭��ȭ;

import java.util.Arrays;

public class _02_01_����ã��3_���� {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int numList[] = {1001,1002,1003,1004};
		int countList[] = {0,0,0,0};
		
		/*
		 * 1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
		 * 2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
		 * 3) numList �� ȸ����ȣ�̴�.
		 * 4) countList �� ��ȸ������ ���Ÿ� �󸶳� �ߴ��� ������ ǥ���Ѵ�.
		 * 5) seatList �� �˻��ؼ� �� ȸ������ ������ ���� countList�������Ѵ�.
		 * 
		 * 	��) int countList[] = {1,1,2,0};
		 */
		
		for(int i = 0; i < numList.length; i++) {
			for(int j =0; j < seatList.length; j++) {
				if(numList[i] == seatList[j]) {
					countList[i] += 1;
				}
			}
		}
		System.out.println(Arrays.toString(countList));
	}
}