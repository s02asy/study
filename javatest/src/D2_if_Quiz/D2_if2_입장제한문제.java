package D2_if_Quiz;

import java.util.Scanner;
/*
 * # ���̱ⱸ �̿�����
 * 1. Ű�� �Է¹޴´�.
 * 2. �Է¹��� Ű�� 120 �̻��̸�, ���̱ⱸ�� �̿��� �� �ִ�.
 * 3. Ű�� 120 �̸��̸�, ���̱ⱸ�� �̿��� �� ����.
 * 4. ��, �θ�԰� �Բ� �� ��� ���̱ⱸ �̿��� �����ϴ�.
 *    ��) �θ�԰� �Բ� ���̳���?(yes:1, no:0)
 */
public class D2_if2_�������ѹ��� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ű�� �Է��ϼ���.");
		int Ű = scan.nextInt();
		if(Ű >= 120) {
			System.out.println("���� ����");
		}
		if(Ű < 120 && Ű >= 110) {
			System.out.println("��ȣ�� ����? yes : 1 , no : 0");
			int ��ȣ�� = scan.nextInt();
			if(��ȣ�� == 1) {
				System.out.println("���� ����");
			}
			if(��ȣ�� == 0) {
				System.out.println("���� �Ұ�");
			}
		}
		if(Ű < 110) {
			System.out.println("���� �Ұ�");
		}
	}
}
