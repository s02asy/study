package E2_While_Quiz;

import java.util.Scanner;

public class E2_While4_�ִ밪���� {
	/*
	 * # �ִ밪 ���ϱ�[2�ܰ�]
	 * 1. ����1) ���
	 * 2. ����2) ū���� ¦������ �Ѵ�.
	 * 3. �ݺ�Ƚ���� �Է¹޴´�.
	 * 4. �Է¹��� �ݺ�Ƚ����ŭ ���ڸ� �Է¹ް�
	 * 5. �Է¹��� ���� �� ���� ū ���� ����Ѵ�.
	 */

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�ݺ�Ƚ���� �Է��ϼ���.");
		int �ݺ� = scan.nextInt();
		int run = 1;
		int max = 0;
		while(run <= �ݺ�) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int ���� = scan.nextInt();
			if(���� > max && ���� % 2 == 0) {
				max = ����;
			}
			run += 1;
		}
		System.out.println("����ū ¦�� : " + max);
	}

}