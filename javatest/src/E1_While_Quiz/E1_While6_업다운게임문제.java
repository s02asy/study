package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

public class E1_While6_���ٿ���ӹ��� {

	/*
	 * # Up & Down ����[2�ܰ�]
	 * 1. com �� �������� 1~100���̸� �����Ѵ�.
	 * 2. me �� 1~100���̸� �Է��Ѵ�. 	 
	 * 3. com �� me �� ���ؼ� com ũ�� "ũ��" , 
	 * 	  com �������� "�۴�" ��Ʈ���� 
	 * 4. ������ ���߸� ������ ����ȴ�.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int run = 1;
		int com = ran.nextInt(100) + 1;
		while(run == 1) {
			System.out.println("���� �Է�[1~100] :");
			int me = scan.nextInt();
			if(com > me) {
				System.out.println("ũ��");
			}
			else if(com < me) {
				System.out.println("�۴�");
			}
			else if(com == me) {
				System.out.println("����");
				run = 0;
			}
		}
	}
}