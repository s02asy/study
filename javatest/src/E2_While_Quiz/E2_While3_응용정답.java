package E2_While_Quiz;

import java.util.Scanner;

public class E2_While3_�������� {
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
		int i = 0;
		int total = 0;
		while (i < 5) {			
			if(total >= 100) {
				System.out.println("���α׷� ����");
				i = 5;
			}else {
				System.out.print("���� �Է�[���� : ��(100)] : ");
				int num = scan.nextInt();
				total += num;
				System.out.println("�� : " + total);
				i += 1;	
			}
		}
	}
}