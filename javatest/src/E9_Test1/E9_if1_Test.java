package E9_Test1;

import java.util.Scanner;

public class E9_if1_Test {
	public static void main(String[] args) {
		/*
		 ����) �������� �Է¹ް� ������� 
		  �Ʒ��� ����ǥ�̴�.
		  100~90 ==> A
		  89~80 ==> B
		  79~70 ==> C
		  69����                      ==> ����� 
		 �߰�����) �������뺰�� ���ڸ��� 7�� �̻��� + ���ٴ´�. 
		 ��) 100 ==> A+
		 ��) 98 ==> A+
		 ��) 83 ==> B
		 ��) 79 ==> C+
		 ��) 66 ==> "�����"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���.");
		int ���� = scan.nextInt();
		int �� = ���� % 10;
		String ��� = "";
		if(���� >= 90 && ���� < 100) {
			��� = "A";
			if(�� >= 7) {
				��� = "A+";
			}
		}
		else if(���� <= 89 && ���� >= 80 ) {
			��� = "B";
			if(�� >= 7) {
				��� = "B+";
			}
		}
		else if(���� <= 79 && ���� >= 70 ) {
			��� = "C";
			if(�� >= 7) {
				��� = "C+";
			}
		}
		else if(���� <= 60) {
			System.out.println("�����");
		}
		else if(���� == 100) {
			��� = "A+";
		}
		System.out.println(����);
		System.out.println(���);
	}
}