package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;

/*
 * # ����(0)����(1)��(2) ����[2�ܰ�] 
 * 1. com�� 0~2 ������ ������ ���ڸ� �����Ѵ�.
 * 2. me�� 0~2 ������ ���ڸ� �Է¹޴´�. 
 * 3. com�� me�� ����, 1) ����. 2) ���� �̰��. 3) ���� ����. �� ����Ѵ�.
 */
public class D3_if3_�������������� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		
		Random ran = new Random();
		
		int com = ran.nextInt(3);
		
		System.out.print("����(0),����(1),��(2) �Է� : ");
		int me = scan.nextInt();
		
		if(com == me) {
			System.out.println("����.");
		}
		
		if(com == 0 && me == 1) {
			System.out.println("�̰��.");
		}
		if(com == 1 && me == 2) {
			System.out.println("�̰��.");
		}
		if(com == 2 && me == 0) {
			System.out.println("�̰��.");
		}
		
		if(com == 0 && me == 2) {
			System.out.println("����.");
		}
		if(com == 1 && me == 0) {
			System.out.println("����.");
		}
		if(com == 2 && me == 1) {
			System.out.println("����.");
		}
	}
}
