package D1_if_Quiz;

import java.util.Scanner;

public class D1_if3_���� {
	public static void main(String[] args) {
		/*
		 * # Up & Down ����[1�ܰ�]
		 * 1. com�� 8�̴�.
		 * 2. me�� ���ڸ� �ϳ��Է¹޴´�.
		 * 3. com �� me �� ���ؼ� ������ ���� �޼����� ����Ѵ�.
		 * 1) me < com	: Up!
		 * 2) me == com : Bingo!
		 * 3) me > com  : Down!
		 */
		Scanner scan = new Scanner(System.in);
		
		int com = 8;
		
		System.out.print("���� �Է� : ");
		int me = scan.nextInt();
		
		if(me < com) { System.out.println("Up!"); }
		if(me > com) { System.out.println("Down!"); }
		if(me == com) { System.out.println("Bingo!"); }
		
		/*
		 * 16 : �Է¹ޱ� ���� Scanner Ŭ������ �ۼ��Ѵ�.
		 * 18 : com�� ��ǻ�͸� �ǹ��Ѵ�. ��ǻ���� ���ڴ� 8�� �����ȴ�.
		 * 20 : �ȳ� ��Ʈ 
		 * 21 : ���� me�� ����ڷκ��� ���� �� ���� �Է¹޴´�.
		 * 23 : me�� 8���� ������ Up�� ����Ѵ�. 
		 */
		
	}
}
