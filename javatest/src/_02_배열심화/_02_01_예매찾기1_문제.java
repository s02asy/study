package _02_�迭��ȭ;

public class _02_01_����ã��1_���� {
	public static void main(String[] args) {
		
	
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int find = 1003;
		
		/*
		 * 1) seatList �� ��ȭ�� 7�ڸ��� ��Ÿ����. 
		 * 2) seatList �� ������ ��ȭ�� ������ ȸ����ȣ�� ��Ÿ����. 
		 * 3) find �� �˻��ϰ����ϴ� ȸ����ȣ�̴�.
		 * 4) find �� ���� ��ȭ������ ã�� �ڸ��� ���������
		 * 	- ��) 1003 �̹Ƿ� ��ȭ�� 0, 1 ���̴�.
		 */
		
		for(int i = 0; i < seatList.length; i++) {
			if(find == seatList[i]) {
				System.out.println(i);
			}
		}
	}
}