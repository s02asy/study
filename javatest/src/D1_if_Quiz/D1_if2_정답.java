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
		System.out.println("����1) ���� �Է� : ");
		int score = scan.nextInt();
		if (score >= 60) {
			System.out.println("�հ�");
		}
		if (score < 60) {
			System.out.println("���հ�");
		}
		
		// ����2 ) ���ڸ� �Է¹ް� "¦��" "Ȧ��" "0" �� ���.
		
		// ����3 ) ���� 2���� �Է¹ް� ��ū���ڸ� ��� 

	}
}
