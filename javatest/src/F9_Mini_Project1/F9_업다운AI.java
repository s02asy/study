package F9_Mini_Project1;

import java.util.Random;
import java.util.Scanner;

/*
 *  # ���ٿ� AI
 *  
 *  ----����� ���ٿ���� ----------------------------------
 *  ���� ���ٿ��� COM �� �������� 1~100 ������ ���ڸ� �������� �����ϰ�,
 *  �÷��̴� 1~100������ ���ڸ� ���ߴ°����̴�.
 *  Ʋ�������� COM�� "��" �Ǵ� "�ٿ�" �� ��Ʈ�� ����Ѵ�. 
 *  --------------------------------------------------
 *  
 *  ---- ���ٿ�AI---------------------------------------
 *  ���ٿ��� �ݴ�� �ϴ°��̴�.
 *  ���� 1~100 ���̸� �Է��ϸ� COM �� 1~100 ���̸� �������� �Է��ϰ�
 *  ���� �Է��� ���ڸ� ���ߴ°����̴�.
 *  ����) COM �� ���ؾ��Ѵ�. 
 *  ���� ��� ���� 50�� �����ϰ� , COM �� 20�� �����ߴٸ� ���� ���ʺ��ʹ�
 *  COM�� 1~20�� �����ʴ´�.
 *  ���������� COM �� 80 �� �������ʿ� �����ߴٸ� 80~100�� ���� ���������ʴ´�.
 *  �ᱹ COM�� �Ÿ��� �������� ���� �Ǿ��ְ� �ᱹ ���߰� �Ǿ��ִ�. 

 */

public class F9_���ٿ�AI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int min = 1;
		int max = 100;
		int max2 = 0;
		boolean run = true;
		System.out.println("��Ʈ Up : 1 Down : 2");
		System.out.println("���ڸ� ������ �ּ���.");
		int me = scan.nextInt();
		while(run) {
			int com = ran.nextInt(max) + min;
			System.out.println("com : " + com);
			if(me == com) {
				System.out.println("�¸� !!");
				break;
			}
			else if(com < me) {
				System.out.println("��Ʈ : ");
				int ��Ʈ = scan.nextInt();
				if(��Ʈ == 1) {
					min = com + 1;
					max = 100 - (com + min);
				}
			}
			else if(com > me) {
				System.out.println("��Ʈ : ");
				int ��Ʈ = scan.nextInt();
				if(��Ʈ == 2) {
					max = com - min;
				}
			}
		}
	}

}