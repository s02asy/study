package D1_if_Quiz;

import java.util.Scanner;
import java.util.Random;

public class D1_if3_���� {
	public static void main(String[] args) {
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 1. com�� �������� 1~100 ���̸� �����Ѵ�.
		 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
		 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		Random ran = new Random(); 
		int com = ran.nextInt(100) + 1;
		System.out.println("���ڸ� �Է��ϼ���.");
		int me = scan.nextInt();
		if(me < com) {
			System.out.println("Up!");
		}
		if(me == com) {
			System.out.println("Bingo!");
		}
		if(me > com) {
			System.out.println("Down!");
		}
	}
}
