package _02_�迭��ȭ;

import java.util.Arrays;

public class _02_02_�����ϱ�1_���� {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex = 2;
		int user = 1004;
		
		/*
		 * 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		 * 2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
		 * 3) user �� ȸ����ȣ�̴� 
		 * 
		 * seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
		 * 
		 * -��) seatList[] = {1003,1003,1004,0,1002,0,1001};
		 */
		
		if(seatList[seatIndex] == 0) {
			seatList[seatIndex] = user;
		}else {
			System.out.println("�̹� ���ŵ��ڸ�.");
		}
		
		System.out.println(Arrays.toString(seatList));
		
	}
}