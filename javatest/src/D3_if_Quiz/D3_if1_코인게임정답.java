package D3_if_Quiz;

import java.util.Random;
import java.util.Scanner;
/*
 * # ���� ����
 * 1. 0 �Ǵ� 1�� ���� ���ڸ� �����Ѵ�.
 * 2. 0�� ������ �ո�, 1�� ������ �޸��̴�.
 * 3. ������ �յ޸��� ���ߴ� �����̴�.
 */
public class D3_if1_���ΰ������� {
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int coin = ran.nextInt(2);
		
		
		
		System.out.print("������ �ո�(0), �޸�(1) �Է� : ");
		int me = scan.nextInt();
		if(coin == me) {
			System.out.println("����!");
		}
		if(coin != me) {
			System.out.println("��!");
		}
		
		
		if(coin == 0) {
			System.out.println("���� : �ո�"); // ���� ��� 
		}
		if(coin == 1) {
			System.out.println("���� : �޸�");
		}
				
	}
}
