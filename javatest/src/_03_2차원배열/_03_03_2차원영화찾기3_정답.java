package _03_2�����迭;

import java.util.Arrays;

public class _03_03_2������ȭã��3_���� {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int user[] = {1001,1002,1003,1004,1005};
		int count[] = {0,0,0,0,0};
				
		/*
		   1) �� 2�����迭�� ��ȭ�� 3*5�� ǥ���Ѵ�.
		   2) 2�����迭�� ������ ���ŵǾ��ִ� ȸ����ȣ�̴�.
		   3) user �� ȸ����ȣ�̰�, count �� ��ȸ������ ������ Ƽ�� ���̴�.
		   4) count �� �� ȸ������ ������ Ƽ�ϼ��� �����Ѵ�.		 
		 */
		
		for(int k = 0; k < user.length; k++) {
			for(int i = 0; i < seatList.length; i++) {
				for(int j = 0; j < seatList[i].length; j++) {
					if(user[k] == seatList[i][j]) {
						count[k] += 1;
					}
				}
			}
		}
		
		System.out.println(Arrays.toString(user));
		System.out.println(Arrays.toString(count));
	}
}