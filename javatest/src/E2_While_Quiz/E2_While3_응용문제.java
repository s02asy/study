package E2_While_Quiz;

import java.util.Scanner;

public class E2_While3_���빮�� {
	/*
	 * #
	 * 1. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
	 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
	 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
	 * 
	 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
	 * 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int run = 0;
		int total = 0;
		while(run < 5) {
			System.out.println("������ �Է��ϼ���.");
			int answer = scan.nextInt();
			total = total + answer;
			System.out.println("�� : " + total);
			if(total >= 100) {
				System.out.println("�� 100�̻� �������");
				run = 5;
			}
			run += 1;
		}
	}
}