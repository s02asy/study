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
	Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		System.out.print("�޴��� �����ϼ��� : ");
		int choice = scan.nextInt();

		System.out.print("������ �Է��ϼ��� : ");
		int money = scan.nextInt();
		
			
		int charge = 0;
		if(choice == 1) { charge = money - price1; }
		if(choice == 2) { charge = money - price2; }
		if(choice == 3) { charge = money - price3; }
		
		if(charge >= 0) {
			System.out.println("�ܵ� : " + charge + "��");
		}
		if(charge < 0) {
			System.out.println("������ �����մϴ�.");
		}
				
	}
}
