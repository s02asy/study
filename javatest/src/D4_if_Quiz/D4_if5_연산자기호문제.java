package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������	//11:26
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 1��
 */
public class D4_if5_�����ڱ�ȣ���� {
	public static void main(String[] args) {	
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int r1 = ran.nextInt(10) + 1;
		int r2 = ran.nextInt(10) + 1;
		int r3 = ran.nextInt(4) + 1;
					   // ���信 ���� �ȳ־��ָ� ��Ŭ������ ������
		int ���� = 0;   // if���� �ɷ��ִ°� �ν����� ���� ��¹��� if�� �ۿ� �ֱ⶧��
		if(r3 == 1) {	
			���� = r1 + r2;
		}
		else if(r3 == 2) {
			���� = r1 - r2;
		}
		else if(r3 == 3) {
			���� = r1 * r2;
		}
		else if(r3 == 4) {
			���� = r1 % r2;
		}
		System.out.println(r1 + " ? " + r2 + " = " + ����);
		System.out.println("1) + 2) - 3) * 4) %");
		System.out.println("��ȣ�� �����ϼ���.");
		int �Է� = scan.nextInt();
		if(�Է� == r3) {
			System.out.println("���� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
	}
}
