package D4_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ������ ��ȣ ���߱� ����
 * 1. 1~10 ������ ���� ���� 2���� �����Ѵ�.
 * 2. 1~4 ������ ���� ���� 1���� �����Ѵ�.
 * 3. �� ���ڴ� ������ ��ȣ�� �ش�ȴ�.
 * 	  1) ����	  2)  �E��     3) ����	 4) ������
 * 4. ����ڴ� ������ ��ȣ�� ���ߴ� �����̴�.
 * ��) 3 ? 4  = 7
 *    1) + 2) - 3) * 4) %
 *    ���� : 1��
 */
public class D4_if5_�����ڱ�ȣ���� {
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		
		
		Random ran = new Random();
		
		int x = ran.nextInt(10) + 1;
		int y = ran.nextInt(10) + 1;
		
		int answer = ran.nextInt(4) + 1;

		int z = 0;
		if(answer == 1) {
			z = x + y;
		}else if(answer == 2) {
			z = x - y;
		}else if(answer == 3) {
			z = x * y;
		}else if(answer == 4) {
			z = x % y;
		}
		
		System.out.println(x + " ? " + y + " = " + z);
		System.out.println("1)+ 2)- 3)* 4)%");
		
		System.out.print("��ȣ�� �����ϼ��� : ");
		int myAnwer = scan.nextInt();
		
		if(answer == myAnwer) {
			System.out.println("����!");
		}else {
			System.out.println("����!");
		}
	}
}
