package E0_loop_�̷�;

import java.util.Scanner;

public class E0_loop5_continue {
	/*
	 * # �������
	 * 
	 * 2. 	continue . �ݺ����� ���ǽ����� �ٷ� �̵� . �Ʒ����� �����Ű�� ���� ���� �� ���
	 *      continue �� else �� �̿��ؼ� ����� ��������ʰ� ���� ��������ִ�.
	 *      continue �� ���� �����ص��ȴ�.
	 */

	public static void main(String[] args) {
		// continue
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("1.�ܹ���");
			System.out.println("2.�ݶ�");
			System.out.println("3.����");

			int sel = scan.nextInt();

			if (sel != 1 && sel != 2 && sel != 3) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			
			if (sel == 1) {
				System.out.println("�ܹ���");
			} else if (sel == 2) {
				System.out.println("�ݶ�");
			} else if (sel == 3) {
				System.out.println("����");
			}
		}
	}
}