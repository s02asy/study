package C0_Operator_�̷�;

import java.util.Scanner;



public class C_Scanner_�Է¹ޱ����� {
		public static void main(String[] args) {
		
			Scanner scan = new Scanner(System.in);
			
			// ���� 1) ���� 2���� �Է¹޾�, �� ���
			System.out.print("����1 �Է� : ");
			int x = scan.nextInt();
			System.out.print("����2 �Է� : ");
			int y = scan.nextInt();
			
			int total = x + y;
			System.out.println("�� ���� �� = " + total);
			
			// ���� 2) ���� 1���� �Է¹޾�, Ȧ���̸� true ���
			System.out.print("���� �� �� �Է� : ");
			int z = scan.nextInt();
			System.out.println(z % 2 == 1);
			
			// ���� 3) ������ �Է¹޾�, 60�� �̻��̰� 100�� �����̸� true ���
			System.out.print("���� �Է� : ");
			int score = scan.nextInt();
			System.out.println(60 <= score && score <= 100);
		
	}
}
