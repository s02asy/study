package D2_if_Quiz;

import java.util.Scanner;

/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������ 
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������  �߸� �Է��߽��ϴ�.
 */
public class D2_if1_������ȿ������ {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int ���� = scan.nextInt();
		if(���� >= 60 && ���� <= 100) {
			System.out.println("�հ�");
		}
		if(���� < 60 && ���� >= 0) {
			System.out.println("���հ�");
		}
		if(���� < 0 || ���� > 100) {
			System.out.println("���� ����");
		}
	}
}
