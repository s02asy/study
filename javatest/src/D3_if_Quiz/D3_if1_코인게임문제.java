package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 * 4. ������ 1000�� �ִ�. ���߸� 2�� , Ʋ���� -1000
 */
public class D3_if1_���ΰ��ӹ��� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int ���� = 1000;
		System.out.println("���� ���� ���� (�� : 0 , �� : 1)");
		int a = scan.nextInt();
		System.out.println("������ ������.");
		int b = ran.nextInt(2);
		if(b == 0) {
			System.out.println("�ո�");
		}
		if(b == 1) {
			System.out.println("�޸�");
		}
		if(a == b) {
			���� = ���� * 2;
			System.out.println("���� (���� * 2)");
			System.out.println("���� : " + ����);
		}
		if(a != b) {
			���� = ���� - 1000;
			System.out.println("���� (���� - 1000)");
			System.out.println("���� : " + ����);
		}
	}
}
