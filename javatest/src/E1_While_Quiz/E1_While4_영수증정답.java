package E1_While_Quiz;

import java.util.Scanner;

public class E1_While4_���������� {
	/*
	 * # ������ ���[2�ܰ�]
	 * 1. 5�� �ֹ��� �޴´�.
	 * 2. �ֹ��� ���� ��, ���� �Է¹޴´�.
	 * 3. �� �޴��� �ֹ������� �ѱݾ��� ����Ѵ�.
	 * 
	 * ��)
	 * �޴� ���� : 1
	 * �޴� ���� : 1
	 * �޴� ���� : 2
	 * �޴� ���� : 2
	 * �޴� ���� : 3
	 * �� �ݾ� = 31300��
	 * ���� �Է� : 32000
	 * === �Ե����� ������ ===
	 * 1. �Ұ�� ���� : 2��
	 * 2. ����    ���� : 2��
	 * 3. ��         �� : 1��
	 * 4. ��   ��   �� : 31300��
	 * 5. ��         �� : 700��
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;

		int cnt1 = 0;
		int cnt2 = 0;
		int cnt3 = 0;
		
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		
		int i = 1;
		while(i <= 5) {
			
			System.out.print("�޴� ���� : ");
			int choice = scan.nextInt();
			
			if(choice == 1) { cnt1 = cnt1 + 1; }
			else if(choice == 2) { cnt2 = cnt2 + 1; }
			else if(choice == 3) { cnt3 = cnt3 + 1; }

			i = i + 1;
		}
		
		int total = price1*cnt1 + price2*cnt2 + price3*cnt3;
		
		System.out.println("�� �ݾ� = " + total + "��");
		System.out.print("���� �Է� : ");
		int money = scan.nextInt();
		
		int charge = money - total;
		if(charge >= 0) {
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ���� : " + cnt1 + "��");
			System.out.println("2. ����    ���� : " + cnt2 + "��");
			System.out.println("3. ��         �� : " + cnt3 + "��");
			System.out.println("4. ��   ��   �� : " + total + "��");
			System.out.println("5. ��         �� : " + charge + "��");
		}else {
			System.out.println("������ �����մϴ�.");
		}	
		
	}

}