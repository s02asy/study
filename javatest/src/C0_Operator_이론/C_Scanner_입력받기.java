package C0_Operator_�̷�;

import java.util.Scanner;

/*
 * # �Է¹ޱ�
 * 1. import java.util.Scanner;  // package �� class ���̿� �ۼ�.
 * 	
 * 2. Scanner scan = new Scanner(System.in); // main�ȿ� ������Ѵ�.(�ʼ�)
 *
 * 3. �ȳ��� �ۼ�
 *    System.out.print("���̸� �Է��ϼ��� : "); 
 *    
 * 4. �Է¹ޱ�
 *    int age = scan.nextInt(); //�ܼ�â�� ���ڸ� ������ ���͸� ���������� ����Ѵ�.
 *    
 * 5. ������ 
 * 	  System.out.println("����� ���̴� " + age + "�� �̱���!");
 */

public class C_Scanner_�Է¹ޱ� {
		public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		System.out.println("�Է��Ͻ� ���ڴ� " + num + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �̱���!");
		
	
		
		
	}
}
