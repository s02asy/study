package _03_2�����迭;

import java.util.Arrays;

public class _03_02_2������ȭ����1_���� {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		
		int y = 1;
		int x = 3;
		int user = 1003;
		
		/*
		 * 1) �� 2�����迭�� ��ȭ�� 3*5�� ǥ���Ѵ�.
		 * 
		 * 2) y �� ���� , x �� ���� ��ġ�� ǥ���Ѵ�. user �� ȸ����ȣ�̴�.
		 * 
		 * 3) y ,x ��ġ�� user �� ������ ��� 
		 * 
		 * ��)
		 * 
				{0,0,0,0,0}
				{0,0,0,1003,0}
				{0,0,0,0,0}

		 */
		if(seatList[y][x] == 0) {
			seatList[y][x] = user;
			for(int i = 0; i < seatList.length; i++) {
				System.out.println(Arrays.toString(seatList[i]));
			}
		}else {
			System.out.println("�̹� ���ŵ� �¼��Դϴ�.");
		}
	}
}