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
public class D2_if2_������������ {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);

		System.out.print("Ű�� �Է��ϼ��� : ");
		int height = scan.nextInt();

		if (height >= 120) {
			System.out.println("���̱ⱸ �̿밡���մϴ�.");
		}
		if (height < 120) {
			System.out.print("�θ�԰� �Բ� ���̳���?(yes:1, no:0) : ");
			int answer = scan.nextInt();

			if (answer == 1) {
				System.out.println("���̱ⱸ �̿밡���մϴ�.");
			}
			if (answer == 0) {
				System.out.println("���̱ⱸ�� �̿��� �� �����ϴ�.");
			}
		}
		
				
	}
}
