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
		int user[] = { 1003,1003,1001,1005,1002};
		
		/*
		 * 1) �� 2�����迭�� ��ȭ�� 3*5�� ǥ���Ѵ�.
		 * 
		 * 2) y �� ���� , x �� ���� ��ġ�� ǥ���Ѵ�. user �� ȸ����ȣ�̴�.
		 * 
		 * 3) y ,x ��ġ�� user ��θ� ������ ��� 
		 * 
		 * 4) ���࿡ �̹� ���ŵ���ġ�� "x" ���
		 */
		
		for(int i = 0; i < y.length; i++) {
			if(seatList[y[i]][x[i]] == 0) {
				seatList[y[i]][x[i]] = user[i];
			}else {
				System.out.print(y[i] + " " + x[i]);
				System.out.println(" [x]");
			}		
		}
		for(int i = 0; i < seatList.length; i ++) {
			System.out.println(Arrays.toString(seatList[i]));
		}
		
		
	}
}