package C0_Operator_�̷�;

import java.util.Scanner;

public class C_Scanner_�Է¹ޱ⹮�� {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		// ���� 1) ���� 2���� �Է¹޾�, �� ���
		System.out.println("���ڸ� �Է� �ϼ���.");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է� �ϼ���.");
		int num2 = scan.nextInt();
		System.out.println("�μ��� ���� " + num1 + num2 + "�Դϴ�.");
		*/
		/*
		// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
		System.out.println("���� 1���� �Է��ϼ���.");
		int num4 = scan.nextInt();
		System.out.println(num4 % 2 == 1);
		*/
		// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
		System.out.println("���������� �Է��ϼ���.");
		int ���� = scan.nextInt();
		System.out.println(���� >= 60 && ���� <= 100);
	}
}
