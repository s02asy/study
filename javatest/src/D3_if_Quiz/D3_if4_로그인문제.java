package D3_if_Quiz;

import java.util.Scanner;

public class D3_if4_�α��ι��� {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dbid = 1234;
		int dbpw = 1111;
				
		// ����1) ���̵�� ��й�ȣ�� �Է¹ް� �α��μ��� , ���� ��� 
		
		// ����) ���̵� �Է¹ް� ���̵� �˻��� ���̵� ������ ��й�ȣ 
		//      �����
		System.out.println("���̵� �Է��ϼ���");
		int id = scan.nextInt();
		if(dbid == id) {
			System.out.println("��й�ȣ�� �Է��ϼ���.");
			int pw = scan.nextInt();
			if(dbpw == pw) {
				System.out.println("�α��� ����.");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� Ȯ���ϼ���");
		}
	}
}