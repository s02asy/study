package E4_For;

import java.util.Scanner;

public class E4_for4_�������� {
	public static void main(String[] args) {
		/*
		 * 
		 * 1. 5ȸ �ݺ��� �ϸ鼭 ������ �Է¹޴´�.
		 * 2. �Է¹��� ������ ���� ���� ����Ѵ�. 
		 * 3. ���࿡ �Է¹��� ���� 100 �̻��̸�  �ݺ��� 5ȸ�� �ƴ����� ��� ���� 
		 * 
		 * ��) 7 ==> �� : 7 ,  14 ==> �� : 21 , 1000 ==> �� : 1021 !����
		 * 
		 */		
		// 10 : 24 ~ 10 : 30 
		Scanner scan = new Scanner(System.in);
		int total = 0;
		for(int i = 0; i < 5; i++) {
			System.out.println("���� �Է� : ");
			int num = scan.nextInt();
			total = total + num;
			if(total >= 100) {
				i = 5;
			}
		}
		System.out.println(total);
		
		
	}
}