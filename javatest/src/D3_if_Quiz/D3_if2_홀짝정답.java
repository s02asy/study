package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # Ȧ¦ ����
 * 1. 1~100������ ���� ���ڸ� �����Ѵ�.
 * 2. ���� ���ڰ� Ȧ������ ¦������ ���ߴ� �����̴�.
 */
public class D3_if2_Ȧ¦���� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int rNum = ran.nextInt(100) + 1;

		
		System.out.println("1.Ȧ��");
		System.out.println("2.¦��");

		System.out.print("��ȣ�� �����ϼ��� : ");
		int choice = scan.nextInt();

		if (choice == 1) {
			if (rNum % 2 == 1) {
				System.out.println("����!");
			}
			if (rNum % 2 == 0) {
				System.out.println("����!");
			}
		}	
		if (choice == 2) {
			if (rNum % 2 == 0) {
				System.out.println("����!");
			}
			if (rNum % 2 == 1) {
				System.out.println("����!");
			}
		}
		
		System.out.println("����[ " + rNum + " ]");
	}
}
