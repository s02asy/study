package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ��� ���� ���߱� ����
 * 1. 150~250 ������ ���� ���� ����
 * 2. ���� ������ ��� ���ڸ� ���ߴ� �����̴�.
 * ��)
 * 		249		: 4
 */
public class D4_if2_����������� {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int rNum = ran.nextInt(101) + 150;		// [0 ~ 100] + 150
		System.out.println("���� = " + rNum);
		
		int answer = rNum % 100 / 10;
		
		System.out.print("��� ���ڸ� �Է��ϼ��� : ");
		int myAnswer = scan.nextInt();
		
		if(answer == myAnswer) {
			System.out.println("����!");
		}else {
			System.out.println("����!");
		}
	}
}
