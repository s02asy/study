package E9_Test1;

import java.util.Scanner;

public class E9_if4_Test {
	public static void main(String[] args) {

		// ATM �ʼ� �ϱ� ����
		// �α��� ���Ŀ� ���ο� �޴��� �������� �ϱ�.

		// 1. �α��� ==> 1.�Ա� 2.��� 3.��ȸ
		int cash = 20000; // �Աݽ� ���� , ��ݽ� ����
		int balance = 30000; // �Աݽ� ���� , ��ݽ� ����
		int account = 11111; // �α��ν� ���
		int password = 1234; // �α��ν� ���

		Scanner scan = new Scanner(System.in);
		System.out.println("===MEGA ATM===");
		System.out.println("1.�α��� 2.����");
		int select = scan.nextInt();
		if (select == 1) {
			System.out.println("���� ��ȣ�� �Է��ϼ���.");
			int ���� = scan.nextInt();
			if(���� == account) {
				System.out.println("��й�ȣ�� �Է��ϼ���");
				int ��й�ȣ = scan.nextInt();
				if(password == ��й�ȣ) {
					System.out.println("1.�Ա� 2.��� 3.��ȸ");
					int ���� = scan.nextInt();
					if(���� == 1) {
						System.out.println("�Ա��Ͻ� �ݾ��� �Է����ּ���.");
						int �Ա� = scan.nextInt();
						if(�Ա� <= cash) {
							System.out.println("�Աݼ���");
							balance = balance + �Ա�;
							cash = cash - �Ա�;
							System.out.println("balance : " + balance);
							System.out.println("cash : " + cash);
						}
						else {
							System.out.println("�Ա��ܾ��� Ȯ�����ּ���.");
						}
					}
					else if(���� == 2) {
						System.out.println("����Ͻ� �ݾ��� �Է����ּ���.");
						int ��� = scan.nextInt();
						if(��� <= balance) {
							System.out.println("�Աݼ���");
							balance = balance - ���;
							cash = cash + ���;
							System.out.println("balance : " + balance);
							System.out.println("cash : " + cash);
						}
						else {
							System.out.println("����ܾ��� Ȯ�����ּ���.");
						}
						
					}else if(���� == 3) {
						System.out.println("��ȸ");
						System.out.println("balance : " + balance);
						System.out.println("cash : " + cash);
					}
				}
				else {
					System.out.println("��й�ȣ�� Ȯ�����ּ���.");
				}
			}
			else {
				System.out.println("���¹�ȣ�� Ȯ�����ּ���.");
			}
		} else if (select == 2) {
			System.out.println("����");
		}

	}
}