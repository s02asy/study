package D3_if_Quiz;

import java.util.Scanner;

public class D3_if4_�α������� {

public static void main(String[] args) {
		
		// 03:52 ~ 04:00 // ��ȣ���� ������ 
		int dbid = 1234;
		int dbpw = 1111;
				
		// ����1) ���̵�� ��й�ȣ�� �Է¹ް� �α��μ��� , ���� ��� 		
		// ����) ���̵� �Է¹ް� ���̵� �˻��� ���̵� ������ ��й�ȣ 
		//      ����� 	
		Scanner scan = new Scanner(System.in);		
		System.out.println("���̵� �Է� : ");
		int id = scan.nextInt();
		if(id == dbid) {
			System.out.println("��й�ȣ �Է� : ");
			int pw = scan.nextInt();
			if(pw == dbpw) {
				System.out.println("�α���");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
	}
}
