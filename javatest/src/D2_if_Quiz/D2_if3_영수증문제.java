package D2_if_Quiz;

import java.util.Scanner;
/*
 * # ������ ���[1�ܰ�]
 * 1. �޴����� ����Ѵ�.
 * 2. ����ڴ� �ֹ��ϰ��� �ϴ� �޴��� ��ȣ�� �Է��Ѵ�.
 * 3. ������ �Է¹޴´�.
 * 4. �Է¹��� ���ݰ� �޴������� Ȯ����, �������� ����Ѵ�.
 * 5. ��, ������ ������ ��� "������ �����մϴ�."��� �޼����� ����Ѵ�.
 */
public class D2_if3_���������� {
	public static void main(String[] args) {
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");		
		Scanner scan = new Scanner(System.in);
		System.out.println("��ȣ ���� : ");
		int num = scan.nextInt();
		
		int result = 0;
		if(num == 1) {
			System.out.println("������ �Է� : ");
			int money = scan.nextInt();
			result = money - price1;		
			if(result >= 0) {
				System.out.println("�Ұ�� ���� ����.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("�����մϴ�.");
			}
		}
		if(num == 2) {
			System.out.println("������ �Է� : ");
			int money = scan.nextInt();
			result = money - price2;			
			if(result >= 0) {
				System.out.println("���� ���� ����.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("�����մϴ�.");
			}
		}
		if(num == 3) {
			System.out.println("������ �Է� : ");
			int money = scan.nextInt();
			result = money - price3;
			if(result >= 0) {
				System.out.println("�ݶ� ����.");
				System.out.println(result);
			}
			if(result < 0) {
				System.out.println("�����մϴ�.");
			}
		}
		if(num < 1 || num > 3) {
			System.out.println("����.");
		}
	}
}