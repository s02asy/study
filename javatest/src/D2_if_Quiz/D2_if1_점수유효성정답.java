package D2_if_Quiz;

import java.util.Scanner;

/*
 * # ���� ��ȿ�� �˻�
 * 1. ������ �Է¹޴´�.
 * 2. ������  60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̴�.
 * 3. ��, �Է¹��� ������ 
 *    �����̰ų� 100���� �ʰ��ϸ�, ���� �޼����� ����Ѵ�.
 *    ��) ������  �߸� �Է��߽��ϴ�.
 */
public class D2_if1_������ȿ������ {
	public static void main(String[] args) {		
Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100) : ");
		int score = scan.nextInt();
		
		if(60 <= score && score <= 100) {
			System.out.println("�հ�1");
		}
		
		System.out.println("------------------------------------");
		
		//# if�� ���� if��
		 
		if(score >= 60) {
			if(score <= 100) {
				System.out.println("�հ�2");
			}
		}
		
		if(0 <= score && score < 60) {
			System.out.println("���հ�");
		}
		
		if(100 < score || score < 0) {
			System.out.println("������ �߸� �Է��߽��ϴ�.");
		}
		
				
	}
}
