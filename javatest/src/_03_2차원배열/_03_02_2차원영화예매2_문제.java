package _03_2�����迭;

import java.util.Arrays;

public class _03_02_2������ȭ����2_���� {
	public static void main(String[] args) {
		int seatList[][] = {
				{0,0,0,0,0},
				{0,0,0,0,0},
				{0,0,0,0,0}
		};
		
		int y[] = {1,2,0,2,1};
		int x[] = {2,1,1,0,2};
		int user[] = {1003,1003,1001,1005,1002};
		int size = user.length;
		/*
		 * 1) �� 2�����迭�� ��ȭ�� 3*5�� ǥ���Ѵ�.
		 * 
		 * 2) y �� ���� , x �� ���� ��ġ�� ǥ���Ѵ�. user �� ȸ����ȣ�̴�.
		 * 
		 * 3) y ,x ��ġ�� user ��θ� ������ ��� 
		 * 
		 * 4) ���࿡ �̹� ���ŵ���ġ�� "x" ���
		 */
		for(int i = 0; i < size; i++) {
			int y_ = y[i];
			int x_ = x[i];
			if(seatList[y_][x_] == 0) {
				seatList[y_][x_] = user[i];
			}else {
				System.out.println(y_ + " " + x_ + " �̹� ���ŵ� �ڸ��Դϴ�.");
			}
		}
		for(int i = 0; i < seatList.length; i++) {
			System.out.println(Arrays.toString(seatList[i]));
		}
	}
}