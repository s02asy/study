package D1_if_Quiz;

import java.util.Scanner;

public class D1_if4_���� {
	public static void main(String[] args) {
		/*
		 * # �α���[1�ܰ�]
		 * 1. Id�� Pw�� �Է¹޴´�.
		 * 2. �Է¹��� �����Ϳ� db�����͸� ���� �α��� ó���� �����Ѵ�.
		 * ��) �α��� ���� or �α��� ����
		 */
		Scanner scan = new Scanner(System.in);
		int dbId = 1234;
		int dbPw = 1111;
		System.out.println("���̵� �Է��ϼ���.");
		int Id = scan.nextInt();
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		int Pw = scan.nextInt();
		if(dbId == Id && dbPw == Pw) {
			System.out.println("�α��� ����");
		}
		if(dbId != Id || dbPw != Pw) {
			System.out.println("�α��� ����");
		}
	}
}
