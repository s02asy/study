package D4_if_Quiz;

import java.util.Random;
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
		
		int r = ran.nextInt(50) + 1;
		int �� = r / 10;
		int �� = r % 10;
		int count = 0;
		if(�� == 3 || �� == 6 || �� == 9) {
			count = count + 1;
		//�� != 0 && �� % 3 == 0
		}
		if(�� == 3 || �� == 6 || �� == 9) {
			count = count + 1;
		}
		if(count == 2) {
			System.out.println("¦¦");
		}
		else if(count == 1) {
			System.out.println("¦");
		}
		else {
			System.out.println(r);
		}
	}
}
