package D0_if_�̷�;

import java.util.Scanner;

public class D_if2_��øif {
	public static void main(String[] args) {

		/*
		��ø if 
		===  �������� �ߴ� �α����� ��øif �� �ٽ� ǥ���ϱ�. ===
		===  ���� id �� �Է¹ް� , id �� ��ġ�ϸ� �׶� pw �� �Է¹ޱ�. ===
		
		 * 1. Id�� �Է¹޾� dbId�� ��ġ�� ��쿡�� Pw�� �Է��� �� �ִ�.
		 * 2. Id�� Ʋ�� ���, "Id�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 3. Pw�� Ʋ�� ���, "Pw�� Ȯ�����ּ���"��� �޼����� ����Ѵ�.
		 * 4. Id�� Pw�� ��� ��ġ�ϴ� ���, "�α��� ����"��� �޼����� ����Ѵ�.
	 
		 */
		Scanner scan = new Scanner(System.in);

		int join_id = 1234;
		int join_pw = 1111;

		System.out.print("ID �Է� : ");
		int log_id = scan.nextInt();

		if (join_id == log_id) {
			System.out.print("Pw �Է� : ");
			int log_pw = scan.nextInt();

			if (join_pw == log_pw) {
				System.out.println("�α��� ����!");
			}
			if (join_pw != log_pw) {
				System.out.println("Pw�� Ȯ�����ּ���.");
			}
		}
		if (join_id != log_id) {
			System.out.println("Id�� Ȯ�����ּ���.");
		}
	}
}
