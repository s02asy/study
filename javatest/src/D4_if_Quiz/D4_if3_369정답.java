package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # 369����[1�ܰ�]
 * 1. 1~50 ������ ���� ���ڸ� �����Ѵ�.
 * 2. �� ���� 369�� ������
 * 	1) 2���̸�, ¦¦�� ���
 *  2) 1���̸�, ¦�� ���
 *  3) 0���̸�, �ش� ���ڸ� ���
 * ��)
 * 		33	 : ¦¦
 * 		16	 : ¦
 * 		 7	 : 7
 */
public class D4_if3_369���� {
	public static void main(String[] args) {	
		Random ran = new Random();
		
		int rNum = ran.nextInt(50) + 1;
		System.out.println("���� = " + rNum);
		
		int x = rNum / 10;
		int y = rNum % 10;
		
		int cnt = 0;
		if(x == 3 || x == 6 || x == 9 ) {
			cnt = cnt + 1;
		}
		if(y == 3 || y == 6 || y == 9) {
			cnt = cnt + 1;
		}
		
		if(cnt == 2) {
			System.out.println("¦¦");
		}else if(cnt == 1) {
			System.out.println("¦");
		}else {
			System.out.println(rNum);
		}
	}
}
