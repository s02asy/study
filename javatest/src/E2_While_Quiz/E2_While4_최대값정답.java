package E2_While_Quiz;

import java.util.Scanner;

public class E2_While4_�ִ밪���� {
	/*
	 * # �ִ밪 ���ϱ�[2�ܰ�]
	 * 1. 3ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
	 * 2. �Է¹��� 3���� ���� �� ���� ū ���� ����Ѵ�.
	 */

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int maxNum = 0;
		
		int i = 1;
		while(i <= 3) {
			
			System.out.print("����" + i + " �Է� : ");
			int num = scan.nextInt();
			
			if(maxNum < num) {
				maxNum = num;
			}
			i += 1;
		}
		
		System.out.println("�ִ밪 = " + maxNum);
		

	}

}