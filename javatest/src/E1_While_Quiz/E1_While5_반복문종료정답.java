package E1_While_Quiz;

import java.util.Scanner;

public class E1_While5_�ݺ����������� {
	/*
	 * # �ݺ��� ����(-100)
	 * 1. ���� �ݺ��� �ϸ鼭 ���ڸ� �Է¹޴´�.
	 * 2. �Է��� ���ڰ� -100�̸�, ���α׷��� ����ȴ�.
	 * ��)
	 * ���� �Է�[EXIT:-100] : 1
	 * ���� �Է�[EXIT:-100] : 3
	 * ���� �Է�[EXIT:-100] : 4
	 * ���� �Է�[EXIT:-100] : -100
	 * ���α׷� ����
	 */


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int run = 1;
		while (run == 1) {
			System.out.print("���� �Է�[EXIT:-100] : ");
			int num = scan.nextInt();

			if (num == -100) {
				System.out.println("���α׷� ����");
				run = 0;
			}
		}

	}

}