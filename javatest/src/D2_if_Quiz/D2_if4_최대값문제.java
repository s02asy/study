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
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		int num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		int num2 = scan.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int num3 = scan.nextInt();
		int max = num1;
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		System.out.println("�ִ� ����?");
		System.out.println(max);
	}
}
