package E1_While_Quiz;

import java.util.Random;
import java.util.Scanner;

public class E1_While3_�����ܹ��� {
	
	/*
	 * # ������ ����[3�ܰ�]
	 * 1. ������ ������ 5ȸ �ݺ��Ѵ�.
	 * 2. ������ ���߸� 20���̴�.
	 * 3. ���� ���� ��, ������ ����Ѵ�.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int i = 1;
		int c = 0;
		while(i == 1) {
			int r1 = ran.nextInt(8) + 1;
			int r2 = ran.nextInt(9) + 1;
			int ���� = r1 * r2;
			System.out.println(r1 + " * " + r2 + " = ");
			System.out.println("������ �Է��ϼ���.");
			int �Է� = scan.nextInt();
			if(���� == �Է�) {
				System.out.println("����!");
				c += 1;
			}
			else {
				System.out.println("����!");
			}
			if(c == 5) {
				System.out.println("����.");
				i = 0;
			}
		}
		int s = c * 20;
		System.out.println("���� : " + s + "��");
	}
}
