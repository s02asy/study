package D2_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ������ ����[1�ܰ�]
 * 1. ������ ������ �����ϱ� ����, ���� 2���� �Է¹޴´�.
 * 2. �Է¹��� ���ڸ� ���� ������ ������ ����Ѵ�.
 * ��)	3 x 7 = ?
 * 3. ������ �ش��ϴ� ������ �Է¹޴´�.
 * 4. ������ �� "����" �Ǵ� "��"�� ����Ѵ�.
 */
public class D2_if5_�����ܹ��� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		/*System.out.println("ù��°���ڸ� �Է��ϼ���.");
		int ����1 = scan.nextInt();
		System.out.println("�ι�°���ڸ� �Է��ϼ���.");
		int ����2 = scan.nextInt();
		System.out.println(����1 + " * " + ����2 + " = " + "?");
		int ���� = scan.nextInt();
		int �� = ����1 * ����2;
		if(���� == ��) {
			System.out.println("����");
		}
		if(���� != ��) {
			System.out.println("��");
		}*/
		System.out.println("ù��°���� �������.");
		int ����1 = ran.nextInt(8) +2;
		System.out.println(����1);
		System.out.println("�ι�°���ڸ� �������.");
		int ����2 = ran.nextInt(9) +1;
		System.out.println(����2);
		System.out.println(����1 + " * " + ����2 + " = " + "?");
		int ���� = scan.nextInt();
		int �� = ����1 * ����2;
		if(���� == ��) {
			System.out.println("����");
		}
		if(���� != ��) {
			System.out.println("��");
		}
	}
}
