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
		int join_id = 0;
		int join_pw = 0;
		int log_id = 0;
		int log_pw = 0;
		System.out.println("ȸ�������� ���̵� �Է��ϼ���.");
		join_id = scan.nextInt();
		System.out.println("ȸ�������� ���̵��� ��й�ȣ�� �Է��ϼ���.");
		join_pw = scan.nextInt();
		
		System.out.println("ȸ�������� �����մϴ�.");
		
		System.out.println("�α���");
		
		System.out.println("���̵� �Է��ϼ���.");
		log_id = scan.nextInt();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		log_pw = scan.nextInt();
		if(join_id == log_id && join_pw == log_pw) {
			System.out.println("�α��� ����");
		}
		if(join_id != log_id || join_pw != log_pw) {
			System.out.println("�α��� ����");
		}
	}
}
