package D2_if_Quiz;

import java.util.Scanner;
/*
 * # �ִ밪 ���ϱ�[1�ܰ�]
 * 1. ���� 3���� �Է¹޴´�.
 * 2. �Է¹��� 3���� ���� ���Ͽ�,
 * 3. ���� ū ��(MAX)�� ����Ѵ�.
 */
public class D2_if4_�ִ밪���� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int x = scan.nextInt();
		System.out.print("����2 �Է� : ");
		int y = scan.nextInt();
		System.out.print("����3 �Է� : ");
		int z = scan.nextInt();
		
		int maxNum = x;
		if(maxNum < y) {
			maxNum = y;
		}
		if(maxNum < z) {
			maxNum = z;
		}
		
		System.out.println("�ִ밪 = " + maxNum);
				
	}
}
