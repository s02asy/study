package E2_While_Quiz;

import java.util.Scanner;

public class E2_While5_�Ҽ�ã������ {
	/*
	 * # �Ҽ�ã��[1�ܰ�]
	 * 1. �Ҽ���, 1�� �ڱ��ڽ����θ� �������� ��
	 * 2. ��) 2, 3, 5, 7, 11, 13, ..
	 * 3. ��Ʈ
	 * 1) �ش� ���ڸ� 1���� �ڱ��ڽű��� ������.
	 * 2) �������� 0�� ������ ī��Ʈ�� ����.
	 * 3) �� ī��Ʈ ���� 2�̸� �Ҽ��̴�.
	 * 4) 6/1 6/2 6/3 6/4 6/5 6/6	cnt=4	�Ҽ�x
	 * 
	 * ���� �� ���� �Է¹޾�, �ش� ���ڰ� �Ҽ����� �ƴ��� �Ǻ��Ѵ�.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
		System.out.print("���� �Է� : ");
		int num = scan.nextInt();
		
		int cnt = 0;
		
		int i = 1;
		while(i <= num) {
			if(num % i == 0) {
				cnt += 1;
			}
			i += 1;
		}
		if(cnt == 2) {
			System.out.println("�Ҽ��̴�.");
		}else {
			System.out.println("�Ҽ��� �ƴϴ�.");
		}

	}

}