package _03_2�����迭;

public class _03_03_2������ȭã��1_���� {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,   0,   0,1001,1001},
				{0,1003,1002,1002,   0},
				{0,1005,1004,   0,   0}
		};
		
		int find = 1002;
		
		
		/*
		   1) �� 2�����迭�� ��ȭ�� 3*5�� ǥ���Ѵ�.
		   2) 2�����迭�� ������ ���ŵǾ��ִ� ȸ����ȣ�̴�.
		   3) find �� ��ġ�� ã�����ϴ� ȸ����ȣ�̴�
		   4) ȸ����ȣ�� ã�� ��ġ�� ��� 
		   5) ���Ű� �������� ����ġ ���� ��� 
		 */
		
		for(int i = 0; i < seatList.length; i++) {
			for(int j = 0; j < seatList[i].length; j++) {
				if(seatList[i][j] == find) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}