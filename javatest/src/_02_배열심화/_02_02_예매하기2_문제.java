package _02_�迭��ȭ;

import java.util.Arrays;

public class _02_02_�����ϱ�2_���� {
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex[] = {2,1,3};
		int user [] = {1003,1002,1005};
		
		/*
		 * 1) seatList �� ���� ��ȭ�� ���Ż�Ȳ �̴�.
		 * 2) seatIndex �� ���� �ҷ��� �¼� ��ȣ�̰�
		 * 3) user �� ȸ����ȣ�̴� 
		 * 
		 * 4) seatIndex �� user �� ������ ������ ��ü ���Ż�Ȳ ��� 
		 * 5) �¼��� ��������� �����Ҽ��ִ�.
		 * 6) �¼��� �̹� ���� �Ǿ������� ���� �Ұ� 
		 * 
		 * -��) 2 , 1003 ==> seatList[] = {1003,1003,1003,0,1002,0,1001};
		 * -��) 1 , 1002 ==> "x";
		 * -��) 3 , 1005 ==> seatList[] = {1003,1003,1003,1005,1002,0,1001};
		 * 
		 */
		for(int i = 0; i < seatIndex.length; i++) {
			int index = seatIndex[i];
			if(seatList[index] != 0) {
				System.out.println("x");
			}else {
				seatList[index] = user[i];
				System.out.println(Arrays.toString(seatList));
			}
		}
	}
}