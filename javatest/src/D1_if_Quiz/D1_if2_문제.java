package D1_if_Quiz;

import java.util.Scanner;

public class D1_if2_���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ����) ���ڿ� ���� �Է¹ް� �׼��ڰ�  ����  4�� ����� "4�� ���" ���.
		System.out.println("����) ���� �Է� : ");
		int num2 = scan.nextInt();
		if (num2 % 4 == 0) {
			System.out.println("4�� ����̴�.");
		}
		if (num2 % 4 != 0) {
			System.out.println("4�� ����� �ƴϴ�.");
		}
		// ����1 ) ������ �Է� �ް� �� ������ 60 ���̻��̸� "�հ�", �ƴϸ� "���հ�" ���.
		System.out.println("������ �Է��ϼ���.");
		int a = scan.nextInt();
		if (a >= 60) {
			System.out.println("�հ�");
		}
		if ( a < 60) {
			System.out.println("���հ�");
		}
		// ����2 ) ���ڸ� �Է¹ް� "¦��" "Ȧ��" �� ���.
		System.out.println("���ڸ� �Է��ϼ���.");
		int b = scan.nextInt();
		if (b % 2 == 0) {
			System.out.println("¦��");
		}
		if (b % 2 == 1) {
			System.out.println("Ȧ��");
		}
		// ����3 ) ���� 2���� �Է¹ް� ��ū���ڸ� ��� 
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int c = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int d = scan.nextInt();
		if (c > d) {
			System.out.println(c);
		}
		if (d > c) {
			System.out.println(d);
		}
	}
}
