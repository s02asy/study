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
		System.out.println("=== �Ե����� ===");
		System.out.println("1.�Ұ�� ���� : " + price1 + "��");
		System.out.println("2.����    ���� : " + price2 + "��");
		System.out.println("3.��         �� : " + price3 + "��");
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int i = 1;
		
		while(i == 1) {
			System.out.println("�޴� ��ȣ�� �����ϼ���.");
			int �Է� = scan.nextInt();
			if(�Է� == 1) {
				count1++;
				count4++;
			}
			else if(�Է� == 2) {
				count2++;
				count4++;
			}
			else if(�Է� == 3) {
				count3++;
				count4++;
			}
			else {
				System.out.println("��ȣ�� �ٽ� �Է��ϼ���.");
			}
			if(count4 == 5) {
				i = 0;
				System.out.println("�ֹ��� �����մϴ�.");
			}
		}
		int total = count1 * price1 + count2 * price2 + count3 * price3;
		System.out.println("�� �ݾ� = " + total + "��");
		System.out.println("������ �Է��ϼ���.");
		int ���� = scan.nextInt();
		int �Ž����� = ���� - total;
		if(�Ž����� >= 0) {
			System.out.println("=== �Ե����� ������ ===");
			System.out.println("1. �Ұ�� ���� : " + count1 + "��");
			System.out.println("2. ����    ���� : " + count2 + "��");
			System.out.println("3. ��         �� : " + count3 + "��");
			System.out.println("4. ��   ��   �� : " + total + "��");
			System.out.println("5. ��         �� : " + �Ž����� + "��");
		}
		else {
			System.out.println("�ֹ����� ������ Ȯ���ϼ���.");
		}
		
	}

}