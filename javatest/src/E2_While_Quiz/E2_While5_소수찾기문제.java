package E2_While_Quiz;

import java.util.Scanner;

public class E2_While5_�Ҽ�ã�⹮�� {
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
		
		int i = 1;
		int count = 0;
		System.out.println("���ڸ� �Է��ϼ���");
		int ���� = scan.nextInt();
		while(i <= ����) {
			if(���� % i == 0) {
				count += 1;
			}
			i += 1;
		}
		if(count == 2) {
			System.out.println("�Ҽ� �Դϴ�.");
			System.out.println("count : " + count);
		}
		else {
			System.out.println("�Ҽ��� �ƴմϴ�.");
			System.out.println("count : " + count);
		}
	}

}