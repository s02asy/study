package D1_if_Quiz;

import java.util.Scanner;

public class D1_if5_���� {
	public static void main(String[] args) {
		
		/*
		 * # ȸ������ �� �α��� 
		 * 1. ���� ���̵�� ��й�ȣ�� �Է��ؼ� ȸ�������Ѵ�. 
		 * 2. ���� �α����� ���� �ٽ� ���̵�� ��й�ȣ�� �Է¹޴´�.
		 * 3. ���Ե� ���̵�� ����� �α��ν� �Է��� ���̵�� ��й�ȣ�� ���Ѵ�. 
		 * ��) �α��� ���� or �α��� ����
		 */
		
		
		Scanner scan = new Scanner(System.in);		
		int dbId = 0;
		int dbPw = 0;	
		System.out.println("=== ȸ������ ===");
		System.out.print("������ Id�� �Է��ϼ��� : ");
		dbId = scan.nextInt();
		System.out.print("������ Pw�� �Է��ϼ��� : ");
		dbPw = scan.nextInt();
		System.out.println("������ �����մϴ�.");
		
		System.out.println("=== �α��� ===");
		System.out.print("ID �Է� : ");
		int myId = scan.nextInt();
		System.out.print("Pw �Է� : ");
		int myPw = scan.nextInt();
		
		if(dbId == myId && dbPw == myPw) {
			System.out.println("�α��� ����");
		}
		if(dbId != myId || dbPw != myPw) {
			System.out.println("�α��� ����");
		}		
	}
}
